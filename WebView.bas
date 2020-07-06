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
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private WebView1 As WebView
	Private TopNavbar As Panel
	Private Navbar As Panel
	Private Web As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("BottomNavigation")
	MainScroll.Panel.LoadLayout("WebView")
	
	WebView1.JavaScriptEnabled=True
	WebView1.LoadUrl(Main.server)
	
	TopNavbar.Visible = False	
	MainScroll.Top = 0%y
	Web.SetBackgroundImage(LoadBitmap(File.DirAssets,"domain_green.png"))
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
