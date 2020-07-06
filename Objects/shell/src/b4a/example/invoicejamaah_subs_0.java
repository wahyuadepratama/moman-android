package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class invoicejamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (invoicejamaah) ","invoicejamaah",19,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(2);
invoicejamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),invoicejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Panel.LoadLayout(\"ConfirmationDonation";
Debug.ShouldStop(4);
invoicejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ConfirmationDonationJamaah")),invoicejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(8);
invoicejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",invoicejamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 37;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(16);
invoicejamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {invoicejamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),invoicejamaah.mostCurrent.activityBA),invoicejamaah.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 38;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(32);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (invoicejamaah) ","invoicejamaah",19,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (invoicejamaah) ","invoicejamaah",19,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","activity_resume");
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/history/";
Debug.ShouldStop(512);
invoicejamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",invoicejamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(invoicejamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/history/detail?id="),invoicejamaah.mostCurrent._historyjamaah._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(invoicejamaah.getObject()));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("BtnConfirm_Click (invoicejamaah) ","invoicejamaah",19,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,134);
if (RapidSub.canDelegate("btnconfirm_click")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","btnconfirm_click");
 BA.debugLineNum = 134;BA.debugLine="Sub BtnConfirm_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="StartActivity(HistoryJamaah)";
Debug.ShouldStop(64);
invoicejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",invoicejamaah.processBA,(Object)((invoicejamaah.mostCurrent._historyjamaah.getObject())));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 24;BA.debugLine="Private Note As Label";
invoicejamaah.mostCurrent._note = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Label5 As Label";
invoicejamaah.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Label6 As Label";
invoicejamaah.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label7 As Label";
invoicejamaah.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Label8 As Label";
invoicejamaah.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelPaidInfo As Panel";
invoicejamaah.mostCurrent._panelpaidinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (invoicejamaah) ","invoicejamaah",19,invoicejamaah.mostCurrent.activityBA,invoicejamaah.mostCurrent,49);
if (RapidSub.canDelegate("jobdone")) return b4a.example.invoicejamaah.remoteMe.runUserSub(false, "invoicejamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _account = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _donation = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 49;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),invoicejamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 52;BA.debugLine="Dim res As String";
Debug.ShouldStop(524288);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 53;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1048576);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 55;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4194304);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 56;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8388608);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 59;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 61;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 62;BA.debugLine="If HistoryJamaah.statusSelected = \"true\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",invoicejamaah.mostCurrent._historyjamaah._statusselected,BA.ObjectToString("true"))) { 
 BA.debugLineNum = 63;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 64;BA.debugLine="a = parser.NextObject";
Debug.ShouldStop(-2147483648);
_a = _parser.runMethod(false,"NextObject");Debug.locals.put("a", _a);
 BA.debugLineNum = 66;BA.debugLine="NavbarTitle.Text = \"Transaction #\"&a.Get(\"id";
Debug.ShouldStop(2);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Transaction #"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 67;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(4);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 69;BA.debugLine="Label1.Text = \"Invoice Pembayaran #\"&a.Get(\"";
Debug.ShouldStop(16);
invoicejamaah.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Invoice Pembayaran #"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 70;BA.debugLine="Label2.Text = a.Get(\"datetime\")";
Debug.ShouldStop(32);
invoicejamaah.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime"))))));
 BA.debugLineNum = 72;BA.debugLine="If a.Get(\"status_out\") = \"project\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("project")))) { 
 BA.debugLineNum = 73;BA.debugLine="Label4.Text = \"Infaq Mosque Development\"";
Debug.ShouldStop(256);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Mosque Development"));
 }else 
{ BA.debugLineNum = 74;BA.debugLine="Else If a.Get(\"status_out\") = \"orphanage\" Th";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("orphanage")))) { 
 BA.debugLineNum = 75;BA.debugLine="Label4.Text = \"Infaq Orphans\"";
Debug.ShouldStop(1024);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Orphans"));
 }else 
{ BA.debugLineNum = 76;BA.debugLine="Else If a.Get(\"status_out\") = \"tpa\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("tpa")))) { 
 BA.debugLineNum = 77;BA.debugLine="Label4.Text = \"Infaq TPA/MDA\"";
Debug.ShouldStop(4096);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq TPA/MDA"));
 }else 
{ BA.debugLineNum = 78;BA.debugLine="Else If a.Get(\"status_out\") = \"poor\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("poor")))) { 
 BA.debugLineNum = 79;BA.debugLine="Label4.Text = \"Infaq Poor\"";
Debug.ShouldStop(16384);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Poor"));
 }}}}
;
 BA.debugLineNum = 82;BA.debugLine="Label12.Text = \"Payment Success (Confirmed)\"";
Debug.ShouldStop(131072);
invoicejamaah.mostCurrent._label12.runMethod(true,"setText",BA.ObjectToCharSequence("Payment Success (Confirmed)"));
 BA.debugLineNum = 83;BA.debugLine="Label10.Text = a.Get(\"fund\")";
Debug.ShouldStop(262144);
invoicejamaah.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))));
 BA.debugLineNum = 84;BA.debugLine="Label5.Text = \"Mosque\"";
Debug.ShouldStop(524288);
invoicejamaah.mostCurrent._label5.runMethod(true,"setText",BA.ObjectToCharSequence("Mosque"));
 BA.debugLineNum = 85;BA.debugLine="Label6.Text = a.Get(\"mosque_name\")";
