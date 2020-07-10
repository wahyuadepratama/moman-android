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

public class donationjamaahdetail extends Activity implements B4AActivity{
	public static donationjamaahdetail mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.donationjamaahdetail");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (donationjamaahdetail).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.donationjamaahdetail");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.donationjamaahdetail", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (donationjamaahdetail) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (donationjamaahdetail) Resume **");
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
		return donationjamaahdetail.class;
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
        BA.LogInfo("** Activity (donationjamaahdetail) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (donationjamaahdetail) Resume **");
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelqurban = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _horizontalscrollview1 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _fundneeded = null;
public anywheresoftware.b4a.objects.LabelWrapper _fundcollected = null;
public anywheresoftware.b4a.objects.LabelWrapper _description = null;
public anywheresoftware.b4a.objects.LabelWrapper _progress = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittotal = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinpengurus = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkguna = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkhamba = null;
public anywheresoftware.b4a.objects.collections.Map _pengurus = null;
public static String _accountid = "";
public static String _publicid = "";
public static String _notransaction = "";
public anywheresoftware.b4a.objects.collections.List _account = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public b4a.example.homejamaah _homejamaah = null;
public b4a.example.qurbanjamaah _qurbanjamaah = null;
public b4a.example.codesemua _codesemua = null;
public b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.historyjamaah _historyjamaah = null;
public b4a.example.homestewardship _homestewardship = null;
public b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public b4a.example.mapsjamaah _mapsjamaah = null;
public b4a.example.qurbanstewardship _qurbanstewardship = null;
public b4a.example.orphansjamaah _orphansjamaah = null;
public b4a.example.donationjamaah _donationjamaah = null;
public b4a.example.tpajamaah _tpajamaah = null;
public b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public b4a.example.poorjamaah _poorjamaah = null;
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="MainScroll.Panel.LoadLayout(\"DonationJamaahDetail";
mostCurrent._mainscroll.getPanel().LoadLayout("DonationJamaahDetail",mostCurrent.activityBA);
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="pengurus.Initialize";
mostCurrent._pengurus.Initialize();
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
mostCurrent._spinpengurus.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/donation/detail?id="+mostCurrent._donationjamaah._idselected,"LoadData",donationjamaahdetail.getObject());
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/mosque/dona";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,mostCurrent._main._server+"api/mosque/donation/store?id="+mostCurrent._donationjamaah._idworshipplace,"project="+mostCurrent._donationjamaah._idselected+"&jamaah="+mostCurrent._homejamaah._id+"&fund="+mostCurrent._edittotal.getText()+"&account="+mostCurrent._accountid+"&public="+mostCurrent._publicid,"Store",donationjamaahdetail.getObject());
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return "";
}
public static String  _checkguna_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkguna_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkguna_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub CheckGuna_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If CheckGuna.Checked Then";
if (mostCurrent._checkguna.getChecked()) { 
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="End Sub";
return "";
}
public static String  _checkhamba_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkhamba_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkhamba_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub CheckHamba_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="If CheckHamba.Checked Then";
if (mostCurrent._checkhamba.getChecked()) { 
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _accountdata = null;
anywheresoftware.b4a.objects.collections.List _gallery = null;
anywheresoftware.b4a.objects.collections.Map _w = null;
String _image = "";
String _gambar = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="If Job.JobName = \"Store\" Then";
if ((_job._jobname).equals("Store")) { 
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.Log(_job._getstring());
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="noTransaction = root.Get(\"trx\")";
mostCurrent._notransaction = BA.ObjectToString(_root.Get((Object)("trx")));
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="Log(noTransaction)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._notransaction);
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="Msgbox(\"Please check payment infromation for tr";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please check payment infromation for transaction #"+mostCurrent._notransaction),BA.ObjectToCharSequence("Transaction successful!"),mostCurrent.activityBA);
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="StartActivity(HistoryJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historyjamaah.getObject()));
 }else {
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="a = root.Get(\"project\")";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("project"))));
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="NavbarTitle.Text = a.Get(\"name\")";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence(_a.Get((Object)("name"))));
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="FundNeeded.Text = \"Fund Needed : \"&a.Get(\"fund\"";
mostCurrent._fundneeded.setText(BA.ObjectToCharSequence("Fund Needed : "+BA.ObjectToString(_a.Get((Object)("fund")))));
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="FundCollected.Text = \"Fund Collected : \"&a.Get(";
mostCurrent._fundcollected.setText(BA.ObjectToCharSequence("Fund Collected : "+BA.ObjectToString(_a.Get((Object)("fund_collected")))));
RDebugUtils.currentLine=9109528;
 //BA.debugLineNum = 9109528;BA.debugLine="Progress.Text = \"Description : \"&a.Get(\"descrip";
