package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanjamaahdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(128);
qurbanjamaahdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Panel.LoadLayout(\"QurbanJamaahDetail\")";
Debug.ShouldStop(256);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("QurbanJamaahDetail")),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Height =100%y";
Debug.ShouldStop(512);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",qurbanjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaahdetail.mostCurrent.activityBA));
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Height=100%y - Navbar.Height";
Debug.ShouldStop(1024);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaahdetail.mostCurrent.activityBA),qurbanjamaahdetail.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(2048);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanjamaahdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 46;BA.debugLine="pengurus.Initialize";
Debug.ShouldStop(8192);
qurbanjamaahdetail.mostCurrent._pengurus.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="types.Initialize";
Debug.ShouldStop(16384);
qurbanjamaahdetail.mostCurrent._types.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
Debug.ShouldStop(65536);
qurbanjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"setDropdownBackgroundColor",qurbanjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="MosqueName.TextColor= Colors.Black";
Debug.ShouldStop(131072);
qurbanjamaahdetail.mostCurrent._mosquename.runMethod(true,"setTextColor",qurbanjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 51;BA.debugLine="DeadlinePayment.TextColor= Colors.Black";
Debug.ShouldStop(262144);
qurbanjamaahdetail.mostCurrent._deadlinepayment.runMethod(true,"setTextColor",qurbanjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 54;BA.debugLine="NavbarTitle.Text = \"Detail Qurban\"";
Debug.ShouldStop(2097152);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Detail Qurban"));
 BA.debugLineNum = 55;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(4194304);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 57;BA.debugLine="SpinPengurus.Add(\"Pilih Group\")";
Debug.ShouldStop(16777216);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Pilih Group")));
 BA.debugLineNum = 58;BA.debugLine="SpinPengurus.Add(\"Group 01\")";
Debug.ShouldStop(33554432);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 01")));
 BA.debugLineNum = 59;BA.debugLine="SpinPengurus.Add(\"Group 02\")";
Debug.ShouldStop(67108864);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 02")));
 BA.debugLineNum = 60;BA.debugLine="SpinPengurus.Add(\"Group 03\")";
Debug.ShouldStop(134217728);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 03")));
 BA.debugLineNum = 61;BA.debugLine="SpinPengurus.Add(\"Group 04\")";
Debug.ShouldStop(268435456);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 04")));
 BA.debugLineNum = 62;BA.debugLine="SpinPengurus.Add(\"Group 05\")";
Debug.ShouldStop(536870912);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 05")));
 BA.debugLineNum = 63;BA.debugLine="SpinPengurus.Add(\"Group 06\")";
Debug.ShouldStop(1073741824);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 06")));
 BA.debugLineNum = 64;BA.debugLine="SpinPengurus.Add(\"Group 07\")";
Debug.ShouldStop(-2147483648);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 07")));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Pause (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,73);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Resume (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,68);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_resume");
 BA.debugLineNum = 68;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/d";
Debug.ShouldStop(16);
qurbanjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/detail?id="),qurbanjamaahdetail.mostCurrent._qurbanjamaah._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanjamaahdetail.getObject()));
 BA.debugLineNum = 70;BA.debugLine="Log(Main.id)";
Debug.ShouldStop(32);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(qurbanjamaahdetail.mostCurrent._main._id));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,117);
if (RapidSub.canDelegate("button1_click")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","button1_click");
 BA.debugLineNum = 117;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/qurban/stor";
Debug.ShouldStop(2097152);
qurbanjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurl",qurbanjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/store?id="),qurbanjamaahdetail.mostCurrent._qurbanjamaah._idselected)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("group_name="),qurbanjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"getSelectedItem"),RemoteObject.createImmutable("&total_qurban="),qurbanjamaahdetail.mostCurrent._edittext1.runMethod(true,"getText"),RemoteObject.createImmutable("&user="),qurbanjamaahdetail.mostCurrent._main._id)),(Object)(BA.ObjectToString("Submit")),(Object)(qurbanjamaahdetail.getObject()));
 BA.debugLineNum = 119;BA.debugLine="Msgbox(\"Your qurban has been processing\", \"Proces";
