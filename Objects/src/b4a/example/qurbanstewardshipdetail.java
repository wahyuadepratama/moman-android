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

public class qurbanstewardshipdetail extends Activity implements B4AActivity{
	public static qurbanstewardshipdetail mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.qurbanstewardshipdetail");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (qurbanstewardshipdetail).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.qurbanstewardshipdetail");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.qurbanstewardshipdetail", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (qurbanstewardshipdetail) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (qurbanstewardshipdetail) Resume **");
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
		return qurbanstewardshipdetail.class;
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
        BA.LogInfo("** Activity (qurbanstewardshipdetail) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (qurbanstewardshipdetail) Resume **");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelqurban = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfirm = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _note = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _part11 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.homejamaah _homejamaah = null;
public b4a.example.qurbanjamaah _qurbanjamaah = null;
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
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="qurbanstewardshipdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="MainScroll.Panel.LoadLayout(\"DetailQurbanConfirma";
mostCurrent._mainscroll.getPanel().LoadLayout("DetailQurbanConfirmation",mostCurrent.activityBA);
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="NavbarTitle.Text=\"Qurban Detail\"";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Qurban Detail"));
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="qurbanstewardshipdetail";
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="qurbanstewardshipdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/c";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/qurban/confirmation/detail?id="+mostCurrent._qurbanstewardship._idselected,"LoadData",qurbanstewardshipdetail.getObject());
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfirm_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardshipdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfirm_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnconfirm_click", null);
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub BtnConfirm_Click";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/c";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/qurban/confirmation/store?id="+mostCurrent._qurbanstewardship._idselected,"success",qurbanstewardshipdetail.getObject());
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Msgbox(\"Transaction Qurban #\"&QurbanStewardship.i";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Transaction Qurban #"+mostCurrent._qurbanstewardship._idselected+" confirmed!"),BA.ObjectToCharSequence("Confirmation Success!"),mostCurrent.activityBA);
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="qurbanstewardshipdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _b = null;
anywheresoftware.b4a.objects.collections.Map _info = null;
anywheresoftware.b4a.objects.collections.List _participant = null;
String _status = "";
anywheresoftware.b4a.objects.collections.Map _part_2 = null;
anywheresoftware.b4a.objects.collections.Map _part_3 = null;
anywheresoftware.b4a.objects.collections.Map _part_4 = null;
anywheresoftware.b4a.objects.collections.Map _part_5 = null;
anywheresoftware.b4a.objects.collections.Map _part_6 = null;
anywheresoftware.b4a.objects.collections.Map _part_7 = null;
anywheresoftware.b4a.objects.collections.Map _part_8 = null;
anywheresoftware.b4a.objects.collections.Map _part_9 = null;
anywheresoftware.b4a.objects.collections.Map _part_10 = null;
anywheresoftware.b4a.objects.collections.Map _part_11 = null;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="Log(\"Response from server-------------- :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server-------------- :"+_res);
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="If Job.JobName = \"success\" Then";
if ((_job._jobname).equals("success")) { 
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="StartActivity(Me)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,qurbanstewardshipdetail.getObject());
 };
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=14090258;
 //BA.debugLineNum = 14090258;BA.debugLine="Try";
try {RDebugUtils.currentLine=14090259;
 //BA.debugLineNum = 14090259;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=14090260;
 //BA.debugLineNum = 14090260;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=14090261;
 //BA.debugLineNum = 14090261;BA.debugLine="Dim b As Map = parser.NextObject";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = _parser.NextObject();
RDebugUtils.currentLine=14090263;
 //BA.debugLineNum = 14090263;BA.debugLine="Dim info As Map : info.Initialize";
_info = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090263;
 //BA.debugLineNum = 14090263;BA.debugLine="Dim info As Map : info.Initialize";
_info.Initialize();
RDebugUtils.currentLine=14090264;
 //BA.debugLineNum = 14090264;BA.debugLine="info = b.Get(\"info\")";
_info.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.Get((Object)("info"))));
RDebugUtils.currentLine=14090266;
 //BA.debugLineNum = 14090266;BA.debugLine="Dim participant As List : participant.Initial";
_participant = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14090266;
 //BA.debugLineNum = 14090266;BA.debugLine="Dim participant As List : participant.Initial";
