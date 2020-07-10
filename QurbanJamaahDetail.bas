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
	Dim invoiceSelected As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private NavbarTitle As Label
	Private MosqueName As Label
	Private DeadlinePayment As Label
	Private EditText1 As EditText
	
	Private PanelQurban As Panel
	Private SpinPengurus As Spinner
	Private SpinType As Spinner
	
	Dim pengurus As Map
	Dim types As Map	
	
	Private Button1 As Button
	
	Dim pengurus As Map
	Dim accountId, publicId, noTransaction As String
	Dim account As List : account.Initialize
	Dim animal_type As List : animal_type.Initialize
	Private PanelPaidInfo As Panel	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("QurbanJamaahDetail")	
	MainScroll.Height =100%y
	MainScroll.Height=100%y - Navbar.Height
	MainScroll.Panel.Height = PanelQurban.Height
	
	pengurus.Initialize
	types.Initialize
	
	SpinPengurus.DropdownBackgroundColor= Colors.White
	MosqueName.TextColor= Colors.Black
	DeadlinePayment.TextColor= Colors.Black
'	SpinType.DropdownBackgroundColor= Colors.White
	
	NavbarTitle.Text = "Detail Qurban"
	NavbarTitle.TextSize = 20	
	
	SpinPengurus.Add("Pilih Group")
	SpinPengurus.Add("Group 01")
	SpinPengurus.Add("Group 02")
	SpinPengurus.Add("Group 03")
	SpinPengurus.Add("Group 04")
	SpinPengurus.Add("Group 05")
	SpinPengurus.Add("Group 06")
	SpinPengurus.Add("Group 07")
	
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/detail?id="&QurbanJamaah.idSelected,"LoadData",Me)
	Log(Main.id)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success = True Then
		
		If Job.JobName = "Submit" Then
			'Log("error: "&Job.GetString)
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject
			
			invoiceSelected = root.Get("id")
			Msgbox(root.Get("status"), "Transaction "&root.Get("id")&" successful!")
			StartActivity(InvoiceJamaah)
		Else
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject
						
			NavbarTitle.Text = "Qurban "&root.Get("name")
			NavbarTitle.TextSize = 20
			
			MosqueName.Text = "Description : "&root.Get("description")
			DeadlinePayment.Text = "Deadline Payment : "&root.Get("deadline_payment")
		End If			
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub SpinPengurus_ItemClick (Position As Int, Value As Object)
	
End Sub


Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub Button1_Click	
	CodeSemua.ExecuteUrl(Main.server&"api/qurban/store?id="&QurbanJamaah.idSelected,"group_name="&SpinPengurus.SelectedItem&"&total_qurban="&EditText1.Text&"&user="&Main.id,"Submit",Me)
	Msgbox("Your qurban has been processing", "Process...")
End Sub