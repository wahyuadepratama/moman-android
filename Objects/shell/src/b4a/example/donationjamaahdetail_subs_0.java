package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class donationjamaahdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,38);
if (RapidSub.canDelegate("activity_create")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 41;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(256);
donationjamaahdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Panel.LoadLayout(\"DonationJamaahDetail";
Debug.ShouldStop(512);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DonationJamaahDetail")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
Debug.ShouldStop(1024);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",donationjamaahdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
Debug.ShouldStop(2048);
donationjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaahdetail.mostCurrent.activityBA),donationjamaahdetail.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 46;BA.debugLine="pengurus.Initialize";
Debug.ShouldStop(8192);
donationjamaahdetail.mostCurrent._pengurus.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
Debug.ShouldStop(16384);
donationjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"setDropdownBackgroundColor",donationjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,54);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Activity_Resume (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","activity_resume");
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
Debug.ShouldStop(262144);
donationjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",donationjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(donationjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/donation/detail?id="),donationjamaahdetail.mostCurrent._donationjamaah._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(donationjamaahdetail.getObject()));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Button1_Click (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,134);
if (RapidSub.canDelegate("button1_click")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","button1_click");
 BA.debugLineNum = 134;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/mosque/dona";
Debug.ShouldStop(64);
donationjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurl",donationjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(donationjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/mosque/donation/store?id="),donationjamaahdetail.mostCurrent._donationjamaah._idworshipplace)),(Object)(RemoteObject.concat(RemoteObject.createImmutable("project="),donationjamaahdetail.mostCurrent._donationjamaah._idselected,RemoteObject.createImmutable("&jamaah="),donationjamaahdetail.mostCurrent._homejamaah._id,RemoteObject.createImmutable("&fund="),donationjamaahdetail.mostCurrent._edittotal.runMethod(true,"getText"),RemoteObject.createImmutable("&account="),donationjamaahdetail.mostCurrent._accountid,RemoteObject.createImmutable("&public="),donationjamaahdetail.mostCurrent._publicid)),(Object)(BA.ObjectToString("Store")),(Object)(donationjamaahdetail.getObject()));
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
public static RemoteObject  _checkguna_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckGuna_CheckedChange (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,138);
if (RapidSub.canDelegate("checkguna_checkedchange")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","checkguna_checkedchange", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 138;BA.debugLine="Sub CheckGuna_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="If CheckGuna.Checked Then";
Debug.ShouldStop(1024);
if (donationjamaahdetail.mostCurrent._checkguna.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="CheckHamba.Checked = False";
Debug.ShouldStop(2048);
donationjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="CheckGuna.Checked = True";
Debug.ShouldStop(4096);
donationjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 142;BA.debugLine="publicId = True";
Debug.ShouldStop(8192);
donationjamaahdetail.mostCurrent._publicid = BA.ObjectToString(donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 144;BA.debugLine="CheckHamba.Checked = True";
Debug.ShouldStop(32768);
donationjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="CheckGuna.Checked = False";
Debug.ShouldStop(65536);
donationjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 146;BA.debugLine="publicId = False";
Debug.ShouldStop(131072);
donationjamaahdetail.mostCurrent._publicid = BA.ObjectToString(donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkhamba_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckHamba_CheckedChange (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,150);
if (RapidSub.canDelegate("checkhamba_checkedchange")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","checkhamba_checkedchange", _checked);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 150;BA.debugLine="Sub CheckHamba_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="If CheckHamba.Checked Then";
Debug.ShouldStop(4194304);
if (donationjamaahdetail.mostCurrent._checkhamba.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="CheckHamba.Checked = True";
Debug.ShouldStop(8388608);
donationjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 153;BA.debugLine="CheckGuna.Checked = False";
Debug.ShouldStop(16777216);
donationjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 154;BA.debugLine="publicId = False";
Debug.ShouldStop(33554432);
donationjamaahdetail.mostCurrent._publicid = BA.ObjectToString(donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 156;BA.debugLine="CheckHamba.Checked = False";
Debug.ShouldStop(134217728);
donationjamaahdetail.mostCurrent._checkhamba.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="CheckGuna.Checked = True";
Debug.ShouldStop(268435456);
donationjamaahdetail.mostCurrent._checkguna.runMethodAndSync(true,"setChecked",donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 158;BA.debugLine="publicId = True";
Debug.ShouldStop(536870912);
donationjamaahdetail.mostCurrent._publicid = BA.ObjectToString(donationjamaahdetail.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
donationjamaahdetail.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private NavbarTitle As Label";
donationjamaahdetail.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelQurban As Panel";
donationjamaahdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Button1 As Button";
donationjamaahdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Button3 As Button";
donationjamaahdetail.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private CustomListView1 As CustomListView";
donationjamaahdetail.mostCurrent._customlistview1 = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 22;BA.debugLine="Private HorizontalScrollView1 As HorizontalScroll";
donationjamaahdetail.mostCurrent._horizontalscrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ImageView1 As ImageView";
donationjamaahdetail.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private FundNeeded As Label";
donationjamaahdetail.mostCurrent._fundneeded = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private FundCollected As Label";
donationjamaahdetail.mostCurrent._fundcollected = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Description As Label";
donationjamaahdetail.mostCurrent._description = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Progress As Label";
donationjamaahdetail.mostCurrent._progress = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private EditTotal As EditText";
donationjamaahdetail.mostCurrent._edittotal = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private SpinPengurus As Spinner";
donationjamaahdetail.mostCurrent._spinpengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private CheckGuna As CheckBox";
donationjamaahdetail.mostCurrent._checkguna = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private CheckHamba As CheckBox";
donationjamaahdetail.mostCurrent._checkhamba = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim pengurus As Map";
donationjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 34;BA.debugLine="Dim accountId, publicId, noTransaction As String";
donationjamaahdetail.mostCurrent._accountid = RemoteObject.createImmutable("");
donationjamaahdetail.mostCurrent._publicid = RemoteObject.createImmutable("");
donationjamaahdetail.mostCurrent._notransaction = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim account As List : account.Initialize";
donationjamaahdetail.mostCurrent._account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 35;BA.debugLine="Dim account As List : account.Initialize";
donationjamaahdetail.mostCurrent._account.runVoidMethod ("Initialize");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,58);
if (RapidSub.canDelegate("jobdone")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","jobdone", _job);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _accountdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _gallery = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _w = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _gambar = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 58;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),donationjamaahdetail.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 61;BA.debugLine="If Job.JobName = \"Store\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname"),BA.ObjectToString("Store"))) { 
 BA.debugLineNum = 62;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(536870912);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 63;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(1073741824);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 64;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 65;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 67;BA.debugLine="noTransaction = root.Get(\"trx\")";
Debug.ShouldStop(4);
donationjamaahdetail.mostCurrent._notransaction = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("trx")))));
 BA.debugLineNum = 68;BA.debugLine="Log(noTransaction)";
Debug.ShouldStop(8);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(donationjamaahdetail.mostCurrent._notransaction));
 BA.debugLineNum = 69;BA.debugLine="Msgbox(\"Please check payment infromation for tr";
Debug.ShouldStop(16);
donationjamaahdetail.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Please check payment infromation for transaction #"),donationjamaahdetail.mostCurrent._notransaction))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Transaction successful!"))),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 70;BA.debugLine="StartActivity(HistoryJamaah)";
Debug.ShouldStop(32);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("StartActivity",donationjamaahdetail.processBA,(Object)((donationjamaahdetail.mostCurrent._historyjamaah.getObject())));
 }else {
 BA.debugLineNum = 72;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 73;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_job.runMethod(true,"_getstring")));
 BA.debugLineNum = 74;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 75;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1024);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 76;BA.debugLine="a = root.Get(\"project\")";
