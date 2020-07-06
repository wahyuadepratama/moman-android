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
	Dim username, phone, status, id, worship_name, types, address,updated_at,avatar,worship_place_address As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private PanelMenu As Panel
	Private MainScroll As ScrollView
	Private PanelHome As Panel
	Private PanelProfile As Panel
	Private LabelName As Label
	Private LabelNumber As Label
	Private LabelUser As Label
	Private Navbar As Panel
	Private mapBtn As Button
	Private qurbanBtn As Button
	Private constructionBtn As Button
	Private orphanBtn As Button
	Private tpaBtn As Button
	Private poorBtn As Button
	Private historyBtn As Button
	Private logoutBtn As Button
	Private NavbarTitle As Label
	Private BackBtn As Button	
	Private PanelPhoto As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("HomeStewardship")
	
	PanelMenu.Height = historyBtn.Top+historyBtn.Height+12%y
	
	PanelHome.Height= PanelMenu.Height + 50%y
	MainScroll.Height=100%y-Navbar.Height
	MainScroll.Panel.Height = PanelHome.Height
	NavbarTitle.Text="Home"
	NavbarTitle.Left= 5%x
	BackBtn.Visible = False		
	
	'orphanBtn.Visible = False
	'tpaBtn.Visible = False
	'poorBtn.Visible = False

End Sub

Sub Activity_Resume
	Log("Home stewardship")
	Log("ID: "&Main.manager.GetString("id"))
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
					username = a.Get("username")
					phone = a.Get("phone")
					status = a.Get("status")
					id = a.Get ("jamaah_id")
					worship_name = a.Get("worship_name")
					types= a.Get("types")
					address= a.Get("address")
					updated_at= a.Get("updated_at")
					avatar= a.Get("avatar")
					worship_place_address= a.Get("worship_place_address")
					Log("username: "&username)
					Log("phone:"&phone)
					Log("status: "&status)
					LabelName.Text = username
					LabelNumber.Text = phone
					LabelUser.Text = status															
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

Sub constructionBtn_Click
	StartActivity(Development)
End Sub

Sub mapBtn_Click
	Main.manager.ClearAll
	Activity.Finish
	StartActivity(Main)
End Sub