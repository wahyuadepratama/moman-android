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

public class homejamaah extends Activity implements B4AActivity{
	public static homejamaah mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.homejamaah");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (homejamaah).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.homejamaah");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.homejamaah", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (homejamaah) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (homejamaah) Resume **");
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
		return homejamaah.class;
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
        BA.LogInfo("** Activity (homejamaah) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (homejamaah) Resume **");
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
public static String _username = "";
public static String _phone = "";
public static String _status = "";
public static String _id = "";
public static String _worship_name = "";
public static String _types = "";
public static String _address = "";
public static String _updated_at = "";
public static String _avatar = "";
public static String _worship_place_address = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelhome = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelname = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnumber = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeluser = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _backbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mapbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qurbanbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _constructionbtn = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _panelphoto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _orphanbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _tpabtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _poorbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _historybtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _logoutbtn = null;
public anywheresoftware.b4a.objects.LabelWrapper _historylabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _logoutlabel = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelbanner = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
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
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="MainScroll.Panel.LoadLayout(\"HomeJamaah\")";
mostCurrent._mainscroll.getPanel().LoadLayout("HomeJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="PanelMenu.Height = logoutLabel.Top+logoutLabel.He";
mostCurrent._panelmenu.setHeight((int) (mostCurrent._logoutlabel.getTop()+mostCurrent._logoutlabel.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA)));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="PanelHome.Height= PanelMenu.Height + 50%y";
mostCurrent._panelhome.setHeight((int) (mostCurrent._panelmenu.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (50),mostCurrent.activityBA)));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="MainScroll.Height=100%y-Navbar.Height";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="MainScroll.Panel.Height = PanelHome.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelhome.getHeight());
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="NavbarTitle.Text=\"Home Jamaah\"";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Home Jamaah"));
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="NavbarTitle.TextSize = 22";
mostCurrent._navbartitle.setTextSize((float) (22));
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="NavbarTitle.Left=4%x";
mostCurrent._navbartitle.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="BackBtn.Visible = False";
mostCurrent._backbtn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="homejamaah";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="CodeSemua.ExecuteUrl(Main.server&\"api/_users\",\"id";
mostCurrent._codesemua._executeurl(mostCurrent.activityBA,mostCurrent._main._server+"api/_users","id="+mostCurrent._main._manager.GetString("id"),"LoadData",homejamaah.getObject());
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _constructionbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "constructionbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "constructionbtn_click", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub constructionBtn_Click";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="StartActivity(DonationJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._donationjamaah.getObject()));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _historybtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "historybtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "historybtn_click", null);
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub historyBtn_Click";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="StartActivity(HistoryJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historyjamaah.getObject()));
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
String _path = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.Log("JobName = "+_job._jobname+", Success = "+BA.ObjectToString(_job._success));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Log(\"Response from server :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Try";
try {RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="a = parser.NextObject";
_a = _parser.NextObject();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="id = Main.manager.GetString(\"id\")";
_id = mostCurrent._main._manager.GetString("id");
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="username = a.Get(\"username\")";
_username = BA.ObjectToString(_a.Get((Object)("username")));
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="phone = a.Get(\"phone\")";
_phone = BA.ObjectToString(_a.Get((Object)("phone")));
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="status = a.Get(\"status\")";
_status = BA.ObjectToString(_a.Get((Object)("status")));
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="LabelName.TextColor = Colors.Black";
mostCurrent._labelname.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="LabelNumber.TextColor = Colors.Black";
mostCurrent._labelnumber.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="LabelUser.TextColor = Colors.Black";
mostCurrent._labeluser.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2162710;
 //BA.debugLineNum = 2162710;BA.debugLine="LabelName.Text = username";
mostCurrent._labelname.setText(BA.ObjectToCharSequence(_username));
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="LabelNumber.Text = \"Jamaah \"&a.Get(\"worship_n";
mostCurrent._labelnumber.setText(BA.ObjectToCharSequence("Jamaah "+BA.ObjectToString(_a.Get((Object)("worship_name")))));
RDebugUtils.currentLine=2162712;
 //BA.debugLineNum = 2162712;BA.debugLine="LabelUser.Text = phone";
mostCurrent._labeluser.setText(BA.ObjectToCharSequence(_phone));
RDebugUtils.currentLine=2162715;
 //BA.debugLineNum = 2162715;BA.debugLine="Dim path As String = \"\"&Main.server&\"images/a";
_path = ""+mostCurrent._main._server+"images/avatar/"+BA.ObjectToString(_a.Get((Object)("avatar")));
RDebugUtils.currentLine=2162716;
 //BA.debugLineNum = 2162716;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2162717;
 //BA.debugLineNum = 2162717;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=2162718;
 //BA.debugLineNum = 2162718;BA.debugLine="m.Put(PanelPhoto,path)";
_m.Put((Object)(mostCurrent._panelphoto.getObject()),(Object)(_path));
RDebugUtils.currentLine=2162719;
 //BA.debugLineNum = 2162719;BA.debugLine="CallSubDelayed2(Starter, \"Download\", m)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_m));
 } 
       catch (Exception e29) {
			processBA.setLastException(e29);RDebugUtils.currentLine=2162722;
 //BA.debugLineNum = 2162722;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=2162723;
 //BA.debugLineNum = 2162723;BA.debugLine="Msgbox(\"Wrong username or password\",\"Login Fa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Wrong username or password"),BA.ObjectToCharSequence("Login Failed"),mostCurrent.activityBA);
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=2162727;
 //BA.debugLineNum = 2162727;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=2162728;
 //BA.debugLineNum = 2162728;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=2162730;
 //BA.debugLineNum = 2162730;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=2162731;
 //BA.debugLineNum = 2162731;BA.debugLine="End Sub";
return "";
}
public static String  _logoutbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "logoutbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "logoutbtn_click", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub logoutBtn_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Main.manager.ClearAll";
mostCurrent._main._manager.ClearAll();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static String  _mapbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "mapbtn_click", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub mapBtn_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="StartActivity(MapsJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._mapsjamaah.getObject()));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public static String  _orphanbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "orphanbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "orphanbtn_click", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub orphanBtn_Click";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="StartActivity(OrphansJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._orphansjamaah.getObject()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return "";
}
public static String  _poorbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "poorbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "poorbtn_click", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub poorBtn_Click";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="StartActivity(PoorJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._poorjamaah.getObject()));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _qurbanbtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "qurbanbtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "qurbanbtn_click", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub qurbanBtn_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="StartActivity(QurbanJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanjamaah.getObject()));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return "";
}
public static String  _tpabtn_click() throws Exception{
RDebugUtils.currentModule="homejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tpabtn_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tpabtn_click", null);
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub tpaBtn_Click";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="StartActivity(InvoiceJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._invoicejamaah.getObject()));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
}