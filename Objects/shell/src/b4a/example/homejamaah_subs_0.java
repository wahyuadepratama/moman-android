package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homejamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(512);
homejamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),homejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeJamaah\")";
Debug.ShouldStop(1024);
homejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("HomeJamaah")),homejamaah.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="PanelMenu.Height = logoutLabel.Top+logoutLabel.He";
Debug.ShouldStop(4096);
homejamaah.mostCurrent._panelmenu.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {homejamaah.mostCurrent._logoutlabel.runMethod(true,"getTop"),homejamaah.mostCurrent._logoutlabel.runMethod(true,"getHeight"),homejamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),homejamaah.mostCurrent.activityBA)}, "++",2, 1));
 BA.debugLineNum = 46;BA.debugLine="PanelHome.Height= PanelMenu.Height + 50%y";
Debug.ShouldStop(8192);
homejamaah.mostCurrent._panelhome.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {homejamaah.mostCurrent._panelmenu.runMethod(true,"getHeight"),homejamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),homejamaah.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 48;BA.debugLine="MainScroll.Height=100%y-Navbar.Height";
Debug.ShouldStop(32768);
homejamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {homejamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homejamaah.mostCurrent.activityBA),homejamaah.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 49;BA.debugLine="MainScroll.Panel.Height = PanelHome.Height";
Debug.ShouldStop(65536);
homejamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",homejamaah.mostCurrent._panelhome.runMethod(true,"getHeight"));
 BA.debugLineNum = 51;BA.debugLine="NavbarTitle.Text=\"Home Jamaah\"";
Debug.ShouldStop(262144);
homejamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Home Jamaah"));
 BA.debugLineNum = 52;BA.debugLine="NavbarTitle.TextSize = 22";
Debug.ShouldStop(524288);
homejamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 22));
 BA.debugLineNum = 53;BA.debugLine="NavbarTitle.Left=4%x";
Debug.ShouldStop(1048576);
homejamaah.mostCurrent._navbartitle.runMethod(true,"setLeft",homejamaah.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),homejamaah.mostCurrent.activityBA));
 BA.debugLineNum = 54;BA.debugLine="BackBtn.Visible = False";
Debug.ShouldStop(2097152);
homejamaah.mostCurrent._backbtn.runMethod(true,"setVisible",homejamaah.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,62);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Activity_Resume (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,58);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","activity_resume");
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/_users\",\"id";
Debug.ShouldStop(67108864);
homejamaah.mostCurrent._codesemua.runVoidMethod ("_executeurl",homejamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(homejamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/_users"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("id="),homejamaah.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))))),(Object)(BA.ObjectToString("LoadData")),(Object)(homejamaah.getObject()));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _constructionbtn_click() throws Exception{
try {
		Debug.PushSubsStack("constructionBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,115);
if (RapidSub.canDelegate("constructionbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","constructionbtn_click");
 BA.debugLineNum = 115;BA.debugLine="Sub constructionBtn_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="StartActivity(DonationJamaah)";
Debug.ShouldStop(524288);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._donationjamaah.getObject())));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
homejamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelHome As Panel";
homejamaah.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LabelName As Label";
homejamaah.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelNumber As Label";
homejamaah.mostCurrent._labelnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelUser As Label";
homejamaah.mostCurrent._labeluser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Navbar As Panel";
homejamaah.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelMenu As Panel";
homejamaah.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private NavbarTitle As Label";
homejamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private BackBtn As Button";
homejamaah.mostCurrent._backbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private mapBtn As Button";
homejamaah.mostCurrent._mapbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private qurbanBtn As Button";
homejamaah.mostCurrent._qurbanbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private constructionBtn As Button";
homejamaah.mostCurrent._constructionbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelPhoto As ImageView";
homejamaah.mostCurrent._panelphoto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private constructionBtn As Button";
homejamaah.mostCurrent._constructionbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private orphanBtn As Button";
homejamaah.mostCurrent._orphanbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private tpaBtn As Button";
homejamaah.mostCurrent._tpabtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private poorBtn As Button";
homejamaah.mostCurrent._poorbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private historyBtn As Button";
homejamaah.mostCurrent._historybtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private logoutBtn As Button";
homejamaah.mostCurrent._logoutbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private historyLabel As Label";
homejamaah.mostCurrent._historylabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private logoutLabel As Label";
homejamaah.mostCurrent._logoutlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelBanner As Panel";
homejamaah.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _historybtn_click() throws Exception{
try {
		Debug.PushSubsStack("historyBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,139);
if (RapidSub.canDelegate("historybtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","historybtn_click");
 BA.debugLineNum = 139;BA.debugLine="Sub historyBtn_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="StartActivity(HistoryJamaah)";
Debug.ShouldStop(2048);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._historyjamaah.getObject())));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,66);
if (RapidSub.canDelegate("jobdone")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 66;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(4);
homejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname"),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success"))));
 BA.debugLineNum = 68;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),homejamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 69;BA.debugLine="Dim res As String";
