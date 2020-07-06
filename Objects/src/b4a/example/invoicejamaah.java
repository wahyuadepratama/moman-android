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

public class invoicejamaah extends Activity implements B4AActivity{
	public static invoicejamaah mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.invoicejamaah");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (invoicejamaah).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.invoicejamaah");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.invoicejamaah", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (invoicejamaah) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (invoicejamaah) Resume **");
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
		return invoicejamaah.class;
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
        BA.LogInfo("** Activity (invoicejamaah) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (invoicejamaah) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panelpaidinfo = null;
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
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="invoicejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="MainScroll.Panel.LoadLayout(\"ConfirmationDonation";
mostCurrent._mainscroll.getPanel().LoadLayout("ConfirmationDonationJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="MainScroll.Panel.Height= PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="invoicejamaah";
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="invoicejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/history/";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/history/detail?id="+mostCurrent._historyjamaah._idselected,"LoadData",invoicejamaah.getObject());
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfirm_click() throws Exception{
RDebugUtils.currentModule="invoicejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfirm_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnconfirm_click", null);
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub BtnConfirm_Click";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="StartActivity(HistoryJamaah)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._historyjamaah.getObject()));
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="invoicejamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.Map _b = null;
anywheresoftware.b4a.objects.collections.Map _account = null;
anywheresoftware.b4a.objects.collections.Map _donation = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=13238284;
 //BA.debugLineNum = 13238284;BA.debugLine="Try";
try {RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="If HistoryJamaah.statusSelected = \"true\" Then";
if ((mostCurrent._historyjamaah._statusselected).equals("true")) { 
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="a = parser.NextObject";
_a = _parser.NextObject();
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="NavbarTitle.Text = \"Transaction #\"&a.Get(\"id";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Transaction #"+BA.ObjectToString(_a.Get((Object)("id")))));
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="Label1.Text = \"Invoice Pembayaran #\"&a.Get(\"";
mostCurrent._label1.setText(BA.ObjectToCharSequence("Invoice Pembayaran #"+BA.ObjectToString(_a.Get((Object)("id")))));
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="Label2.Text = a.Get(\"datetime\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(_a.Get((Object)("datetime"))));
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="If a.Get(\"status_out\") = \"project\" Then";
if ((_a.Get((Object)("status_out"))).equals((Object)("project"))) { 
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="Label4.Text = \"Infaq Mosque Development\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Mosque Development"));
 }else 
{RDebugUtils.currentLine=13238297;
 //BA.debugLineNum = 13238297;BA.debugLine="Else If a.Get(\"status_out\") = \"orphanage\" Th";
if ((_a.Get((Object)("status_out"))).equals((Object)("orphanage"))) { 
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="Label4.Text = \"Infaq Orphans\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Orphans"));
 }else 
{RDebugUtils.currentLine=13238299;
 //BA.debugLineNum = 13238299;BA.debugLine="Else If a.Get(\"status_out\") = \"tpa\" Then";
if ((_a.Get((Object)("status_out"))).equals((Object)("tpa"))) { 
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="Label4.Text = \"Infaq TPA/MDA\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq TPA/MDA"));
 }else 
{RDebugUtils.currentLine=13238301;
 //BA.debugLineNum = 13238301;BA.debugLine="Else If a.Get(\"status_out\") = \"poor\" Then";
if ((_a.Get((Object)("status_out"))).equals((Object)("poor"))) { 
RDebugUtils.currentLine=13238302;
 //BA.debugLineNum = 13238302;BA.debugLine="Label4.Text = \"Infaq Poor\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Poor"));
 }}}}
;
RDebugUtils.currentLine=13238305;
 //BA.debugLineNum = 13238305;BA.debugLine="Label12.Text = \"Payment Success (Confirmed)\"";
mostCurrent._label12.setText(BA.ObjectToCharSequence("Payment Success (Confirmed)"));
RDebugUtils.currentLine=13238306;
 //BA.debugLineNum = 13238306;BA.debugLine="Label10.Text = a.Get(\"fund\")";
mostCurrent._label10.setText(BA.ObjectToCharSequence(_a.Get((Object)("fund"))));
RDebugUtils.currentLine=13238307;
 //BA.debugLineNum = 13238307;BA.debugLine="Label5.Text = \"Mosque\"";
mostCurrent._label5.setText(BA.ObjectToCharSequence("Mosque"));
RDebugUtils.currentLine=13238308;
 //BA.debugLineNum = 13238308;BA.debugLine="Label6.Text = a.Get(\"mosque_name\")";
mostCurrent._label6.setText(BA.ObjectToCharSequence(_a.Get((Object)("mosque_name"))));
RDebugUtils.currentLine=13238309;
 //BA.debugLineNum = 13238309;BA.debugLine="Label7.Text = \"Donatur\"";
mostCurrent._label7.setText(BA.ObjectToCharSequence("Donatur"));
RDebugUtils.currentLine=13238310;
 //BA.debugLineNum = 13238310;BA.debugLine="Label8.Text = HomeJamaah.username";
mostCurrent._label8.setText(BA.ObjectToCharSequence(mostCurrent._homejamaah._username));
RDebugUtils.currentLine=13238311;
 //BA.debugLineNum = 13238311;BA.debugLine="Note.Visible = False";
mostCurrent._note.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=13238313;
 //BA.debugLineNum = 13238313;BA.debugLine="Dim b As Map";
_b = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238314;
 //BA.debugLineNum = 13238314;BA.debugLine="b = parser.NextObject";