mostCurrent._progress.setText(BA.ObjectToCharSequence("Description : "+BA.ObjectToString(_a.Get((Object)("description")))));
RDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="Description.Text = \"Progress : \"&a.Get(\"progres";
mostCurrent._description.setText(BA.ObjectToCharSequence("Progress : "+BA.ObjectToString(_a.Get((Object)("progress")))));
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="Dim data As List : data.Initialize";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="Dim data As List : data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="account = root.Get(\"account\")";
mostCurrent._account.setObject((java.util.List)(_root.Get((Object)("account"))));
RDebugUtils.currentLine=9109534;
 //BA.debugLineNum = 9109534;BA.debugLine="If account.Size = 0 Then";
if (mostCurrent._account.getSize()==0) { 
RDebugUtils.currentLine=9109535;
 //BA.debugLineNum = 9109535;BA.debugLine="SpinPengurus.Add(\"Belum Ada Akun Rekening!\")";
mostCurrent._spinpengurus.Add("Belum Ada Akun Rekening!");
 }else {
RDebugUtils.currentLine=9109537;
 //BA.debugLineNum = 9109537;BA.debugLine="SpinPengurus.Add(\"Pilih Nomor Rekeing Pengirim";
mostCurrent._spinpengurus.Add("Pilih Nomor Rekeing Pengiriman Donasi");
RDebugUtils.currentLine=9109538;
 //BA.debugLineNum = 9109538;BA.debugLine="For i=0 To account.Size-1";
{
final int step30 = 1;
final int limit30 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
RDebugUtils.currentLine=9109539;
 //BA.debugLineNum = 9109539;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9109540;
 //BA.debugLineNum = 9109540;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=9109541;
 //BA.debugLineNum = 9109541;BA.debugLine="SpinPengurus.Add(accountData.Get(\"owner\")&\" -";
mostCurrent._spinpengurus.Add(BA.ObjectToString(_accountdata.Get((Object)("owner")))+" - "+BA.ObjectToString(_accountdata.Get((Object)("account_number")))+" ("+BA.ObjectToString(_accountdata.Get((Object)("bank")))+")");
 }
};
 };
RDebugUtils.currentLine=9109545;
 //BA.debugLineNum = 9109545;BA.debugLine="Dim gallery As List : data.Initialize";
_gallery = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9109545;
 //BA.debugLineNum = 9109545;BA.debugLine="Dim gallery As List : data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=9109546;
 //BA.debugLineNum = 9109546;BA.debugLine="gallery = root.Get(\"gallery\")";
_gallery.setObject((java.util.List)(_root.Get((Object)("gallery"))));
RDebugUtils.currentLine=9109547;
 //BA.debugLineNum = 9109547;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"ClvDona";
