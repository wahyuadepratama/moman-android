package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 48;BA.debugLine="If manager.GetBoolean(\"is_login\") Then";
Debug.ShouldStop(32768);
if (main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login"))).<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 50;BA.debugLine="manager.SetBoolean(\"jamaah\", True)";
Debug.ShouldStop(131072);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("jamaah")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="manager.SetBoolean(\"step\", False)";
Debug.ShouldStop(262144);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("step")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 54;BA.debugLine="CheckLogin";
Debug.ShouldStop(2097152);
_checklogin();
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),main.mostCurrent.activityBA);
 BA.debugLineNum = 56;BA.debugLine="MainScroll.Panel.LoadLayout(\"Login\")";
Debug.ShouldStop(8388608);
main.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="MainScroll.Panel.Height = PanelLogin.Height";
Debug.ShouldStop(16777216);
main.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",main.mostCurrent._panellogin.runMethod(true,"getHeight"));
 BA.debugLineNum = 58;BA.debugLine="MainScroll.Height = PanelLogin.Height";
Debug.ShouldStop(33554432);
main.mostCurrent._mainscroll.runMethod(true,"setHeight",main.mostCurrent._panellogin.runMethod(true,"getHeight"));
 BA.debugLineNum = 59;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
Debug.ShouldStop(67108864);
_setchecked(main.mostCurrent._pstep,main.mostCurrent._labelstep,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("step"))));
 BA.debugLineNum = 60;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
Debug.ShouldStop(134217728);
_setchecked(main.mostCurrent._pjam,main.mostCurrent._labeljam,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("jamaah"))));
 BA.debugLineNum = 61;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._navbar.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,71);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 71;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(manager.GetString(\"wahyu\"))";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("wahyu")))));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("btnlogin_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","btnlogin_click");
RemoteObject _pi = RemoteObject.createImmutable("");
RemoteObject _md = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");
RemoteObject _bytecon = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _passwordhash = null;
 BA.debugLineNum = 137;BA.debugLine="Sub BtnLogin_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Private pi As String";
Debug.ShouldStop(512);
_pi = RemoteObject.createImmutable("");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 139;BA.debugLine="pi = EditPassword.Text";
Debug.ShouldStop(1024);
_pi = main.mostCurrent._editpassword.runMethod(true,"getText");Debug.locals.put("pi", _pi);
 BA.debugLineNum = 141;BA.debugLine="Dim md As MessageDigest";
Debug.ShouldStop(4096);
_md = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper");Debug.locals.put("md", _md);
 BA.debugLineNum = 142;BA.debugLine="Dim ByteCon As ByteConverter";
Debug.ShouldStop(8192);
_bytecon = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("ByteCon", _bytecon);
 BA.debugLineNum = 143;BA.debugLine="Dim passwordhash() As Byte";
Debug.ShouldStop(16384);
_passwordhash = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 145;BA.debugLine="passwordhash = md.GetMessageDigest(pi.GetBytes(\"U";
Debug.ShouldStop(65536);
_passwordhash = _md.runMethod(false,"GetMessageDigest",(Object)(_pi.runMethod(false,"getBytes",(Object)(RemoteObject.createImmutable("UTF8")))),(Object)(RemoteObject.createImmutable("MD5")));Debug.locals.put("passwordhash", _passwordhash);
 BA.debugLineNum = 146;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
Debug.ShouldStop(131072);
main.mostCurrent._md5string = _bytecon.runMethod(true,"HexFromBytes",(Object)(_passwordhash));
 BA.debugLineNum = 147;BA.debugLine="md5string = md5string.ToLowerCase";
Debug.ShouldStop(262144);
main.mostCurrent._md5string = main.mostCurrent._md5string.runMethod(true,"toLowerCase");
 BA.debugLineNum = 148;BA.debugLine="CodeSemua.ExecuteUrl(server&\"api/login\",\"username";
