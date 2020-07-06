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
	Private PanelQurban As Panel
	Private BtnConfirm As Button
	Private NavbarTitle As Label
	Private Label2 As Label
	Private Label1 As Label
	Private Label4 As Label
	Private Label10 As Label
	Private Label12 As Label
	Private Note As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private Label8 As Label
	Private PanelPaidInfo As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("ConfirmationDonationJamaah")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height = 100%y - MainScroll.Top	
	NavbarTitle.TextSize = 20
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrlGet(Main.server&"api/history/detail?id="&HistoryJamaah.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		
		'Log("Response from server :"& res)
		Select Job.JobName
			Case "LoadData"
				Try
					If HistoryJamaah.statusSelected = "true" Then
						Dim a As Map
						a = parser.NextObject
						
						NavbarTitle.Text = "Transaction #"&a.Get("id")
						NavbarTitle.TextSize = 20
						
						Label1.Text = "Invoice Pembayaran #"&a.Get("id")
						Label2.Text = a.Get("datetime")
						
						If a.Get("status_out") = "project" Then
							Label4.Text = "Infaq Mosque Development"
						Else If a.Get("status_out") = "orphanage" Then
							Label4.Text = "Infaq Orphans"
						Else If a.Get("status_out") = "tpa" Then
							Label4.Text = "Infaq TPA/MDA"
						Else If a.Get("status_out") = "poor" Then
							Label4.Text = "Infaq Poor"
						End If
						
						Label12.Text = "Payment Success (Confirmed)"
						Label10.Text = a.Get("fund")
						Label5.Text = "Mosque"
						Label6.Text = a.Get("mosque_name")
						Label7.Text = "Donatur"
						Label8.Text = HomeJamaah.username
						Note.Visible = False
					Else
						Dim b As Map
						b = parser.NextObject
						
						Dim account As Map
						account = b.Get("account")
						
						Dim donation As Map
						donation = b.Get("donation")
						
						NavbarTitle.Text = "Transaction #"&donation.Get("id")
						NavbarTitle.TextSize = 20
						
						Label1.Text = "Invoice Payment #"&donation.Get("id")
						Label2.Text = donation.Get("datetime")
						
						If donation.Get("status_out") = "project" Then
							Label4.Text = "Infaq Mosque Development"
						Else If donation.Get("status_out") = "orphanage" Then
							Label4.Text = "Infaq Orphans"
						Else If donation.Get("status_out") = "tpa" Then
							Label4.Text = "Infaq TPA/MDA"
						Else If donation.Get("status_out") = "poor" Then
							Label4.Text = "Infaq Poor"
						End If
						
						Label12.Text = "Waiting Confirmation"
						Label10.Text = donation.Get("fund")
						Label6.Text = account.Get("owner")
						Label8.Text = account.Get("account_number")&" ("&account.Get("bank")&")"
						Note.Text = "Note: Please confirmation your payment to mosque's stewardship number: "&account.Get("whatsapp")&" (Whatsapp)"
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

Sub BtnConfirm_Click
	StartActivity(HistoryJamaah)
End Sub