Debug.ShouldStop(16);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 70;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(32);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 71;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 72;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 73;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(256);
homejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 74;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 76;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 77;BA.debugLine="Dim a As Map";
Debug.ShouldStop(4096);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 78;BA.debugLine="a = parser.NextObject";
Debug.ShouldStop(8192);
_a = _parser.runMethod(false,"NextObject");Debug.locals.put("a", _a);
 BA.debugLineNum = 79;BA.debugLine="id = Main.manager.GetString(\"id\")";
Debug.ShouldStop(16384);
homejamaah._id = homejamaah.mostCurrent._main._manager.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 81;BA.debugLine="LabelName.TextColor = Colors.Black";
Debug.ShouldStop(65536);
homejamaah.mostCurrent._labelname.runMethod(true,"setTextColor",homejamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 82;BA.debugLine="LabelNumber.TextColor = Colors.Black";
Debug.ShouldStop(131072);
homejamaah.mostCurrent._labelnumber.runMethod(true,"setTextColor",homejamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 83;BA.debugLine="LabelUser.TextColor = Colors.Black";
Debug.ShouldStop(262144);
homejamaah.mostCurrent._labeluser.runMethod(true,"setTextColor",homejamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 85;BA.debugLine="LabelName.Text = a.Get(\"name\")&\" / @\"&a.Get(\"";
Debug.ShouldStop(1048576);
homejamaah.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" / @"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))))));
 BA.debugLineNum = 86;BA.debugLine="LabelNumber.Text = a.Get(\"id\")";
Debug.ShouldStop(2097152);
homejamaah.mostCurrent._labelnumber.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 87;BA.debugLine="LabelUser.Text = a.Get(\"phone\")";
Debug.ShouldStop(4194304);
homejamaah.mostCurrent._labeluser.runMethod(true,"setText",BA.ObjectToCharSequence(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("phone"))))));
 BA.debugLineNum = 88;BA.debugLine="Main.username = a.Get(\"username\")";
Debug.ShouldStop(8388608);
homejamaah.mostCurrent._main._username = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 89;BA.debugLine="Main.id = a.Get(\"id\")";
Debug.ShouldStop(16777216);
homejamaah.mostCurrent._main._id = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 91;BA.debugLine="Dim path As String = \"\"&Main.server&\"images/a";
Debug.ShouldStop(67108864);
_path = RemoteObject.concat(RemoteObject.createImmutable(""),homejamaah.mostCurrent._main._server,RemoteObject.createImmutable("images/avatar/"),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("avatar")))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 92;BA.debugLine="Dim m As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 93;BA.debugLine="m.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="m.Put(PanelPhoto,path)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)((homejamaah.mostCurrent._panelphoto.getObject())),(Object)((_path)));
 BA.debugLineNum = 95;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