_b = _parser.NextObject();
RDebugUtils.currentLine=13238316;
 //BA.debugLineNum = 13238316;BA.debugLine="Dim account As Map";
_account = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238317;
 //BA.debugLineNum = 13238317;BA.debugLine="account = b.Get(\"account\")";
_account.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.Get((Object)("account"))));
RDebugUtils.currentLine=13238319;
 //BA.debugLineNum = 13238319;BA.debugLine="Dim donation As Map";
_donation = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13238320;
 //BA.debugLineNum = 13238320;BA.debugLine="donation = b.Get(\"donation\")";
_donation.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.Get((Object)("donation"))));
RDebugUtils.currentLine=13238322;
 //BA.debugLineNum = 13238322;BA.debugLine="NavbarTitle.Text = \"Transaction #\"&donation.";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Transaction #"+BA.ObjectToString(_donation.Get((Object)("id")))));
RDebugUtils.currentLine=13238323;
 //BA.debugLineNum = 13238323;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=13238325;
 //BA.debugLineNum = 13238325;BA.debugLine="Label1.Text = \"Invoice Payment #\"&donation.G";
mostCurrent._label1.setText(BA.ObjectToCharSequence("Invoice Payment #"+BA.ObjectToString(_donation.Get((Object)("id")))));
RDebugUtils.currentLine=13238326;
 //BA.debugLineNum = 13238326;BA.debugLine="Label2.Text = donation.Get(\"datetime\")";
mostCurrent._label2.setText(BA.ObjectToCharSequence(_donation.Get((Object)("datetime"))));
RDebugUtils.currentLine=13238328;
 //BA.debugLineNum = 13238328;BA.debugLine="If donation.Get(\"status_out\") = \"project\" Th";
if ((_donation.Get((Object)("status_out"))).equals((Object)("project"))) { 
RDebugUtils.currentLine=13238329;
 //BA.debugLineNum = 13238329;BA.debugLine="Label4.Text = \"Infaq Mosque Development\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Mosque Development"));
 }else 
{RDebugUtils.currentLine=13238330;
 //BA.debugLineNum = 13238330;BA.debugLine="Else If donation.Get(\"status_out\") = \"orphan";
if ((_donation.Get((Object)("status_out"))).equals((Object)("orphanage"))) { 
RDebugUtils.currentLine=13238331;
 //BA.debugLineNum = 13238331;BA.debugLine="Label4.Text = \"Infaq Orphans\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Orphans"));
 }else 
{RDebugUtils.currentLine=13238332;
 //BA.debugLineNum = 13238332;BA.debugLine="Else If donation.Get(\"status_out\") = \"tpa\" T";
if ((_donation.Get((Object)("status_out"))).equals((Object)("tpa"))) { 
RDebugUtils.currentLine=13238333;
 //BA.debugLineNum = 13238333;BA.debugLine="Label4.Text = \"Infaq TPA/MDA\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq TPA/MDA"));
 }else 
{RDebugUtils.currentLine=13238334;
 //BA.debugLineNum = 13238334;BA.debugLine="Else If donation.Get(\"status_out\") = \"poor\"";
if ((_donation.Get((Object)("status_out"))).equals((Object)("poor"))) { 
RDebugUtils.currentLine=13238335;
 //BA.debugLineNum = 13238335;BA.debugLine="Label4.Text = \"Infaq Poor\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Infaq Poor"));
 }}}}
;
RDebugUtils.currentLine=13238338;
 //BA.debugLineNum = 13238338;BA.debugLine="Label12.Text = \"Waiting Confirmation\"";
mostCurrent._label12.setText(BA.ObjectToCharSequence("Waiting Confirmation"));
RDebugUtils.currentLine=13238339;
 //BA.debugLineNum = 13238339;BA.debugLine="Label10.Text = donation.Get(\"fund\")";
mostCurrent._label10.setText(BA.ObjectToCharSequence(_donation.Get((Object)("fund"))));
RDebugUtils.currentLine=13238340;
 //BA.debugLineNum = 13238340;BA.debugLine="Label6.Text = account.Get(\"owner\")";
mostCurrent._label6.setText(BA.ObjectToCharSequence(_account.Get((Object)("owner"))));
RDebugUtils.currentLine=13238341;
 //BA.debugLineNum = 13238341;BA.debugLine="Label8.Text = account.Get(\"account_number\")&";
mostCurrent._label8.setText(BA.ObjectToCharSequence(BA.ObjectToString(_account.Get((Object)("account_number")))+" ("+BA.ObjectToString(_account.Get((Object)("bank")))+")"));
RDebugUtils.currentLine=13238342;
 //BA.debugLineNum = 13238342;BA.debugLine="Note.Text = \"Note: Please confirmation your";
mostCurrent._note.setText(BA.ObjectToCharSequence("Note: Please confirmation your payment to mosque's stewardship number: "+BA.ObjectToString(_account.Get((Object)("whatsapp")))+" (Whatsapp)"));
 };
 } 
       catch (Exception e59) {
			processBA.setLastException(e59);RDebugUtils.currentLine=13238346;
 //BA.debugLineNum = 13238346;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=13238351;
 //BA.debugLineNum = 13238351;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=13238352;
 //BA.debugLineNum = 13238352;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=13238354;
 //BA.debugLineNum = 13238354;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=13238355;
 //BA.debugLineNum = 13238355;BA.debugLine="End Sub";
return "";
}
}