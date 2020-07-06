B4A=true
Group=Default Group\Jamaah
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelMaps As Panel
	Private WebView1 As WebView
	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSetting As WebViewSettings
	Dim events,facilities, capacities, parking As Map	
	
	Private EditName As EditText
	Private SpinCapacity As Spinner
	Private SpinEvent As Spinner
	Private SpinFacility As Spinner
	Private SpinParking As Spinner
	Private btnSearch As Button
	Private NavbarTitle As Label	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsJamaah")
	MainScroll.Panel.Height = PanelMaps.Height
	MainScroll.Height = 100%y - MainScroll.Top
	
	'WebView1.Initialize("WebView1")
	WebView1.JavaScriptEnabled=True
	WebView1.LoadUrl(Main.server&"api/maps?search=nofilter&lat="&Starter.lat&"&lang="&Starter.lang)
	
	NavbarTitle.Text = "Maps"
	NavbarTitle.TextSize = 20
	
	events.Initialize
	facilities.Initialize
	capacities.Initialize
	parking.Initialize
	SpinCapacity.DropdownBackgroundColor = Colors.White
	SpinFacility.DropdownBackgroundColor = Colors.White
	SpinEvent.DropdownBackgroundColor = Colors.White
	SpinParking.DropdownBackgroundColor = Colors.White
	CodeSemua.SetBackgroundTintList(EditName, Colors.Transparent, Colors.Transparent)
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrlGet(Main.server&"api/getfacility","LoadData",Me)
	
	SpinCapacity.Add("All Capacity")
	SpinCapacity.Add("0 - 100")
	SpinCapacity.Add("100 - 300")
	SpinCapacity.Add("300 - 500")
	SpinCapacity.Add("> 500")
	
	SpinEvent.Add("All Worship Place")
	SpinEvent.Add("Masjid")
	SpinEvent.Add("Mushalla")
	
	SpinParking.Add("All Parking Area")
	SpinParking.Add("0 - 50")
	SpinParking.Add("50 - 100")
	SpinParking.Add("100 - 200")
	SpinParking.Add("> 200")
	
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then CallSubDelayed(Starter, "StartGPS")
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success = True Then
		
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)			
		
		Dim data_list As List
		data_list = parser.NextArray	
		
		SpinFacility.Add("All Facility")
		For i=0 To data_list.Size-1
			Dim facilityData As Map
			facilityData = data_list.Get(i)
			SpinFacility.Add(facilityData.Get("name"))
		Next
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub btnSearch_Click
	'StartActivity(QurbanJamaahConfirm)
	'CallSubDelayed(Starter, "StartGPS")
	
	Log(Main.server&"api/maps?search=filter&name="&EditName.Text&"&type="&SpinEvent.SelectedIndex&"&park="&SpinParking.SelectedIndex&"&capacity="&SpinCapacity.SelectedIndex&"&lat="&Starter.lat&"&lang="&Starter.lang)
	
	MyWebViewSetting.setLoadWithOverviewMode(WebView1, True)
	MyWebViewSetting.setUseWideViewPort(WebView1, True)
	MyWebViewSetting.setSupportZoom(WebView1, True)
	MyWebViewSetting.setDefaultTextEncodingName(WebView1, "utf-8")
	MyWebViewSetting.setPluginState(WebView1, "ON")
	MyWebViewSetting.getDOMStorageEnabled(WebView1)
	MyWebViewSetting.getLoadsImagesAutomatically(WebView1)
	MyWebViewSetting.setGeolocationEnabled(WebView1, True)
	MyWebViewSetting.getCacheMode(WebView1)
	MyWebViewSetting.getAllowFileAccess(WebView1)
	MyWebViewSetting.getLightTouchEnabled(WebView1)
	MyWebViewSetting.getSaveFormData(WebView1)
	MyWebViewSetting.getSavePassword(WebView1)
	MyWebViewSetting.getUserAgentString(WebView1)
	MyWebViewSetting.getUseWideViewPort(WebView1)
	MyWebViewSetting.setAllowFileAccess(WebView1, True)
	MyWebViewSetting.setAppCacheEnabled(WebView1, True)
	MyWebViewSetting.setMediaPlaybackRequiresUserGesture(WebView1, True)
	WebView1.LoadUrl(Main.server&"api/maps?search=filter&name="&EditName.Text&"&type="&SpinEvent.SelectedIndex&"&park="&SpinParking.SelectedIndex&"&capacity="&SpinCapacity.SelectedIndex&"&lat="&Starter.lat&"&lang="&Starter.lang)
End Sub

Sub myWebView_PageFinished (Url As String)
	Dim Obj1 As Reflector
	Obj1.Target=WebView1
	'   all attempts to run the method produce an error:
	'   java.lang.NoSuchMethodException: addJavascriptInterface
	'   Obj1.RunMethod("addJavascriptInterface")
	Obj1.RunMethod2("addJavascriptInterface", "myNewJSMethod", "java.lang.String")
End Sub