mostCurrent._horizontalscrollview1.getPanel().LoadLayout("ClvDonation",mostCurrent.activityBA);
RDebugUtils.currentLine=9109548;
 //BA.debugLineNum = 9109548;BA.debugLine="For i=0 To gallery.Size-1";
{
final int step40 = 1;
final int limit40 = (int) (_gallery.getSize()-1);
_i = (int) (0) ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
RDebugUtils.currentLine=9109549;
 //BA.debugLineNum = 9109549;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9109550;
 //BA.debugLineNum = 9109550;BA.debugLine="w=gallery.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_gallery.Get(_i)));
RDebugUtils.currentLine=9109551;
 //BA.debugLineNum = 9109551;BA.debugLine="Dim image = w.Get(\"image\") As String";
_image = BA.ObjectToString(_w.Get((Object)("image")));
RDebugUtils.currentLine=9109552;
 //BA.debugLineNum = 9109552;BA.debugLine="Dim gambar = \"\"&Main.Server&\"images/project/\"&";
_gambar = ""+mostCurrent._main._server+"images/project/"+_image;
RDebugUtils.currentLine=9109554;
 //BA.debugLineNum = 9109554;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9109555;
 //BA.debugLineNum = 9109555;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=9109556;
 //BA.debugLineNum = 9109556;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109557;
 //BA.debugLineNum = 9109557;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=9109558;
 //BA.debugLineNum = 9109558;BA.debugLine="p.SetLayout(0,0,100%x,50%y)";
_p.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=9109559;
 //BA.debugLineNum = 9109559;BA.debugLine="p.Color=Colors.Green";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=9109560;
 //BA.debugLineNum = 9109560;BA.debugLine="p.LoadLayout(\"ListImageProjectJamaah\")";
_p.LoadLayout("ListImageProjectJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=9109562;
 //BA.debugLineNum = 9109562;BA.debugLine="CustomListView1.AsView.Color= Colors.Magenta";
mostCurrent._customlistview1._asview().setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=9109563;
 //BA.debugLineNum = 9109563;BA.debugLine="CustomListView1.Add(p,m)";
mostCurrent._customlistview1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_m.getObject()));
RDebugUtils.currentLine=9109564;
 //BA.debugLineNum = 9109564;BA.debugLine="m.Put(ImageView1, gambar)";
_m.Put((Object)(mostCurrent._imageview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=9109565;
 //BA.debugLineNum = 9109565;BA.debugLine="CallSubDelayed2(Starter2, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter2.getObject()),"Download",(Object)(_m));
 }
};
RDebugUtils.currentLine=9109568;
 //BA.debugLineNum = 9109568;BA.debugLine="CustomListView1.sv.Height = (ImageView1.width)";
mostCurrent._customlistview1._sv.setHeight((int) ((mostCurrent._imageview1.getWidth())*mostCurrent._customlistview1._getsize()));
RDebugUtils.currentLine=9109569;
 //BA.debugLineNum = 9109569;BA.debugLine="CustomListView1.AsView.Width = CustomListView1.";
mostCurrent._customlistview1._asview().setWidth(mostCurrent._customlistview1._sv.getHeight());
RDebugUtils.currentLine=9109570;
 //BA.debugLineNum = 9109570;BA.debugLine="HorizontalScrollView1.Panel.Width = CustomListV";
mostCurrent._horizontalscrollview1.getPanel().setWidth(mostCurrent._customlistview1._sv.getHeight());
 };
 }else {
RDebugUtils.currentLine=9109574;
 //BA.debugLineNum = 9109574;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=9109575;
 //BA.debugLineNum = 9109575;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=9109577;
 //BA.debugLineNum = 9109577;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=9109578;
 //BA.debugLineNum = 9109578;BA.debugLine="End Sub";
return "";
}
public static String  _spinpengurus_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinpengurus_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinpengurus_itemclick", new Object[] {_position,_value});
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _accountdata = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="For i=0 To account.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="If SpinPengurus.SelectedIndex = i+1 Then";
if (mostCurrent._spinpengurus.getSelectedIndex()==_i+1) { 
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="accountId = accountData.Get(\"id\")";
mostCurrent._accountid = BA.ObjectToString(_accountdata.Get((Object)("id")));
 };
 }
};
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="End Sub";
return "";
}
}