B4A=true
Group=Default Group\Stewardship
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
	Private Part2 As Label
	Private Part3 As Label
	Private Part4 As Label
	Private Part5 As Label
	Private Part6 As Label
	Private Part7 As Label
	Private Part8 As Label
	Private Part9 As Label
	Private Part10 As Label
	Private Part11 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("DetailQurbanConfirmation")
	MainScroll.Panel.Height= PanelQurban.Height
	MainScroll.Height = 100%y - MainScroll.Top
	
	NavbarTitle.Text="Qurban Detail"
	NavbarTitle.TextSize = 20
End Sub

Sub Activity_Resume
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/confirmation/detail?id="&QurbanStewardship.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	
	If Job.Success = True Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		
		Log("Response from server-------------- :"& res)
		
		If Job.JobName = "success" Then
			Activity.Finish
			StartActivity(Me)
		End If
		
		Select Job.JobName
			Case "LoadData"
				Try					
					Dim parser As JSONParser
					parser.Initialize(Job.GetString)
					Dim b As Map = parser.NextObject
					
					Dim info As Map : info.Initialize
					info = b.Get("info")
					
					Dim participant As List : participant.Initialize
					participant = b.Get("participant")
					
					Label4.Text = ": "&info.Get("animal_type")
					Label6.Text = ": "&info.Get("fund")
					Label8.Text = ": "&info.Get("datetime")
					Dim status As String = info.Get("confirmation")
					If status = False Then
						Label12.Text = ": Checking"
						Label12.TextColor = Colors.Red
					Else
						Label12.Text = ": Confirmed"
						Label12.TextColor = Colors.Green						
					End If
					
					If participant.Size = 1 Then						
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Part3.Visible = False
						Part4.Visible = False
						Part5.Visible = False
						Part6.Visible = False
						Part7.Visible = False
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 2 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Part4.Visible = False
						Part5.Visible = False
						Part6.Visible = False
						Part7.Visible = False
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 3 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Part5.Visible = False
						Part6.Visible = False
						Part7.Visible = False
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 4 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Part6.Visible = False
						Part7.Visible = False
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 5 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Part7.Visible = False
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 6 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Dim part_7 As Map
						part_7 = participant.Get(5)
						Part7.Text = " - "&part_7.Get("name")
						
						Part8.Visible = False
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 7 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Dim part_7 As Map
						part_7 = participant.Get(5)
						Part7.Text = " - "&part_7.Get("name")
						
						Dim part_8 As Map
						part_8 = participant.Get(6)
						Part8.Text = " - "&part_8.Get("name")
						
						Part9.Visible = False
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 8 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Dim part_7 As Map
						part_7 = participant.Get(5)
						Part7.Text = " - "&part_7.Get("name")
						
						Dim part_8 As Map
						part_8 = participant.Get(6)
						Part8.Text = " - "&part_8.Get("name")
						
						Dim part_9 As Map
						part_9 = participant.Get(7)
						Part9.Text = " - "&part_9.Get("name")
						
						Part10.Visible = False
						Part11.Visible = False
					Else If participant.Size = 9 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Dim part_7 As Map
						part_7 = participant.Get(5)
						Part7.Text = " - "&part_7.Get("name")
						
						Dim part_8 As Map
						part_8 = participant.Get(6)
						Part8.Text = " - "&part_8.Get("name")
						
						Dim part_9 As Map
						part_9 = participant.Get(7)
						Part9.Text = " - "&part_9.Get("name")
						
						Dim part_10 As Map
						part_10 = participant.Get(8)
						Part10.Text = " - "&part_10.Get("name")
						
						Part11.Visible = False
					Else If participant.Size = 10 Then
						Dim part_2 As Map
						part_2 = participant.Get(0)
						Part2.Text = " - "&part_2.Get("name")
						
						Dim part_3 As Map
						part_3 = participant.Get(1)
						Part3.Text = " - "&part_3.Get("name")
						
						Dim part_4 As Map
						part_4 = participant.Get(2)
						Part4.Text = " - "&part_4.Get("name")
												
						Dim part_5 As Map
						part_5 = participant.Get(3)
						Part5.Text = " - "&part_5.Get("name")
						
						Dim part_6 As Map
						part_6 = participant.Get(4)
						Part6.Text = " - "&part_6.Get("name")
						
						Dim part_7 As Map
						part_7 = participant.Get(5)
						Part7.Text = " - "&part_7.Get("name")
						
						Dim part_8 As Map
						part_8 = participant.Get(6)
						Part8.Text = " - "&part_8.Get("name")
						
						Dim part_9 As Map
						part_9 = participant.Get(7)
						Part9.Text = " - "&part_9.Get("name")
						
						Dim part_10 As Map
						part_10 = participant.Get(8)
						Part10.Text = " - "&part_10.Get("name")
						
						Dim part_11 As Map
						part_11 = participant.Get(9)
						Part11.Text = " - "&part_11.Get("name")
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
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/confirmation/store?id="&QurbanStewardship.idSelected,"success",Me)
	Msgbox("Transaction Qurban #"&QurbanStewardship.idSelected&" confirmed!", "Confirmation Success!")
End Sub
