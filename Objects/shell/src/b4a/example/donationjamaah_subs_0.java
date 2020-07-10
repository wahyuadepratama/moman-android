package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class donationjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
donationjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),donationjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(2);
donationjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),donationjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(4);
donationjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",donationjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),donationjamaah.mostCurrent.activityBA));
 BA.debugLineNum = 37;BA.debugLine="NavbarTitle.Text=\"Infaq Construction\"";
Debug.ShouldStop(16);
donationjamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq Construction"));
 BA.debugLineNum = 38;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(32);
donationjamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Pause (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,42);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","activity_resume");
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="CLV.Clear";
Debug.ShouldStop(1024);
donationjamaah.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 44;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
Debug.ShouldStop(2048);
donationjamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",donationjamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(donationjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/donation"))),(Object)(BA.ObjectToString("LoadData")),(Object)(donationjamaah.getObject()));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("CLV_ItemClick (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,111);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","clv_itemclick", _index, _value);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 111;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(32768);
_item = donationjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), donationjamaah.mostCurrent.__c.runMethod(false,"Sender",donationjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 113;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(65536);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 114;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(131072);
_p = donationjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(524288);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 117;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(1048576);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 119;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
Debug.ShouldStop(4194304);
donationjamaah._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 120;BA.debugLine="idWorshipplace = a.GetView(0).GetView(6).Text";
Debug.ShouldStop(8388608);
donationjamaah._idworshipplace = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).runMethod(true,"getText");
 BA.debugLineNum = 121;BA.debugLine="StartActivity(DonationJamaahDetail)";
Debug.ShouldStop(16777216);
donationjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",donationjamaah.processBA,(Object)((donationjamaah.mostCurrent._donationjamaahdetail.getObject())));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _id,RemoteObject _title,RemoteObject _needed,RemoteObject _collect,RemoteObject _worship_id,RemoteObject _worship) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,51);
if (RapidSub.canDelegate("createitem")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","createitem", _width, _id, _title, _needed, _collect, _worship_id, _worship);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("id", _id);
Debug.locals.put("Title", _title);
Debug.locals.put("needed", _needed);
Debug.locals.put("collect", _collect);
Debug.locals.put("worship_id", _worship_id);
Debug.locals.put("worship", _worship);
 BA.debugLineNum = 51;BA.debugLine="Private Sub CreateItem(Width As Int, id As String,";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = donationjamaah._xui.runMethod(false,"CreatePanel",donationjamaah.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 54;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(donationjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),donationjamaah.mostCurrent.activityBA)));
 BA.debugLineNum = 55;BA.debugLine="p.LoadLayout(\"ListDonationJamaah\")";
Debug.ShouldStop(4194304);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListDonationJamaah")),donationjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="ProjectName.Text = Title";
Debug.ShouldStop(16777216);
donationjamaah.mostCurrent._projectname.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 58;BA.debugLine="IDpro.Text = id";
Debug.ShouldStop(33554432);
donationjamaah.mostCurrent._idpro.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 59;BA.debugLine="IDworship.Text = worship_id";
Debug.ShouldStop(67108864);
donationjamaah.mostCurrent._idworship.runMethod(true,"setText",BA.ObjectToCharSequence(_worship_id));
 BA.debugLineNum = 60;BA.debugLine="FundNeed.Text = needed";
Debug.ShouldStop(134217728);
donationjamaah.mostCurrent._fundneed.runMethod(true,"setText",BA.ObjectToCharSequence(_needed));
 BA.debugLineNum = 61;BA.debugLine="FundCollect.Text = collect";
Debug.ShouldStop(268435456);
donationjamaah.mostCurrent._fundcollect.runMethod(true,"setText",BA.ObjectToCharSequence(_collect));
 BA.debugLineNum = 62;BA.debugLine="WorshipPlace.Text = worship";
Debug.ShouldStop(536870912);
donationjamaah.mostCurrent._worshipplace.runMethod(true,"setText",BA.ObjectToCharSequence(_worship));
 BA.debugLineNum = 64;BA.debugLine="Return p";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
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
donationjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
donationjamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
donationjamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
donationjamaah.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As B4XView";
donationjamaah.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ProjectName As B4XView";
donationjamaah.mostCurrent._projectname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private IDpro As Label";
donationjamaah.mostCurrent._idpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private FundNeed As Label";
donationjamaah.mostCurrent._fundneed = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private FundCollect As B4XView";
donationjamaah.mostCurrent._fundcollect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private WorshipPlace As B4XView";
donationjamaah.mostCurrent._worshipplace = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private IDworship As Label";
donationjamaah.mostCurrent._idworship = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,67);
if (RapidSub.canDelegate("jobdone")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 67;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),donationjamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 70;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 71;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(64);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 73;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 74;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 77;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 79;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 80;BA.debugLine="Dim data As List";
Debug.ShouldStop(32768);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 81;BA.debugLine="data=parser.NextArray";
Debug.ShouldStop(65536);
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 82;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 84;BA.debugLine="For i=0 To data.Size -1";
Debug.ShouldStop(524288);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1048576);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 86;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(2097152);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 88;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
Debug.ShouldStop(8388608);
donationjamaah.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),RemoteObject.concat(RemoteObject.createImmutable("Fund Needed : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund"))))),RemoteObject.concat(RemoteObject.createImmutable("Fund Collected : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fund_collected"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship_place_id"))))),RemoteObject.concat(RemoteObject.createImmutable("Worship Place : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("worship")))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 89;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
Debug.ShouldStop(16777216);
donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {donationjamaah.mostCurrent._panellistitem.runMethod(true,"getHeight"),donationjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),donationjamaah.mostCurrent.activityBA)}, "+",1, 1)),donationjamaah.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(134217728);
donationjamaah.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),donationjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),donationjamaah.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 93;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(268435456);
donationjamaah.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 94;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(536870912);
donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",donationjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 95;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(1073741824);
donationjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",donationjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",donationjamaah.processBA, e24.toString()); BA.debugLineNum = 100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
donationjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(donationjamaah.mostCurrent.__c.runMethod(false,"LastException",donationjamaah.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(256);
donationjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 106;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(512);
donationjamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(donationjamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 108;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_release");
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (donationjamaah) ","donationjamaah",15,donationjamaah.mostCurrent.activityBA,donationjamaah.mostCurrent,124);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.donationjamaah.remoteMe.runUserSub(false, "donationjamaah","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 124;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(268435456);
_item = donationjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), donationjamaah.mostCurrent.__c.runMethod(false,"Sender",donationjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 126;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 127;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(1073741824);
_p = donationjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(1);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 130;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(2);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 132;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
Debug.ShouldStop(8);
donationjamaah._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 133;BA.debugLine="idWorshipplace = a.GetView(0).GetView(6).Text";
Debug.ShouldStop(16);
donationjamaah._idworshipplace = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 6))).runMethod(true,"getText");
 BA.debugLineNum = 134;BA.debugLine="StartActivity(DonationJamaahDetail)";
Debug.ShouldStop(32);
donationjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",donationjamaah.processBA,(Object)((donationjamaah.mostCurrent._donationjamaahdetail.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
donationjamaah._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idSelected, idWorshipplace As String";
donationjamaah._idselected = RemoteObject.createImmutable("");
donationjamaah._idworshipplace = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}