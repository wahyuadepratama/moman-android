package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanstewardshipdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanstewardshipdetail) ","qurbanstewardshipdetail",20,qurbanstewardshipdetail.mostCurrent.activityBA,qurbanstewardshipdetail.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanstewardshipdetail.remoteMe.runUserSub(false, "qurbanstewardshipdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(32);
qurbanstewardshipdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),qurbanstewardshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="MainScroll.Panel.LoadLayout(\"DetailQurbanConfirma";
Debug.ShouldStop(64);
qurbanstewardshipdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DetailQurbanConfirmation")),qurbanstewardshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(128);
qurbanstewardshipdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanstewardshipdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(256);
qurbanstewardshipdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanstewardshipdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanstewardshipdetail.mostCurrent.activityBA),qurbanstewardshipdetail.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 43;BA.debugLine="NavbarTitle.Text=\"Qurban Detail\"";
Debug.ShouldStop(1024);
qurbanstewardshipdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Qurban Detail"));
 BA.debugLineNum = 44;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(2048);
qurbanstewardshipdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (qurbanstewardshipdetail) ","qurbanstewardshipdetail",20,qurbanstewardshipdetail.mostCurrent.activityBA,qurbanstewardshipdetail.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanstewardshipdetail.remoteMe.runUserSub(false, "qurbanstewardshipdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (qurbanstewardshipdetail) ","qurbanstewardshipdetail",20,qurbanstewardshipdetail.mostCurrent.activityBA,qurbanstewardshipdetail.mostCurrent,47);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanstewardshipdetail.remoteMe.runUserSub(false, "qurbanstewardshipdetail","activity_resume");
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="QurbanStewardship.idSelected = QurbanStewardship.";
Debug.ShouldStop(32768);
qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected = qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 49;BA.debugLine="Log(\"------------------> \"&QurbanStewardship.idSe";
Debug.ShouldStop(65536);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("------------------> "),qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected)));
 BA.debugLineNum = 50;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/i";
Debug.ShouldStop(131072);
qurbanstewardshipdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanstewardshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanstewardshipdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/invoice?invoice="),qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanstewardshipdetail.getObject()));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfirm_click() throws Exception{
try {
		Debug.PushSubsStack("BtnConfirm_Click (qurbanstewardshipdetail) ","qurbanstewardshipdetail",20,qurbanstewardshipdetail.mostCurrent.activityBA,qurbanstewardshipdetail.mostCurrent,95);
if (RapidSub.canDelegate("btnconfirm_click")) return b4a.example.qurbanstewardshipdetail.remoteMe.runUserSub(false, "qurbanstewardshipdetail","btnconfirm_click");
 BA.debugLineNum = 95;BA.debugLine="Sub BtnConfirm_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/c";
Debug.ShouldStop(-2147483648);
qurbanstewardshipdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanstewardshipdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanstewardshipdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/confirmation?id="),qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected,RemoteObject.createImmutable("&total="),qurbanstewardshipdetail.mostCurrent._valueconfirmation.runMethod(true,"getText"),RemoteObject.createImmutable("&unpaid="),qurbanstewardshipdetail.mostCurrent._valueunpaid.runMethod(true,"getText"))),(Object)(BA.ObjectToString("success")),(Object)(qurbanstewardshipdetail.getObject()));
 BA.debugLineNum = 97;BA.debugLine="Msgbox(\"Transaction Qurban #\"&QurbanStewardship.i";
Debug.ShouldStop(1);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Transaction Qurban #"),qurbanstewardshipdetail.mostCurrent._qurbanstewardship._idselected,RemoteObject.createImmutable(" confirmed!")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Confirmation Success!"))),qurbanstewardshipdetail.mostCurrent.activityBA);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
qurbanstewardshipdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelQurban As Panel";
qurbanstewardshipdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnConfirm As Button";
qurbanstewardshipdetail.mostCurrent._btnconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
qurbanstewardshipdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
qurbanstewardshipdetail.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label1 As Label";
qurbanstewardshipdetail.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
qurbanstewardshipdetail.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label10 As Label";
qurbanstewardshipdetail.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label12 As Label";
qurbanstewardshipdetail.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label5 As Label";
qurbanstewardshipdetail.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Label6 As Label";
qurbanstewardshipdetail.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Label7 As Label";
qurbanstewardshipdetail.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LabelDate As Label";
qurbanstewardshipdetail.mostCurrent._labeldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private valueUnpaid As Label";
qurbanstewardshipdetail.mostCurrent._valueunpaid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private valuePaid As Label";
qurbanstewardshipdetail.mostCurrent._valuepaid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private valueStatus As Label";
qurbanstewardshipdetail.mostCurrent._valuestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelPaidInfo As Panel";
qurbanstewardshipdetail.mostCurrent._panelpaidinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private valuePaymentInfo As Label";
qurbanstewardshipdetail.mostCurrent._valuepaymentinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private valueConfirmation As Label";
qurbanstewardshipdetail.mostCurrent._valueconfirmation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (qurbanstewardshipdetail) ","qurbanstewardshipdetail",20,qurbanstewardshipdetail.mostCurrent.activityBA,qurbanstewardshipdetail.mostCurrent,57);
if (RapidSub.canDelegate("jobdone")) return b4a.example.qurbanstewardshipdetail.remoteMe.runUserSub(false, "qurbanstewardshipdetail","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 57;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),qurbanstewardshipdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 61;BA.debugLine="If Job.JobName = \"success\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("success"))) { 
 BA.debugLineNum = 62;BA.debugLine="StartActivity(QurbanStewardship)";
Debug.ShouldStop(536870912);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardshipdetail.processBA,(Object)((qurbanstewardshipdetail.mostCurrent._qurbanstewardship.getObject())));
 };
 BA.debugLineNum = 65;BA.debugLine="Dim res As String";
