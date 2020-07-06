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
public b4a.example.homejamaah _homejamaah = null;
public b4a.example.qurbanjamaah _qurbanjamaah = null;
public b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public b4a.example.mapsjamaah _mapsjamaah = null;
public b4a.example.donationstewardship _donationstewardship = null;
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
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="MainScroll.Panel.LoadLayout(\"DonationJamaahDetail";
mostCurrent._mainscroll.getPanel().LoadLayout("DonationJamaahDetail",mostCurrent.activityBA);
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="pengurus.Initialize";
mostCurrent._pengurus.Initialize();
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
mostCurrent._spinpengurus.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/donation";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/donation/detail?id="+mostCurrent._donationjamaah._idselected,"LoadData",donationjamaahdetail.getObject());
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/mosque/dona";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,mostCurrent._main._server+"api/mosque/donation/store?id="+mostCurrent._donationjamaah._idworshipplace,"project="+mostCurrent._donationjamaah._idselected+"&jamaah="+mostCurrent._homejamaah._id+"&fund="+mostCurrent._edittotal.getText()+"&account="+mostCurrent._accountid+"&public="+mostCurrent._publicid,"Store",donationjamaahdetail.getObject());
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public static String  _checkguna_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkguna_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkguna_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub CheckGuna_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="If CheckGuna.Checked Then";
if (mostCurrent._checkguna.getChecked()) { 
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="End Sub";
return "";
}
public static String  _checkhamba_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkhamba_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkhamba_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub CheckHamba_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="If CheckHamba.Checked Then";
if (mostCurrent._checkhamba.getChecked()) { 
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="If Job.JobName = \"Store\" Then";
if ((_job._jobname).equals("Store")) { 
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.Log(_job._getstring());
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="noTransaction = root.Get(\"trx\")";
mostCurrent._notransaction = BA.ObjectToString(_root.Get((Object)("trx")));
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Log(noTransaction)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._notransaction);
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Msgbox(\"Please check payment infromation for tr";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please check payment infromation for transaction #"+mostCurrent._notransaction),BA.ObjectToCharSequence("Transaction successful!"),mostCurrent.activityBA);
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="StartActivity(HistoryJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historyjamaah.getObject()));
 }else {
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="a = root.Get(\"project\")";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("project"))));
RDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="NavbarTitle.Text = a.Get(\"name\")";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence(_a.Get((Object)("name"))));
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="FundNeeded.Text = \"Fund Needed : \"&a.Get(\"fund\"";
mostCurrent._fundneeded.setText(BA.ObjectToCharSequence("Fund Needed : "+BA.ObjectToString(_a.Get((Object)("fund")))));
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="FundCollected.Text = \"Fund Collected : \"&a.Get(";
mostCurrent._fundcollected.setText(BA.ObjectToCharSequence("Fund Collected : "+BA.ObjectToString(_a.Get((Object)("fund_collected")))));
RDebugUtils.currentLine=6357016;
 //BA.debugLineNum = 6357016;BA.debugLine="Progress.Text = \"Description : \"&a.Get(\"descrip";
mostCurrent._progress.setText(BA.ObjectToCharSequence("Description : "+BA.ObjectToString(_a.Get((Object)("description")))));
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="Description.Text = \"Progress : \"&a.Get(\"progres";
mostCurrent._description.setText(BA.ObjectToCharSequence("Progress : "+BA.ObjectToString(_a.Get((Object)("progress")))));
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="Dim data As List : data.Initialize";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="Dim data As List : data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=6357020;
 //BA.debugLineNum = 6357020;BA.debugLine="account = root.Get(\"account\")";
mostCurrent._account.setObject((java.util.List)(_root.Get((Object)("account"))));
RDebugUtils.currentLine=6357022;
 //BA.debugLineNum = 6357022;BA.debugLine="If account.Size = 0 Then";
if (mostCurrent._account.getSize()==0) { 
RDebugUtils.currentLine=6357023;
 //BA.debugLineNum = 6357023;BA.debugLine="SpinPengurus.Add(\"Belum Ada Akun Rekening!\")";
mostCurrent._spinpengurus.Add("Belum Ada Akun Rekening!");
 }else {
RDebugUtils.currentLine=6357025;
 //BA.debugLineNum = 6357025;BA.debugLine="SpinPengurus.Add(\"Pilih Nomor Rekeing Pengirim";
mostCurrent._spinpengurus.Add("Pilih Nomor Rekeing Pengiriman Donasi");
RDebugUtils.currentLine=6357026;
 //BA.debugLineNum = 6357026;BA.debugLine="For i=0 To account.Size-1";
{
final int step30 = 1;
final int limit30 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
RDebugUtils.currentLine=6357027;
 //BA.debugLineNum = 6357027;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6357028;
 //BA.debugLineNum = 6357028;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=6357029;
 //BA.debugLineNum = 6357029;BA.debugLine="SpinPengurus.Add(accountData.Get(\"owner\")&\" -";
mostCurrent._spinpengurus.Add(BA.ObjectToString(_accountdata.Get((Object)("owner")))+" - "+BA.ObjectToString(_accountdata.Get((Object)("account_number")))+" ("+BA.ObjectToString(_accountdata.Get((Object)("bank")))+")");
 }
};
 };
