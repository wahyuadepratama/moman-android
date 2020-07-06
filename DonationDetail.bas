B4A=true
Group=Default Group
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
	Private PanelQurban As Panel
	Private Button1 As Button
	Private Button3 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("DonationDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
End Sub

Sub Activity_Resume
	Log(DonationJamaah.idSelected)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Button1_Click
	StartActivity(DonationConfirm)
End Sub