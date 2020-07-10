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
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private LabelDate As Label
	Private valueUnpaid As Label
	Private valuePaid As Label
	Private valueStatus As Label
	Private PanelPaidInfo As Panel
	Private valuePaymentInfo As Label
	Private valueConfirmation As Label
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
	QurbanStewardship.idSelected = QurbanStewardship.idSelected.Replace("#", "")
	Log("------------------> "&QurbanStewardship.idSelected)
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/invoice?invoice="&QurbanStewardship.idSelected,"LoadData",Me)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	
	If Job.Success = True Then
		
		If Job.JobName = "success" Then
			StartActivity(QurbanStewardship)
		End If
		
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log(Job.GetString)
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)		
		Dim root As Map = parser.NextObject
		
		Label2.Text = root.Get("id")
		LabelDate.Text = root.Get("date")
		Label4.Text = root.Get("worship_place")
		Label6.Text = root.Get("animal_price")
		Label10.Text = root.Get("total_order")
		valueUnpaid.Text = root.Get("unpaid")
		valuePaid.Text = root.Get("paid")
		valueStatus.Text = root.Get("payment_completed")
		valuePaymentInfo.Text = root.Get("bank")&" ("&root.Get("rekening_number")&")"		
		
		If root.Get("payment_completed") = "Payment Completed" Then
			valueStatus.TextColor = Colors.Green
			valueConfirmation.Visible = False
			BtnConfirm.Visible = False
		End If
		
	Else
		Log("Error: " & Job.ErrorMessage)
		ToastMessageShow("Error: " & Job.ErrorMessage, True)
	End If
	Job.Release
End Sub

Sub BtnConfirm_Click
	CodeSemua.ExecuteUrlGet(Main.server&"api/qurban/confirmation?id="&QurbanStewardship.idSelected&"&total="&valueConfirmation.Text&"&unpaid="&valueUnpaid.Text,"success",Me)
	Msgbox("Transaction Qurban #"&QurbanStewardship.idSelected&" confirmed!", "Confirmation Success!")
End Sub
