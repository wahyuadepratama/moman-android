package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class invoicejamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (invoicejamaah) ","invoicejamaah",7,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(128);
invoicejamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),invoicejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Panel.LoadLayout(\"ConfirmationDonation";
Debug.ShouldStop(256);
invoicejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ConfirmationDonationJamaah")),invoicejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(512);
invoicejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",invoicejamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(1024);
invoicejamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {invoicejamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),invoicejamaah.mostCurrent.activityBA),invoicejamaah.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 44;BA.debugLine="NavbarTitle.Text = \"Invoice\"";
Debug.ShouldStop(2048);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Invoice"));
 BA.debugLineNum = 45;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(4096);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (invoicejamaah) ","invoicejamaah",7,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Activity_Resume (invoicejamaah) ","invoicejamaah",7,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_resume");
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="If HistoryJamaah.invoiceSelected = \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",invoicejamaah.mostCurrent._historyjamaah._invoiceselected,BA.ObjectToString(""))) { 
 BA.debugLineNum = 50;BA.debugLine="id = QurbanJamaahDetail.invoiceSelected";
Debug.ShouldStop(131072);
invoicejamaah.mostCurrent._id = invoicejamaah.mostCurrent._qurbanjamaahdetail._invoiceselected;
 }else {
 BA.debugLineNum = 52;BA.debugLine="id = HistoryJamaah.invoiceSelected";
Debug.ShouldStop(524288);
invoicejamaah.mostCurrent._id = invoicejamaah.mostCurrent._historyjamaah._invoiceselected;
 };
 BA.debugLineNum = 55;BA.debugLine="id = id.Replace(\"#\", \"\")";
Debug.ShouldStop(4194304);
invoicejamaah.mostCurrent._id = invoicejamaah.mostCurrent._id.runMethod(true,"replace",(Object)(BA.ObjectToString("#")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 56;BA.debugLine="Log(\"id --> \"&id)";
Debug.ShouldStop(8388608);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("id --> "),invoicejamaah.mostCurrent._id)));
 BA.debugLineNum = 57;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/i";
Debug.ShouldStop(16777216);
invoicejamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",invoicejamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(invoicejamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/invoice?invoice="),invoicejamaah.mostCurrent._id)),(Object)(BA.ObjectToString("LoadData")),(Object)(invoicejamaah.getObject()));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("BtnConfirm_Click (invoicejamaah) ","invoicejamaah",7,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,97);
if (RapidSub.canDelegate("btnconfirm_click")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","btnconfirm_click");
 BA.debugLineNum = 97;BA.debugLine="Sub BtnConfirm_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="StartActivity(HomeJamaah)";
Debug.ShouldStop(2);
invoicejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",invoicejamaah.processBA,(Object)((invoicejamaah.mostCurrent._homejamaah.getObject())));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
invoicejamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelQurban As Panel";
invoicejamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnConfirm As Button";
invoicejamaah.mostCurrent._btnconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
invoicejamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label2 As Label";
invoicejamaah.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label1 As Label";
invoicejamaah.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
invoicejamaah.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label10 As Label";
invoicejamaah.mostCurrent._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label12 As Label";
invoicejamaah.mostCurrent._label12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Label5 As Label";
invoicejamaah.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Label6 As Label";
invoicejamaah.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Label7 As Label";
invoicejamaah.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private LabelDate As Label";
invoicejamaah.mostCurrent._labeldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private valueUnpaid As Label";
invoicejamaah.mostCurrent._valueunpaid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private valuePaid As Label";
invoicejamaah.mostCurrent._valuepaid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private valueStatus As Label";
invoicejamaah.mostCurrent._valuestatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelPaidInfo As Panel";
invoicejamaah.mostCurrent._panelpaidinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private valuePaymentInfo As Label";
invoicejamaah.mostCurrent._valuepaymentinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private valueConfirmation As Label";
invoicejamaah.mostCurrent._valueconfirmation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim id As String";
invoicejamaah.mostCurrent._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (invoicejamaah) ","invoicejamaah",7,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,64);
if (RapidSub.canDelegate("jobdone")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 64;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 66;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),invoicejamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 67;BA.debugLine="Dim res As String";
Debug.ShouldStop(4);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 68;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(8);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 69;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(16);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 70;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 71;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(64);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 72;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(128);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 73;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 75;BA.debugLine="Label2.Text = root.Get(\"id\")";
Debug.ShouldStop(1024);
invoicejamaah.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 76;BA.debugLine="LabelDate.Text = root.Get(\"date\")";
Debug.ShouldStop(2048);
invoicejamaah.mostCurrent._labeldate.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date"))))));
 BA.debugLineNum = 77;BA.debugLine="Label4.Text = root.Get(\"worship_place\")";
Debug.ShouldStop(4096);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_place"))))));
 BA.debugLineNum = 78;BA.debugLine="Label6.Text = root.Get(\"animal_price\")";
Debug.ShouldStop(8192);
invoicejamaah.mostCurrent._label6.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("animal_price"))))));
 BA.debugLineNum = 79;BA.debugLine="Label10.Text = root.Get(\"total_order\")";
Debug.ShouldStop(16384);
invoicejamaah.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_order"))))));
 BA.debugLineNum = 80;BA.debugLine="valueUnpaid.Text = root.Get(\"unpaid\")";
Debug.ShouldStop(32768);
invoicejamaah.mostCurrent._valueunpaid.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unpaid"))))));
 BA.debugLineNum = 81;BA.debugLine="valuePaid.Text = root.Get(\"paid\")";
Debug.ShouldStop(65536);
invoicejamaah.mostCurrent._valuepaid.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("paid"))))));
 BA.debugLineNum = 82;BA.debugLine="valueStatus.Text = root.Get(\"payment_completed\")";
Debug.ShouldStop(131072);
invoicejamaah.mostCurrent._valuestatus.runMethod(true,"setText",BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed"))))));
 BA.debugLineNum = 83;BA.debugLine="valuePaymentInfo.Text = root.Get(\"bank\")&\" (\"&ro";
Debug.ShouldStop(262144);
invoicejamaah.mostCurrent._valuepaymentinfo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(" ("),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rekening_number")))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 84;BA.debugLine="valueConfirmation.Text = root.Get(\"stewardship\")";
Debug.ShouldStop(524288);
invoicejamaah.mostCurrent._valueconfirmation.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stewardship")))),RemoteObject.createImmutable(" ("),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("stewardship_phone")))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 86;BA.debugLine="If root.Get(\"payment_completed\") = \"Payment Comp";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed")))),RemoteObject.createImmutable(("Payment Completed")))) { 
 BA.debugLineNum = 87;BA.debugLine="valueStatus.TextColor = Colors.Green";
Debug.ShouldStop(4194304);
invoicejamaah.mostCurrent._valuestatus.runMethod(true,"setTextColor",invoicejamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 };
 }else {
 BA.debugLineNum = 91;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(67108864);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(134217728);
invoicejamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(invoicejamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 94;BA.debugLine="Job.Release";
Debug.ShouldStop(536870912);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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