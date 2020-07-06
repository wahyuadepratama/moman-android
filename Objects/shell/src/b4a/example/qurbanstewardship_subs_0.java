package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanstewardship_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
Debug.ShouldStop(8);
qurbanstewardship.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BottomNavigation")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(16);
qurbanstewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(32);
qurbanstewardship.mostCurrent._mainscroll.runMethod(true,"setHeight",qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanstewardship.mostCurrent.activityBA));
 BA.debugLineNum = 40;BA.debugLine="NavbarTitle.Text=\"Qurban Confirmation\"";
Debug.ShouldStop(128);
qurbanstewardship.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Qurban Confirmation"));
 BA.debugLineNum = 41;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(256);
qurbanstewardship.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 43;BA.debugLine="Qurban.SetBackgroundImage(LoadBitmap(File.DirAsse";
Debug.ShouldStop(1024);
qurbanstewardship.mostCurrent._qurban.runVoidMethod ("SetBackgroundImageNew",(Object)((qurbanstewardship.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(qurbanstewardship.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cow_green.png"))).getObject())));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,51);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_resume");
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="CLV.Clear";
Debug.ShouldStop(16384);
qurbanstewardship.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 48;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/c";
Debug.ShouldStop(32768);
qurbanstewardship.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanstewardship.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanstewardship.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/confirmation?id="),qurbanstewardship.mostCurrent._homestewardship._worship)),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanstewardship.getObject()));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,134);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","clv_itemclick", _index, _value);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 134;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(64);
_item = qurbanstewardship.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanstewardship.mostCurrent.__c.runMethod(false,"Sender",qurbanstewardship.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 136;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 137;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(256);
_p = qurbanstewardship.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 139;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(1024);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 140;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(2048);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 142;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
Debug.ShouldStop(8192);
qurbanstewardship._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 143;BA.debugLine="Log(idSelected)";
Debug.ShouldStop(16384);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(qurbanstewardship._idselected));
 BA.debugLineNum = 144;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
Debug.ShouldStop(32768);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._qurbanstewardshipdetail.getObject())));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _id,RemoteObject _from,RemoteObject _donation,RemoteObject _total,RemoteObject _datetimes,RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,55);
if (RapidSub.canDelegate("createitem")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","createitem", _width, _id, _from, _donation, _total, _datetimes, _status);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("id", _id);
Debug.locals.put("from", _from);
Debug.locals.put("Donation", _donation);
Debug.locals.put("total", _total);
Debug.locals.put("datetimes", _datetimes);
Debug.locals.put("status", _status);
 BA.debugLineNum = 55;BA.debugLine="Private Sub CreateItem(Width As Int, id As String,";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8388608);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = qurbanstewardship._xui.runMethod(false,"CreatePanel",qurbanstewardship.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 58;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(33554432);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),qurbanstewardship.mostCurrent.activityBA)));
 BA.debugLineNum = 59;BA.debugLine="p.LoadLayout(\"ListQurbanConfirmation\")";
Debug.ShouldStop(67108864);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListQurbanConfirmation")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="ProjectName.Text = \"Qurban \"&Donation";
Debug.ShouldStop(268435456);
qurbanstewardship.mostCurrent._projectname.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Qurban "),_donation)));
 BA.debugLineNum = 62;BA.debugLine="IDpro.Text = id";
Debug.ShouldStop(536870912);
qurbanstewardship.mostCurrent._idpro.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 63;BA.debugLine="FundNeed.Text = \"From : \"&from";
Debug.ShouldStop(1073741824);
qurbanstewardship.mostCurrent._fundneed.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("From : "),_from)));
 BA.debugLineNum = 64;BA.debugLine="WorshipPlace.Text = \"Datetime : \"&datetimes";
Debug.ShouldStop(-2147483648);
qurbanstewardship.mostCurrent._worshipplace.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Datetime : "),_datetimes)));
 BA.debugLineNum = 66;BA.debugLine="If Donation = \"project\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_donation,BA.ObjectToString("project"))) { 
 BA.debugLineNum = 67;BA.debugLine="FundCollect.Text = \"Donation : Infaq Mosque Deve";
