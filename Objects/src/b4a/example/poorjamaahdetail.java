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

public class poorjamaahdetail extends Activity implements B4AActivity{
	public static poorjamaahdetail mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.poorjamaahdetail");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (poorjamaahdetail).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.poorjamaahdetail");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.poorjamaahdetail", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (poorjamaahdetail) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (poorjamaahdetail) Resume **");
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
		return poorjamaahdetail.class;
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
        BA.LogInfo("** Activity (poorjamaahdetail) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (poorjamaahdetail) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelqurban = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
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
public b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public b4a.example.homestewardship _homestewardship = null;
public b4a.example.qurbanstewardship _qurbanstewardship = null;
public b4a.example.orphansjamaah _orphansjamaah = null;
public b4a.example.historyjamaah _historyjamaah = null;
public b4a.example.donationjamaah _donationjamaah = null;
public b4a.example.codesemua _codesemua = null;
public b4a.example.tpajamaah _tpajamaah = null;
public b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public b4a.example.poorjamaah _poorjamaah = null;
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="MainScroll.Panel.LoadLayout(\"PoorJamaahDetail\")";
mostCurrent._mainscroll.getPanel().LoadLayout("PoorJamaahDetail",mostCurrent.activityBA);
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="MainScroll.Height =100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="pengurus.Initialize";
mostCurrent._pengurus.Initialize();
RDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="SpinPengurus.DropdownBackgroundColor= Colors.Whit";
mostCurrent._spinpengurus.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/mosque/d";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/mosque/detail?id="+mostCurrent._poorjamaah._id_clicked,"LoadData",poorjamaahdetail.getObject());
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/mosque/poor";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,mostCurrent._main._server+"api/mosque/poor/store?id="+mostCurrent._poorjamaah._id_clicked,"jamaah="+mostCurrent._homejamaah._id+"&fund="+mostCurrent._edittotal.getText()+"&account="+mostCurrent._accountid+"&public="+mostCurrent._publicid,"Store",poorjamaahdetail.getObject());
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public static String  _checkguna_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkguna_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkguna_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub CheckGuna_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="If CheckGuna.Checked Then";
if (mostCurrent._checkguna.getChecked()) { 
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="End Sub";
return "";
}
public static String  _checkhamba_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkhamba_checkedchange"))
	return (String) Debug.delegate(mostCurrent.activityBA, "checkhamba_checkedchange", new Object[] {_checked});
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub CheckHamba_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="If CheckHamba.Checked Then";
if (mostCurrent._checkhamba.getChecked()) { 
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="CheckHamba.Checked = True";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="CheckGuna.Checked = False";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="publicId = False";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="CheckHamba.Checked = False";
mostCurrent._checkhamba.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="CheckGuna.Checked = True";
mostCurrent._checkguna.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="publicId = True";
mostCurrent._publicid = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=12189706;
 //BA.debugLineNum = 12189706;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _mosque = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _accountdata = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="If Job.JobName = \"Store\" Then";
if ((_job._jobname).equals("Store")) { 
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="noTransaction = root.Get(\"trx\")";
mostCurrent._notransaction = BA.ObjectToString(_root.Get((Object)("trx")));
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="Msgbox(\"Please check payment infromation for tr";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please check payment infromation for transaction #"+mostCurrent._notransaction),BA.ObjectToCharSequence("Transaction successful!"),mostCurrent.activityBA);
RDebugUtils.currentLine=11993099;
 //BA.debugLineNum = 11993099;BA.debugLine="StartActivity(HistoryJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historyjamaah.getObject()));
 }else {
RDebugUtils.currentLine=11993103;
 //BA.debugLineNum = 11993103;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11993104;
 //BA.debugLineNum = 11993104;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring());
RDebugUtils.currentLine=11993105;
 //BA.debugLineNum = 11993105;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=11993106;
 //BA.debugLineNum = 11993106;BA.debugLine="Dim mosque As Map";
_mosque = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11993107;
 //BA.debugLineNum = 11993107;BA.debugLine="mosque = root.Get(\"mosque\")";
_mosque.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_root.Get((Object)("mosque"))));
RDebugUtils.currentLine=11993109;
 //BA.debugLineNum = 11993109;BA.debugLine="NavbarTitle.Text = \"Poor People \"&mosque.Get(\"n";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Poor People "+BA.ObjectToString(_mosque.Get((Object)("name")))));
RDebugUtils.currentLine=11993110;
 //BA.debugLineNum = 11993110;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=11993112;
 //BA.debugLineNum = 11993112;BA.debugLine="account = root.Get(\"account\")";
mostCurrent._account.setObject((java.util.List)(_root.Get((Object)("account"))));
RDebugUtils.currentLine=11993114;
 //BA.debugLineNum = 11993114;BA.debugLine="If account.Size = 0 Then";
if (mostCurrent._account.getSize()==0) { 
RDebugUtils.currentLine=11993115;
 //BA.debugLineNum = 11993115;BA.debugLine="SpinPengurus.Add(\"Belum Ada Akun Rekening!\")";
mostCurrent._spinpengurus.Add("Belum Ada Akun Rekening!");
 }else {
RDebugUtils.currentLine=11993117;
 //BA.debugLineNum = 11993117;BA.debugLine="SpinPengurus.Add(\"Pilih Nomor Rekeing Pengirim";
mostCurrent._spinpengurus.Add("Pilih Nomor Rekeing Pengiriman Donasi");
RDebugUtils.currentLine=11993118;
 //BA.debugLineNum = 11993118;BA.debugLine="For i=0 To account.Size-1";
{
final int step22 = 1;
final int limit22 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
RDebugUtils.currentLine=11993119;
 //BA.debugLineNum = 11993119;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11993120;
 //BA.debugLineNum = 11993120;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=11993121;
 //BA.debugLineNum = 11993121;BA.debugLine="SpinPengurus.Add(accountData.Get(\"owner\")&\" -";
mostCurrent._spinpengurus.Add(BA.ObjectToString(_accountdata.Get((Object)("owner")))+" - "+BA.ObjectToString(_accountdata.Get((Object)("account_number")))+" ("+BA.ObjectToString(_accountdata.Get((Object)("bank")))+")");
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=11993128;
 //BA.debugLineNum = 11993128;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=11993129;
 //BA.debugLineNum = 11993129;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=11993131;
 //BA.debugLineNum = 11993131;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=11993132;
 //BA.debugLineNum = 11993132;BA.debugLine="End Sub";
return "";
}
public static String  _spinpengurus_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="poorjamaahdetail";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinpengurus_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinpengurus_itemclick", new Object[] {_position,_value});
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _accountdata = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub SpinPengurus_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="For i=0 To account.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._account.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="If SpinPengurus.SelectedIndex = i+1 Then";
if (mostCurrent._spinpengurus.getSelectedIndex()==_i+1) { 
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Dim accountData As Map";
_accountdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="accountData = account.Get(i)";
_accountdata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._account.Get(_i)));
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="accountId = accountData.Get(\"id\")";
mostCurrent._accountid = BA.ObjectToString(_accountdata.Get((Object)("id")));
 };
 }
};
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="End Sub";
return "";
}
}