Debug.ShouldStop(1);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 66;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(2);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 67;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(4);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 68;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 69;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 70;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 72;BA.debugLine="Label2.Text = root.Get(\"id\")";
Debug.ShouldStop(128);
qurbanstewardshipdetail.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 73;BA.debugLine="LabelDate.Text = root.Get(\"date\")";
Debug.ShouldStop(256);
qurbanstewardshipdetail.mostCurrent._labeldate.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date"))))));
 BA.debugLineNum = 74;BA.debugLine="Label4.Text = root.Get(\"worship_place\")";
Debug.ShouldStop(512);
qurbanstewardshipdetail.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_place"))))));
 BA.debugLineNum = 75;BA.debugLine="Label6.Text = root.Get(\"animal_price\")";
Debug.ShouldStop(1024);
qurbanstewardshipdetail.mostCurrent._label6.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("animal_price"))))));
 BA.debugLineNum = 76;BA.debugLine="Label10.Text = root.Get(\"total_order\")";
Debug.ShouldStop(2048);
qurbanstewardshipdetail.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_order"))))));
 BA.debugLineNum = 77;BA.debugLine="valueUnpaid.Text = root.Get(\"unpaid\")";
Debug.ShouldStop(4096);
qurbanstewardshipdetail.mostCurrent._valueunpaid.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unpaid"))))));
 BA.debugLineNum = 78;BA.debugLine="valuePaid.Text = root.Get(\"paid\")";
Debug.ShouldStop(8192);
qurbanstewardshipdetail.mostCurrent._valuepaid.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("paid"))))));
 BA.debugLineNum = 79;BA.debugLine="valueStatus.Text = root.Get(\"payment_completed\")";
Debug.ShouldStop(16384);
qurbanstewardshipdetail.mostCurrent._valuestatus.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed"))))));
 BA.debugLineNum = 80;BA.debugLine="valuePaymentInfo.Text = root.Get(\"bank\")&\" (\"&ro";
Debug.ShouldStop(32768);
qurbanstewardshipdetail.mostCurrent._valuepaymentinfo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(" ("),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rekening_number")))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 82;BA.debugLine="If root.Get(\"payment_completed\") = \"Payment Comp";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed")))),RemoteObject.createImmutable(("Payment Completed")))) { 
 BA.debugLineNum = 83;BA.debugLine="valueStatus.TextColor = Colors.Green";
Debug.ShouldStop(262144);
qurbanstewardshipdetail.mostCurrent._valuestatus.runMethod(true,"setTextColor",qurbanstewardshipdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 84;BA.debugLine="valueConfirmation.Visible = False";
Debug.ShouldStop(524288);
qurbanstewardshipdetail.mostCurrent._valueconfirmation.runMethod(true,"setVisible",qurbanstewardshipdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 85;BA.debugLine="BtnConfirm.Visible = False";
Debug.ShouldStop(1048576);
qurbanstewardshipdetail.mostCurrent._btnconfirm.runMethod(true,"setVisible",qurbanstewardshipdetail.mostCurrent.__c.getField(true,"False"));
 };
 }else {
 BA.debugLineNum = 89;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16777216);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(33554432);
qurbanstewardshipdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(qurbanstewardshipdetail.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 92;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}