Debug.ShouldStop(2048);
_a.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("project")))));
 BA.debugLineNum = 77;BA.debugLine="NavbarTitle.Text = a.Get(\"name\")";
Debug.ShouldStop(4096);
donationjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 78;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(8192);
donationjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 80;BA.debugLine="FundNeeded.Text = \"Fund Needed : \"&a.Get(\"fund\"";
Debug.ShouldStop(32768);
donationjamaahdetail.mostCurrent._fundneeded.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Fund Needed : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund")))))));
 BA.debugLineNum = 81;BA.debugLine="FundCollected.Text = \"Fund Collected : \"&a.Get(";
Debug.ShouldStop(65536);
donationjamaahdetail.mostCurrent._fundcollected.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Fund Collected : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund_collected")))))));
 BA.debugLineNum = 82;BA.debugLine="Progress.Text = \"Description : \"&a.Get(\"descrip";
Debug.ShouldStop(131072);
donationjamaahdetail.mostCurrent._progress.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Description : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("description")))))));
 BA.debugLineNum = 83;BA.debugLine="Description.Text = \"Progress : \"&a.Get(\"progres";
Debug.ShouldStop(262144);
donationjamaahdetail.mostCurrent._description.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Progress : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("progress")))))));
 BA.debugLineNum = 85;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(1048576);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 85;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(1048576);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="account = root.Get(\"account\")";
