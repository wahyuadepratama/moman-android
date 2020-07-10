package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanstewardship_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
Debug.ShouldStop(16);
qurbanstewardship.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BottomNavigation")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(32);
qurbanstewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(64);
qurbanstewardship.mostCurrent._mainscroll.runMethod(true,"setHeight",qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanstewardship.mostCurrent.activityBA));
 BA.debugLineNum = 41;BA.debugLine="NavbarTitle.Text=\"Qurban Confirmation\"";
Debug.ShouldStop(256);
qurbanstewardship.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Qurban Confirmation"));
 BA.debugLineNum = 42;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(512);
qurbanstewardship.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 44;BA.debugLine="Qurban.SetBackgroundImage(LoadBitmap(File.DirAsse";
Debug.ShouldStop(2048);
qurbanstewardship.mostCurrent._qurban.runVoidMethod ("SetBackgroundImageNew",(Object)((qurbanstewardship.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(qurbanstewardship.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cow_green.png"))).getObject())));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,47);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","activity_resume");
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="CLV.Clear";
Debug.ShouldStop(32768);
qurbanstewardship.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 49;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/t";
Debug.ShouldStop(65536);
qurbanstewardship.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanstewardship.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanstewardship.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/transaction?id="),qurbanstewardship.mostCurrent._homestewardship._id)),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanstewardship.getObject()));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("CLV_ItemClick (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,115);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","clv_itemclick", _index, _value);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 115;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(524288);
_item = qurbanstewardship.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanstewardship.mostCurrent.__c.runMethod(false,"Sender",qurbanstewardship.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 117;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 118;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(2097152);
_p = qurbanstewardship.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16777216);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 123;BA.debugLine="idSelected=a.GetView(0).GetView(0).Text";
Debug.ShouldStop(67108864);
qurbanstewardship._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText");
 BA.debugLineNum = 124;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
Debug.ShouldStop(134217728);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._qurbanstewardshipdetail.getObject())));
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _transactions,RemoteObject _dates,RemoteObject _statuss,RemoteObject _jamaahs) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,56);
if (RapidSub.canDelegate("createitem")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","createitem", _width, _transactions, _dates, _statuss, _jamaahs);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Transactions", _transactions);
Debug.locals.put("Dates", _dates);
Debug.locals.put("Statuss", _statuss);
Debug.locals.put("Jamaahs", _jamaahs);
 BA.debugLineNum = 56;BA.debugLine="Private Sub CreateItem(Width As Int, Transactions";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = qurbanstewardship._xui.runMethod(false,"CreatePanel",qurbanstewardship.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 59;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),qurbanstewardship.mostCurrent.activityBA)));
 BA.debugLineNum = 60;BA.debugLine="p.LoadLayout(\"ListQurbanConfirmation\")";
Debug.ShouldStop(134217728);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListQurbanConfirmation")),qurbanstewardship.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="Transaction.Text 	= \"Transaction  \"&Transactions";
Debug.ShouldStop(536870912);
qurbanstewardship.mostCurrent._transaction.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Transaction  "),_transactions)));
 BA.debugLineNum = 63;BA.debugLine="Date.Text 			= \"Date                \"&Dates";
Debug.ShouldStop(1073741824);
qurbanstewardship.mostCurrent._date.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Date                "),_dates)));
 BA.debugLineNum = 64;BA.debugLine="Status.Text 		= \"Status             \"&Statuss";
Debug.ShouldStop(-2147483648);
qurbanstewardship.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Status             "),_statuss)));
 BA.debugLineNum = 65;BA.debugLine="Jamaah.Text 		= \"Jamaah          \"&Jamaahs";
Debug.ShouldStop(1);
qurbanstewardship.mostCurrent._jamaah.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Jamaah          "),_jamaahs)));
 BA.debugLineNum = 66;BA.debugLine="IDpro.Text = Transactions";
Debug.ShouldStop(2);
qurbanstewardship.mostCurrent._idpro.runMethod(true,"setText",BA.ObjectToCharSequence(_transactions));
 BA.debugLineNum = 68;BA.debugLine="Return p";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