_participant.Initialize();
RDebugUtils.currentLine=14090267;
 //BA.debugLineNum = 14090267;BA.debugLine="participant = b.Get(\"participant\")";
_participant.setObject((java.util.List)(_b.Get((Object)("participant"))));
RDebugUtils.currentLine=14090269;
 //BA.debugLineNum = 14090269;BA.debugLine="Label4.Text = \": \"&info.Get(\"animal_type\")";
mostCurrent._label4.setText(BA.ObjectToCharSequence(": "+BA.ObjectToString(_info.Get((Object)("animal_type")))));
RDebugUtils.currentLine=14090270;
 //BA.debugLineNum = 14090270;BA.debugLine="Label6.Text = \": \"&info.Get(\"fund\")";
mostCurrent._label6.setText(BA.ObjectToCharSequence(": "+BA.ObjectToString(_info.Get((Object)("fund")))));
RDebugUtils.currentLine=14090271;
 //BA.debugLineNum = 14090271;BA.debugLine="Label8.Text = \": \"&info.Get(\"datetime\")";
mostCurrent._label8.setText(BA.ObjectToCharSequence(": "+BA.ObjectToString(_info.Get((Object)("datetime")))));
RDebugUtils.currentLine=14090272;
 //BA.debugLineNum = 14090272;BA.debugLine="Dim status As String = info.Get(\"confirmation";
_status = BA.ObjectToString(_info.Get((Object)("confirmation")));
RDebugUtils.currentLine=14090273;
 //BA.debugLineNum = 14090273;BA.debugLine="If status = False Then";
if ((_status).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=14090274;
 //BA.debugLineNum = 14090274;BA.debugLine="Label12.Text = \": Checking\"";
mostCurrent._label12.setText(BA.ObjectToCharSequence(": Checking"));
RDebugUtils.currentLine=14090275;
 //BA.debugLineNum = 14090275;BA.debugLine="Label12.TextColor = Colors.Red";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=14090277;
 //BA.debugLineNum = 14090277;BA.debugLine="Label12.Text = \": Confirmed\"";
mostCurrent._label12.setText(BA.ObjectToCharSequence(": Confirmed"));
RDebugUtils.currentLine=14090278;
 //BA.debugLineNum = 14090278;BA.debugLine="Label12.TextColor = Colors.Green";
mostCurrent._label12.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
 };
RDebugUtils.currentLine=14090281;
 //BA.debugLineNum = 14090281;BA.debugLine="If participant.Size = 1 Then";