Debug.ShouldStop(4);
qurbanstewardship.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Donation : Infaq Mosque Development ("),_total,RemoteObject.createImmutable(")"))));
 }else 
{ BA.debugLineNum = 68;BA.debugLine="Else If Donation = \"orphanage\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_donation,BA.ObjectToString("orphanage"))) { 
 BA.debugLineNum = 69;BA.debugLine="FundCollect.Text = \"Donation : Infaq Orphans (\"&";
Debug.ShouldStop(16);
qurbanstewardship.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Donation : Infaq Orphans ("),_total,RemoteObject.createImmutable(")"))));
 }else 
{ BA.debugLineNum = 70;BA.debugLine="Else If Donation = \"tpa\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_donation,BA.ObjectToString("tpa"))) { 
 BA.debugLineNum = 71;BA.debugLine="FundCollect.Text = \"Donation : Infaq TPA/MDA (\"&";
Debug.ShouldStop(64);
qurbanstewardship.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Donation : Infaq TPA/MDA ("),_total,RemoteObject.createImmutable(")"))));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else If Donation = \"poor\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_donation,BA.ObjectToString("poor"))) { 
 BA.debugLineNum = 73;BA.debugLine="FundCollect.Text = \"Donation : Infaq Poor (\"&tot";
Debug.ShouldStop(256);
qurbanstewardship.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Donation : Infaq Poor ("),_total,RemoteObject.createImmutable(")"))));
 }else {
 BA.debugLineNum = 75;BA.debugLine="FundCollect.Text = \"Qurban : \"&Donation&\" (\"&tot";
Debug.ShouldStop(1024);
qurbanstewardship.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Qurban : "),_donation,RemoteObject.createImmutable(" ("),_total,RemoteObject.createImmutable(")"))));
 }}}}
;
 BA.debugLineNum = 78;BA.debugLine="If status = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString(qurbanstewardship.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 79;BA.debugLine="LDatetime.Text = \"Status: Checking\"";
Debug.ShouldStop(16384);
qurbanstewardship.mostCurrent._ldatetime.runMethod(true,"setText",BA.ObjectToCharSequence("Status: Checking"));
 BA.debugLineNum = 80;BA.debugLine="LDatetime.TextColor = Colors.Red";