qurbanstewardship.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
qurbanstewardship.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
qurbanstewardship.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
qurbanstewardship.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As B4XView";
qurbanstewardship.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Transaction As Label";
qurbanstewardship.mostCurrent._transaction = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Date As Label";
qurbanstewardship.mostCurrent._date = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Status As Label";
qurbanstewardship.mostCurrent._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Jamaah As Label";
qurbanstewardship.mostCurrent._jamaah = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private IDpro As Label";
qurbanstewardship.mostCurrent._idpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnDonationHere As Button";
qurbanstewardship.mostCurrent._btndonationhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Qurban As Button";
qurbanstewardship.mostCurrent._qurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,71);
if (RapidSub.canDelegate("jobdone")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 71;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),qurbanstewardship.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 74;BA.debugLine="Dim res As String";
Debug.ShouldStop(512);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 75;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1024);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 77;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 78;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 81;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 83;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 84;BA.debugLine="Dim data As List";
Debug.ShouldStop(524288);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 85;BA.debugLine="data=parser.NextArray";
Debug.ShouldStop(1048576);
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 86;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 88;BA.debugLine="For i=0 To data.Size -1";
Debug.ShouldStop(8388608);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="Dim a As Map";
Debug.ShouldStop(16777216);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 90;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(33554432);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 92;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
Debug.ShouldStop(134217728);
qurbanstewardship.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("invoice"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jamaah_name")))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 93;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
Debug.ShouldStop(268435456);
qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {qurbanstewardship.mostCurrent._panellistitem.runMethod(true,"getHeight"),qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),qurbanstewardship.mostCurrent.activityBA)}, "+",1, 1)),qurbanstewardship.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 96;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(-2147483648);
qurbanstewardship.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),qurbanstewardship.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),qurbanstewardship.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 97;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(1);
qurbanstewardship.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 98;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(2);
qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 99;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(4);
qurbanstewardship.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanstewardship.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e24) {
			BA.rdebugUtils.runVoidMethod("setLastException",qurbanstewardship.processBA, e24.toString()); BA.debugLineNum = 104;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(qurbanstewardship.mostCurrent.__c.runMethod(false,"LastException",qurbanstewardship.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 109;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4096);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 110;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(8192);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(qurbanstewardship.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 112;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_release");
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
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,127);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 127;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(-2147483648);
_item = qurbanstewardship.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanstewardship.mostCurrent.__c.runMethod(false,"Sender",qurbanstewardship.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 129;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 130;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(2);
_p = qurbanstewardship.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 132;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 133;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 135;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
Debug.ShouldStop(64);
qurbanstewardship._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 136;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
Debug.ShouldStop(128);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._qurbanstewardshipdetail.getObject())));
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
		Debug.PushSubsStack("Profile_Click (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,139);
if (RapidSub.canDelegate("profile_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","profile_click");
 BA.debugLineNum = 139;BA.debugLine="Sub Profile_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="StartActivity(HomeStewardship)";
Debug.ShouldStop(2048);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._homestewardship.getObject())));
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
public static RemoteObject  _qurban_click() throws Exception{
try {
		Debug.PushSubsStack("Qurban_Click (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,143);
if (RapidSub.canDelegate("qurban_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","qurban_click");
 BA.debugLineNum = 143;BA.debugLine="Sub Qurban_Click";
Debug.ShouldStop(16384);
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
public static RemoteObject  _web_click() throws Exception{
try {
		Debug.PushSubsStack("Web_Click (qurbanstewardship) ","qurbanstewardship",13,qurbanstewardship.mostCurrent.activityBA,qurbanstewardship.mostCurrent,147);
if (RapidSub.canDelegate("web_click")) return b4a.example.qurbanstewardship.remoteMe.runUserSub(false, "qurbanstewardship","web_click");
 BA.debugLineNum = 147;BA.debugLine="Sub Web_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="StartActivity(WebView)";
Debug.ShouldStop(524288);
qurbanstewardship.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanstewardship.processBA,(Object)((qurbanstewardship.mostCurrent._webview.getObject())));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}