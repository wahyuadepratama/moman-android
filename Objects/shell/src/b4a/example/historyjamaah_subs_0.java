package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class historyjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
historyjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(2);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(8);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",historyjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 BA.debugLineNum = 37;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(16);
historyjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),historyjamaah.mostCurrent.activityBA));
 BA.debugLineNum = 39;BA.debugLine="NavbarTitle.Text=\"History Transaction\"";
Debug.ShouldStop(64);
historyjamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("History Transaction"));
 BA.debugLineNum = 40;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(128);
historyjamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,127);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 127;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, historyjamaah.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 129;BA.debugLine="StartActivity(HomeJamaah)";
Debug.ShouldStop(1);
historyjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",historyjamaah.processBA,(Object)((historyjamaah.mostCurrent._homejamaah.getObject())));
 }else {
 BA.debugLineNum = 131;BA.debugLine="Return False";
Debug.ShouldStop(4);
Debug.CheckDeviceExceptions();if (true) return historyjamaah.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","activity_resume");
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="CLV.Clear'";
Debug.ShouldStop(2048);
historyjamaah.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 45;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/h";
Debug.ShouldStop(4096);
historyjamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",historyjamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(historyjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban/history?user="),historyjamaah.mostCurrent._main._id)),(Object)(BA.ObjectToString("LoadData")),(Object)(historyjamaah.getObject()));
 BA.debugLineNum = 46;BA.debugLine="Log(\"ID: \"&Main.id)";
Debug.ShouldStop(8192);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("ID: "),historyjamaah.mostCurrent._main._id)));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CLV_ItemClick (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,111);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","clv_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 111;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(16384);
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
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _idtrx,RemoteObject _date,RemoteObject _confirm) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,53);
if (RapidSub.canDelegate("createitem")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","createitem", _width, _idtrx, _date, _confirm);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("idtrx", _idtrx);
Debug.locals.put("date", _date);
Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 53;BA.debugLine="Private Sub CreateItem(Width As Int, idtrx As Stri";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2097152);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = historyjamaah._xui.runMethod(false,"CreatePanel",historyjamaah.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 56;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),historyjamaah.mostCurrent.activityBA)));
 BA.debugLineNum = 57;BA.debugLine="p.LoadLayout(\"ListHistoryJamaah\")";
Debug.ShouldStop(16777216);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListHistoryJamaah")),historyjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="Id.Text = idtrx";
Debug.ShouldStop(67108864);
historyjamaah.mostCurrent._id.runMethod(true,"setText",BA.ObjectToCharSequence(_idtrx));
 BA.debugLineNum = 60;BA.debugLine="DateTrans.Text = date";
Debug.ShouldStop(134217728);
historyjamaah.mostCurrent._datetrans.runMethod(true,"setText",BA.ObjectToCharSequence(_date));
 BA.debugLineNum = 61;BA.debugLine="TransName.Text = idtrx";
Debug.ShouldStop(268435456);
historyjamaah.mostCurrent._transname.runMethod(true,"setText",BA.ObjectToCharSequence(_idtrx));
 BA.debugLineNum = 62;BA.debugLine="statusTransc.Text = confirm";
Debug.ShouldStop(536870912);
historyjamaah.mostCurrent._statustransc.runMethod(true,"setText",BA.ObjectToCharSequence(_confirm));
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
historyjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
historyjamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
historyjamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
historyjamaah.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As Panel";
historyjamaah.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private TransName As Label";
historyjamaah.mostCurrent._transname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private DateTrans As Label";
historyjamaah.mostCurrent._datetrans = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private TotalTrans As Label";
historyjamaah.mostCurrent._totaltrans = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Id As Label";
historyjamaah.mostCurrent._id = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private statusTransc As Label";
historyjamaah.mostCurrent._statustransc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,67);
if (RapidSub.canDelegate("jobdone")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","jobdone", _job);
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
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),historyjamaah.mostCurrent.__c.getField(true,"True"))) { 
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
 BA.debugLineNum = 76;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(2048);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
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
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1048576);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 86;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(2097152);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 88;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width, a.Get(";
Debug.ShouldStop(8388608);
historyjamaah.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("invoice"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_completed")))))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 89;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+1";
Debug.ShouldStop(16777216);
historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {historyjamaah.mostCurrent._panellistitem.runMethod(true,"getHeight"),historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1.4)),historyjamaah.mostCurrent.activityBA)}, "+",1, 1)),historyjamaah.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 92;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(134217728);
historyjamaah.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),historyjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),historyjamaah.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 93;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(268435456);
historyjamaah.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 94;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(536870912);
historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",historyjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 95;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(1073741824);
historyjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",historyjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e25) {
			BA.rdebugUtils.runVoidMethod("setLastException",historyjamaah.processBA, e25.toString()); BA.debugLineNum = 100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(historyjamaah.mostCurrent.__c.runMethod(false,"LastException",historyjamaah.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 105;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(256);
historyjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 106;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(512);
historyjamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(historyjamaah.mostCurrent.__c.getField(true,"True")));
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
		Debug.PushSubsStack("PanelListItem_Click (historyjamaah) ","historyjamaah",8,historyjamaah.mostCurrent.activityBA,historyjamaah.mostCurrent,115);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.historyjamaah.remoteMe.runUserSub(false, "historyjamaah","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 115;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(524288);
_item = historyjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), historyjamaah.mostCurrent.__c.runMethod(false,"Sender",historyjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 117;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 118;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(2097152);
_p = historyjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(8388608);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(16777216);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 123;BA.debugLine="invoiceSelected = a.GetView(0).GetView(4).Text";
Debug.ShouldStop(67108864);
historyjamaah._invoiceselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).runMethod(true,"getText");
 BA.debugLineNum = 124;BA.debugLine="StartActivity(InvoiceJamaah)";
Debug.ShouldStop(134217728);
historyjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",historyjamaah.processBA,(Object)((historyjamaah.mostCurrent._invoicejamaah.getObject())));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
historyjamaah._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim invoiceSelected As String";
historyjamaah._invoiceselected = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}