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
	
	Private MosqueName As Label
	Private Address As Label
	Private Status As Label
	Private IDpro As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("List")
	
	MainScroll.Height = 100%y
	NavbarTitle.Text = "Infaq TPA/MDA"
	NavbarTitle.TextSize = 20
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrl(Main.server&"/api/mosque","","LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	
End Sub

Sub JobDone (Job As HttpJob)
	
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		
		Select Job.JobName
			Case "LoadData"
				Try
					Dim data_list As List
					data_list = parser.NextArray
					Log(data_list.Size)
					For i=0 To data_list.Size-1
						Dim a As Map
						a = data_list.Get(i)
						
						CLV.Add(CreateItem(a.Get("id"), a.Get("name"), "Address : "&a.Get("address"), "Infaq for TPA/MDA Available"),"")
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

Private Sub CreateItem(idproject As String, mosquetxt As String, addresstxt As String, statustxt As String) As Panel
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0%x, 0%y, 100%x,35%y)
	p.LoadLayout("ListOrphanTPAPoorJamaah")
	
	IDpro.Text = idproject
	MosqueName.Text = mosquetxt
	Address.Text = addresstxt
	Status.Text = statustxt
	
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
	
	StartActivity(TpaJamaahDetail)
End Sub