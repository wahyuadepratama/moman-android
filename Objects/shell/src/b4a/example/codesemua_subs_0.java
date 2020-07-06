package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class codesemua_subs_0 {


public static RemoteObject  _executeurl(RemoteObject _ba,RemoteObject _url,RemoteObject _parameters,RemoteObject _jobname,RemoteObject _objek) throws Exception{
try {
		Debug.PushSubsStack("ExecuteUrl (codesemua) ","codesemua",14,_ba,codesemua.mostCurrent,21);
if (RapidSub.canDelegate("executeurl")) return b4a.example.codesemua.remoteMe.runUserSub(false, "codesemua","executeurl", _ba, _url, _parameters, _jobname, _objek);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
;
Debug.locals.put("Url", _url);
Debug.locals.put("Parameters", _parameters);
Debug.locals.put("JobName", _jobname);
Debug.locals.put("Objek", _objek);
 BA.debugLineNum = 21;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 23;BA.debugLine="job.Initialize(JobName, Objek)";
Debug.ShouldStop(4194304);
_job.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_jobname),(Object)(_objek));
 BA.debugLineNum = 24;BA.debugLine="job.PostString(Url,Parameters)";
Debug.ShouldStop(8388608);
_job.runVoidMethod ("_poststring",(Object)(_url),(Object)(_parameters));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executeurlget(RemoteObject _ba,RemoteObject _url,RemoteObject _jobname,RemoteObject _objek) throws Exception{
try {
		Debug.PushSubsStack("ExecuteUrlGet (codesemua) ","codesemua",14,_ba,codesemua.mostCurrent,27);
if (RapidSub.canDelegate("executeurlget")) return b4a.example.codesemua.remoteMe.runUserSub(false, "codesemua","executeurlget", _ba, _url, _jobname, _objek);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
;
Debug.locals.put("Url", _url);
Debug.locals.put("JobName", _jobname);
Debug.locals.put("Objek", _objek);
 BA.debugLineNum = 27;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(134217728);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 29;BA.debugLine="job.Initialize(JobName, Objek)";
Debug.ShouldStop(268435456);
_job.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_jobname),(Object)(_objek));
 BA.debugLineNum = 30;BA.debugLine="job.Download(Url)";
Debug.ShouldStop(536870912);
_job.runVoidMethod ("_download",(Object)(_url));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setbackgroundtintlist(RemoteObject _ba,RemoteObject _view,RemoteObject _active,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundTintList (codesemua) ","codesemua",14,_ba,codesemua.mostCurrent,9);
if (RapidSub.canDelegate("setbackgroundtintlist")) return b4a.example.codesemua.remoteMe.runUserSub(false, "codesemua","setbackgroundtintlist", _ba, _view, _active, _enabled);
RemoteObject _states = null;
RemoteObject _color = null;
RemoteObject _csl = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("View", _view);
Debug.locals.put("Active", _active);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 9;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim States(2,1) As Int";
Debug.ShouldStop(512);
_states = RemoteObject.createNewArray ("int", new int[] {2,1}, new Object[]{});Debug.locals.put("States", _states);
 BA.debugLineNum = 11;BA.debugLine="States(0,0) = 16842908     'Active";
Debug.ShouldStop(1024);
_states.setArrayElement (BA.numberCast(int.class, 16842908),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 12;BA.debugLine="States(1,0) = 16842910    'Enabled";
Debug.ShouldStop(2048);
_states.setArrayElement (BA.numberCast(int.class, 16842910),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 13;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
Debug.ShouldStop(4096);
_color = RemoteObject.createNewArray("int",new int[] {2},new Object[] {_active,_enabled});Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 14;BA.debugLine="Dim CSL As JavaObject";
Debug.ShouldStop(8192);
_csl = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("CSL", _csl);
 BA.debugLineNum = 15;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
Debug.ShouldStop(16384);
_csl.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.content.res.ColorStateList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_states),(_color)})));
 BA.debugLineNum = 16;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 17;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.support.v4.view.ViewCompat")));
 BA.debugLineNum = 18;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
