package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homestewardship_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
Debug.ShouldStop(33554432);
homestewardship.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BottomNavigation")),homestewardship.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeStewardship\")";
Debug.ShouldStop(67108864);
homestewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeStewardship")),homestewardship.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="Profile.SetBackgroundImage(LoadBitmap(File.DirAss";
Debug.ShouldStop(134217728);
homestewardship.mostCurrent._profile.runVoidMethod ("SetBackgroundImageNew",(Object)((homestewardship.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homestewardship.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("user_green.png"))).getObject())));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","activity_resume");
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/_users\",\"id";
Debug.ShouldStop(-2147483648);
homestewardship.mostCurrent._codesemua.runVoidMethod ("_executeurl",homestewardship.mostCurrent.activityBA,(Object)(RemoteObject.concat(homestewardship.mostCurrent._main._server,RemoteObject.createImmutable("api/_users"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("id="),homestewardship.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))))),(Object)(BA.ObjectToString("LoadData")),(Object)(homestewardship.getObject()));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 16;BA.debugLine="Private StewardshipName As Label";
homestewardship.mostCurrent._stewardshipname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private IdKtp As Label";
homestewardship.mostCurrent._idktp = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelNumber As Label";
homestewardship.mostCurrent._labelnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelPhoto As ImageView";
homestewardship.mostCurrent._panelphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Profile As Button";
homestewardship.mostCurrent._profile = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Address As Label";
homestewardship.mostCurrent._address = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,39);
if (RapidSub.canDelegate("jobdone")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 39;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(128);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success"))));
 BA.debugLineNum = 41;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),homestewardship.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 42;BA.debugLine="Dim res As String";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 43;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1024);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 44;BA.debugLine="Log(\"data->>>>> \"&res)";
Debug.ShouldStop(2048);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("data->>>>> "),_res)));
 BA.debugLineNum = 45;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 46;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 47;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16384);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 49;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 50;BA.debugLine="Dim a As Map";
Debug.ShouldStop(131072);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 51;BA.debugLine="a = parser.NextObject";
Debug.ShouldStop(262144);
_a = _parser.runMethod(false,"NextObject");Debug.locals.put("a", _a);
 BA.debugLineNum = 52;BA.debugLine="id = Main.manager.GetString(\"id\")";
Debug.ShouldStop(524288);
homestewardship._id = homestewardship.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 53;BA.debugLine="StewardshipName.Text = a.Get(\"jamaah_name\")&\"";
Debug.ShouldStop(1048576);
homestewardship.mostCurrent._stewardshipname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jamaah_name")))),RemoteObject.createImmutable("/"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))))));
 BA.debugLineNum = 54;BA.debugLine="IdKtp.Text = a.Get(\"id\")";
Debug.ShouldStop(2097152);
homestewardship.mostCurrent._idktp.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 55;BA.debugLine="LabelNumber.Text = \"Phone: \"&a.Get(\"phone\")";
Debug.ShouldStop(4194304);
homestewardship.mostCurrent._labelnumber.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Phone: "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))))));
 BA.debugLineNum = 56;BA.debugLine="Address.Text = a.Get(\"address\")";
Debug.ShouldStop(8388608);
homestewardship.mostCurrent._address.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))));
 BA.debugLineNum = 57;BA.debugLine="id = a.Get(\"id\")";
Debug.ShouldStop(16777216);
homestewardship._id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 59;BA.debugLine="Dim path As String = \"\"&Main.server&\"images/a";
Debug.ShouldStop(67108864);
_path = RemoteObject.concat(RemoteObject.createImmutable(""),homestewardship.mostCurrent._main._server,RemoteObject.createImmutable("images/avatar/"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 60;BA.debugLine="Dim m As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 61;BA.debugLine="m.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="m.Put(PanelPhoto,path)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)((homestewardship.mostCurrent._panelphoto.getObject())),(Object)((_path)));
 BA.debugLineNum = 63;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(1073741824);
homestewardship.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homestewardship.processBA,(Object)((homestewardship.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",homestewardship.processBA, e25.toString()); BA.debugLineNum = 65;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(homestewardship.mostCurrent.__c.runMethod(false,"LastException",homestewardship.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 70;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32);
homestewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 71;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(64);
homestewardship.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(homestewardship.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 73;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Logout_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,77);
if (RapidSub.canDelegate("logout_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","logout_click");
 BA.debugLineNum = 77;BA.debugLine="Sub Logout_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Main.manager.ClearAll";
Debug.ShouldStop(8192);
homestewardship.mostCurrent._main._manager.runVoidMethod ("ClearAll");
 BA.debugLineNum = 79;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
homestewardship.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 80;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(32768);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._main.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim id As String";
homestewardship._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _profile_click() throws Exception{
try {
		Debug.PushSubsStack("Profile_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,83);
if (RapidSub.canDelegate("profile_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","profile_click");
 BA.debugLineNum = 83;BA.debugLine="Sub Profile_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Qurban_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,87);
if (RapidSub.canDelegate("qurban_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","qurban_click");
 BA.debugLineNum = 87;BA.debugLine="Sub Qurban_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="StartActivity(QurbanStewardship)";
Debug.ShouldStop(8388608);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._qurbanstewardship.getObject())));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Web_Click (homestewardship) ","homestewardship",9,homestewardship.mostCurrent.activityBA,homestewardship.mostCurrent,91);
if (RapidSub.canDelegate("web_click")) return b4a.example.homestewardship.remoteMe.runUserSub(false, "homestewardship","web_click");
 BA.debugLineNum = 91;BA.debugLine="Sub Web_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="StartActivity(WebView)";
Debug.ShouldStop(134217728);
homestewardship.mostCurrent.__c.runVoidMethod ("StartActivity",homestewardship.processBA,(Object)((homestewardship.mostCurrent._webview.getObject())));
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
}