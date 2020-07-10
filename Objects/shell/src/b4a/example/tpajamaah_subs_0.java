package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tpajamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(-2147483648);
tpajamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),tpajamaah.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(1);
tpajamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),tpajamaah.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Height = 100%y";
Debug.ShouldStop(4);
tpajamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",tpajamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),tpajamaah.mostCurrent.activityBA));
 BA.debugLineNum = 36;BA.debugLine="NavbarTitle.Text = \"Infaq TPA/MDA\"";
Debug.ShouldStop(8);
tpajamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Infaq TPA/MDA"));
 BA.debugLineNum = 37;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(16);
tpajamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,44);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Resume (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","activity_resume");
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"/api/mosque\",\"\"";
Debug.ShouldStop(256);
tpajamaah.mostCurrent._codesemua.runVoidMethod ("_executeurl",tpajamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(tpajamaah.mostCurrent._main._server,RemoteObject.createImmutable("/api/mosque"))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("LoadData")),(Object)(tpajamaah.getObject()));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndonationhere_click() throws Exception{
try {
		Debug.PushSubsStack("BtnDonationHere_Click (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,103);
if (RapidSub.canDelegate("btndonationhere_click")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","btndonationhere_click");
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 103;BA.debugLine="Sub BtnDonationHere_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(128);
_item = tpajamaah.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), tpajamaah.mostCurrent.__c.runMethod(false,"Sender",tpajamaah.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 105;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(512);
_p = tpajamaah.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 107;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(1024);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 108;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(2048);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 110;BA.debugLine="id_clicked = a.GetView(0).GetView(5).Text";
Debug.ShouldStop(8192);
tpajamaah._id_clicked = _a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 5))).runMethod(true,"getText");
 BA.debugLineNum = 112;BA.debugLine="StartActivity(TpaJamaahDetail)";
Debug.ShouldStop(32768);
tpajamaah.mostCurrent.__c.runVoidMethod ("StartActivity",tpajamaah.processBA,(Object)((tpajamaah.mostCurrent._tpajamaahdetail.getObject())));
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
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,99);
if (RapidSub.canDelegate("clv_itemclick")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","clv_itemclick", _index, _value);
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 99;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Log(Index)";
Debug.ShouldStop(8);
tpajamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_index)));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _idproject,RemoteObject _mosquetxt,RemoteObject _addresstxt,RemoteObject _statustxt) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,86);
if (RapidSub.canDelegate("createitem")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","createitem", _idproject, _mosquetxt, _addresstxt, _statustxt);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("idproject", _idproject);
Debug.locals.put("mosquetxt", _mosquetxt);
Debug.locals.put("addresstxt", _addresstxt);
Debug.locals.put("statustxt", _statustxt);
 BA.debugLineNum = 86;BA.debugLine="Private Sub CreateItem(idproject As String, mosque";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = tpajamaah._xui.runMethod(false,"CreatePanel",tpajamaah.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="p.SetLayoutAnimated(0, 0%x, 0%y, 100%x,35%y)";
Debug.ShouldStop(8388608);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(tpajamaah.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),tpajamaah.mostCurrent.activityBA)),(Object)(tpajamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),tpajamaah.mostCurrent.activityBA)),(Object)(tpajamaah.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),tpajamaah.mostCurrent.activityBA)),(Object)(tpajamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),tpajamaah.mostCurrent.activityBA)));
 BA.debugLineNum = 89;BA.debugLine="p.LoadLayout(\"ListOrphanTPAPoorJamaah\")";
Debug.ShouldStop(16777216);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListOrphanTPAPoorJamaah")),tpajamaah.mostCurrent.activityBA);
 BA.debugLineNum = 91;BA.debugLine="IDpro.Text = idproject";
Debug.ShouldStop(67108864);
tpajamaah.mostCurrent._idpro.runMethod(true,"setText",BA.ObjectToCharSequence(_idproject));
 BA.debugLineNum = 92;BA.debugLine="MosqueName.Text = mosquetxt";
Debug.ShouldStop(134217728);
tpajamaah.mostCurrent._mosquename.runMethod(true,"setText",BA.ObjectToCharSequence(_mosquetxt));
 BA.debugLineNum = 93;BA.debugLine="Address.Text = addresstxt";
Debug.ShouldStop(268435456);
tpajamaah.mostCurrent._address.runMethod(true,"setText",BA.ObjectToCharSequence(_addresstxt));
 BA.debugLineNum = 94;BA.debugLine="Status.Text = statustxt";