if (_participant.getSize()==1) { 
RDebugUtils.currentLine=14090282;
 //BA.debugLineNum = 14090282;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090283;
 //BA.debugLineNum = 14090283;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090284;
 //BA.debugLineNum = 14090284;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090286;
 //BA.debugLineNum = 14090286;BA.debugLine="Part3.Visible = False";
mostCurrent._part3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090287;
 //BA.debugLineNum = 14090287;BA.debugLine="Part4.Visible = False";
mostCurrent._part4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090288;
 //BA.debugLineNum = 14090288;BA.debugLine="Part5.Visible = False";
mostCurrent._part5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090289;
 //BA.debugLineNum = 14090289;BA.debugLine="Part6.Visible = False";
mostCurrent._part6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090290;
 //BA.debugLineNum = 14090290;BA.debugLine="Part7.Visible = False";
mostCurrent._part7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090291;
 //BA.debugLineNum = 14090291;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090292;
 //BA.debugLineNum = 14090292;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090293;
 //BA.debugLineNum = 14090293;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090294;
 //BA.debugLineNum = 14090294;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090295;
 //BA.debugLineNum = 14090295;BA.debugLine="Else If participant.Size = 2 Then";
if (_participant.getSize()==2) { 
RDebugUtils.currentLine=14090296;
 //BA.debugLineNum = 14090296;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090297;
 //BA.debugLineNum = 14090297;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090298;
 //BA.debugLineNum = 14090298;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090300;
 //BA.debugLineNum = 14090300;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090301;
 //BA.debugLineNum = 14090301;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090302;
 //BA.debugLineNum = 14090302;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090304;
 //BA.debugLineNum = 14090304;BA.debugLine="Part4.Visible = False";
mostCurrent._part4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090305;
 //BA.debugLineNum = 14090305;BA.debugLine="Part5.Visible = False";
mostCurrent._part5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090306;
 //BA.debugLineNum = 14090306;BA.debugLine="Part6.Visible = False";
mostCurrent._part6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090307;
 //BA.debugLineNum = 14090307;BA.debugLine="Part7.Visible = False";
mostCurrent._part7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090308;
 //BA.debugLineNum = 14090308;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090309;
 //BA.debugLineNum = 14090309;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090310;
 //BA.debugLineNum = 14090310;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090311;
 //BA.debugLineNum = 14090311;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090312;
 //BA.debugLineNum = 14090312;BA.debugLine="Else If participant.Size = 3 Then";
if (_participant.getSize()==3) { 
RDebugUtils.currentLine=14090313;
 //BA.debugLineNum = 14090313;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090314;
 //BA.debugLineNum = 14090314;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090315;
 //BA.debugLineNum = 14090315;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090317;
 //BA.debugLineNum = 14090317;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090318;
 //BA.debugLineNum = 14090318;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090319;
 //BA.debugLineNum = 14090319;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090321;
 //BA.debugLineNum = 14090321;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090322;
 //BA.debugLineNum = 14090322;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090323;
 //BA.debugLineNum = 14090323;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090325;
 //BA.debugLineNum = 14090325;BA.debugLine="Part5.Visible = False";
mostCurrent._part5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090326;
 //BA.debugLineNum = 14090326;BA.debugLine="Part6.Visible = False";
mostCurrent._part6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090327;
 //BA.debugLineNum = 14090327;BA.debugLine="Part7.Visible = False";
mostCurrent._part7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090328;
 //BA.debugLineNum = 14090328;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090329;
 //BA.debugLineNum = 14090329;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090330;
 //BA.debugLineNum = 14090330;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090331;
 //BA.debugLineNum = 14090331;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090332;
 //BA.debugLineNum = 14090332;BA.debugLine="Else If participant.Size = 4 Then";
if (_participant.getSize()==4) { 
RDebugUtils.currentLine=14090333;
 //BA.debugLineNum = 14090333;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090334;
 //BA.debugLineNum = 14090334;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090335;
 //BA.debugLineNum = 14090335;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090337;
 //BA.debugLineNum = 14090337;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090338;
 //BA.debugLineNum = 14090338;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090339;
 //BA.debugLineNum = 14090339;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090341;
 //BA.debugLineNum = 14090341;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090342;
 //BA.debugLineNum = 14090342;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090343;
 //BA.debugLineNum = 14090343;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090345;
 //BA.debugLineNum = 14090345;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090346;
 //BA.debugLineNum = 14090346;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090347;
 //BA.debugLineNum = 14090347;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090349;
 //BA.debugLineNum = 14090349;BA.debugLine="Part6.Visible = False";
mostCurrent._part6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090350;
 //BA.debugLineNum = 14090350;BA.debugLine="Part7.Visible = False";
mostCurrent._part7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090351;
 //BA.debugLineNum = 14090351;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090352;
 //BA.debugLineNum = 14090352;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090353;
 //BA.debugLineNum = 14090353;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090354;
 //BA.debugLineNum = 14090354;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090355;
 //BA.debugLineNum = 14090355;BA.debugLine="Else If participant.Size = 5 Then";
if (_participant.getSize()==5) { 
RDebugUtils.currentLine=14090356;
 //BA.debugLineNum = 14090356;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090357;
 //BA.debugLineNum = 14090357;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090358;
 //BA.debugLineNum = 14090358;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090360;
 //BA.debugLineNum = 14090360;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090361;
 //BA.debugLineNum = 14090361;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090362;
 //BA.debugLineNum = 14090362;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090364;
 //BA.debugLineNum = 14090364;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090365;
 //BA.debugLineNum = 14090365;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090366;
 //BA.debugLineNum = 14090366;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090368;
 //BA.debugLineNum = 14090368;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090369;
 //BA.debugLineNum = 14090369;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090370;
 //BA.debugLineNum = 14090370;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090372;
 //BA.debugLineNum = 14090372;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090373;
 //BA.debugLineNum = 14090373;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090374;
 //BA.debugLineNum = 14090374;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090376;
 //BA.debugLineNum = 14090376;BA.debugLine="Part7.Visible = False";
mostCurrent._part7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090377;
 //BA.debugLineNum = 14090377;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090378;
 //BA.debugLineNum = 14090378;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090379;
 //BA.debugLineNum = 14090379;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090380;
 //BA.debugLineNum = 14090380;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090381;
 //BA.debugLineNum = 14090381;BA.debugLine="Else If participant.Size = 6 Then";
if (_participant.getSize()==6) { 
RDebugUtils.currentLine=14090382;
 //BA.debugLineNum = 14090382;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090383;
 //BA.debugLineNum = 14090383;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090384;
 //BA.debugLineNum = 14090384;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090386;
 //BA.debugLineNum = 14090386;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090387;
 //BA.debugLineNum = 14090387;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090388;
 //BA.debugLineNum = 14090388;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090390;
 //BA.debugLineNum = 14090390;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090391;
 //BA.debugLineNum = 14090391;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090392;
 //BA.debugLineNum = 14090392;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090394;
 //BA.debugLineNum = 14090394;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090395;
 //BA.debugLineNum = 14090395;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090396;
 //BA.debugLineNum = 14090396;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090398;
 //BA.debugLineNum = 14090398;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090399;
 //BA.debugLineNum = 14090399;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090400;
 //BA.debugLineNum = 14090400;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090402;
 //BA.debugLineNum = 14090402;BA.debugLine="Dim part_7 As Map";
_part_7 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090403;
 //BA.debugLineNum = 14090403;BA.debugLine="part_7 = participant.Get(5)";
_part_7.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (5))));
RDebugUtils.currentLine=14090404;
 //BA.debugLineNum = 14090404;BA.debugLine="Part7.Text = \" - \"&part_7.Get(\"name\")";
mostCurrent._part7.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_7.Get((Object)("name")))));
RDebugUtils.currentLine=14090406;
 //BA.debugLineNum = 14090406;BA.debugLine="Part8.Visible = False";