Debug.ShouldStop(1048576);
invoicejamaah.mostCurrent._label6.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mosque_name"))))));
 BA.debugLineNum = 86;BA.debugLine="Label7.Text = \"Donatur\"";
Debug.ShouldStop(2097152);
invoicejamaah.mostCurrent._label7.runMethod(true,"setText",BA.ObjectToCharSequence("Donatur"));
 BA.debugLineNum = 87;BA.debugLine="Label8.Text = HomeJamaah.username";
Debug.ShouldStop(4194304);
invoicejamaah.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence(invoicejamaah.mostCurrent._homejamaah._username));
 BA.debugLineNum = 88;BA.debugLine="Note.Visible = False";
Debug.ShouldStop(8388608);
invoicejamaah.mostCurrent._note.runMethod(true,"setVisible",invoicejamaah.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 90;BA.debugLine="Dim b As Map";
Debug.ShouldStop(33554432);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("b", _b);
 BA.debugLineNum = 91;BA.debugLine="b = parser.NextObject";
Debug.ShouldStop(67108864);
_b = _parser.runMethod(false,"NextObject");Debug.locals.put("b", _b);
 BA.debugLineNum = 93;BA.debugLine="Dim account As Map";
Debug.ShouldStop(268435456);
_account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("account", _account);
 BA.debugLineNum = 94;BA.debugLine="account = b.Get(\"account\")";
Debug.ShouldStop(536870912);
_account.setObject(_b.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));
 BA.debugLineNum = 96;BA.debugLine="Dim donation As Map";
Debug.ShouldStop(-2147483648);
_donation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("donation", _donation);
 BA.debugLineNum = 97;BA.debugLine="donation = b.Get(\"donation\")";
Debug.ShouldStop(1);
_donation.setObject(_b.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("donation")))));
 BA.debugLineNum = 99;BA.debugLine="NavbarTitle.Text = \"Transaction #\"&donation.";
Debug.ShouldStop(4);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Transaction #"),_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 100;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(8);
invoicejamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 102;BA.debugLine="Label1.Text = \"Invoice Payment #\"&donation.G";
Debug.ShouldStop(32);
invoicejamaah.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Invoice Payment #"),_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 103;BA.debugLine="Label2.Text = donation.Get(\"datetime\")";
Debug.ShouldStop(64);
invoicejamaah.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime"))))));
 BA.debugLineNum = 105;BA.debugLine="If donation.Get(\"status_out\") = \"project\" Th";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("project")))) { 
 BA.debugLineNum = 106;BA.debugLine="Label4.Text = \"Infaq Mosque Development\"";
Debug.ShouldStop(512);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Mosque Development"));
 }else 
{ BA.debugLineNum = 107;BA.debugLine="Else If donation.Get(\"status_out\") = \"orphan";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("orphanage")))) { 
 BA.debugLineNum = 108;BA.debugLine="Label4.Text = \"Infaq Orphans\"";
Debug.ShouldStop(2048);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Orphans"));
 }else 
{ BA.debugLineNum = 109;BA.debugLine="Else If donation.Get(\"status_out\") = \"tpa\" T";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("tpa")))) { 
 BA.debugLineNum = 110;BA.debugLine="Label4.Text = \"Infaq TPA/MDA\"";
Debug.ShouldStop(8192);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq TPA/MDA"));
 }else 
{ BA.debugLineNum = 111;BA.debugLine="Else If donation.Get(\"status_out\") = \"poor\"";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_out")))),RemoteObject.createImmutable(("poor")))) { 
 BA.debugLineNum = 112;BA.debugLine="Label4.Text = \"Infaq Poor\"";
Debug.ShouldStop(32768);
invoicejamaah.mostCurrent._label4.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Poor"));
 }}}}
;
 BA.debugLineNum = 115;BA.debugLine="Label12.Text = \"Waiting Confirmation\"";
Debug.ShouldStop(262144);
invoicejamaah.mostCurrent._label12.runMethod(true,"setText",BA.ObjectToCharSequence("Waiting Confirmation"));
 BA.debugLineNum = 116;BA.debugLine="Label10.Text = donation.Get(\"fund\")";
Debug.ShouldStop(524288);
invoicejamaah.mostCurrent._label10.runMethod(true,"setText",BA.ObjectToCharSequence(_donation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))));
 BA.debugLineNum = 117;BA.debugLine="Label6.Text = account.Get(\"owner\")";
Debug.ShouldStop(1048576);
invoicejamaah.mostCurrent._label6.runMethod(true,"setText",BA.ObjectToCharSequence(_account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("owner"))))));
 BA.debugLineNum = 118;BA.debugLine="Label8.Text = account.Get(\"account_number\")&";
Debug.ShouldStop(2097152);
invoicejamaah.mostCurrent._label8.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_number")))),RemoteObject.createImmutable(" ("),_account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 119;BA.debugLine="Note.Text = \"Note: Please confirmation your";
Debug.ShouldStop(4194304);
invoicejamaah.mostCurrent._note.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Note: Please confirmation your payment to mosque's stewardship number: "),_account.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("whatsapp")))),RemoteObject.createImmutable(" (Whatsapp)"))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e59) {
			BA.rdebugUtils.runVoidMethod("setLastException",invoicejamaah.processBA, e59.toString()); BA.debugLineNum = 123;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(invoicejamaah.mostCurrent.__c.runMethod(false,"LastException",invoicejamaah.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 128;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(-2147483648);
invoicejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(1);
invoicejamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(invoicejamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 131;BA.debugLine="Job.Release";
Debug.ShouldStop(4);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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