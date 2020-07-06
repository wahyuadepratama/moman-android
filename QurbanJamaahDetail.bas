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
	Private Navbar As Panel
	Private NavbarTitle As Label
	
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
'	SpinType.DropdownBackgroundColor= Colors.White
	
	NavbarTitle.Text = "Detail Qurban"
	NavbarTitle.TextSize = 20	
	
	SpinPengurus.Add("Pilih Group")
	SpinPengurus.Add("Group 01")
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/detail?id="&QurbanJamaah.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'Sub JobDone (Job As HttpJob)
'	If Job.Success = True Then		
'			
'		Dim parser As JSONParser
'		parser.Initialize(Job.GetString)
'		Dim root As Map = parser.NextObject		
'						
'		NavbarTitle.Text = "Qurban "&root.Get("name")
'		NavbarTitle.TextSize = 20
'			
'		account = root.Get("account")
'		animal_type = root.Get("animal_type")
'	
'		If account.Size = 0 Then
'			SpinPengurus.Add("Belum Ada Akun Rekening!")
'		Else
'			SpinPengurus.Add("Pilih Nomor Rekeing Pengiriman Donasi")
'			For i=0 To account.Size-1
'				Dim accountData As Map
'				accountData = account.Get(i)
'				SpinPengurus.Add(accountData.Get("owner")&" - "&accountData.Get("account_number")&" ("&accountData.Get("bank")&")")
'			Next
'		End If
'		
'		SpinType.Add("Pilih Jenis Hewan Qurban")
'		For i=0 To animal_type.Size-1
'			Dim typeData As Map
'			typeData = animal_type.Get(i)
'			SpinType.Add(typeData.Get("animal_type")&" - "&typeData.Get("animal_price")&" (Untuk "&typeData.Get("max_person")&" Orang)")
'		Next
'		
'	Else
'		Log("Error: " & Job.ErrorMessage)
'		ToastMessageShow("Error: " & Job.ErrorMessage, True)
'	End If
'	Job.Release
'End Sub

Sub SpinPengurus_ItemClick (Position As Int, Value As Object)
	
End Sub


Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	
End Sub

Sub Button1_Click
'	Msgbox("Qurban transaction success! Please check your history transaction for payment!", "Transaction successful!")
	StartActivity(InvoiceJamaah)
End Sub