mostCurrent._part8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090407;
 //BA.debugLineNum = 14090407;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090408;
 //BA.debugLineNum = 14090408;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090409;
 //BA.debugLineNum = 14090409;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090410;
 //BA.debugLineNum = 14090410;BA.debugLine="Else If participant.Size = 7 Then";
if (_participant.getSize()==7) { 
RDebugUtils.currentLine=14090411;
 //BA.debugLineNum = 14090411;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090412;
 //BA.debugLineNum = 14090412;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090413;
 //BA.debugLineNum = 14090413;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090415;
 //BA.debugLineNum = 14090415;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090416;
 //BA.debugLineNum = 14090416;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090417;
 //BA.debugLineNum = 14090417;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090419;
 //BA.debugLineNum = 14090419;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090420;
 //BA.debugLineNum = 14090420;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090421;
 //BA.debugLineNum = 14090421;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090423;
 //BA.debugLineNum = 14090423;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090424;
 //BA.debugLineNum = 14090424;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090425;
 //BA.debugLineNum = 14090425;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090427;
 //BA.debugLineNum = 14090427;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090428;
 //BA.debugLineNum = 14090428;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090429;
 //BA.debugLineNum = 14090429;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090431;
 //BA.debugLineNum = 14090431;BA.debugLine="Dim part_7 As Map";
_part_7 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090432;
 //BA.debugLineNum = 14090432;BA.debugLine="part_7 = participant.Get(5)";
_part_7.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (5))));
RDebugUtils.currentLine=14090433;
 //BA.debugLineNum = 14090433;BA.debugLine="Part7.Text = \" - \"&part_7.Get(\"name\")";
mostCurrent._part7.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_7.Get((Object)("name")))));
RDebugUtils.currentLine=14090435;
 //BA.debugLineNum = 14090435;BA.debugLine="Dim part_8 As Map";
_part_8 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090436;
 //BA.debugLineNum = 14090436;BA.debugLine="part_8 = participant.Get(6)";
_part_8.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (6))));
RDebugUtils.currentLine=14090437;
 //BA.debugLineNum = 14090437;BA.debugLine="Part8.Text = \" - \"&part_8.Get(\"name\")";
