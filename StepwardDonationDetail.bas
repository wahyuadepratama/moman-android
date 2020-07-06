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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private PanelQurban As Panel
	Private Button1 As Button
	Private NavbarTitle As Label
	Dim spinAccount As Map
	Private SpinPengurus As Spinner
	Private CheckGuna As CheckBox
	Private CheckHamba As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("DonationDetail")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height =100%y - MainScroll.Top
	NavbarTitle.Text = "Development"
	CheckGuna.Text = "Public"
	CheckHamba.Text = "Private"
End Sub

Sub Activity_Resume
	spinAccount.Initialize
	spinAccount.Clear
	CodeSemua.ExecuteUrlGet(Main.server&"api/donation/detail?id="&Development.id_clicked,"LoadData",Me)
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
					Dim root As Map = parser.NextObject
					Dim project As Map = root.Get("project")
					Dim worship_place_id As String = project.Get("worship_place_id")
					Dim worship_id As String = project.Get("worship_id")
					Dim fund As String = project.Get("fund")
					Dim name As String = project.Get("name")
					Dim description As String = project.Get("description")
					Dim progress As String = project.Get("progress")
					Dim id As String = project.Get("id")
					Dim worship As String = project.Get("worship")
					Dim account As List = root.Get("account")
					For Each colaccount As Map In account
						Dim whatsapp As String = colaccount.Get("whatsapp")
						Dim owner As String = colaccount.Get("owner")
						Dim account_number As String = colaccount.Get("account_number")
						Dim bank As String = colaccount.Get("bank")
						Dim phone As String = colaccount.Get("phone")
						Dim stewardship_id As String = colaccount.Get("stewardship_id")
						Dim id As String = colaccount.Get("id")
						Dim username As String = colaccount.Get("username")
						Log("Owner: "&owner)
						SpinPengurus.Add(owner)
						spinAccount.Put(id,owner)
					Next
				
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

Sub Button1_Click
	StartActivity(DonationConfirm)
End Sub