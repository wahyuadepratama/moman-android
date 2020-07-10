package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class codesemua {
private static codesemua mostCurrent = new codesemua();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public b4a.example.homejamaah _homejamaah = null;
public b4a.example.qurbanjamaah _qurbanjamaah = null;
public b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.historyjamaah _historyjamaah = null;
public b4a.example.homestewardship _homestewardship = null;
public b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public b4a.example.mapsjamaah _mapsjamaah = null;
public b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public b4a.example.qurbanstewardship _qurbanstewardship = null;
public b4a.example.orphansjamaah _orphansjamaah = null;
public b4a.example.donationjamaah _donationjamaah = null;
public b4a.example.tpajamaah _tpajamaah = null;
public b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public b4a.example.poorjamaah _poorjamaah = null;
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _objek) throws Exception{
RDebugUtils.currentModule="codesemua";
if (Debug.shouldDelegate(null, "executeurl"))
	return (String) Debug.delegate(null, "executeurl", new Object[] {_ba,_url,_parameters,_jobname,_objek});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="job.Initialize(JobName, Objek)";
_job._initialize((_ba.processBA == null ? _ba : _ba.processBA),_jobname,_objek);
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="job.PostString(Url,Parameters)";
_job._poststring(_url,_parameters);
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _objek) throws Exception{
RDebugUtils.currentModule="codesemua";
if (Debug.shouldDelegate(null, "executeurlget"))
	return (String) Debug.delegate(null, "executeurlget", new Object[] {_ba,_url,_jobname,_objek});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="job.Initialize(JobName, Objek)";
_job._initialize((_ba.processBA == null ? _ba : _ba.processBA),_jobname,_objek);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="job.Download(Url)";
_job._download(_url);
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return "";
}
public static String  _setbackgroundtintlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _view,int _active,int _enabled) throws Exception{
RDebugUtils.currentModule="codesemua";
if (Debug.shouldDelegate(null, "setbackgroundtintlist"))
	return (String) Debug.delegate(null, "setbackgroundtintlist", new Object[] {_ba,_view,_active,_enabled});
int[][] _states = null;
int[] _color = null;
anywheresoftware.b4j.object.JavaObject _csl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub SetBackgroundTintList(View As View,Active As I";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim States(2,1) As Int";
_states = new int[(int) (2)][];
{
int d0 = _states.length;
int d1 = (int) (1);
for (int i0 = 0;i0 < d0;i0++) {
_states[i0] = new int[d1];
}
}
;
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="States(0,0) = 16842908     'Active";
_states[(int) (0)][(int) (0)] = (int) (16842908);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="States(1,0) = 16842910    'Enabled";
_states[(int) (1)][(int) (0)] = (int) (16842910);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Dim Color(2) As Int = Array As Int(Active,Enabled";
_color = new int[]{_active,_enabled};
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim CSL As JavaObject";
_csl = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="CSL.InitializeNewInstance(\"android.content.res.Co";
_csl.InitializeNewInstance("android.content.res.ColorStateList",new Object[]{(Object)(_states),(Object)(_color)});
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="jo.InitializeStatic(\"android.support.v4.view.View";
_jo.InitializeStatic("android.support.v4.view.ViewCompat");
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="jo.RunMethod(\"setBackgroundTintList\", Array(View,";
_jo.RunMethod("setBackgroundTintList",new Object[]{(Object)(_view.getObject()),(Object)(_csl.getObject())});
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="End Sub";
return "";
}
public static String  _setcbdrawable(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _cb,int _boxcolor,int _boxwidth,int _tickcolor,String _tickchar,int _disabledcolor,int _size,int _padding) throws Exception{
RDebugUtils.currentModule="codesemua";
if (Debug.shouldDelegate(null, "setcbdrawable"))
	return (String) Debug.delegate(null, "setcbdrawable", new Object[] {_ba,_cb,_boxcolor,_boxwidth,_tickcolor,_tickchar,_disabledcolor,_size,_padding});
anywheresoftware.b4a.objects.drawable.StateListDrawable _sld = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmenabled = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmchecked = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmdisabled = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _enabled = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _checked = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _disabled = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv1 = null;
int _fontsize = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cnv2 = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub SetCBDrawable(CB As RadioButton,BoxColor As In";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim SLD As StateListDrawable";
_sld = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="SLD.Initialize";
_sld.Initialize();
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Dim BMEnabled,BMChecked,BMDisabled As Bitmap";
_bmenabled = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmchecked = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmdisabled = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="BMEnabled.InitializeMutable(Size,Size)";
_bmenabled.InitializeMutable(_size,_size);
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="BMChecked.InitializeMutable(Size,Size)";
_bmchecked.InitializeMutable(_size,_size);
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="BMDisabled.InitializeMutable(Size,Size)";
_bmdisabled.InitializeMutable(_size,_size);
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Dim CNV As Canvas";
_cnv = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="CNV.Initialize2(BMEnabled)";
_cnv.Initialize2((android.graphics.Bitmap)(_bmenabled.getObject()));
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="Dim Rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=4194316;
 //BA.debugLineNum = 4194316;BA.debugLine="Rect1.Initialize(Padding ,Padding ,Size - Padding";
_rect1.Initialize(_padding,_padding,(int) (_size-_padding),(int) (_size-_padding));
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="CNV.DrawRect(Rect1,BoxColor,False,BoxWidth)";
_cnv.DrawRect((android.graphics.Rect)(_rect1.getObject()),_boxcolor,anywheresoftware.b4a.keywords.Common.False,(float) (_boxwidth));
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="Dim Enabled,Checked,Disabled As BitmapDrawable";
_enabled = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_checked = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_disabled = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="Enabled.Initialize(BMEnabled)";
_enabled.Initialize((android.graphics.Bitmap)(_bmenabled.getObject()));
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="Dim CNV1 As Canvas";
_cnv1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="CNV1.Initialize2(BMChecked)";
_cnv1.Initialize2((android.graphics.Bitmap)(_bmchecked.getObject()));
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="If TickChar = \"Fill\" Then";
if ((_tickchar).equals("Fill")) { 
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="CNV1.DrawRect(Rect1,TickColor,True,BoxWidth)";
_cnv1.DrawRect((android.graphics.Rect)(_rect1.getObject()),_tickcolor,anywheresoftware.b4a.keywords.Common.True,(float) (_boxwidth));
RDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)";
_cnv1.DrawRect((android.graphics.Rect)(_rect1.getObject()),_boxcolor,anywheresoftware.b4a.keywords.Common.False,(float) (_boxwidth));
 }else {
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="CNV1.DrawRect(Rect1,BoxColor,False,BoxWidth)";
_cnv1.DrawRect((android.graphics.Rect)(_rect1.getObject()),_boxcolor,anywheresoftware.b4a.keywords.Common.False,(float) (_boxwidth));
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="Dim FontSize As Int = 6";
_fontsize = (int) (6);
RDebugUtils.currentLine=4194330;
 //BA.debugLineNum = 4194330;BA.debugLine="Do While CNV.MeasureStringHeight(TickChar,Typefa";
while (_cnv.MeasureStringHeight(_tickchar,anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,(float) (_fontsize))<_size-(_boxwidth*2)-(_padding*2)) {
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="FontSize = FontSize + 1";
_fontsize = (int) (_fontsize+1);
 }
;
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="FontSize = FontSize - 1";
_fontsize = (int) (_fontsize-1);
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="CNV1.DrawText(TickChar,Size/2,(Size + CNV.Measur";
_cnv1.DrawText(_ba,_tickchar,(float) (_size/(double)2),(float) ((_size+_cnv.MeasureStringHeight(_tickchar,anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,(float) (_fontsize)))/(double)2),anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT,(float) (_fontsize),_tickcolor,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
RDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="Checked.Initialize(BMChecked)";
_checked.Initialize((android.graphics.Bitmap)(_bmchecked.getObject()));
RDebugUtils.currentLine=4194339;
 //BA.debugLineNum = 4194339;BA.debugLine="Dim CNV2 As Canvas";
_cnv2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=4194340;
 //BA.debugLineNum = 4194340;BA.debugLine="CNV2.Initialize2(BMDisabled)";
_cnv2.Initialize2((android.graphics.Bitmap)(_bmdisabled.getObject()));
RDebugUtils.currentLine=4194341;
 //BA.debugLineNum = 4194341;BA.debugLine="CNV2.DrawRect(Rect1,DisabledColor,True,BoxWidth)";
_cnv2.DrawRect((android.graphics.Rect)(_rect1.getObject()),_disabledcolor,anywheresoftware.b4a.keywords.Common.True,(float) (_boxwidth));
RDebugUtils.currentLine=4194342;
 //BA.debugLineNum = 4194342;BA.debugLine="CNV2.DrawRect(Rect1,BoxColor,False,BoxWidth)";
_cnv2.DrawRect((android.graphics.Rect)(_rect1.getObject()),_boxcolor,anywheresoftware.b4a.keywords.Common.False,(float) (_boxwidth));
RDebugUtils.currentLine=4194343;
 //BA.debugLineNum = 4194343;BA.debugLine="Disabled.Initialize(BMDisabled)";
_disabled.Initialize((android.graphics.Bitmap)(_bmdisabled.getObject()));
RDebugUtils.currentLine=4194346;
 //BA.debugLineNum = 4194346;BA.debugLine="SLD.AddState(SLD.State_Disabled,Disabled)";
_sld.AddState(_sld.State_Disabled,(android.graphics.drawable.Drawable)(_disabled.getObject()));
RDebugUtils.currentLine=4194347;
 //BA.debugLineNum = 4194347;BA.debugLine="SLD.AddState(SLD.State_Checked,Checked)";
_sld.AddState(_sld.State_Checked,(android.graphics.drawable.Drawable)(_checked.getObject()));
RDebugUtils.currentLine=4194348;
 //BA.debugLineNum = 4194348;BA.debugLine="SLD.AddState(SLD.State_Enabled,Enabled)";
_sld.AddState(_sld.State_Enabled,(android.graphics.drawable.Drawable)(_enabled.getObject()));
RDebugUtils.currentLine=4194349;
 //BA.debugLineNum = 4194349;BA.debugLine="SLD.AddCatchAllState(Enabled)";
_sld.AddCatchAllState((android.graphics.drawable.Drawable)(_enabled.getObject()));
RDebugUtils.currentLine=4194351;
 //BA.debugLineNum = 4194351;BA.debugLine="Dim JO As JavaObject = CB";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_cb.getObject()));
RDebugUtils.currentLine=4194352;
 //BA.debugLineNum = 4194352;BA.debugLine="JO.RunMethod(\"setButtonDrawable\",Array As Object(";
_jo.RunMethod("setButtonDrawable",new Object[]{(Object)(_sld.getObject())});
RDebugUtils.currentLine=4194353;
 //BA.debugLineNum = 4194353;BA.debugLine="End Sub";
return "";
}
}