Debug.ShouldStop(1073741824);
homejamaah.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homejamaah.processBA,(Object)((homejamaah.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_m)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",homejamaah.processBA, e28.toString()); BA.debugLineNum = 98;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
homejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(homejamaah.mostCurrent.__c.runMethod(false,"LastException",homejamaah.mostCurrent.activityBA))));
 BA.debugLineNum = 99;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
Debug.ShouldStop(4);
homejamaah.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),homejamaah.mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 103;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(64);
homejamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 104;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(128);
homejamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(homejamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 106;BA.debugLine="Job.Release";
Debug.ShouldStop(512);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logoutbtn_click() throws Exception{
try {
		Debug.PushSubsStack("logoutBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,109);
if (RapidSub.canDelegate("logoutbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","logoutbtn_click");
 BA.debugLineNum = 109;BA.debugLine="Sub logoutBtn_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Main.manager.ClearAll";
Debug.ShouldStop(8192);
homejamaah.mostCurrent._main._manager.runVoidMethod ("ClearAll");
 BA.debugLineNum = 111;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
homejamaah.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 112;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(32768);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._main.getObject())));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapbtn_click() throws Exception{
try {
		Debug.PushSubsStack("mapBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,123);
if (RapidSub.canDelegate("mapbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","mapbtn_click");
 BA.debugLineNum = 123;BA.debugLine="Sub mapBtn_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 124;BA.debugLine="StartActivity(MapsJamaah)";
Debug.ShouldStop(134217728);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._mapsjamaah.getObject())));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _orphanbtn_click() throws Exception{
try {
		Debug.PushSubsStack("orphanBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,127);
if (RapidSub.canDelegate("orphanbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","orphanbtn_click");
 BA.debugLineNum = 127;BA.debugLine="Sub orphanBtn_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="StartActivity(OrphansJamaah)";
Debug.ShouldStop(-2147483648);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._orphansjamaah.getObject())));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _poorbtn_click() throws Exception{
try {
		Debug.PushSubsStack("poorBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,135);
if (RapidSub.canDelegate("poorbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","poorbtn_click");
 BA.debugLineNum = 135;BA.debugLine="Sub poorBtn_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="StartActivity(PoorJamaah)";
Debug.ShouldStop(128);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._poorjamaah.getObject())));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim username, phone, status, id, worship_name, ty";
homejamaah._username = RemoteObject.createImmutable("");
homejamaah._phone = RemoteObject.createImmutable("");
homejamaah._status = RemoteObject.createImmutable("");
homejamaah._id = RemoteObject.createImmutable("");
homejamaah._worship_name = RemoteObject.createImmutable("");
homejamaah._types = RemoteObject.createImmutable("");
homejamaah._address = RemoteObject.createImmutable("");
homejamaah._updated_at = RemoteObject.createImmutable("");
homejamaah._avatar = RemoteObject.createImmutable("");
homejamaah._worship_place_address = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _qurbanbtn_click() throws Exception{
try {
		Debug.PushSubsStack("qurbanBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,119);
if (RapidSub.canDelegate("qurbanbtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","qurbanbtn_click");
 BA.debugLineNum = 119;BA.debugLine="Sub qurbanBtn_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="StartActivity(QurbanJamaah)";
Debug.ShouldStop(8388608);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._qurbanjamaah.getObject())));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tpabtn_click() throws Exception{
try {
		Debug.PushSubsStack("tpaBtn_Click (homejamaah) ","homejamaah",3,homejamaah.mostCurrent.activityBA,homejamaah.mostCurrent,131);
if (RapidSub.canDelegate("tpabtn_click")) return b4a.example.homejamaah.remoteMe.runUserSub(false, "homejamaah","tpabtn_click");
 BA.debugLineNum = 131;BA.debugLine="Sub tpaBtn_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="StartActivity(InvoiceJamaah)";
Debug.ShouldStop(8);
homejamaah.mostCurrent.__c.runVoidMethod ("StartActivity",homejamaah.processBA,(Object)((homejamaah.mostCurrent._invoicejamaah.getObject())));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}