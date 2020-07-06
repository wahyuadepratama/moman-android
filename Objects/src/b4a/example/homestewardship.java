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

public class homestewardship extends Activity implements B4AActivity{
	public static homestewardship mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.homestewardship");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homestewardship).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.homestewardship");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.homestewardship", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homestewardship) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homestewardship) Resume **");
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
		return homestewardship.class;
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
        BA.LogInfo("** Activity (homestewardship) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (homestewardship) Resume **");
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
public static String _id = "";
public static String _account = "";
public static String _worship = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnumber = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeluser = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _panelphoto = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnorekening1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnorekening2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _profile = null;
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
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
mostCurrent._activity.LoadLayout("BottomNavigation",mostCurrent.activityBA);
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeStewardship\")";
mostCurrent._mainscroll.getPanel().LoadLayout("HomeStewardship",mostCurrent.activityBA);
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Profile.SetBackgroundImage(LoadBitmap(File.DirAss";
mostCurrent._profile.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"user_green.png").getObject()));
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homestewardship";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/_users\",\"id";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,mostCurrent._main._server+"api/_users","id="+mostCurrent._main._manager.GetString("id"),"LoadData",homestewardship.getObject());
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return "";
}
public static String  _donation_click() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "donation_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "donation_click", null);
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Donation_Click";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="StartActivity(DonationStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._donationstewardship.getObject()));
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.Map _b = null;
String _path = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.Log("JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success));
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Try";
try {RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="a = parser.NextObject";
_a = _parser.NextObject();
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="id = Main.manager.GetString(\"id\")";
_id = mostCurrent._main._manager.GetString("id");
RDebugUtils.currentLine=7012365;
 //BA.debugLineNum = 7012365;BA.debugLine="LabelName.Text = a.Get(\"username\")";
mostCurrent._labelname.setText(BA.ObjectToCharSequence(_a.Get((Object)("username"))));
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="LabelNumber.Text = a.Get(\"phone\")";
mostCurrent._labelnumber.setText(BA.ObjectToCharSequence(_a.Get((Object)("phone"))));
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="LabelUser.Text = \"Stewardship \"&a.Get(\"worshi";
mostCurrent._labeluser.setText(BA.ObjectToCharSequence("Stewardship "+BA.ObjectToString(_a.Get((Object)("worship_name")))));
RDebugUtils.currentLine=7012368;
 //BA.debugLineNum = 7012368;BA.debugLine="worship = a.Get(\"worship_id\")";
_worship = BA.ObjectToString(_a.Get((Object)("worship_id")));
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="Dim data As List : data.Initialize";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7012370;
 //BA.debugLineNum = 7012370;BA.debugLine="Dim data As List : data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=7012371;
 //BA.debugLineNum = 7012371;BA.debugLine="data = a.Get(\"account\")";
_data.setObject((java.util.List)(_a.Get((Object)("account"))));
RDebugUtils.currentLine=7012372;
 //BA.debugLineNum = 7012372;BA.debugLine="Dim b As Map";
_b = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7012373;
 //BA.debugLineNum = 7012373;BA.debugLine="b = data.Get(0)";
_b.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data.Get((int) (0))));
RDebugUtils.currentLine=7012375;
 //BA.debugLineNum = 7012375;BA.debugLine="LabelNoRekening1.Text = \"- \"&b.Get(\"account_n";
mostCurrent._labelnorekening1.setText(BA.ObjectToCharSequence("- "+BA.ObjectToString(_b.Get((Object)("account_number")))+" ("+BA.ObjectToString(_b.Get((Object)("bank")))+")"));
RDebugUtils.currentLine=7012377;
 //BA.debugLineNum = 7012377;BA.debugLine="Dim path As String = \"\"&Main.server&\"images/a";
_path = ""+mostCurrent._main._server+"images/avatar/"+BA.ObjectToString(_a.Get((Object)("avatar")));
RDebugUtils.currentLine=7012378;
 //BA.debugLineNum = 7012378;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7012379;
 //BA.debugLineNum = 7012379;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7012380;
 //BA.debugLineNum = 7012380;BA.debugLine="m.Put(PanelPhoto,path)";
_m.Put((Object)(mostCurrent._panelphoto.getObject()),(Object)(_path));
RDebugUtils.currentLine=7012381;
 //BA.debugLineNum = 7012381;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_m));
 } 
       catch (Exception e29) {
			processBA.setLastException(e29);RDebugUtils.currentLine=7012383;
 //BA.debugLineNum = 7012383;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=7012384;
 //BA.debugLineNum = 7012384;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Wrong username or password"),BA.ObjectToCharSequence("Login Failed"),mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=7012388;
 //BA.debugLineNum = 7012388;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=7012389;
 //BA.debugLineNum = 7012389;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7012391;
 //BA.debugLineNum = 7012391;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=7012392;
 //BA.debugLineNum = 7012392;BA.debugLine="End Sub";
return "";
}
public static String  _logout_click() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "logout_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "logout_click", null);
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Logout_Click";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Main.manager.ClearAll";
mostCurrent._main._manager.ClearAll();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="End Sub";
return "";
}
public static String  _profile_click() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "profile_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "profile_click", null);
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Profile_Click";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public static String  _qurban_click() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "qurban_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "qurban_click", null);
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub Qurban_Click";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="StartActivity(QurbanStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanstewardship.getObject()));
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public static String  _web_click() throws Exception{
RDebugUtils.currentModule="homestewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "web_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "web_click", null);
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub Web_Click";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="StartActivity(WebView)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._webview.getObject()));
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return "";
}
}