RDebugUtils.currentLine=6357033;
 //BA.debugLineNum = 6357033;BA.debugLine="Dim gallery As List : data.Initialize";
_gallery = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6357033;
 //BA.debugLineNum = 6357033;BA.debugLine="Dim gallery As List : data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=6357034;
 //BA.debugLineNum = 6357034;BA.debugLine="gallery = root.Get(\"gallery\")";
_gallery.setObject((java.util.List)(_root.Get((Object)("gallery"))));
RDebugUtils.currentLine=6357035;
 //BA.debugLineNum = 6357035;BA.debugLine="HorizontalScrollView1.Panel.LoadLayout(\"ClvDona";
mostCurrent._horizontalscrollview1.getPanel().LoadLayout("ClvDonation",mostCurrent.activityBA);
RDebugUtils.currentLine=6357036;
 //BA.debugLineNum = 6357036;BA.debugLine="For i=0 To gallery.Size-1";
{
final int step40 = 1;
final int limit40 = (int) (_gallery.getSize()-1);
_i = (int) (0) ;
for (;(step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40) ;_i = ((int)(0 + _i + step40))  ) {
RDebugUtils.currentLine=6357037;
 //BA.debugLineNum = 6357037;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6357038;
 //BA.debugLineNum = 6357038;BA.debugLine="w=gallery.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_gallery.Get(_i)));
RDebugUtils.currentLine=6357039;
 //BA.debugLineNum = 6357039;BA.debugLine="Dim image = w.Get(\"image\") As String";
_image = BA.ObjectToString(_w.Get((Object)("image")));
RDebugUtils.currentLine=6357040;
 //BA.debugLineNum = 6357040;BA.debugLine="Dim gambar = \"\"&Main.Server&\"images/project/\"&";
_gambar = ""+mostCurrent._main._server+"images/project/"+_image;
RDebugUtils.currentLine=6357042;
 //BA.debugLineNum = 6357042;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6357043;
 //BA.debugLineNum = 6357043;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6357044;
 //BA.debugLineNum = 6357044;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6357045;
 //BA.debugLineNum = 6357045;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=6357046;
 //BA.debugLineNum = 6357046;BA.debugLine="p.SetLayout(0,0,100%x,50%y)";
_p.SetLayout((int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA));
RDebugUtils.currentLine=6357047;
 //BA.debugLineNum = 6357047;BA.debugLine="p.Color=Colors.Green";
_p.setColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=6357048;
 //BA.debugLineNum = 6357048;BA.debugLine="p.LoadLayout(\"ListImageProjectJamaah\")";
_p.LoadLayout("ListImageProjectJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=6357050;
 //BA.debugLineNum = 6357050;BA.debugLine="CustomListView1.AsView.Color= Colors.Magenta";
mostCurrent._customlistview1._asview().setColor(anywheresoftware.b4a.keywords.Common.Colors.Magenta);
RDebugUtils.currentLine=6357051;
 //BA.debugLineNum = 6357051;BA.debugLine="CustomListView1.Add(p,m)";
mostCurrent._customlistview1._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_m.getObject()));
RDebugUtils.currentLine=6357052;
 //BA.debugLineNum = 6357052;BA.debugLine="m.Put(ImageView1, gambar)";
_m.Put((Object)(mostCurrent._imageview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=6357053;
 //BA.debugLineNum = 6357053;BA.debugLine="CallSubDelayed2(Starter2, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter2.getObject()),"Download",(Object)(_m));
 }
};
RDebugUtils.currentLine=6357056;
 //BA.debugLineNum = 6357056;BA.debugLine="CustomListView1.sv.Height = (ImageView1.width)";
mostCurrent._customlistview1._sv.setHeight((int) ((mostCurrent._imageview1.getWidth())*mostCurrent._customlistview1._getsize()));
RDebugUtils.currentLine=6357057;
 //BA.debugLineNum = 6357057;BA.debugLine="CustomListView1.AsView.Width = CustomListView1.";
mostCurrent._customlistview1._asview().setWidth(mostCurrent._customlistview1._sv.getHeight());
RDebugUtils.currentLine=6357058;
 //BA.debugLineNum = 6357058;BA.debugLine="HorizontalScrollView1.Panel.Width = CustomListV";
mostCurrent._horizontalscrollview1.getPanel().setWidth(mostCurrent._customlistview1._sv.getHeight());
 };
 }else {
RDebugUtils.currentLine=6357062;
 //BA.debugLineNum = 6357062;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=6357063;
 //BA.debugLineNum = 6357063;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=6357065;
 //BA.debugLineNum = 6357065;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=6357066;
 //BA.debugLineNum = 6357066;BA.debugLine="End Sub";
return "";
}
public static String  _spinpengurus_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="donationjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinpengurus_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinpengurus_itemclick", new Object[] {_position,_value});
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _accountdata = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="For i=0 To account.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="If SpinPengurus.SelectedIndex = i+1 Then";
if (mostCurrent._spinpengurus.getSelectedIndex()==_i+1) { 
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="accountId = accountData.Get(\"id\")";
mostCurrent._accountid = BA.ObjectToString(_accountdata.Get((Object)("id")));
 };
 }
};
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="End Sub";
return "";
}
}