Debug.ShouldStop(2097152);
donationjamaahdetail.mostCurrent._account.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));
 BA.debugLineNum = 88;BA.debugLine="If account.Size = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",donationjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 89;BA.debugLine="SpinPengurus.Add(\"Belum Ada Akun Rekening!\")";
Debug.ShouldStop(16777216);
donationjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Belum Ada Akun Rekening!")));
 }else {
 BA.debugLineNum = 91;BA.debugLine="SpinPengurus.Add(\"Pilih Nomor Rekeing Pengirim";
Debug.ShouldStop(67108864);
donationjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Pilih Nomor Rekeing Pengiriman Donasi")));
 BA.debugLineNum = 92;BA.debugLine="For i=0 To account.Size-1";
Debug.ShouldStop(134217728);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {donationjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 93;BA.debugLine="Dim accountData As Map";
Debug.ShouldStop(268435456);
_accountdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("accountData", _accountdata);
 BA.debugLineNum = 94;BA.debugLine="accountData = account.Get(i)";
Debug.ShouldStop(536870912);
_accountdata.setObject(donationjamaahdetail.mostCurrent._account.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 95;BA.debugLine="SpinPengurus.Add(accountData.Get(\"owner\")&\" -";
Debug.ShouldStop(1073741824);
donationjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.concat(_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("owner")))),RemoteObject.createImmutable(" - "),_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_number")))),RemoteObject.createImmutable(" ("),_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(")"))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 99;BA.debugLine="Dim gallery As List : data.Initialize";
Debug.ShouldStop(4);
_gallery = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("gallery", _gallery);
 BA.debugLineNum = 99;BA.debugLine="Dim gallery As List : data.Initialize";
Debug.ShouldStop(4);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="gallery = root.Get(\"gallery\")";
Debug.ShouldStop(8);
_gallery.setObject(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery")))));
 BA.debugLineNum = 101;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"ClvDona";
Debug.ShouldStop(16);
donationjamaahdetail.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ClvDonation")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="For i=0 To gallery.Size-1";
Debug.ShouldStop(32);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {_gallery.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 103;BA.debugLine="Dim w As Map";
Debug.ShouldStop(64);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 104;BA.debugLine="w=gallery.Get(i)";
Debug.ShouldStop(128);
_w.setObject(_gallery.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 105;BA.debugLine="Dim image = w.Get(\"image\") As String";
Debug.ShouldStop(256);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 106;BA.debugLine="Dim gambar = \"\"&Main.Server&\"images/project/\"&";
Debug.ShouldStop(512);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),donationjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("images/project/"),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 108;BA.debugLine="Dim m As Map";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 109;BA.debugLine="m.Initialize";
Debug.ShouldStop(4096);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 110;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 111;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16384);
_p.runVoidMethod ("Initialize",donationjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 112;BA.debugLine="p.SetLayout(0,0,100%x,50%y)";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaahdetail.mostCurrent.activityBA)),(Object)(donationjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),donationjamaahdetail.mostCurrent.activityBA)));
 BA.debugLineNum = 113;BA.debugLine="p.Color=Colors.Green";
