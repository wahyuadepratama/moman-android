B4A=true
Group=Default Group\Stewardship
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
	Dim idSelected, idWorshipplace As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel
	Private NavbarTitle As Label
	
	Private CLV As CustomListView
	Private PanelListItem As B4XView	
	Private Transaction As Label
	Private Date As Label
	Private Status As Label
	Private Jamaah As Label
	Private IDpro As Label
	'Private FundCollect As B4XView
	'Private WorshipPlace As B4XView
	'Private ProjectName As B4XView
	Private BtnDonationHere As Button
	Private Qurban As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("BottomNavigation")
	MainScroll.Panel.LoadLayout("List")
	MainScroll.Height = 100%y
	
	NavbarTitle.Text="Qurban Confirmation"
	NavbarTitle.TextSize = 20
	
	Qurban.SetBackgroundImage(LoadBitmap(File.DirAssets,"cow_green.png"))
End Sub

Sub Activity_Resume
	CLV.Clear
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/transaction?id="&HomeStewardship.id,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Private Sub CreateItem(Width As Int, Transactions As String, Dates As String, Statuss As String, Jamaahs As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	
	p.SetLayoutAnimated(0, 0, 0, Width, 30%y)
	p.LoadLayout("ListQurbanConfirmation")
		
	Transaction.Text 	= "Transaction  "&Transactions
	Date.Text 			= "Date                "&Dates
	Status.Text 		= "Status             "&Statuss
	Jamaah.Text 		= "Jamaah          "&Jamaahs
	IDpro.Text = Transactions
	
	Return p
End Sub

Sub JobDone (Job As HttpJob)
	'Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		
		'Log("Response from server :"& res)
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
							CLV.Add(CreateItem(CLV.AsView.Width,a.Get("invoice"),a.Get("date"),a.Get("payment_completed"),a.Get("jamaah_name")),"")
							CLV.AsView.Height = (PanelListItem.Height+2%y) *CLV.Size
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
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	
	Dim a As B4XView
	a = p.GetView(0)
	
	idSelected=a.GetView(0).GetView(0).Text	
	StartActivity(QurbanStewardshipDetail)
End Sub

Sub PanelListItem_Click
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	
	Dim a As B4XView
	a = p.GetView(0)
	
	idSelected=a.GetView(0).GetView(5).Text	
	StartActivity(QurbanStewardshipDetail)
End Sub

Sub Profile_Click
	StartActivity(HomeStewardship)
End Sub

Sub Qurban_Click
	
End Sub

Sub Web_Click
	StartActivity(WebView)
End Sub