B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub SetBackgroundTintList(View As View,Active As Int, Enabled As Int)
	Dim States(2,1) As Int
	States(0,0) = 16842908     'Active
	States(1,0) = 16842910    'Enabled
	Dim Color(2) As Int = Array As Int(Active,Enabled)
	Dim CSL As JavaObject
	CSL.InitializeNewInstance("android.content.res.ColorStateList",Array As Object(States,Color))
	Dim jo As JavaObject
	jo.InitializeStatic("android.support.v4.view.ViewCompat")
	jo.RunMethod("setBackgroundTintList", Array(View, CSL))
End Sub

Sub ExecuteUrl(Url As String, Parameters As String, JobName As String, Objek As Object)
	Dim job As HttpJob
	job.Initialize(JobName, Objek)
	job.PostString(Url,Parameters)
End Sub

Sub ExecuteUrlGet(Url As String, JobName As String, Objek As Object)
	Dim job As HttpJob
	job.Initialize(JobName, Objek)
	job.Download(Url)
End Sub

Sub SetCBDrawable(CB As RadioButton,BoxColor As Int,BoxWidth As Int,TickColor As Int,TickChar As String,DisabledColor As Int,Size As Int,Padding As Int)
	Dim SLD As StateListDrawable
	SLD.Initialize
	
	Dim BMEnabled,BMChecked,BMDisabled As Bitmap
	BMEnabled.InitializeMutable(Size,Size)
	BMChecked.InitializeMutable(Size,Size)
	BMDisabled.InitializeMutable(Size,Size)
	'Draw Enabled State
	Dim CNV As Canvas
	CNV.Initialize2(BMEnabled)
	Dim Rect1 As Rect
	Rect1.Initialize(Padding ,Padding ,Size - Padding ,Size - Padding)
	CNV.DrawRect(Rect1,BoxColor,False,BoxWidth)
	Dim Enabled,Checked,Disabled As BitmapDrawable
	Enabled.Initialize(BMEnabled)
	'Draw Selected state
	Dim CNV1 As Canvas
	CNV1.Initialize2(BMChecked)
	If TickChar = "Fill" Then
		CNV1.DrawRect(Rect1,TickColor,True,BoxWidth)
		CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)
	Else
		CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)
		'Start small and find the largest font that allows the tick to fit in the box
		Dim FontSize As Int = 6
		Do While CNV.MeasureStringHeight(TickChar,Typeface.DEFAULT,FontSize) < Size - (BoxWidth * 2) - (Padding * 2)
			FontSize = FontSize + 1
		Loop
		FontSize = FontSize - 1
		'Draw the TickChar centered in the box
		CNV1.DrawText(TickChar,Size/2,(Size + CNV.MeasureStringHeight(TickChar,Typeface.DEFAULT,FontSize))/2,Typeface.DEFAULT,FontSize,TickColor,"CENTER")
	End If
	Checked.Initialize(BMChecked)
	'Draw disabled State
	Dim CNV2 As Canvas
	CNV2.Initialize2(BMDisabled)
	CNV2.DrawRect(Rect1,DisabledColor,True,BoxWidth)
	CNV2.DrawRect(Rect1,BoxColor,False,BoxWidth)
	Disabled.Initialize(BMDisabled)
	
	'Add to the StateList Drawable
	SLD.AddState(SLD.State_Disabled,Disabled)
	SLD.AddState(SLD.State_Checked,Checked)
	SLD.AddState(SLD.State_Enabled,Enabled)
	SLD.AddCatchAllState(Enabled)
	'Add SLD to the Checkbox
	Dim JO As JavaObject = CB
	JO.RunMethod("setButtonDrawable",Array As Object(SLD))
End Sub

'--------------------------------------- Untuk image ----------------------------------'

