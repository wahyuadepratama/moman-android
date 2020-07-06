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
	Dim id,fund,id_clicked, name_project As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel
	Private NavbarTitle As Label
	Private CLV As CustomListView
	Private PanelListItem As Panel
	Private BtnDonationHere As Button
	Private ProjectName As Label
	Private FundNeed As Label
	Private IDpro As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	'MainScroll.Panel.LoadLayout("QurbanDonationJamaah")
	
	MainScroll.Height = 100%y
	NavbarTitle.Text = "Mosque Construction"
End Sub

Sub Activity_Resume
	Interface.ExecuteUrl(Main.server&"/api/donation","","LoadData",Me)
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
					Dim data_list As List
					data_list = parser.NextArray
					Log(data_list.Size)
					For i=0 To data_list.Size-1
						Dim a As Map
						a = data_list.Get(i)
						id = a.Get("id")
						name_project = a.Get("name")
						fund = a.Get("fund")		
						Log("ID :"&id)
						Log("Fund :"&fund)	
						CLV.Add(CreateItem(id,name_project,fund),"")
						CLV.AsView.Height = (PanelListItem.Height+4%y)*(i+1)
					Next
					
					PanelQurban.Height= CLV.AsView.Height
					CLV.sv.Height = CLV.AsView.Height
					CLV.AsView.Height = CLV.AsView.Height
					MainScroll.Panel.Height = PanelQurban.Height
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

Private Sub CreateItem(idproject As String,Title As String, Content As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0%x, 0%y, 100%x,35%y)
	p.LoadLayout("ListDonationJamaah")
	IDpro.Text = idproject
	ProjectName.Text = Title
	FundNeed.Text = "Fund Needed : "&Content
	Return p
End Sub

Sub CLV_ItemClick (Index As Int, Value As Object)
	Log(Index)
End Sub

Sub BtnDonationHere_Click
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	Dim a As B4XView
	a = p.GetView(0)
	'Log(a.GetView(0).GetView(0).Text)
	id_clicked = a.GetView(0).GetView(5).Text
	Log(id_clicked)
	StartActivity(StewardshipDonationDetail)
End Sub