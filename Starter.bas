B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private cache As Map
	Private tasks As Map
	Private ongoingTasks As Map
	Public rp As RuntimePermissions
	Public GPS1 As GPS
	Private gpsStarted As Boolean
	Public lat, lang As String
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	tasks.Initialize
	cache.Initialize
	ongoingTasks.Initialize
	GPS1.Initialize("GPS")
End Sub

Sub Service_Start (StartingIntent As Intent)
	

End Sub

Public Sub StartGps
	If gpsStarted = False Then
		GPS1.Start(0, 0)
		gpsStarted = True
	End If
End Sub

Public Sub StopGps
	If gpsStarted Then
		GPS1.Stop
		gpsStarted = False
	End If
End Sub

Sub GPS_LocationChanged (Location1 As Location)
	'Log( "Lat = " & Location1.ConvertToMinutes(Location1.Latitude))
	'Log("Lon = " & Location1.ConvertToMinutes(Location1.Longitude))
	'Log( $"Speed = $1.2{Location1.Speed} m/s "$)
End Sub


Sub GPS_GpsStatus (Satellites As List)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("Satellites:").Append(CRLF)
	For i = 0 To Satellites.Size - 1
		Dim Satellite As GPSSatellite = Satellites.Get(i)
		sb.Append(CRLF).Append(Satellite.Prn).Append($" $1.2{Satellite.Snr}"$).Append(" ").Append(Satellite.UsedInFix)
		sb.Append(" ").Append($" $1.2{Satellite.Azimuth}"$).Append($" $1.2{Satellite.Elevation}"$)
	Next
	Log( sb.ToString)
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy
	StopGps
End Sub

'------------ untuk image --------------'

Sub Download (ImageViewsMap As Map)
	For i = 0 To ImageViewsMap.Size - 1
		tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsMap.GetValueAt(i))
		Dim link As String = ImageViewsMap.GetValueAt(i)
		If cache.ContainsKey(link) Then
			Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)
			iv.SetBackgroundImage(cache.Get(link))
		Else If ongoingTasks.ContainsKey(link) = False Then
			ongoingTasks.Put(link, "")
			Dim j As HttpJob
			j.Initialize(link, Me)
			j.Download(link)
		End If
	Next
End Sub

Sub JobDone(Job As HttpJob)
	ongoingTasks.Remove(Job.JobName)
	If Job.Success Then
		Dim bmp As Bitmap = Job.GetBitmap		
		If tasks.IsInitialized Then
			For i = 0 To tasks.Size - 1
				Dim link As String = tasks.GetValueAt(i)
				If link = Job.JobName Then
					Dim iv As ImageView = tasks.GetKeyAt(i)
					Dim cvs As Canvas = CreateBitmap
					DrawRoundBitmap(cvs, bmp)
					iv.SetBackgroundImage(cvs.Bitmap)
					cache.Put(Job.JobName, cvs.Bitmap)
					'iv.SetBackgroundImage(bmp)
				End If
			Next
		End If
	Else
		Log("Error downloading image: " & Job.JobName & CRLF & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Sub CreateBitmap As Canvas
	Dim bmp As Bitmap
	bmp.InitializeMutable(200dip, 200dip)
	Dim cvs As Canvas
	cvs.Initialize2(bmp)
	Dim r As Rect
	r.Initialize(0, 0, bmp.Width, bmp.Height)
	cvs.DrawRect(r, Colors.Transparent, True, 0)
	Dim p As Path
	p.Initialize(0, 0)
	Dim jo As JavaObject = p
	Dim x = 100dip, y = 100dip, radius = 100dip As Float
	jo.RunMethod("addCircle", Array As Object(x, y, radius, "CW"))
	cvs.ClipPath(p)
	Return cvs
End Sub

Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)
	Dim r As Rect
	r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.Height)
	cvs.DrawBitmap(bmp, Null, r)
End Sub

Sub ActivityIsPaused
	tasks.Clear
End Sub

Public Sub GpsStatus (Satellites As List)
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("Satellites:").Append(CRLF)
	For i = 0 To Satellites.Size - 1
		Dim Satellite As GPSSatellite = Satellites.Get(i)
		sb.Append(CRLF).Append(Satellite.Prn).Append($" $1.2{Satellite.Snr}"$).Append(" ").Append(Satellite.UsedInFix)
		sb.Append(" ").Append($" $1.2{Satellite.Azimuth}"$).Append($" $1.2{Satellite.Elevation}"$)
	Next
	Log( sb.ToString)
End Sub

Public Sub LocationChanged(Location1 As Location)
	lat = Location1.ConvertToMinutes(Location1.Latitude)
	lang = Location1.ConvertToMinutes(Location1.Longitude)
	Log( "Lat = " & Location1.ConvertToMinutes(Location1.Latitude))
	Log("Lon = " & Location1.ConvertToMinutes(Location1.Longitude))
	Log( $"Speed = $1.2{Location1.Speed} m/s "$)
End Sub