mostCurrent._part8.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_8.Get((Object)("name")))));
RDebugUtils.currentLine=14090439;
 //BA.debugLineNum = 14090439;BA.debugLine="Part9.Visible = False";
mostCurrent._part9.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090440;
 //BA.debugLineNum = 14090440;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090441;
 //BA.debugLineNum = 14090441;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090442;
 //BA.debugLineNum = 14090442;BA.debugLine="Else If participant.Size = 8 Then";
if (_participant.getSize()==8) { 
RDebugUtils.currentLine=14090443;
 //BA.debugLineNum = 14090443;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090444;
 //BA.debugLineNum = 14090444;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090445;
 //BA.debugLineNum = 14090445;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090447;
 //BA.debugLineNum = 14090447;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090448;
 //BA.debugLineNum = 14090448;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090449;
 //BA.debugLineNum = 14090449;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090451;
 //BA.debugLineNum = 14090451;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090452;
 //BA.debugLineNum = 14090452;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090453;
 //BA.debugLineNum = 14090453;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090455;
 //BA.debugLineNum = 14090455;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090456;
 //BA.debugLineNum = 14090456;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090457;
 //BA.debugLineNum = 14090457;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090459;
 //BA.debugLineNum = 14090459;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090460;
 //BA.debugLineNum = 14090460;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090461;
 //BA.debugLineNum = 14090461;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090463;
 //BA.debugLineNum = 14090463;BA.debugLine="Dim part_7 As Map";
_part_7 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090464;
 //BA.debugLineNum = 14090464;BA.debugLine="part_7 = participant.Get(5)";
_part_7.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (5))));
RDebugUtils.currentLine=14090465;
 //BA.debugLineNum = 14090465;BA.debugLine="Part7.Text = \" - \"&part_7.Get(\"name\")";
mostCurrent._part7.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_7.Get((Object)("name")))));
RDebugUtils.currentLine=14090467;
 //BA.debugLineNum = 14090467;BA.debugLine="Dim part_8 As Map";
_part_8 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090468;
 //BA.debugLineNum = 14090468;BA.debugLine="part_8 = participant.Get(6)";
_part_8.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (6))));
RDebugUtils.currentLine=14090469;
 //BA.debugLineNum = 14090469;BA.debugLine="Part8.Text = \" - \"&part_8.Get(\"name\")";
mostCurrent._part8.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_8.Get((Object)("name")))));
RDebugUtils.currentLine=14090471;
 //BA.debugLineNum = 14090471;BA.debugLine="Dim part_9 As Map";
_part_9 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090472;
 //BA.debugLineNum = 14090472;BA.debugLine="part_9 = participant.Get(7)";
_part_9.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (7))));
RDebugUtils.currentLine=14090473;
 //BA.debugLineNum = 14090473;BA.debugLine="Part9.Text = \" - \"&part_9.Get(\"name\")";
mostCurrent._part9.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_9.Get((Object)("name")))));
RDebugUtils.currentLine=14090475;
 //BA.debugLineNum = 14090475;BA.debugLine="Part10.Visible = False";
mostCurrent._part10.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14090476;
 //BA.debugLineNum = 14090476;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090477;
 //BA.debugLineNum = 14090477;BA.debugLine="Else If participant.Size = 9 Then";
if (_participant.getSize()==9) { 
RDebugUtils.currentLine=14090478;
 //BA.debugLineNum = 14090478;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090479;
 //BA.debugLineNum = 14090479;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090480;
 //BA.debugLineNum = 14090480;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090482;
 //BA.debugLineNum = 14090482;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090483;
 //BA.debugLineNum = 14090483;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090484;
 //BA.debugLineNum = 14090484;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090486;
 //BA.debugLineNum = 14090486;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090487;
 //BA.debugLineNum = 14090487;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090488;
 //BA.debugLineNum = 14090488;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090490;
 //BA.debugLineNum = 14090490;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090491;
 //BA.debugLineNum = 14090491;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090492;
 //BA.debugLineNum = 14090492;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090494;
 //BA.debugLineNum = 14090494;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090495;
 //BA.debugLineNum = 14090495;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090496;
 //BA.debugLineNum = 14090496;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090498;
 //BA.debugLineNum = 14090498;BA.debugLine="Dim part_7 As Map";
_part_7 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090499;
 //BA.debugLineNum = 14090499;BA.debugLine="part_7 = participant.Get(5)";
_part_7.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (5))));
RDebugUtils.currentLine=14090500;
 //BA.debugLineNum = 14090500;BA.debugLine="Part7.Text = \" - \"&part_7.Get(\"name\")";
