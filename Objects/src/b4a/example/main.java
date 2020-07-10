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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (qurbanjamaahdetail.mostCurrent != null);
vis = vis | (homejamaah.mostCurrent != null);
vis = vis | (qurbanjamaah.mostCurrent != null);
vis = vis | (poorjamaahdetail.mostCurrent != null);
vis = vis | (invoicejamaah.mostCurrent != null);
vis = vis | (historyjamaah.mostCurrent != null);
vis = vis | (homestewardship.mostCurrent != null);
vis = vis | (orphansjamaahdetail.mostCurrent != null);
vis = vis | (mapsjamaah.mostCurrent != null);
vis = vis | (donationjamaahdetail.mostCurrent != null);
vis = vis | (qurbanstewardship.mostCurrent != null);
vis = vis | (orphansjamaah.mostCurrent != null);
vis = vis | (donationjamaah.mostCurrent != null);
vis = vis | (tpajamaah.mostCurrent != null);
vis = vis | (tpajamaahdetail.mostCurrent != null);
vis = vis | (poorjamaah.mostCurrent != null);
vis = vis | (qurbanstewardshipdetail.mostCurrent != null);
vis = vis | (webview.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (qurbanjamaahdetail.previousOne != null) {
				__a = qurbanjamaahdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(qurbanjamaahdetail.mostCurrent == null ? null : qurbanjamaahdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homejamaah.previousOne != null) {
				__a = homejamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homejamaah.mostCurrent == null ? null : homejamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (qurbanjamaah.previousOne != null) {
				__a = qurbanjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(qurbanjamaah.mostCurrent == null ? null : qurbanjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (poorjamaahdetail.previousOne != null) {
				__a = poorjamaahdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(poorjamaahdetail.mostCurrent == null ? null : poorjamaahdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (invoicejamaah.previousOne != null) {
				__a = invoicejamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(invoicejamaah.mostCurrent == null ? null : invoicejamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (historyjamaah.previousOne != null) {
				__a = historyjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(historyjamaah.mostCurrent == null ? null : historyjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homestewardship.previousOne != null) {
				__a = homestewardship.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homestewardship.mostCurrent == null ? null : homestewardship.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (orphansjamaahdetail.previousOne != null) {
				__a = orphansjamaahdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(orphansjamaahdetail.mostCurrent == null ? null : orphansjamaahdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsjamaah.previousOne != null) {
				__a = mapsjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsjamaah.mostCurrent == null ? null : mapsjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (donationjamaahdetail.previousOne != null) {
				__a = donationjamaahdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(donationjamaahdetail.mostCurrent == null ? null : donationjamaahdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (qurbanstewardship.previousOne != null) {
				__a = qurbanstewardship.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(qurbanstewardship.mostCurrent == null ? null : qurbanstewardship.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (orphansjamaah.previousOne != null) {
				__a = orphansjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(orphansjamaah.mostCurrent == null ? null : orphansjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (donationjamaah.previousOne != null) {
				__a = donationjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(donationjamaah.mostCurrent == null ? null : donationjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tpajamaah.previousOne != null) {
				__a = tpajamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tpajamaah.mostCurrent == null ? null : tpajamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tpajamaahdetail.previousOne != null) {
				__a = tpajamaahdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tpajamaahdetail.mostCurrent == null ? null : tpajamaahdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (poorjamaah.previousOne != null) {
				__a = poorjamaah.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(poorjamaah.mostCurrent == null ? null : poorjamaah.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter2.class));
 {
            Activity __a = null;
            if (qurbanstewardshipdetail.previousOne != null) {
				__a = qurbanstewardshipdetail.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(qurbanstewardshipdetail.mostCurrent == null ? null : qurbanstewardshipdetail.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (webview.previousOne != null) {
				__a = webview.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(webview.mostCurrent == null ? null : webview.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _username = "";
public static String _phone = "";
public static String _status = "";
public static String _id = "";
public static String _worship_place_address = "";
public static String _server = "";
public static de.amberhome.objects.preferenceactivity.PreferenceManager _manager = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editusername = null;
public static String _md5string = "";
public anywheresoftware.b4a.objects.PanelWrapper _pstep = null;
public anywheresoftware.b4a.objects.PanelWrapper _pjam = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelstep = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeljam = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="If manager.GetBoolean(\"is_login\") Then";
if (_manager.GetBoolean("is_login")) { 
 }else {
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="manager.SetBoolean(\"jamaah\", True)";
_manager.SetBoolean("jamaah",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="manager.SetBoolean(\"step\", False)";
_manager.SetBoolean("step",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="CheckLogin";
_checklogin();
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="MainScroll.Panel.LoadLayout(\"Login\")";
mostCurrent._mainscroll.getPanel().LoadLayout("Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="MainScroll.Panel.Height = PanelLogin.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panellogin.getHeight());
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="MainScroll.Height = PanelLogin.Height";
mostCurrent._mainscroll.setHeight(mostCurrent._panellogin.getHeight());
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
_setchecked(mostCurrent._pstep,mostCurrent._labelstep,_manager.GetBoolean("step"));
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
_setchecked(mostCurrent._pjam,mostCurrent._labeljam,_manager.GetBoolean("jamaah"));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="End Sub";
return "";
}
public static String  _checklogin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checklogin"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checklogin", null);
boolean _islogin = false;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub CheckLogin";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim islogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="islogin = manager.GetBoolean(\"is_login\")";
_islogin = _manager.GetBoolean("is_login");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="If islogin Then";
if (_islogin) { 
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="If manager.GetBoolean(\"jamaah\") = True Then";
if (_manager.GetBoolean("jamaah")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="StartActivity(HomeJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homejamaah.getObject()));
 }else {
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="If manager.GetBoolean(\"step\") = True Then";
if (_manager.GetBoolean("step")==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="StartActivity(HomeStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homestewardship.getObject()));
 };
 };
 };
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="End Sub";
return "";
}
public static String  _setchecked(anywheresoftware.b4a.objects.PanelWrapper _v,anywheresoftware.b4a.objects.LabelWrapper _s,boolean _pressedstate) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setchecked"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setchecked", new Object[] {_v,_s,_pressedstate});
anywheresoftware.b4a.objects.drawable.ColorDrawable _checked = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _unchecked = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub SetChecked(v As Panel,s As Label, PressedState";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Dim checked, unchecked As ColorDrawable";
_checked = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_unchecked = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="checked.Initialize(Colors.ARGB(255,5,138,72), 0di";
_checked.Initialize(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (5),(int) (138),(int) (72)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="unchecked.Initialize(Colors.White, 0dip)";
_unchecked.Initialize(anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Log(PressedState)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_pressedstate));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Select PressedState";
switch (BA.switchObjectToInt(_pressedstate,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False)) {
case 0: {
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="v.Background = checked";
_v.setBackground((android.graphics.drawable.Drawable)(_checked.getObject()));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="s.TextColor = Colors.White";
_s.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 break; }
case 1: {
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="v.Background = unchecked";
_v.setBackground((android.graphics.drawable.Drawable)(_unchecked.getObject()));
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="s.TextColor = Colors.Black";
_s.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
 break; }
}
;
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(manager.GetString(\"wahyu\"))";
anywheresoftware.b4a.keywords.Common.Log(_manager.GetString("wahyu"));
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null);
String _pi = "";
anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _md = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bytecon = null;
byte[] _passwordhash = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub BtnLogin_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Private pi As String";
_pi = "";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="pi = EditPassword.Text";
_pi = mostCurrent._editpassword.getText();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim md As MessageDigest";
_md = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim ByteCon As ByteConverter";
_bytecon = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="Dim passwordhash() As Byte";
_passwordhash = new byte[(int) (0)];
;
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="passwordhash = md.GetMessageDigest(pi.GetBytes(\"U";
_passwordhash = _md.GetMessageDigest(_pi.getBytes("UTF8"),"MD5");
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
mostCurrent._md5string = _bytecon.HexFromBytes(_passwordhash);
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="md5string = md5string.ToLowerCase";
mostCurrent._md5string = mostCurrent._md5string.toLowerCase();
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="CodeSemua.ExecuteUrl(server&\"api/login\",\"username";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,_server+"api/login","username="+mostCurrent._editusername.getText()+"&password="+mostCurrent._md5string,"Login",main.getObject());
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \"";
anywheresoftware.b4a.keywords.Common.Log("JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success));
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"Login")) {
case 0: {
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Try";
try {RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="a = parser.NextObject";
_a = _parser.NextObject();
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="username = a.Get(\"username\")";
_username = BA.ObjectToString(_a.Get((Object)("username")));
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="phone = a.Get(\"phone\")";
_phone = BA.ObjectToString(_a.Get((Object)("phone")));
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="status = a.Get(\"status\")";
_status = BA.ObjectToString(_a.Get((Object)("status")));
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="id = a.Get (\"id\")";
_id = BA.ObjectToString(_a.Get((Object)("id")));
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="If username == \"null\" Or phone == \"null\" Then";
if ((_username).equals("null") || (_phone).equals("null")) { 
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login F";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Wrong username or password"),BA.ObjectToCharSequence("Login Failed"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="If (manager.GetBoolean(\"jamaah\") = True) The";
if ((_manager.GetBoolean("jamaah")==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="manager.SetString(\"username\",username)";
_manager.SetString("username",_username);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="manager.SetString(\"id\",id)";
_manager.SetString("id",_id);
RDebugUtils.currentLine=327705;
 //BA.debugLineNum = 327705;BA.debugLine="Msgbox(\"login sebagai jamaah\",\"Info\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("login sebagai jamaah"),BA.ObjectToCharSequence("Info"),mostCurrent.activityBA);
RDebugUtils.currentLine=327706;
 //BA.debugLineNum = 327706;BA.debugLine="manager.SetBoolean(\"is_login\",True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327707;
 //BA.debugLineNum = 327707;BA.debugLine="Log(\"start home jamaah-----------------\")";
anywheresoftware.b4a.keywords.Common.Log("start home jamaah-----------------");
RDebugUtils.currentLine=327708;
 //BA.debugLineNum = 327708;BA.debugLine="StartActivity(HomeJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homejamaah.getObject()));
 }else {
RDebugUtils.currentLine=327710;
 //BA.debugLineNum = 327710;BA.debugLine="If (status = \"stewardship\") And (manager.Ge";
if (((_status).equals("stewardship")) && (_manager.GetBoolean("step")==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=327711;
 //BA.debugLineNum = 327711;BA.debugLine="Msgbox(\"login sebagai stewardship\",\"Info\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("login sebagai stewardship"),BA.ObjectToCharSequence("Info"),mostCurrent.activityBA);
RDebugUtils.currentLine=327712;
 //BA.debugLineNum = 327712;BA.debugLine="manager.SetString(\"username\",username)";
_manager.SetString("username",_username);
RDebugUtils.currentLine=327713;
 //BA.debugLineNum = 327713;BA.debugLine="manager.SetString(\"id\",id)";
_manager.SetString("id",_id);
RDebugUtils.currentLine=327714;
 //BA.debugLineNum = 327714;BA.debugLine="manager.SetBoolean(\"is_login\",True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327715;
 //BA.debugLineNum = 327715;BA.debugLine="Log(\"start home stewardship.............\"";
anywheresoftware.b4a.keywords.Common.Log("start home stewardship.............");
RDebugUtils.currentLine=327716;
 //BA.debugLineNum = 327716;BA.debugLine="StartActivity(HomeStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homestewardship.getObject()));
 }else {
RDebugUtils.currentLine=327718;
 //BA.debugLineNum = 327718;BA.debugLine="Msgbox(\"Pastikan Login Dengan Benar\",\"Warn";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Pastikan Login Dengan Benar"),BA.ObjectToCharSequence("Warning"),mostCurrent.activityBA);
 };
 };
 };
 } 
       catch (Exception e41) {
			processBA.setLastException(e41);RDebugUtils.currentLine=327724;
 //BA.debugLineNum = 327724;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=327725;
 //BA.debugLineNum = 327725;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Wrong username or password"),BA.ObjectToCharSequence("Login Failed"),mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=327729;
 //BA.debugLineNum = 327729;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=327730;
 //BA.debugLineNum = 327730;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=327732;
 //BA.debugLineNum = 327732;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=327733;
 //BA.debugLineNum = 327733;BA.debugLine="End Sub";
return "";
}
public static String  _labeljam_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labeljam_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "labeljam_click", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub labeljam_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="manager.SetBoolean(\"jamaah\",True)";
_manager.SetBoolean("jamaah",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="manager.SetBoolean(\"step\",False)";
_manager.SetBoolean("step",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
_setchecked(mostCurrent._pstep,mostCurrent._labelstep,_manager.GetBoolean("step"));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
_setchecked(mostCurrent._pjam,mostCurrent._labeljam,_manager.GetBoolean("jamaah"));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="End Sub";
return "";
}
public static String  _labelstep_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labelstep_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "labelstep_click", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Labelstep_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="manager.SetBoolean(\"step\",True)";
_manager.SetBoolean("step",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="manager.SetBoolean(\"jamaah\",False)";
_manager.SetBoolean("jamaah",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="SetChecked(pstep,Labelstep,manager.GetBoolean(\"st";
_setchecked(mostCurrent._pstep,mostCurrent._labelstep,_manager.GetBoolean("step"));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="SetChecked(pjam,labeljam,manager.GetBoolean(\"jama";
_setchecked(mostCurrent._pjam,mostCurrent._labeljam,_manager.GetBoolean("jamaah"));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
}