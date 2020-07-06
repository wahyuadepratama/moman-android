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
	Private PanelMaps As Panel
	Private WebView1 As WebView
	Dim events,facilities, capacities, parking As Map
	Private EditName As EditText
	Private SpinCapacity As Spinner
	Private SpinEvent As Spinner
	Private SpinFacility As Spinner
	Private SpinParking As Spinner
	Private btnSearch As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("JamaahMaps")
	MainScroll.Panel.Height = PanelMaps.Height
	MainScroll.Height = 100%y - MainScroll.Top
	WebView1.LoadUrl("https://www.google.com/")
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
	SpinCapacity.Add("Capacity")
	SpinCapacity.Add("hahahah")
	SpinFacility.Add("Facility")
	SpinEvent.Add("Event")
	SpinParking.Add("Parking Area")
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btnSearch_Click
	StartActivity(QurbanJamaahConfirm)
End Sub