Debug.ShouldStop(4194304);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Your qurban has been processing")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Process..."))),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customlistview1_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListView1_ItemClick (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,113);
if (RapidSub.canDelegate("customlistview1_itemclick")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","customlistview1_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 113;BA.debugLine="Sub CustomListView1_ItemClick (Index As Int, Value";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
qurbanjamaahdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private Navbar As Panel";
qurbanjamaahdetail.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private NavbarTitle As Label";
qurbanjamaahdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MosqueName As Label";
qurbanjamaahdetail.mostCurrent._mosquename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private DeadlinePayment As Label";
qurbanjamaahdetail.mostCurrent._deadlinepayment = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private EditText1 As EditText";
qurbanjamaahdetail.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelQurban As Panel";
qurbanjamaahdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SpinPengurus As Spinner";
qurbanjamaahdetail.mostCurrent._spinpengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private SpinType As Spinner";
qurbanjamaahdetail.mostCurrent._spintype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim pengurus As Map";
qurbanjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 27;BA.debugLine="Dim types As Map";
qurbanjamaahdetail.mostCurrent._types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 29;BA.debugLine="Private Button1 As Button";
qurbanjamaahdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim pengurus As Map";
qurbanjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 32;BA.debugLine="Dim accountId, publicId, noTransaction As String";
qurbanjamaahdetail.mostCurrent._accountid = RemoteObject.createImmutable("");
qurbanjamaahdetail.mostCurrent._publicid = RemoteObject.createImmutable("");
qurbanjamaahdetail.mostCurrent._notransaction = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Dim account As List : account.Initialize";
qurbanjamaahdetail.mostCurrent._account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Dim account As List : account.Initialize";
qurbanjamaahdetail.mostCurrent._account.runVoidMethod ("Initialize");
 //BA.debugLineNum = 34;BA.debugLine="Dim animal_type As List : animal_type.Initialize";
qurbanjamaahdetail.mostCurrent._animal_type = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 34;BA.debugLine="Dim animal_type As List : animal_type.Initialize";
qurbanjamaahdetail.mostCurrent._animal_type.runVoidMethod ("Initialize");
 //BA.debugLineNum = 35;BA.debugLine="Private PanelPaidInfo As Panel";
qurbanjamaahdetail.mostCurrent._panelpaidinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,77);
if (RapidSub.canDelegate("jobdone")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","jobdone", _job);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 77;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),qurbanjamaahdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 80;BA.debugLine="If Job.JobName = \"Submit\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("Submit"))) { 
 BA.debugLineNum = 82;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 83;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 84;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 86;BA.debugLine="invoiceSelected = root.Get(\"id\")";
Debug.ShouldStop(2097152);
qurbanjamaahdetail._invoiceselected = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 87;BA.debugLine="Msgbox(root.Get(\"status\"), \"Transaction \"&root.";
Debug.ShouldStop(4194304);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Transaction "),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable(" successful!")))),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(InvoiceJamaah)";
Debug.ShouldStop(8388608);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanjamaahdetail.processBA,(Object)((qurbanjamaahdetail.mostCurrent._invoicejamaah.getObject())));
 }else {
 BA.debugLineNum = 90;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 91;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 92;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 94;BA.debugLine="NavbarTitle.Text = \"Qurban \"&root.Get(\"name\")";
Debug.ShouldStop(536870912);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Qurban "),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 BA.debugLineNum = 95;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(1073741824);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 97;BA.debugLine="MosqueName.Text = \"Description : \"&root.Get(\"de";
Debug.ShouldStop(1);
qurbanjamaahdetail.mostCurrent._mosquename.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Description : "),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))))));
 BA.debugLineNum = 98;BA.debugLine="DeadlinePayment.Text = \"Deadline Payment : \"&ro";
Debug.ShouldStop(2);
qurbanjamaahdetail.mostCurrent._deadlinepayment.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Deadline Payment : "),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("deadline_payment")))))));
 };
 }else {
 BA.debugLineNum = 102;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(64);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(qurbanjamaahdetail.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 105;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim invoiceSelected As String";
qurbanjamaahdetail._invoiceselected = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinpengurus_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinPengurus_ItemClick (qurbanjamaahdetail) ","qurbanjamaahdetail",2,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,108);
if (RapidSub.canDelegate("spinpengurus_itemclick")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","spinpengurus_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 108;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
Debug.ShouldStop(2048);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}