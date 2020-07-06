package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qurbanjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(536870912);
qurbanjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),qurbanjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(1073741824);
qurbanjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),qurbanjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(-2147483648);
qurbanjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",qurbanjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),qurbanjamaah.mostCurrent.activityBA));
 BA.debugLineNum = 34;BA.debugLine="NavbarTitle.Text=\"Qurban\"";
Debug.ShouldStop(2);
qurbanjamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Qurban"));
 BA.debugLineNum = 35;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(4);
qurbanjamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","activity_resume");
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="CLV.Clear";
Debug.ShouldStop(128);
qurbanjamaah.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 41;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban\",";
Debug.ShouldStop(256);
qurbanjamaah.mostCurrent._codesemua.runVoidMethod ("_executeurlget",qurbanjamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(qurbanjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/qurban"))),(Object)(BA.ObjectToString("LoadData")),(Object)(qurbanjamaah.getObject()));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("CLV_ItemClick (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,101);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","clv_itemclick", _index, _value);
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(32);
_item = qurbanjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanjamaah.mostCurrent.__c.runMethod(false,"Sender",qurbanjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 103;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 104;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(128);
_p = qurbanjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(512);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 107;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(1024);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 109;BA.debugLine="idSelected = a.GetView(0).GetView(4).Text";
Debug.ShouldStop(4096);
qurbanjamaah._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).runMethod(true,"getText");
 BA.debugLineNum = 110;BA.debugLine="StartActivity(QurbanJamaahDetail)";
Debug.ShouldStop(8192);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanjamaah.processBA,(Object)((qurbanjamaah.mostCurrent._qurbanjamaahdetail.getObject())));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _width,RemoteObject _id,RemoteObject _title,RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,49);
if (RapidSub.canDelegate("createitem")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","createitem", _width, _id, _title, _status);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("id", _id);
Debug.locals.put("title", _title);
Debug.locals.put("status", _status);
 BA.debugLineNum = 49;BA.debugLine="Private Sub CreateItem(Width As Int, id As String,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(131072);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = qurbanjamaah._xui.runMethod(false,"CreatePanel",qurbanjamaah.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 51;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
Debug.ShouldStop(262144);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(qurbanjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),qurbanjamaah.mostCurrent.activityBA)));
 BA.debugLineNum = 52;BA.debugLine="p.LoadLayout(\"ListQurbanJamaah\")";
Debug.ShouldStop(524288);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListQurbanJamaah")),qurbanjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 54;BA.debugLine="MosqueName.Text = title";
Debug.ShouldStop(2097152);
qurbanjamaah.mostCurrent._mosquename.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 55;BA.debugLine="IdQurban.Text = id";
Debug.ShouldStop(4194304);
qurbanjamaah.mostCurrent._idqurban.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 56;BA.debugLine="QurbanCow.Text = status";
Debug.ShouldStop(8388608);
qurbanjamaah.mostCurrent._qurbancow.runMethod(true,"setText",BA.ObjectToCharSequence(_status));
 BA.debugLineNum = 58;BA.debugLine="Return p";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
qurbanjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
qurbanjamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
qurbanjamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CLV As CustomListView";
qurbanjamaah.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelListItem As B4XView";
qurbanjamaah.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private MosqueName As B4XView";
qurbanjamaah.mostCurrent._mosquename = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private QurbanCow As Label";
qurbanjamaah.mostCurrent._qurbancow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private BtnQurbanHere As Button";
qurbanjamaah.mostCurrent._btnqurbanhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private IdQurban As Label";
qurbanjamaah.mostCurrent._idqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,62);
if (RapidSub.canDelegate("jobdone")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _animal = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 62;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),qurbanjamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 64;BA.debugLine="Dim res As String";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 65;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(1);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 66;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 67;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 68;BA.debugLine="Log(\"Response from server :\"& res)";
Debug.ShouldStop(8);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 69;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 71;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 72;BA.debugLine="Dim data As List";
Debug.ShouldStop(128);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 73;BA.debugLine="data=parser.NextArray";
Debug.ShouldStop(256);
_data = _parser.runMethod(false,"NextArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 74;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 75;BA.debugLine="For i=0 To data.Size -1";
Debug.ShouldStop(1024);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="Dim a As Map";
Debug.ShouldStop(2048);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 77;BA.debugLine="Dim animal As List";
Debug.ShouldStop(4096);
_animal = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("animal", _animal);
 BA.debugLineNum = 79;BA.debugLine="a = data.Get(i)";
Debug.ShouldStop(16384);
_a.setObject(_data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 80;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
Debug.ShouldStop(32768);
qurbanjamaah.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getWidth"),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),RemoteObject.concat(RemoteObject.createImmutable("Qurban "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),RemoteObject.createImmutable("Qurban Available")).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 81;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
Debug.ShouldStop(65536);
qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {qurbanjamaah.mostCurrent._panellistitem.runMethod(true,"getHeight"),qurbanjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),qurbanjamaah.mostCurrent.activityBA)}, "+",1, 1)),qurbanjamaah.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 83;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
Debug.ShouldStop(262144);
qurbanjamaah.mostCurrent._panelqurban.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"),qurbanjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),qurbanjamaah.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 84;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(524288);
qurbanjamaah.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 85;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(1048576);
qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",qurbanjamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 86;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(2097152);
qurbanjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",qurbanjamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",qurbanjamaah.processBA, e26.toString()); BA.debugLineNum = 90;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(qurbanjamaah.mostCurrent.__c.runMethod(false,"LastException",qurbanjamaah.mostCurrent.activityBA))));
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 95;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(1073741824);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 96;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(-2147483648);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(qurbanjamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 98;BA.debugLine="Job.Release";
Debug.ShouldStop(2);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("PanelListItem_Click (qurbanjamaah) ","qurbanjamaah",3,qurbanjamaah.mostCurrent.activityBA,qurbanjamaah.mostCurrent,113);
if (RapidSub.canDelegate("panellistitem_click")) return b4a.example.qurbanjamaah.remoteMe.runUserSub(false, "qurbanjamaah","panellistitem_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub PanelListItem_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(131072);
_item = qurbanjamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), qurbanjamaah.mostCurrent.__c.runMethod(false,"Sender",qurbanjamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 115;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 116;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(524288);
_p = qurbanjamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 118;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(2097152);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 119;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(4194304);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 121;BA.debugLine="idSelected = a.GetView(0).GetView(4).Text";
Debug.ShouldStop(16777216);
qurbanjamaah._idselected = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 4))).runMethod(true,"getText");
 BA.debugLineNum = 122;BA.debugLine="StartActivity(QurbanJamaahDetail)";
Debug.ShouldStop(33554432);
qurbanjamaah.mostCurrent.__c.runVoidMethod ("StartActivity",qurbanjamaah.processBA,(Object)((qurbanjamaah.mostCurrent._qurbanjamaahdetail.getObject())));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
qurbanjamaah._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim idSelected As String";
qurbanjamaah._idselected = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}