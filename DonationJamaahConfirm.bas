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
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("ConfirmationDonationJamaah")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height = 100%y - MainScroll.Top
	NavbarTitle.Text="Edit disini guys ......"
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
						Log(a.Get("status_out"))
					Else
						
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

