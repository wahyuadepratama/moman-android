B4A=true
Group=Default Group
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
	Private PanelQurban As Panel
	Private SpinPengurus As Spinner
	Private SpinType As Spinner
	Dim pengurus As Map
	Dim types As Map
	Private Button1 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("QurbanDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
	pengurus.Initialize
	types.Initialize
	SpinPengurus.DropdownBackgroundColor= Colors.White
	SpinType.DropdownBackgroundColor= Colors.White
End Sub

Sub Activity_Resume
	SpinPengurus.Add("Akun Pengurus")
	pengurus.Put("Akun Pengurus","")
	SpinType.Add("Type")
	types.Put("Type","")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub SpinPengurus_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub SpinType_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub Button1_Click
	StartActivity(QurbanJamaah)
End Sub