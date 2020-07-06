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
	Private xui As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel
	
	Private CLV As CustomListView
	Private PanelListItem As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	'MainScroll.Panel.LoadLayout("QurbanDonationJamaah")
	For i = 0 To 9
		CLV.Add(CreateItem("test","content"),"")
		CLV.AsView.Height = (PanelListItem.Height+1.4%y) *CLV.Size
	Next
	PanelQurban.Height= CLV.AsView.Height
	CLV.sv.Height = CLV.AsView.Height
	CLV.AsView.Height = CLV.AsView.Height
	MainScroll.Panel.Height = PanelQurban.Height
	MainScroll.Height = 100%y
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0%x, 0%y, 100%x,25%y)
	p.LoadLayout("ListHistoryTrans")
	Return p
End Sub

Sub CLV_ItemClick (Index As Int, Value As Object)
	StartActivity(DonationJamaah)
End Sub