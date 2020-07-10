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
	Private xui As XUI
	Dim invoiceSelected As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel
	Private NavbarTitle As Label
	
	Private CLV As CustomListView
	Private PanelListItem As Panel
	
	Private TransName As Label
	Private DateTrans As Label
	Private TotalTrans As Label
	Private Id As Label		
	Private statusTransc As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("List")	
	
	MainScroll.Panel.Height = PanelQurban.Height
	MainScroll.Height = 100%y
	
	NavbarTitle.Text="History Transaction"
	NavbarTitle.TextSize = 20
End Sub

Sub Activity_Resume
	CLV.Clear'
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/history?user="&Main.id,"LoadData",Me)
	Log("ID: "&Main.id)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Width As Int, idtrx As String, date As String, confirm As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Width, 30%y)
	p.LoadLayout("ListHistoryJamaah")
	
	Id.Text = idtrx
	DateTrans.Text = date
	TransName.Text = idtrx
	statusTransc.Text = confirm	
	
	Return p
End Sub

Sub JobDone (Job As HttpJob)
	'Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		
		Log("Response from server :"& res)
		Select Job.JobName
			Case "LoadData"
				Try
					Dim data As List
					data=parser.NextArray
					If data.Size-1 > 0 Then
						
						For i=0 To data.Size -1
							Dim a As Map
							a = data.Get(i)
							'Log("NAMAE: "&a.Get("name"))
							CLV.Add(CreateItem(CLV.AsView.Width, a.Get("invoice"), a.Get("date"),a.Get("payment_completed")),"")
							CLV.AsView.Height = (PanelListItem.Height+1.4%y) *CLV.Size
						Next
											
						PanelQurban.Height= CLV.AsView.Height + 10%y
						CLV.sv.Height = CLV.AsView.Height
						CLV.AsView.Height = CLV.AsView.Height
						MainScroll.Panel.Height = PanelQurban.Height
						
					End If
								
				Catch
					Log(LastException)
				End Try
		End Select
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub CLV_ItemClick (Index As Int, Value As Object)	
	'StartActivity(DonationJamaahConfirm)
End Sub

Sub PanelListItem_Click
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	
	Dim a As B4XView
	a = p.GetView(0)
	
	invoiceSelected = a.GetView(0).GetView(4).Text	
	StartActivity(InvoiceJamaah)
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then                     
		StartActivity(HomeJamaah)
	Else
		Return False
	End If
End Sub