mostCurrent._part7.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_7.Get((Object)("name")))));
RDebugUtils.currentLine=14090502;
 //BA.debugLineNum = 14090502;BA.debugLine="Dim part_8 As Map";
_part_8 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090503;
 //BA.debugLineNum = 14090503;BA.debugLine="part_8 = participant.Get(6)";
_part_8.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (6))));
RDebugUtils.currentLine=14090504;
 //BA.debugLineNum = 14090504;BA.debugLine="Part8.Text = \" - \"&part_8.Get(\"name\")";
mostCurrent._part8.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_8.Get((Object)("name")))));
RDebugUtils.currentLine=14090506;
 //BA.debugLineNum = 14090506;BA.debugLine="Dim part_9 As Map";
_part_9 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090507;
 //BA.debugLineNum = 14090507;BA.debugLine="part_9 = participant.Get(7)";
_part_9.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (7))));
RDebugUtils.currentLine=14090508;
 //BA.debugLineNum = 14090508;BA.debugLine="Part9.Text = \" - \"&part_9.Get(\"name\")";
mostCurrent._part9.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_9.Get((Object)("name")))));
RDebugUtils.currentLine=14090510;
 //BA.debugLineNum = 14090510;BA.debugLine="Dim part_10 As Map";
_part_10 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090511;
 //BA.debugLineNum = 14090511;BA.debugLine="part_10 = participant.Get(8)";
_part_10.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (8))));
RDebugUtils.currentLine=14090512;
 //BA.debugLineNum = 14090512;BA.debugLine="Part10.Text = \" - \"&part_10.Get(\"name\")";
mostCurrent._part10.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_10.Get((Object)("name")))));
RDebugUtils.currentLine=14090514;
 //BA.debugLineNum = 14090514;BA.debugLine="Part11.Visible = False";
mostCurrent._part11.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else 
{RDebugUtils.currentLine=14090515;
 //BA.debugLineNum = 14090515;BA.debugLine="Else If participant.Size = 10 Then";
if (_participant.getSize()==10) { 
RDebugUtils.currentLine=14090516;
 //BA.debugLineNum = 14090516;BA.debugLine="Dim part_2 As Map";
_part_2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090517;
 //BA.debugLineNum = 14090517;BA.debugLine="part_2 = participant.Get(0)";
_part_2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (0))));
RDebugUtils.currentLine=14090518;
 //BA.debugLineNum = 14090518;BA.debugLine="Part2.Text = \" - \"&part_2.Get(\"name\")";
mostCurrent._part2.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_2.Get((Object)("name")))));
RDebugUtils.currentLine=14090520;
 //BA.debugLineNum = 14090520;BA.debugLine="Dim part_3 As Map";
_part_3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090521;
 //BA.debugLineNum = 14090521;BA.debugLine="part_3 = participant.Get(1)";
_part_3.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (1))));
RDebugUtils.currentLine=14090522;
 //BA.debugLineNum = 14090522;BA.debugLine="Part3.Text = \" - \"&part_3.Get(\"name\")";
mostCurrent._part3.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_3.Get((Object)("name")))));
RDebugUtils.currentLine=14090524;
 //BA.debugLineNum = 14090524;BA.debugLine="Dim part_4 As Map";
_part_4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090525;
 //BA.debugLineNum = 14090525;BA.debugLine="part_4 = participant.Get(2)";
_part_4.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (2))));
RDebugUtils.currentLine=14090526;
 //BA.debugLineNum = 14090526;BA.debugLine="Part4.Text = \" - \"&part_4.Get(\"name\")";
mostCurrent._part4.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_4.Get((Object)("name")))));
RDebugUtils.currentLine=14090528;
 //BA.debugLineNum = 14090528;BA.debugLine="Dim part_5 As Map";