Debug.ShouldStop(524288);
main.mostCurrent._codesemua.runVoidMethod ("_executeurl",main.mostCurrent.activityBA,(Object)(RemoteObject.concat(main._server,RemoteObject.createImmutable("api/login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("username="),main.mostCurrent._editusername.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),main.mostCurrent._md5string)),(Object)(BA.ObjectToString("Login")),(Object)(main.getObject()));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checklogin() throws Exception{
try {
		Debug.PushSubsStack("CheckLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,168);
if (RapidSub.canDelegate("checklogin")) return b4a.example.main.remoteMe.runUserSub(false, "main","checklogin");
RemoteObject _islogin = RemoteObject.createImmutable(false);
 BA.debugLineNum = 168;BA.debugLine="Sub CheckLogin";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="Dim islogin As Boolean";
Debug.ShouldStop(256);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("islogin", _islogin);
 BA.debugLineNum = 170;BA.debugLine="islogin = manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(512);
_islogin = main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("islogin", _islogin);
 BA.debugLineNum = 171;BA.debugLine="If islogin Then";
Debug.ShouldStop(1024);
if (_islogin.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="If manager.GetBoolean(\"jamaah\") = True Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("jamaah"))),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 173;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 174;BA.debugLine="StartActivity(HomeJamaah)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homejamaah.getObject())));
 }else {
 BA.debugLineNum = 176;BA.debugLine="If manager.GetBoolean(\"step\") = True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("step"))),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 177;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 178;BA.debugLine="StartActivity(HomeStewardship)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homestewardship.getObject())));
 };
 };
 };
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 30;BA.debugLine="Private MainScroll As ScrollView";
main.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelLogin As Panel";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private BtnLogin As Button";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private EditPassword As EditText";
main.mostCurrent._editpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private EditUsername As EditText";
main.mostCurrent._editusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim md5string As String";
main.mostCurrent._md5string = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Private pstep As Panel";
main.mostCurrent._pstep = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private pjam As Panel";
main.mostCurrent._pjam = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Labelstep As Label";
main.mostCurrent._labelstep = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private labeljam As Label";
main.mostCurrent._labeljam = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Navbar As Panel";
main.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,76);
if (RapidSub.canDelegate("jobdone")) return b4a.example.main.remoteMe.runUserSub(false, "main","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 76;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \"";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success"))));
 BA.debugLineNum = 78;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 79;BA.debugLine="Dim res As String";
Debug.ShouldStop(16384);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 80;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(32768);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 81;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(65536);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 82;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(131072);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 83;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 84;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("Login"))) {
case 0: {
 BA.debugLineNum = 86;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 87;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4194304);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 88;BA.debugLine="a = parser.NextObject";
Debug.ShouldStop(8388608);
_a = _parser.runMethod(false,"NextObject");Debug.locals.put("a", _a);
 BA.debugLineNum = 89;BA.debugLine="username = a.Get(\"username\")";
Debug.ShouldStop(16777216);
main._username = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 90;BA.debugLine="phone = a.Get(\"phone\")";
Debug.ShouldStop(33554432);
main._phone = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone")))));
 BA.debugLineNum = 91;BA.debugLine="status = a.Get(\"status\")";
Debug.ShouldStop(67108864);
main._status = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));
 BA.debugLineNum = 92;BA.debugLine="id = a.Get (\"jamaah_id\")";
Debug.ShouldStop(134217728);
main._id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jamaah_id")))));
 BA.debugLineNum = 95;BA.debugLine="address= a.Get(\"address\")";
Debug.ShouldStop(1073741824);
main._address = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 97;BA.debugLine="avatar= a.Get(\"avatar\")";
Debug.ShouldStop(1);
main._avatar = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));
 BA.debugLineNum = 101;BA.debugLine="If username == \"null\" Or phone == \"null\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main._username,BA.ObjectToString("null")) || RemoteObject.solveBoolean("=",main._phone,BA.ObjectToString("null"))) { 
 BA.debugLineNum = 102;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login F";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 104;BA.debugLine="If (manager.GetBoolean(\"jamaah\") = True) The";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("jamaah"))),main.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 105;BA.debugLine="manager.SetString(\"username\",username)";
Debug.ShouldStop(256);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("username")),(Object)(main._username));
 BA.debugLineNum = 106;BA.debugLine="manager.SetString(\"id\",id)";
Debug.ShouldStop(512);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("id")),(Object)(main._id));
 BA.debugLineNum = 107;BA.debugLine="Msgbox(\"login sebagai jamaah\",\"Info\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("login sebagai jamaah")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 108;BA.debugLine="manager.SetBoolean(\"is_login\",True)";
Debug.ShouldStop(2048);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 109;BA.debugLine="Log(\"start home jamaah-----------------\")";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("start home jamaah-----------------")));
 BA.debugLineNum = 110;BA.debugLine="StartActivity(HomeJamaah)";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homejamaah.getObject())));
 }else {
 BA.debugLineNum = 112;BA.debugLine="If (status = \"stewardship\") And (manager.Ge";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main._status,RemoteObject.createImmutable("stewardship"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("step"))),main.mostCurrent.__c.getField(true,"True")))))) { 
 BA.debugLineNum = 113;BA.debugLine="Msgbox(\"login sebagai stewardship\",\"Info\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("login sebagai stewardship")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Info"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 114;BA.debugLine="manager.SetString(\"username\",username)";
Debug.ShouldStop(131072);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("username")),(Object)(main._username));
 BA.debugLineNum = 115;BA.debugLine="manager.SetString(\"id\",id)";