Debug.ShouldStop(536870912);
tpajamaah.mostCurrent._status.runMethod(true,"setText",BA.ObjectToCharSequence(_statustxt));
 BA.debugLineNum = 96;BA.debugLine="Return p";
Debug.ShouldStop(-2147483648);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.getObject());
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
tpajamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelQurban As Panel";
tpajamaah.mostCurrent._panelqurban = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private NavbarTitle As Label";
tpajamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private CLV As CustomListView";
tpajamaah.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelListItem As Panel";
tpajamaah.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private BtnDonationHere As Button";
tpajamaah.mostCurrent._btndonationhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private MosqueName As Label";
tpajamaah.mostCurrent._mosquename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Address As Label";
tpajamaah.mostCurrent._address = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Status As Label";
tpajamaah.mostCurrent._status = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private IDpro As Label";
tpajamaah.mostCurrent._idpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (tpajamaah) ","tpajamaah",16,tpajamaah.mostCurrent.activityBA,tpajamaah.mostCurrent,48);
if (RapidSub.canDelegate("jobdone")) return b4a.example.tpajamaah.remoteMe.runUserSub(false, "tpajamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 48;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),tpajamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 51;BA.debugLine="Dim res As String";
Debug.ShouldStop(262144);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 52;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(524288);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 53;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(1048576);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 54;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2097152);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 56;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("LoadData"))) {
case 0: {
 BA.debugLineNum = 58;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 59;BA.debugLine="Dim data_list As List";
Debug.ShouldStop(67108864);
_data_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_list", _data_list);
 BA.debugLineNum = 60;BA.debugLine="data_list = parser.NextArray";
Debug.ShouldStop(134217728);
_data_list = _parser.runMethod(false,"NextArray");Debug.locals.put("data_list", _data_list);
 BA.debugLineNum = 61;BA.debugLine="Log(data_list.Size)";
Debug.ShouldStop(268435456);
tpajamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_data_list.runMethod(true,"getSize"))));
 BA.debugLineNum = 62;BA.debugLine="For i=0 To data_list.Size-1";
Debug.ShouldStop(536870912);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_data_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 63;BA.debugLine="Dim a As Map";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 64;BA.debugLine="a = data_list.Get(i)";
Debug.ShouldStop(-2147483648);
_a.setObject(_data_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 66;BA.debugLine="CLV.Add(CreateItem(a.Get(\"id\"), a.Get(\"name\"";
Debug.ShouldStop(2);
tpajamaah.mostCurrent._clv.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createitem(BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),RemoteObject.concat(RemoteObject.createImmutable("Address : "),_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))),RemoteObject.createImmutable("Infaq for TPA/MDA Available")).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 67;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+4%";
Debug.ShouldStop(4);
tpajamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tpajamaah.mostCurrent._panellistitem.runMethod(true,"getHeight"),tpajamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),tpajamaah.mostCurrent.activityBA)}, "+",1, 1)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 70;BA.debugLine="PanelQurban.Height= CLV.AsView.Height";
Debug.ShouldStop(32);
tpajamaah.mostCurrent._panelqurban.runMethod(true,"setHeight",tpajamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 71;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(64);
tpajamaah.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",tpajamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 72;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
Debug.ShouldStop(128);
tpajamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",tpajamaah.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 73;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
Debug.ShouldStop(256);
tpajamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",tpajamaah.mostCurrent._panelqurban.runMethod(true,"getHeight"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",tpajamaah.processBA, e23.toString()); BA.debugLineNum = 75;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
tpajamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(tpajamaah.mostCurrent.__c.runMethod(false,"LastException",tpajamaah.mostCurrent.activityBA))));
 BA.debugLineNum = 76;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
Debug.ShouldStop(2048);
tpajamaah.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Wrong username or password")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),tpajamaah.mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 80;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(32768);
tpajamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 81;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(65536);
tpajamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(tpajamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 83;BA.debugLine="Job.Release";
Debug.ShouldStop(262144);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
tpajamaah._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Dim id,fund,id_clicked, name_project As String";
tpajamaah._id = RemoteObject.createImmutable("");
tpajamaah._fund = RemoteObject.createImmutable("");
tpajamaah._id_clicked = RemoteObject.createImmutable("");
tpajamaah._name_project = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}