Debug.ShouldStop(65536);
_p.runVoidMethod ("setColor",donationjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 114;BA.debugLine="p.LoadLayout(\"ListImageProjectJamaah\")";
Debug.ShouldStop(131072);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListImageProjectJamaah")),donationjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 116;BA.debugLine="CustomListView1.AsView.Color= Colors.Magenta";
Debug.ShouldStop(524288);
donationjamaahdetail.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"setColor",donationjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 117;BA.debugLine="CustomListView1.Add(p,m)";
Debug.ShouldStop(1048576);
donationjamaahdetail.mostCurrent._customlistview1.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((_m.getObject())));
 BA.debugLineNum = 118;BA.debugLine="m.Put(ImageView1, gambar)";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)((donationjamaahdetail.mostCurrent._imageview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 119;BA.debugLine="CallSubDelayed2(Starter2, \"Download\", m)";
Debug.ShouldStop(4194304);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",donationjamaahdetail.processBA,(Object)((donationjamaahdetail.mostCurrent._starter2.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 122;BA.debugLine="CustomListView1.sv.Height = (ImageView1.width)";
Debug.ShouldStop(33554432);
donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(donationjamaahdetail.mostCurrent._imageview1.runMethod(true,"getWidth")),donationjamaahdetail.mostCurrent._customlistview1.runMethod(true,"_getsize")}, "*",0, 1));
 BA.debugLineNum = 123;BA.debugLine="CustomListView1.AsView.Width = CustomListView1.";
Debug.ShouldStop(67108864);
donationjamaahdetail.mostCurrent._customlistview1.runMethod(false,"_asview").runMethod(true,"setWidth",donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"getHeight"));
 BA.debugLineNum = 124;BA.debugLine="HorizontalScrollView1.Panel.Width = CustomListV";
Debug.ShouldStop(134217728);
donationjamaahdetail.mostCurrent._horizontalscrollview1.runMethod(false,"getPanel").runMethod(true,"setWidth",donationjamaahdetail.mostCurrent._customlistview1.getField(false,"_sv").runMethod(true,"getHeight"));
 };
 }else {
 BA.debugLineNum = 128;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(-2147483648);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(1);
donationjamaahdetail.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(donationjamaahdetail.mostCurrent.__c.getField(true,"True")));
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
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
donationjamaahdetail._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinpengurus_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinPengurus_ItemClick (donationjamaahdetail) ","donationjamaahdetail",8,donationjamaahdetail.mostCurrent.activityBA,donationjamaahdetail.mostCurrent,162);
if (RapidSub.canDelegate("spinpengurus_itemclick")) return b4a.example.donationjamaahdetail.remoteMe.runUserSub(false, "donationjamaahdetail","spinpengurus_itemclick", _position, _value);
int _i = 0;
RemoteObject _accountdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 162;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="For i=0 To account.Size-1";
Debug.ShouldStop(4);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {donationjamaahdetail.mostCurrent._account.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 164;BA.debugLine="If SpinPengurus.SelectedIndex = i+1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",donationjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 165;BA.debugLine="Dim accountData As Map";
Debug.ShouldStop(16);
_accountdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("accountData", _accountdata);
 BA.debugLineNum = 166;BA.debugLine="accountData = account.Get(i)";
Debug.ShouldStop(32);
_accountdata.setObject(donationjamaahdetail.mostCurrent._account.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 167;BA.debugLine="accountId = accountData.Get(\"id\")";
Debug.ShouldStop(64);
donationjamaahdetail.mostCurrent._accountid = BA.ObjectToString(_accountdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}