Debug.ShouldStop(32768);
qurbanstewardship.mostCurrent._ldatetime.runMethod(true,"setTextColor",qurbanstewardship.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 }else {
 BA.debugLineNum = 82;BA.debugLine="LDatetime.Text = \"Status: Confirmed\"";
Debug.ShouldStop(131072);
qurbanstewardship.mostCurrent._ldatetime.runMethod(true,"setText",BA.ObjectToCharSequence("Status: Confirmed"));
 BA.debugLineNum = 83;BA.debugLine="LDatetime.TextColor = Colors.Green";
Debug.ShouldStop(262144);
qurbanstewardship.mostCurrent._ldatetime.runMethod(true,"setTextColor",qurbanstewardship.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 84;BA.debugLine="BtnDonationHere.Visible = False";
Debug.ShouldStop(524288);
qurbanstewardship.mostCurrent._btndonationhere.runMethod(true,"setVisible",qurbanstewardship.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 87;BA.debugLine="Return p";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _donation_click() throws Exception{
try {
		Debug.PushSubsStack("Donation_Click (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,164);
if (RapidSub.canDelegate("donation_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","donation_click");
 BA.debugLineNum = 164;BA.debugLine="Sub Donation_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="StartActivity(DonationStewardship)";
Debug.ShouldStop(16);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._donationstewardship.getObject())));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private MainScroll As ScrollView";
qurbanstewardship.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
qurbanstewardship.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
qurbanstewardship.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
qurbanstewardship.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As B4XView";
qurbanstewardship.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ProjectName As B4XView";
qurbanstewardship.mostCurrent._projectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private IDpro As Label";
qurbanstewardship.mostCurrent._idpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private FundNeed As Label";
qurbanstewardship.mostCurrent._fundneed = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private FundCollect As B4XView";
qurbanstewardship.mostCurrent._fundcollect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private WorshipPlace As B4XView";
qurbanstewardship.mostCurrent._worshipplace = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private IDworship As Label";
qurbanstewardship.mostCurrent._idworship = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private LDatetime As Label";
qurbanstewardship.mostCurrent._ldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnDonationHere As Button";
qurbanstewardship.mostCurrent._btndonationhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Qurban As Button";
qurbanstewardship.mostCurrent._qurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,90);
if (RapidSub.canDelegate("jobdone")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 90;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),qurbanstewardship.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 93;BA.debugLine="Dim res As String";
Debug.ShouldStop(268435456);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 94;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(536870912);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 96;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 97;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 100;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 102;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 103;BA.debugLine="Dim data As List";
Debug.ShouldStop(64);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 104;BA.debugLine="data=parser.NextArray";
Debug.ShouldStop(128);
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 105;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 107;BA.debugLine="For i=0 To data.Size -1";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 108;BA.debugLine="Dim a As Map";
Debug.ShouldStop(2048);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 109;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(4096);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 111;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
Debug.ShouldStop(16384);
qurbanstewardship.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("animal_type"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("confirmation")))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 112;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
Debug.ShouldStop(32768);
qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {qurbanstewardship.mostCurrent._panellistitem.runMethod(true,"getHeight"),qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),qurbanstewardship.mostCurrent.activityBA)}, "+",1, 1)),qurbanstewardship.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 115;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(262144);
qurbanstewardship.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),qurbanstewardship.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 116;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(524288);
qurbanstewardship.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 117;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(1048576);
qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 118;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(2097152);
qurbanstewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",qurbanstewardship.processBA, e24.toString()); BA.debugLineNum = 123;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(qurbanstewardship.mostCurrent.__c.runMethod(false,"LastException",qurbanstewardship.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 128;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(-2147483648);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 129;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(1);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(qurbanstewardship.mostCurrent.__c.getField(true,"True")));
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,147);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 147;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(524288);
_item = qurbanstewardship.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanstewardship.mostCurrent.__c.runMethod(false,"Sender",qurbanstewardship.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 149;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 150;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(2097152);
_p = qurbanstewardship.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 152;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 153;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16777216);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 155;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
Debug.ShouldStop(67108864);
qurbanstewardship._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 156;BA.debugLine="Log(idSelected)";
Debug.ShouldStop(134217728);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(qurbanstewardship._idselected));
 BA.debugLineNum = 157;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
Debug.ShouldStop(268435456);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._qurbanstewardshipdetail.getObject())));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
qurbanstewardship._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idSelected, idWorshipplace As String";
qurbanstewardship._idselected = RemoteObject.createImmutable("");
qurbanstewardship._idworshipplace = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _profile_click() throws Exception{
try {
		Debug.PushSubsStack("Profile_Click (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,160);
if (RapidSub.canDelegate("profile_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","profile_click");
 BA.debugLineNum = 160;BA.debugLine="Sub Profile_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="StartActivity(HomeStewardship)";
Debug.ShouldStop(1);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._homestewardship.getObject())));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Qurban_Click (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,168);
if (RapidSub.canDelegate("qurban_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","qurban_click");
 BA.debugLineNum = 168;BA.debugLine="Sub Qurban_Click";
Debug.ShouldStop(128);
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
public static RemoteObject  _web_click() throws Exception{
try {
		Debug.PushSubsStack("Web_Click (qurbanstewardship) ","qurbanstewardship",10,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,172);
if (RapidSub.canDelegate("web_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","web_click");
 BA.debugLineNum = 172;BA.debugLine="Sub Web_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="StartActivity(WebView)";
Debug.ShouldStop(4096);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._webview.getObject())));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
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