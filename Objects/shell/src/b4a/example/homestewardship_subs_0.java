package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homestewardship_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
Debug.ShouldStop(134217728);
homestewardship.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BottomNavigation")),homestewardship.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeStewardship\")";
Debug.ShouldStop(268435456);
homestewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeStewardship")),homestewardship.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="Profile.SetBackgroundImage(LoadBitmap(File.DirAss";
Debug.ShouldStop(536870912);
homestewardship.mostCurrent._profile.runVoidMethod ("SetBackgroundImageNew",(Object)((homestewardship.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homestewardship.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user_green.png"))).getObject())));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,37);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,33);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_resume");
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/_users\",\"id";
Debug.ShouldStop(2);
homestewardship.mostCurrent._codesemua.runVoidMethod ("_executeurl",homestewardship.mostCurrent.activityBA,(Object)(RemoteObject.concat(homestewardship.mostCurrent._main._server,RemoteObject.createImmutable("api/_users"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("id="),homestewardship.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))))),(Object)(BA.ObjectToString("LoadData")),(Object)(homestewardship.getObject()));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _donation_click() throws Exception{
try {
		Debug.PushSubsStack("Donation_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,94);
if (RapidSub.canDelegate("donation_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","donation_click");
 BA.debugLineNum = 94;BA.debugLine="Sub Donation_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="StartActivity(DonationStewardship)";
Debug.ShouldStop(1073741824);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._donationstewardship.getObject())));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
homestewardship.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelHome As Panel";
homestewardship.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LabelName As Label";
homestewardship.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelNumber As Label";
homestewardship.mostCurrent._labelnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelUser As Label";
homestewardship.mostCurrent._labeluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelPhoto As ImageView";
homestewardship.mostCurrent._panelphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelNoRekening1 As Label";
homestewardship.mostCurrent._labelnorekening1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelNoRekening2 As Label";
homestewardship.mostCurrent._labelnorekening2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Profile As Button";
homestewardship.mostCurrent._profile = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,41);
if (RapidSub.canDelegate("jobdone")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 41;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(512);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success"))));
 BA.debugLineNum = 43;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),homestewardship.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 44;BA.debugLine="Dim res As String";
Debug.ShouldStop(2048);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 45;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(4096);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 46;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(8192);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 47;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16384);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 48;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 50;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 51;BA.debugLine="Dim a As Map";
Debug.ShouldStop(262144);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 52;BA.debugLine="a = parser.NextObject";
Debug.ShouldStop(524288);
_a = _parser.runMethod(false,"NextObject");Debug.locals.put("a", _a);
 BA.debugLineNum = 53;BA.debugLine="id = Main.manager.GetString(\"id\")";
Debug.ShouldStop(1048576);
homestewardship._id = homestewardship.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 54;BA.debugLine="LabelName.Text = a.Get(\"username\")";
Debug.ShouldStop(2097152);
homestewardship.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))));
 BA.debugLineNum = 55;BA.debugLine="LabelNumber.Text = a.Get(\"phone\")";
Debug.ShouldStop(4194304);
homestewardship.mostCurrent._labelnumber.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone"))))));
 BA.debugLineNum = 56;BA.debugLine="LabelUser.Text = \"Stewardship \"&a.Get(\"worshi";
Debug.ShouldStop(8388608);
homestewardship.mostCurrent._labeluser.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Stewardship "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_name")))))));
 BA.debugLineNum = 57;BA.debugLine="worship = a.Get(\"worship_id\")";
Debug.ShouldStop(16777216);
homestewardship._worship = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_id")))));
 BA.debugLineNum = 59;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(67108864);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 59;BA.debugLine="Dim data As List : data.Initialize";
Debug.ShouldStop(67108864);
_data.runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="data = a.Get(\"account\")";
Debug.ShouldStop(134217728);
_data.setObject(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account")))));
 BA.debugLineNum = 61;BA.debugLine="Dim b As Map";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="b = data.Get(0)";
Debug.ShouldStop(536870912);
_b.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 64;BA.debugLine="LabelNoRekening1.Text = \"- \"&b.Get(\"account_n";
Debug.ShouldStop(-2147483648);
homestewardship.mostCurrent._labelnorekening1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("- "),_b.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_number")))),RemoteObject.createImmutable(" ("),_b.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bank")))),RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 66;BA.debugLine="Dim path As String = \"\"&Main.server&\"images/a";
Debug.ShouldStop(2);
_path = RemoteObject.concat(RemoteObject.createImmutable(""),homestewardship.mostCurrent._main._server,RemoteObject.createImmutable("images/avatar/"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 67;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 68;BA.debugLine="m.Initialize";
Debug.ShouldStop(8);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="m.Put(PanelPhoto,path)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)((homestewardship.mostCurrent._panelphoto.getObject())),(Object)((_path)));
 BA.debugLineNum = 70;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(32);
homestewardship.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homestewardship.processBA,(Object)((homestewardship.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",homestewardship.processBA, e29.toString()); BA.debugLineNum = 72;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(homestewardship.mostCurrent.__c.runMethod(false,"LastException",homestewardship.mostCurrent.activityBA))));
 BA.debugLineNum = 73;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
Debug.ShouldStop(256);
homestewardship.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),homestewardship.mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 77;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4096);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(8192);
homestewardship.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(homestewardship.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 80;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logout_click() throws Exception{
try {
		Debug.PushSubsStack("Logout_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,84);
if (RapidSub.canDelegate("logout_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","logout_click");
 BA.debugLineNum = 84;BA.debugLine="Sub Logout_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Main.manager.ClearAll";
Debug.ShouldStop(1048576);
homestewardship.mostCurrent._main._manager.runVoidMethod ("ClearAll");
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
homestewardship.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 87;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4194304);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._main.getObject())));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim id, account, worship As String";
homestewardship._id = RemoteObject.createImmutable("");
homestewardship._account = RemoteObject.createImmutable("");
homestewardship._worship = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _profile_click() throws Exception{
try {
		Debug.PushSubsStack("Profile_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,90);
if (RapidSub.canDelegate("profile_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","profile_click");
 BA.debugLineNum = 90;BA.debugLine="Sub Profile_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _qurban_click() throws Exception{
try {
		Debug.PushSubsStack("Qurban_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,98);
if (RapidSub.canDelegate("qurban_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","qurban_click");
 BA.debugLineNum = 98;BA.debugLine="Sub Qurban_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="StartActivity(QurbanStewardship)";
Debug.ShouldStop(4);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._qurbanstewardship.getObject())));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _web_click() throws Exception{
try {
		Debug.PushSubsStack("Web_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,102);
if (RapidSub.canDelegate("web_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","web_click");
 BA.debugLineNum = 102;BA.debugLine="Sub Web_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="StartActivity(WebView)";
Debug.ShouldStop(64);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._webview.getObject())));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}