B4A=true
Group=Default Group\Stewardship
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim id As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView	
	Private StewardshipName As Label	
	Private IdKtp As Label
	Private LabelNumber As Label
	Private PanelPhoto As ImageView	
	Private Profile As Button
	Private Address As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:	
	Activity.LoadLayout("BottomNavigation")
	MainScroll.Panel.LoadLayout("HomeStewardship")
	Profile.SetBackgroundImage(LoadBitmap(File.DirAssets,"user_green.png"))
End Sub

Sub Activity_Resume	
	CodeSemua.ExecuteUrl(Main.server&"api/_users","id="&Main.manager.GetString("id"),"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("data->>>>> "&res)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)		
		Select Job.JobName
			Case "LoadData"
				Try
					Dim a As Map
					a = parser.NextObject
					id = Main.manager.GetString("id")
					StewardshipName.Text = a.Get("jamaah_name")&"/"&a.Get("username")
					IdKtp.Text = a.Get("id")
					LabelNumber.Text = "Phone: "&a.Get("phone")
					Address.Text = a.Get("address")
					id = a.Get("id")
					
					Dim path As String = ""&Main.server&"images/avatar/"&a.Get("avatar")
					Dim m As Map
					m.Initialize
					m.Put(PanelPhoto,path)
					CallSubDelayed2(Starter, "Download", m)
				Catch
					Log(LastException)
					'Msgbox("Wrong username or password","Login Failed")
				End Try
		End Select
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub


Sub Logout_Click
	Main.manager.ClearAll
	Activity.Finish
	StartActivity(Main)
End Sub

Sub Profile_Click
	
End Sub

Sub Qurban_Click
	StartActivity(QurbanStewardship)
End Sub

Sub Web_Click
	StartActivity(WebView)
End Sub