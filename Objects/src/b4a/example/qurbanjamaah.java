package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class qurbanjamaah extends Activity implements B4AActivity{
	public static qurbanjamaah mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.qurbanjamaah");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (qurbanjamaah).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.qurbanjamaah");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.qurbanjamaah", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (qurbanjamaah) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (qurbanjamaah) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return qurbanjamaah.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (qurbanjamaah) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (qurbanjamaah) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _idselected = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelqurban = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public b4a.example3.customlistview _clv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panellistitem = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mosquename = null;
public anywheresoftware.b4a.objects.LabelWrapper _qurbancow = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnqurbanhere = null;
public anywheresoftware.b4a.objects.LabelWrapper _idqurban = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.homejamaah _homejamaah = null;
public b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public b4a.example.mapsjamaah _mapsjamaah = null;
public b4a.example.donationstewardship _donationstewardship = null;
public b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public b4a.example.homestewardship _homestewardship = null;
public b4a.example.qurbanstewardship _qurbanstewardship = null;
public b4a.example.orphansjamaah _orphansjamaah = null;
public b4a.example.historyjamaah _historyjamaah = null;
public b4a.example.donationjamaah _donationjamaah = null;
public b4a.example.codesemua _codesemua = null;
public b4a.example.tpajamaah _tpajamaah = null;
public b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public b4a.example.poorjamaah _poorjamaah = null;
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
mostCurrent._mainscroll.getPanel().LoadLayout("List",mostCurrent.activityBA);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="MainScroll.Height = 100%y";
mostCurrent._mainscroll.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="NavbarTitle.Text=\"Qurban\"";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Qurban"));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="CLV.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban\",";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/qurban","LoadData",qurbanjamaah.getObject());
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public static String  _clv_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "clv_itemclick", new Object[] {_index,_value});
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
_item = mostCurrent._clv._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="p = CLV.GetPanel(item)";
_p = mostCurrent._clv._getpanel(_item);
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="idSelected = a.GetView(0).GetView(4).Text";
_idselected = _a.GetView((int) (0)).GetView((int) (4)).getText();
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="StartActivity(QurbanJamaahDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanjamaahdetail.getObject()));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _id,String _title,String _status) throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_id,_title,_status});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Private Sub CreateItem(Width As Int, id As String,";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="p.LoadLayout(\"ListQurbanJamaah\")";
_p.LoadLayout("ListQurbanJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="MosqueName.Text = title";
mostCurrent._mosquename.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="IdQurban.Text = id";
mostCurrent._idqurban.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="QurbanCow.Text = status";
mostCurrent._qurbancow.setText(BA.ObjectToCharSequence(_status));
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="End Sub";
return null;
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.List _animal = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Try";
try {RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="data=parser.NextArray";
_data = _parser.NextArray();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="If data.Size-1 > 0 Then";
if (_data.getSize()-1>0) { 
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="For i=0 To data.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Dim animal As List";
_animal = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="a = data.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data.Get(_i)));
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv._asview().getWidth(),BA.ObjectToString(_a.Get((Object)("id"))),"Qurban "+BA.ObjectToString(_a.Get((Object)("name"))),"Qurban Available").getObject())),(Object)(""));
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
mostCurrent._clv._asview().setHeight((int) ((mostCurrent._panellistitem.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA))*mostCurrent._clv._getsize()));
 }
};
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
mostCurrent._panelqurban.setHeight((int) (mostCurrent._clv._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
mostCurrent._clv._sv.setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
mostCurrent._clv._asview().setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
 };
 } 
       catch (Exception e26) {
			processBA.setLastException(e26);RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=3145761;
 //BA.debugLineNum = 3145761;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=3145762;
 //BA.debugLineNum = 3145762;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=3145765;
 //BA.debugLineNum = 3145765;BA.debugLine="End Sub";
return "";
}
public static String  _panellistitem_click() throws Exception{
RDebugUtils.currentModule="qurbanjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panellistitem_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panellistitem_click", null);
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub PanelListItem_Click";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
_item = mostCurrent._clv._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="p = CLV.GetPanel(item)";
_p = mostCurrent._clv._getpanel(_item);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="idSelected = a.GetView(0).GetView(4).Text";
_idselected = _a.GetView((int) (0)).GetView((int) (4)).getText();
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="StartActivity(QurbanJamaahDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanjamaahdetail.getObject()));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="End Sub";
return "";
}
}