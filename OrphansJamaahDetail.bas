B4A=true
Group=Default Group\Jamaah
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
	Private NavbarTitle As Label
	
	Private PanelQurban As Panel
	Private Button1 As Button	
	Private EditTotal As EditText
	Private SpinPengurus As Spinner
	Private CheckGuna As CheckBox
	Private CheckHamba As CheckBox
	
	Dim pengurus As Map
	Dim accountId, publicId, noTransaction As String
	Dim account As List : account.Initialize
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:	
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("OrphansJamaahDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
	
	pengurus.Initialize
	SpinPengurus.DropdownBackgroundColor= Colors.White
End Sub

Sub Activity_Resume	
	CodeSemua.ExecuteUrlGet(Main.server&"api/mosque/detail?id="&OrphansJamaah.id_clicked,"LoadData",Me)	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	If Job.Success = True Then
		
		If Job.JobName = "Store" Then
			
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject			
			
			noTransaction = root.Get("trx")
			Msgbox("Please check payment infromation for transaction #"&noTransaction, "Transaction successful!")
			StartActivity(HistoryJamaah)
			
		Else
			
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject
			Dim mosque As Map
			mosque = root.Get("mosque")
							
			NavbarTitle.Text = "Orphans "&mosque.Get("name")
			NavbarTitle.TextSize = 20
				
			account = root.Get("account")
		
			If account.Size = 0 Then
				SpinPengurus.Add("Belum Ada Akun Rekening!")
			Else
				SpinPengurus.Add("Pilih Nomor Rekeing Pengiriman Donasi")
				For i=0 To account.Size-1
					Dim accountData As Map
					accountData = account.Get(i)
					SpinPengurus.Add(accountData.Get("owner")&" - "&accountData.Get("account_number")&" ("&accountData.Get("bank")&")")
				Next
			End If
			
		End If			
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub


Sub Button1_Click
	CodeSemua.ExecuteUrl(Main.server&"api/mosque/orphan/store?id="&OrphansJamaah.id_clicked,"jamaah="&HomeJamaah.id&"&fund="&EditTotal.Text&"&account="&accountId&"&public="&publicId, "Store",Me)	
End Sub

Sub CheckGuna_CheckedChange(Checked As Boolean)
	If CheckGuna.Checked Then
		CheckHamba.Checked = False
		CheckGuna.Checked = True
		publicId = True
	Else
		CheckHamba.Checked = True
		CheckGuna.Checked = False
		publicId = False
	End If
End Sub

Sub CheckHamba_CheckedChange(Checked As Boolean)
	If CheckHamba.Checked Then
		CheckHamba.Checked = True
		CheckGuna.Checked = False
		publicId = False
	Else
		CheckHamba.Checked = False
		CheckGuna.Checked = True
		publicId = True
	End If
End Sub

Sub SpinPengurus_ItemClick (Position As Int, Value As Object)
	For i=0 To account.Size-1
		If SpinPengurus.SelectedIndex = i+1 Then
			Dim accountData As Map
			accountData = account.Get(i)
			accountId = accountData.Get("id")
		End If
	Next
End Sub