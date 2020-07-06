package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanjamaahdetail_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16);
qurbanjamaahdetail.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Panel.LoadLayout(\"QurbanJamaahDetail\")";
Debug.ShouldStop(32);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("QurbanJamaahDetail")),qurbanjamaahdetail.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="MainScroll.Height =100%y";
Debug.ShouldStop(64);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",qurbanjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaahdetail.mostCurrent.activityBA));
 BA.debugLineNum = 40;BA.debugLine="MainScroll.Height=100%y - Navbar.Height";
Debug.ShouldStop(128);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanjamaahdetail.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaahdetail.mostCurrent.activityBA),qurbanjamaahdetail.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(256);
qurbanjamaahdetail.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanjamaahdetail.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 43;BA.debugLine="pengurus.Initialize";
Debug.ShouldStop(1024);
qurbanjamaahdetail.mostCurrent._pengurus.runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="types.Initialize";
Debug.ShouldStop(2048);
qurbanjamaahdetail.mostCurrent._types.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
Debug.ShouldStop(8192);
qurbanjamaahdetail.mostCurrent._spinpengurus.runMethod(true,"setDropdownBackgroundColor",qurbanjamaahdetail.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 49;BA.debugLine="NavbarTitle.Text = \"Detail Qurban\"";
Debug.ShouldStop(65536);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Detail Qurban"));
 BA.debugLineNum = 50;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(131072);
qurbanjamaahdetail.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="SpinPengurus.Add(\"Pilih Group\")";
Debug.ShouldStop(524288);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Pilih Group")));
 BA.debugLineNum = 53;BA.debugLine="SpinPengurus.Add(\"Group 01\")";
Debug.ShouldStop(1048576);
qurbanjamaahdetail.mostCurrent._spinpengurus.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Group 01")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,60);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_pause", _userclosed);
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
		Debug.PushSubsStack("Activity_Resume (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,56);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","activity_resume");
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/d";
Debug.ShouldStop(16777216);
qurbanjamaahdetail.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanjamaahdetail.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanjamaahdetail.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/detail?id="),qurbanjamaahdetail.mostCurrent._qurbanjamaah._idselected)),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanjamaahdetail.getObject()));
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,111);
if (RapidSub.canDelegate("button1_click")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","button1_click");
 BA.debugLineNum = 111;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="StartActivity(InvoiceJamaah)";
Debug.ShouldStop(65536);
qurbanjamaahdetail.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanjamaahdetail.processBA,(Object)((qurbanjamaahdetail.mostCurrent._invoicejamaah.getObject())));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("CustomListView1_ItemClick (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,107);
if (RapidSub.canDelegate("customlistview1_itemclick")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","customlistview1_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 107;BA.debugLine="Sub CustomListView1_ItemClick (Index As Int, Value";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 19;BA.debugLine="Private PanelQurban As Panel";
qurbanjamaahdetail.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private SpinPengurus As Spinner";
qurbanjamaahdetail.mostCurrent._spinpengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private SpinType As Spinner";
qurbanjamaahdetail.mostCurrent._spintype = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim pengurus As Map";
qurbanjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 24;BA.debugLine="Dim types As Map";
qurbanjamaahdetail.mostCurrent._types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 26;BA.debugLine="Private Button1 As Button";
qurbanjamaahdetail.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim pengurus As Map";
qurbanjamaahdetail.mostCurrent._pengurus = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 29;BA.debugLine="Dim accountId, publicId, noTransaction As String";
qurbanjamaahdetail.mostCurrent._accountid = RemoteObject.createImmutable("");
qurbanjamaahdetail.mostCurrent._publicid = RemoteObject.createImmutable("");
qurbanjamaahdetail.mostCurrent._notransaction = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Dim account As List : account.Initialize";
qurbanjamaahdetail.mostCurrent._account = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim account As List : account.Initialize";
qurbanjamaahdetail.mostCurrent._account.runVoidMethod ("Initialize");
 //BA.debugLineNum = 31;BA.debugLine="Dim animal_type As List : animal_type.Initialize";
qurbanjamaahdetail.mostCurrent._animal_type = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 31;BA.debugLine="Dim animal_type As List : animal_type.Initialize";
qurbanjamaahdetail.mostCurrent._animal_type.runVoidMethod ("Initialize");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelPaidInfo As Panel";
qurbanjamaahdetail.mostCurrent._panelpaidinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinpengurus_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SpinPengurus_ItemClick (qurbanjamaahdetail) ","qurbanjamaahdetail",4,qurbanjamaahdetail.mostCurrent.activityBA,qurbanjamaahdetail.mostCurrent,102);
if (RapidSub.canDelegate("spinpengurus_itemclick")) return b4a.example.qurbanjamaahdetail.remoteMe.runUserSub(false, "qurbanjamaahdetail","spinpengurus_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 102;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
Debug.ShouldStop(32);
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