Debug.ShouldStop(131072);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundTintList")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_view.getObject()),(_csl.getObject())})));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcbdrawable(RemoteObject _ba,RemoteObject _cb,RemoteObject _boxcolor,RemoteObject _boxwidth,RemoteObject _tickcolor,RemoteObject _tickchar,RemoteObject _disabledcolor,RemoteObject _size,RemoteObject _padding) throws Exception{
try {
		Debug.PushSubsStack("SetCBDrawable (codesemua) ","codesemua",14,_ba,codesemua.mostCurrent,33);
if (RapidSub.canDelegate("setcbdrawable")) return b4a.example.codesemua.remoteMe.runUserSub(false, "codesemua","setcbdrawable", _ba, _cb, _boxcolor, _boxwidth, _tickcolor, _tickchar, _disabledcolor, _size, _padding);
RemoteObject _sld = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _bmenabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bmchecked = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _bmdisabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cnv = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _enabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _checked = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _disabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _cnv1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _fontsize = RemoteObject.createImmutable(0);
RemoteObject _cnv2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("CB", _cb);
Debug.locals.put("BoxColor", _boxcolor);
Debug.locals.put("BoxWidth", _boxwidth);
Debug.locals.put("TickColor", _tickcolor);
Debug.locals.put("TickChar", _tickchar);
Debug.locals.put("DisabledColor", _disabledcolor);
Debug.locals.put("Size", _size);
Debug.locals.put("Padding", _padding);
 BA.debugLineNum = 33;BA.debugLine="Sub SetCBDrawable(CB As RadioButton,BoxColor As In";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Dim SLD As StateListDrawable";
Debug.ShouldStop(2);
_sld = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("SLD", _sld);
 BA.debugLineNum = 35;BA.debugLine="SLD.Initialize";
Debug.ShouldStop(4);
_sld.runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="Dim BMEnabled,BMChecked,BMDisabled As Bitmap";
Debug.ShouldStop(16);
_bmenabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("BMEnabled", _bmenabled);
_bmchecked = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("BMChecked", _bmchecked);
_bmdisabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("BMDisabled", _bmdisabled);
 BA.debugLineNum = 38;BA.debugLine="BMEnabled.InitializeMutable(Size,Size)";
Debug.ShouldStop(32);
_bmenabled.runVoidMethod ("InitializeMutable",(Object)(_size),(Object)(_size));
 BA.debugLineNum = 39;BA.debugLine="BMChecked.InitializeMutable(Size,Size)";
Debug.ShouldStop(64);
_bmchecked.runVoidMethod ("InitializeMutable",(Object)(_size),(Object)(_size));
 BA.debugLineNum = 40;BA.debugLine="BMDisabled.InitializeMutable(Size,Size)";
Debug.ShouldStop(128);
_bmdisabled.runVoidMethod ("InitializeMutable",(Object)(_size),(Object)(_size));
 BA.debugLineNum = 42;BA.debugLine="Dim CNV As Canvas";
Debug.ShouldStop(512);
_cnv = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("CNV", _cnv);
 BA.debugLineNum = 43;BA.debugLine="CNV.Initialize2(BMEnabled)";
Debug.ShouldStop(1024);
_cnv.runVoidMethod ("Initialize2",(Object)((_bmenabled.getObject())));
 BA.debugLineNum = 44;BA.debugLine="Dim Rect1 As Rect";
Debug.ShouldStop(2048);
_rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("Rect1", _rect1);
 BA.debugLineNum = 45;BA.debugLine="Rect1.Initialize(Padding ,Padding ,Size - Padding";
Debug.ShouldStop(4096);
_rect1.runVoidMethod ("Initialize",(Object)(_padding),(Object)(_padding),(Object)(RemoteObject.solve(new RemoteObject[] {_size,_padding}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_size,_padding}, "-",1, 1)));
 BA.debugLineNum = 46;BA.debugLine="CNV.DrawRect(Rect1,BoxColor,False,BoxWidth)";
Debug.ShouldStop(8192);
_cnv.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_boxcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _boxwidth)));
 BA.debugLineNum = 47;BA.debugLine="Dim Enabled,Checked,Disabled As BitmapDrawable";
Debug.ShouldStop(16384);
_enabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Enabled", _enabled);
_checked = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Checked", _checked);
_disabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Disabled", _disabled);
 BA.debugLineNum = 48;BA.debugLine="Enabled.Initialize(BMEnabled)";
Debug.ShouldStop(32768);
_enabled.runVoidMethod ("Initialize",(Object)((_bmenabled.getObject())));
 BA.debugLineNum = 50;BA.debugLine="Dim CNV1 As Canvas";
Debug.ShouldStop(131072);
_cnv1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("CNV1", _cnv1);
 BA.debugLineNum = 51;BA.debugLine="CNV1.Initialize2(BMChecked)";
Debug.ShouldStop(262144);
_cnv1.runVoidMethod ("Initialize2",(Object)((_bmchecked.getObject())));
 BA.debugLineNum = 52;BA.debugLine="If TickChar = \"Fill\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_tickchar,BA.ObjectToString("Fill"))) { 
 BA.debugLineNum = 53;BA.debugLine="CNV1.DrawRect(Rect1,TickColor,True,BoxWidth)";
Debug.ShouldStop(1048576);
_cnv1.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_tickcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _boxwidth)));
 BA.debugLineNum = 54;BA.debugLine="CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)";
