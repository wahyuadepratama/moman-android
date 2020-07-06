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
	Private xui As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private NavbarTitle As Label
	
	Private PanelQurban As Panel
	Private Button1 As Button
	Private Button3 As Button
	Private CustomListView1 As CustomListView
	Private HorizontalScrollView1 As HorizontalScrollView
	Private ImageView1 As ImageView
	Private FundNeeded As Label
	Private FundCollected As Label
	Private Description As Label
	Private Progress As Label
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
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("DonationJamaahDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
	
	pengurus.Initialize
	SpinPengurus.DropdownBackgroundColor= Colors.White
End Sub

Sub Activity_Resume	
	CodeSemua.ExecuteUrlGet(Main.server&"api/donation/detail?id="&DonationJamaah.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)	
	If Job.Success = True Then
		
		If Job.JobName = "Store" Then			
			Dim parser As JSONParser
			Log(Job.GetString)
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject
			
			noTransaction = root.Get("trx")
			Log(noTransaction)
			Msgbox("Please check payment infromation for transaction #"&noTransaction, "Transaction successful!")
			StartActivity(HistoryJamaah)			
		Else			
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As Map = parser.NextObject
			Dim a As Map
			a = root.Get("project")
			NavbarTitle.Text = a.Get("name")
			NavbarTitle.TextSize = 20
		
			FundNeeded.Text = "Fund Needed : "&a.Get("fund")
			FundCollected.Text = "Fund Collected : "&a.Get("fund_collected")
			Progress.Text = "Description : "&a.Get("description")
			Description.Text = "Progress : "&a.Get("progress")
		
			Dim data As List : data.Initialize
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
		
			Dim gallery As List : data.Initialize
			gallery = root.Get("gallery")
			HorizontalScrollView1.Panel.LoadLayout("ClvDonation")
			For i=0 To gallery.Size-1
				Dim w As Map
				w=gallery.Get(i)
				Dim image = w.Get("image") As String
				Dim gambar = ""&Main.Server&"images/project/"&image As String
				
				Dim m As Map
				m.Initialize
				Dim p As Panel
				p.Initialize("")
				p.SetLayout(0,0,100%x,50%y)
				p.Color=Colors.Green
				p.LoadLayout("ListImageProjectJamaah")
			
				CustomListView1.AsView.Color= Colors.Magenta
				CustomListView1.Add(p,m)
				m.Put(ImageView1, gambar)
				CallSubDelayed2(Starter2, "Download", m)
			Next
		
			CustomListView1.sv.Height = (ImageView1.width) * CustomListView1.Size
			CustomListView1.AsView.Width = CustomListView1.sv.Height
			HorizontalScrollView1.Panel.Width = CustomListView1.sv.Height
			
		End If								
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub Button1_Click
	CodeSemua.ExecuteUrl(Main.server&"api/mosque/donation/store?id="&DonationJamaah.idWorshipplace,"project="&DonationJamaah.idSelected&"&jamaah="&HomeJamaah.id&"&fund="&EditTotal.Text&"&account="&accountId&"&public="&publicId, "Store",Me)
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