_part_5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090529;
 //BA.debugLineNum = 14090529;BA.debugLine="part_5 = participant.Get(3)";
_part_5.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (3))));
RDebugUtils.currentLine=14090530;
 //BA.debugLineNum = 14090530;BA.debugLine="Part5.Text = \" - \"&part_5.Get(\"name\")";
mostCurrent._part5.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_5.Get((Object)("name")))));
RDebugUtils.currentLine=14090532;
 //BA.debugLineNum = 14090532;BA.debugLine="Dim part_6 As Map";
_part_6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090533;
 //BA.debugLineNum = 14090533;BA.debugLine="part_6 = participant.Get(4)";
_part_6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (4))));
RDebugUtils.currentLine=14090534;
 //BA.debugLineNum = 14090534;BA.debugLine="Part6.Text = \" - \"&part_6.Get(\"name\")";
mostCurrent._part6.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_6.Get((Object)("name")))));
RDebugUtils.currentLine=14090536;
 //BA.debugLineNum = 14090536;BA.debugLine="Dim part_7 As Map";
_part_7 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090537;
 //BA.debugLineNum = 14090537;BA.debugLine="part_7 = participant.Get(5)";
_part_7.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (5))));
RDebugUtils.currentLine=14090538;
 //BA.debugLineNum = 14090538;BA.debugLine="Part7.Text = \" - \"&part_7.Get(\"name\")";
mostCurrent._part7.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_7.Get((Object)("name")))));
RDebugUtils.currentLine=14090540;
 //BA.debugLineNum = 14090540;BA.debugLine="Dim part_8 As Map";
_part_8 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090541;
 //BA.debugLineNum = 14090541;BA.debugLine="part_8 = participant.Get(6)";
_part_8.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (6))));
RDebugUtils.currentLine=14090542;
 //BA.debugLineNum = 14090542;BA.debugLine="Part8.Text = \" - \"&part_8.Get(\"name\")";
mostCurrent._part8.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_8.Get((Object)("name")))));
RDebugUtils.currentLine=14090544;
 //BA.debugLineNum = 14090544;BA.debugLine="Dim part_9 As Map";
_part_9 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090545;
 //BA.debugLineNum = 14090545;BA.debugLine="part_9 = participant.Get(7)";
_part_9.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (7))));
RDebugUtils.currentLine=14090546;
 //BA.debugLineNum = 14090546;BA.debugLine="Part9.Text = \" - \"&part_9.Get(\"name\")";
mostCurrent._part9.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_9.Get((Object)("name")))));
RDebugUtils.currentLine=14090548;
 //BA.debugLineNum = 14090548;BA.debugLine="Dim part_10 As Map";
_part_10 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090549;
 //BA.debugLineNum = 14090549;BA.debugLine="part_10 = participant.Get(8)";
_part_10.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (8))));
RDebugUtils.currentLine=14090550;
 //BA.debugLineNum = 14090550;BA.debugLine="Part10.Text = \" - \"&part_10.Get(\"name\")";
mostCurrent._part10.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_10.Get((Object)("name")))));
RDebugUtils.currentLine=14090552;
 //BA.debugLineNum = 14090552;BA.debugLine="Dim part_11 As Map";
_part_11 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090553;
 //BA.debugLineNum = 14090553;BA.debugLine="part_11 = participant.Get(9)";
_part_11.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_participant.Get((int) (9))));
RDebugUtils.currentLine=14090554;
 //BA.debugLineNum = 14090554;BA.debugLine="Part11.Text = \" - \"&part_11.Get(\"name\")";
mostCurrent._part11.setText(BA.ObjectToCharSequence(" - "+BA.ObjectToString(_part_11.Get((Object)("name")))));
 }}}}}}}}}}
;
 } 
       catch (Exception e256) {
			processBA.setLastException(e256);RDebugUtils.currentLine=14090557;
 //BA.debugLineNum = 14090557;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=14090562;
 //BA.debugLineNum = 14090562;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=14090563;
 //BA.debugLineNum = 14090563;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=14090565;
 //BA.debugLineNum = 14090565;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=14090566;
 //BA.debugLineNum = 14090566;BA.debugLine="End Sub";
return "";
}
}