Debug.ShouldStop(2097152);
_cnv1.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_boxcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _boxwidth)));
 }else {
 BA.debugLineNum = 56;BA.debugLine="CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)";
Debug.ShouldStop(8388608);
_cnv1.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_boxcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _boxwidth)));
 BA.debugLineNum = 58;BA.debugLine="Dim FontSize As Int = 6";
Debug.ShouldStop(33554432);
_fontsize = BA.numberCast(int.class, 6);Debug.locals.put("FontSize", _fontsize);Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 59;BA.debugLine="Do While CNV.MeasureStringHeight(TickChar,Typefa";
Debug.ShouldStop(67108864);
while (RemoteObject.solveBoolean("<",_cnv.runMethod(true,"MeasureStringHeight",(Object)(_tickchar),(Object)(codesemua.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, _fontsize))),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_size,(RemoteObject.solve(new RemoteObject[] {_boxwidth,RemoteObject.createImmutable(2)}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {_padding,RemoteObject.createImmutable(2)}, "*",0, 1))}, "--",2, 1)))) {
 BA.debugLineNum = 60;BA.debugLine="FontSize = FontSize + 1";
Debug.ShouldStop(134217728);
_fontsize = RemoteObject.solve(new RemoteObject[] {_fontsize,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("FontSize", _fontsize);
 }
;
 BA.debugLineNum = 62;BA.debugLine="FontSize = FontSize - 1";
Debug.ShouldStop(536870912);
_fontsize = RemoteObject.solve(new RemoteObject[] {_fontsize,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("FontSize", _fontsize);
 BA.debugLineNum = 64;BA.debugLine="CNV1.DrawText(TickChar,Size/2,(Size + CNV.Measur";
Debug.ShouldStop(-2147483648);
_cnv1.runVoidMethod ("DrawText",_ba,(Object)(_tickchar),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_size,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_size,_cnv.runMethod(true,"MeasureStringHeight",(Object)(_tickchar),(Object)(codesemua.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, _fontsize)))}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(codesemua.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, _fontsize)),(Object)(_tickcolor),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 };
 BA.debugLineNum = 66;BA.debugLine="Checked.Initialize(BMChecked)";
Debug.ShouldStop(2);
_checked.runVoidMethod ("Initialize",(Object)((_bmchecked.getObject())));
 BA.debugLineNum = 68;BA.debugLine="Dim CNV2 As Canvas";
Debug.ShouldStop(8);
_cnv2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("CNV2", _cnv2);
 BA.debugLineNum = 69;BA.debugLine="CNV2.Initialize2(BMDisabled)";
Debug.ShouldStop(16);
_cnv2.runVoidMethod ("Initialize2",(Object)((_bmdisabled.getObject())));
 BA.debugLineNum = 70;BA.debugLine="CNV2.DrawRect(Rect1,DisabledColor,True,BoxWidth)";
Debug.ShouldStop(32);
_cnv2.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_disabledcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _boxwidth)));
 BA.debugLineNum = 71;BA.debugLine="CNV2.DrawRect(Rect1,BoxColor,False,BoxWidth)";
Debug.ShouldStop(64);
_cnv2.runVoidMethod ("DrawRect",(Object)((_rect1.getObject())),(Object)(_boxcolor),(Object)(codesemua.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, _boxwidth)));
 BA.debugLineNum = 72;BA.debugLine="Disabled.Initialize(BMDisabled)";
Debug.ShouldStop(128);
_disabled.runVoidMethod ("Initialize",(Object)((_bmdisabled.getObject())));
 BA.debugLineNum = 75;BA.debugLine="SLD.AddState(SLD.State_Disabled,Disabled)";
Debug.ShouldStop(1024);
_sld.runVoidMethod ("AddState",(Object)(_sld.getField(true,"State_Disabled")),(Object)((_disabled.getObject())));
 BA.debugLineNum = 76;BA.debugLine="SLD.AddState(SLD.State_Checked,Checked)";
Debug.ShouldStop(2048);
_sld.runVoidMethod ("AddState",(Object)(_sld.getField(true,"State_Checked")),(Object)((_checked.getObject())));
 BA.debugLineNum = 77;BA.debugLine="SLD.AddState(SLD.State_Enabled,Enabled)";
Debug.ShouldStop(4096);
_sld.runVoidMethod ("AddState",(Object)(_sld.getField(true,"State_Enabled")),(Object)((_enabled.getObject())));
 BA.debugLineNum = 78;BA.debugLine="SLD.AddCatchAllState(Enabled)";
Debug.ShouldStop(8192);
_sld.runVoidMethod ("AddCatchAllState",(Object)((_enabled.getObject())));
 BA.debugLineNum = 80;BA.debugLine="Dim JO As JavaObject = CB";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_cb.getObject());Debug.locals.put("JO", _jo);
 BA.debugLineNum = 81;BA.debugLine="JO.RunMethod(\"setButtonDrawable\",Array As Object(";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setButtonDrawable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sld.getObject())})));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}