Debug.ShouldStop(262144);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("id")),(Object)(main._id));
 BA.debugLineNum = 116;BA.debugLine="manager.SetBoolean(\"is_login\",True)";
Debug.ShouldStop(524288);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 117;BA.debugLine="Log(\"start home stewardship.............\"";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("start home stewardship.............")));
 BA.debugLineNum = 118;BA.debugLine="StartActivity(HomeStewardship)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homestewardship.getObject())));
 }else {
 BA.debugLineNum = 120;BA.debugLine="Msgbox(\"Pastikan Login Dengan Benar\",\"Warn";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Pastikan Login Dengan Benar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning"))),main.mostCurrent.activityBA);
 };
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e43) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e43.toString()); BA.debugLineNum = 126;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 BA.debugLineNum = 127;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),main.mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 131;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 132;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 134;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labeljam_click() throws Exception{
try {
		Debug.PushSubsStack("labeljam_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,191);
if (RapidSub.canDelegate("labeljam_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","labeljam_click");
 BA.debugLineNum = 191;BA.debugLine="Sub labeljam_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="manager.SetBoolean(\"jamaah\",True)";
Debug.ShouldStop(-2147483648);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("jamaah")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 193;BA.debugLine="manager.SetBoolean(\"step\",False)";
Debug.ShouldStop(1);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("step")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 194;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
Debug.ShouldStop(2);
_setchecked(main.mostCurrent._pstep,main.mostCurrent._labelstep,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("step"))));
 BA.debugLineNum = 195;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
Debug.ShouldStop(4);
_setchecked(main.mostCurrent._pjam,main.mostCurrent._labeljam,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("jamaah"))));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelstep_click() throws Exception{
try {
		Debug.PushSubsStack("Labelstep_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,184);
if (RapidSub.canDelegate("labelstep_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","labelstep_click");
 BA.debugLineNum = 184;BA.debugLine="Sub Labelstep_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="manager.SetBoolean(\"step\",True)";
Debug.ShouldStop(16777216);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("step")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 186;BA.debugLine="manager.SetBoolean(\"jamaah\",False)";
Debug.ShouldStop(33554432);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("jamaah")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 187;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
Debug.ShouldStop(67108864);
_setchecked(main.mostCurrent._pstep,main.mostCurrent._labelstep,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("step"))));
 BA.debugLineNum = 188;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
Debug.ShouldStop(134217728);
_setchecked(main.mostCurrent._pjam,main.mostCurrent._labeljam,main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("jamaah"))));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
homejamaah_subs_0._process_globals();
qurbanjamaah_subs_0._process_globals();
qurbanjamaahdetail_subs_0._process_globals();
orphansjamaahdetail_subs_0._process_globals();
mapsjamaah_subs_0._process_globals();
donationstewardship_subs_0._process_globals();
donationjamaahdetail_subs_0._process_globals();
homestewardship_subs_0._process_globals();
qurbanstewardship_subs_0._process_globals();
orphansjamaah_subs_0._process_globals();
historyjamaah_subs_0._process_globals();
donationjamaah_subs_0._process_globals();
codesemua_subs_0._process_globals();
tpajamaah_subs_0._process_globals();
tpajamaahdetail_subs_0._process_globals();
poorjamaahdetail_subs_0._process_globals();
poorjamaah_subs_0._process_globals();
invoicejamaah_subs_0._process_globals();
starter2_subs_0._process_globals();
qurbanstewardshipdetail_subs_0._process_globals();
webview_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
homejamaah.myClass = BA.getDeviceClass ("b4a.example.homejamaah");
qurbanjamaah.myClass = BA.getDeviceClass ("b4a.example.qurbanjamaah");
qurbanjamaahdetail.myClass = BA.getDeviceClass ("b4a.example.qurbanjamaahdetail");
orphansjamaahdetail.myClass = BA.getDeviceClass ("b4a.example.orphansjamaahdetail");
mapsjamaah.myClass = BA.getDeviceClass ("b4a.example.mapsjamaah");
donationstewardship.myClass = BA.getDeviceClass ("b4a.example.donationstewardship");
donationjamaahdetail.myClass = BA.getDeviceClass ("b4a.example.donationjamaahdetail");
homestewardship.myClass = BA.getDeviceClass ("b4a.example.homestewardship");
qurbanstewardship.myClass = BA.getDeviceClass ("b4a.example.qurbanstewardship");
orphansjamaah.myClass = BA.getDeviceClass ("b4a.example.orphansjamaah");
historyjamaah.myClass = BA.getDeviceClass ("b4a.example.historyjamaah");
donationjamaah.myClass = BA.getDeviceClass ("b4a.example.donationjamaah");
codesemua.myClass = BA.getDeviceClass ("b4a.example.codesemua");
tpajamaah.myClass = BA.getDeviceClass ("b4a.example.tpajamaah");
tpajamaahdetail.myClass = BA.getDeviceClass ("b4a.example.tpajamaahdetail");
poorjamaahdetail.myClass = BA.getDeviceClass ("b4a.example.poorjamaahdetail");
poorjamaah.myClass = BA.getDeviceClass ("b4a.example.poorjamaah");
invoicejamaah.myClass = BA.getDeviceClass ("b4a.example.invoicejamaah");
starter2.myClass = BA.getDeviceClass ("b4a.example.starter2");
qurbanstewardshipdetail.myClass = BA.getDeviceClass ("b4a.example.qurbanstewardshipdetail");
webview.myClass = BA.getDeviceClass ("b4a.example.webview");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim username, phone, status, id, worship_name, ty";
main._username = RemoteObject.createImmutable("");
main._phone = RemoteObject.createImmutable("");
main._status = RemoteObject.createImmutable("");
main._id = RemoteObject.createImmutable("");
main._worship_name = RemoteObject.createImmutable("");
main._types = RemoteObject.createImmutable("");
main._address = RemoteObject.createImmutable("");
main._updated_at = RemoteObject.createImmutable("");
main._avatar = RemoteObject.createImmutable("");
main._worship_place_address = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim server As String = \"http://192.168.43.99:3000";
main._server = BA.ObjectToString("http://192.168.43.99:3000/");
 //BA.debugLineNum = 23;BA.debugLine="Dim manager As AHPreferenceManager";
main._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setchecked(RemoteObject _v,RemoteObject _s,RemoteObject _pressedstate) throws Exception{
try {
		Debug.PushSubsStack("SetChecked (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("setchecked")) return b4a.example.main.remoteMe.runUserSub(false, "main","setchecked", _v, _s, _pressedstate);
RemoteObject _checked = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _unchecked = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("v", _v);
Debug.locals.put("s", _s);
Debug.locals.put("PressedState", _pressedstate);
 BA.debugLineNum = 153;BA.debugLine="Sub SetChecked(v As Panel,s As Label, PressedState";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Dim checked, unchecked As ColorDrawable";
Debug.ShouldStop(33554432);
_checked = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("checked", _checked);
_unchecked = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("unchecked", _unchecked);
 BA.debugLineNum = 155;BA.debugLine="checked.Initialize(Colors.ARGB(255,5,138,72), 0di";
Debug.ShouldStop(67108864);
_checked.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 138)),(Object)(BA.numberCast(int.class, 72)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 156;BA.debugLine="unchecked.Initialize(Colors.White, 0dip)";
Debug.ShouldStop(134217728);
_unchecked.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 157;BA.debugLine="Log(PressedState)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_pressedstate)));
 BA.debugLineNum = 158;BA.debugLine="Select PressedState";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_pressedstate,main.mostCurrent.__c.getField(true,"True"),main.mostCurrent.__c.getField(true,"False"))) {
case 0: {
 BA.debugLineNum = 160;BA.debugLine="v.Background = checked";
Debug.ShouldStop(-2147483648);
_v.runMethod(false,"setBackground",(_checked.getObject()));
 BA.debugLineNum = 161;BA.debugLine="s.TextColor = Colors.White";
Debug.ShouldStop(1);
_s.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 break; }
case 1: {
 BA.debugLineNum = 163;BA.debugLine="v.Background = unchecked";
Debug.ShouldStop(4);
_v.runMethod(false,"setBackground",(_unchecked.getObject()));
 BA.debugLineNum = 164;BA.debugLine="s.TextColor = Colors.Black";
Debug.ShouldStop(8);
_s.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 break; }
}
;
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}