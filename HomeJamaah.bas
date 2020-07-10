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
	Dim username, phone, status, id, worship_name, types, address,updated_at,avatar,worship_place_address As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelHome As Panel
	Private LabelName As Label
	Private LabelNumber As Label
	Private LabelUser As Label
	Private Navbar As Panel
	Private PanelMenu As Panel
	Private NavbarTitle As Label
	Private BackBtn As Button
	Private mapBtn As Button
	Private qurbanBtn As Button
	Private constructionBtn As Button	
	Private PanelPhoto As ImageView
	Private constructionBtn As Button
	Private orphanBtn As Button
	Private tpaBtn As Button
	Private poorBtn As Button
	Private historyBtn As Button
	Private logoutBtn As Button
	Private historyLabel As Label
	Private logoutLabel As Label
	
	Private PanelBanner As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)	
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("HomeJamaah")
	
	PanelMenu.Height = logoutLabel.Top+logoutLabel.Height+12%y
	PanelHome.Height= PanelMenu.Height + 50%y
	
	MainScroll.Height=100%y-Navbar.Height
	MainScroll.Panel.Height = PanelHome.Height
	
	NavbarTitle.Text="Home Jamaah"
	NavbarTitle.TextSize = 22
	NavbarTitle.Left=4%x
	BackBtn.Visible = False	
	
End Sub

Sub Activity_Resume	
	CodeSemua.ExecuteUrl(Main.server&"api/_users","id="&Main.manager.GetString("id"),"LoadData",Me)	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Log("Response from server :"& res)
		Select Job.JobName
			Case "LoadData"
				Try
					Dim a As Map
					a = parser.NextObject
					id = Main.manager.GetString("id")				
					
					LabelName.TextColor = Colors.Black
					LabelNumber.TextColor = Colors.Black
					LabelUser.TextColor = Colors.Black
					
					LabelName.Text = a.Get("name")&" / @"&a.Get("username")
					LabelNumber.Text = a.Get("id")
					LabelUser.Text = a.Get("phone")
					Main.username = a.Get("username")
					Main.id = a.Get("id")
					
					Dim path As String = ""&Main.server&"images/avatar/"&a.Get("avatar")					
					Dim m As Map
					m.Initialize
					m.Put(PanelPhoto,path)					
					CallSubDelayed2(Starter, "Download", m)					
														
				Catch
					Log(LastException)
					Msgbox("Wrong username or password","Login Failed")
				End Try
		End Select
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub logoutBtn_Click
	Main.manager.ClearAll
	Activity.Finish
	StartActivity(Main)
End Sub

Sub constructionBtn_Click	
	StartActivity(DonationJamaah)
End Sub

Sub qurbanBtn_Click
	StartActivity(QurbanJamaah)
End Sub

Sub mapBtn_Click
	StartActivity(MapsJamaah)
End Sub

Sub orphanBtn_Click
	StartActivity(OrphansJamaah)
End Sub

Sub tpaBtn_Click
	StartActivity(InvoiceJamaah)
End Sub

Sub poorBtn_Click
	StartActivity(PoorJamaah)
End Sub

Sub historyBtn_Click
	StartActivity(HistoryJamaah)
End Sub