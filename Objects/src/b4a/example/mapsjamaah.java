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

public class mapsjamaah extends Activity implements B4AActivity{
	public static mapsjamaah mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.mapsjamaah");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsjamaah).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.mapsjamaah");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.mapsjamaah", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsjamaah) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsjamaah) Resume **");
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
		return mapsjamaah.class;
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
        BA.LogInfo("** Activity (mapsjamaah) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (mapsjamaah) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panelmaps = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public uk.co.martinpearman.b4a.webviewsettings.WebViewSettings _mywebviewsetting = null;
public anywheresoftware.b4a.objects.collections.Map _events = null;
public anywheresoftware.b4a.objects.collections.Map _facilities = null;
public anywheresoftware.b4a.objects.collections.Map _capacities = null;
public anywheresoftware.b4a.objects.collections.Map _parking = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editname = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spincapacity = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinevent = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinfacility = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinparking = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsearch = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
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
RDebugUtils.currentModule="mapsjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsJamaah\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsJamaah",mostCurrent.activityBA);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="MainScroll.Panel.Height = PanelMaps.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelmaps.getHeight());
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
mostCurrent._mainscroll.setHeight((int) (anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA)-mostCurrent._mainscroll.getTop()));
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="WebView1.JavaScriptEnabled=True";
mostCurrent._webview1.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="WebView1.LoadUrl(Main.server&\"api/maps?search=nof";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"api/maps?search=nofilter&lat="+mostCurrent._starter._lat+"&lang="+mostCurrent._starter._lang);
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="NavbarTitle.Text = \"Maps\"";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Maps"));
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=7536654;
 //BA.debugLineNum = 7536654;BA.debugLine="events.Initialize";
mostCurrent._events.Initialize();
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="facilities.Initialize";
mostCurrent._facilities.Initialize();
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="capacities.Initialize";
mostCurrent._capacities.Initialize();
RDebugUtils.currentLine=7536657;
 //BA.debugLineNum = 7536657;BA.debugLine="parking.Initialize";
mostCurrent._parking.Initialize();
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="SpinCapacity.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spincapacity.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7536659;
 //BA.debugLineNum = 7536659;BA.debugLine="SpinFacility.DropdownBackgroundColor = Colors.Whi";
mostCurrent._spinfacility.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="SpinEvent.DropdownBackgroundColor = Colors.White";
mostCurrent._spinevent.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7536661;
 //BA.debugLineNum = 7536661;BA.debugLine="SpinParking.DropdownBackgroundColor = Colors.Whit";
mostCurrent._spinparking.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7536662;
 //BA.debugLineNum = 7536662;BA.debugLine="CodeSemua.SetBackgroundTintList(EditName, Colors.";
mostCurrent._codesemua._setbackgroundtintlist(mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._editname.getObject())),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=7536663;
 //BA.debugLineNum = 7536663;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsjamaah";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._starter.getObject()),"StopGPS");
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.mapsjamaah parent) {
this.parent = parent;
}
b4a.example.mapsjamaah parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsjamaah";
Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/getfacil";
parent.mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,parent.mostCurrent._main._server+"api/getfacility","LoadData",mapsjamaah.getObject());
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="SpinCapacity.Add(\"All Capacity\")";
parent.mostCurrent._spincapacity.Add("All Capacity");
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="SpinCapacity.Add(\"0 - 100\")";
parent.mostCurrent._spincapacity.Add("0 - 100");
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="SpinCapacity.Add(\"100 - 300\")";
parent.mostCurrent._spincapacity.Add("100 - 300");
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="SpinCapacity.Add(\"300 - 500\")";
parent.mostCurrent._spincapacity.Add("300 - 500");
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="SpinCapacity.Add(\"> 500\")";
parent.mostCurrent._spincapacity.Add("> 500");
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="SpinEvent.Add(\"All Worship Place\")";
parent.mostCurrent._spinevent.Add("All Worship Place");
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="SpinEvent.Add(\"Masjid\")";
parent.mostCurrent._spinevent.Add("Masjid");
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="SpinEvent.Add(\"Mushalla\")";
parent.mostCurrent._spinevent.Add("Mushalla");
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="SpinParking.Add(\"All Parking Area\")";
parent.mostCurrent._spinparking.Add("All Parking Area");
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="SpinParking.Add(\"0 - 50\")";
parent.mostCurrent._spinparking.Add("0 - 50");
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="SpinParking.Add(\"50 - 100\")";
parent.mostCurrent._spinparking.Add("50 - 100");
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="SpinParking.Add(\"100 - 200\")";
parent.mostCurrent._spinparking.Add("100 - 200");
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="SpinParking.Add(\"> 200\")";
parent.mostCurrent._spinparking.Add("> 200");
RDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent._starter._gps1.getGPSEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please enable the GPS device."),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._starter._gps1.getLocationSettingsIntent()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
parent.mostCurrent._starter._rp.CheckAndRequest(processBA,parent.mostCurrent._starter._rp.PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
if (true) break;

case 6:
//if
this.state = 11;
if (_result) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._starter.getObject()),"StartGPS");
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=7602204;
 //BA.debugLineNum = 7602204;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnsearch_click() throws Exception{
RDebugUtils.currentModule="mapsjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsearch_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "btnsearch_click", null);
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub btnSearch_Click";
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Log(Main.server&\"api/maps?search=filter&name=\"&Ed";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._main._server+"api/maps?search=filter&name="+mostCurrent._editname.getText()+"&type="+BA.NumberToString(mostCurrent._spinevent.getSelectedIndex())+"&park="+BA.NumberToString(mostCurrent._spinparking.getSelectedIndex())+"&capacity="+BA.NumberToString(mostCurrent._spincapacity.getSelectedIndex())+"&lat="+mostCurrent._starter._lat+"&lang="+mostCurrent._starter._lang);
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="MyWebViewSetting.setLoadWithOverviewMode(WebView1";
mostCurrent._mywebviewsetting.setLoadWithOverviewMode((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="MyWebViewSetting.setUseWideViewPort(WebView1, Tru";
mostCurrent._mywebviewsetting.setUseWideViewPort((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="MyWebViewSetting.setSupportZoom(WebView1, True)";
mostCurrent._mywebviewsetting.setSupportZoom((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="MyWebViewSetting.setDefaultTextEncodingName(WebVi";
mostCurrent._mywebviewsetting.setDefaultTextEncodingName((android.webkit.WebView)(mostCurrent._webview1.getObject()),"utf-8");
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="MyWebViewSetting.setPluginState(WebView1, \"ON\")";
mostCurrent._mywebviewsetting.setPluginState((android.webkit.WebView)(mostCurrent._webview1.getObject()),"ON");
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="MyWebViewSetting.getDOMStorageEnabled(WebView1)";
mostCurrent._mywebviewsetting.getDOMStorageEnabled((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="MyWebViewSetting.getLoadsImagesAutomatically(WebV";
mostCurrent._mywebviewsetting.getLoadsImagesAutomatically((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="MyWebViewSetting.setGeolocationEnabled(WebView1,";
mostCurrent._mywebviewsetting.setGeolocationEnabled((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="MyWebViewSetting.getCacheMode(WebView1)";
mostCurrent._mywebviewsetting.getCacheMode((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="MyWebViewSetting.getAllowFileAccess(WebView1)";
mostCurrent._mywebviewsetting.getAllowFileAccess((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798800;
 //BA.debugLineNum = 7798800;BA.debugLine="MyWebViewSetting.getLightTouchEnabled(WebView1)";
mostCurrent._mywebviewsetting.getLightTouchEnabled((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="MyWebViewSetting.getSaveFormData(WebView1)";
mostCurrent._mywebviewsetting.getSaveFormData((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="MyWebViewSetting.getSavePassword(WebView1)";
mostCurrent._mywebviewsetting.getSavePassword((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="MyWebViewSetting.getUserAgentString(WebView1)";
mostCurrent._mywebviewsetting.getUserAgentString((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="MyWebViewSetting.getUseWideViewPort(WebView1)";
mostCurrent._mywebviewsetting.getUseWideViewPort((android.webkit.WebView)(mostCurrent._webview1.getObject()));
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="MyWebViewSetting.setAllowFileAccess(WebView1, Tru";
mostCurrent._mywebviewsetting.setAllowFileAccess((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="MyWebViewSetting.setAppCacheEnabled(WebView1, Tru";
mostCurrent._mywebviewsetting.setAppCacheEnabled((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="MyWebViewSetting.setMediaPlaybackRequiresUserGest";
mostCurrent._mywebviewsetting.setMediaPlaybackRequiresUserGesture((android.webkit.WebView)(mostCurrent._webview1.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798808;
 //BA.debugLineNum = 7798808;BA.debugLine="WebView1.LoadUrl(Main.server&\"api/maps?search=fil";
mostCurrent._webview1.LoadUrl(mostCurrent._main._server+"api/maps?search=filter&name="+mostCurrent._editname.getText()+"&type="+BA.NumberToString(mostCurrent._spinevent.getSelectedIndex())+"&park="+BA.NumberToString(mostCurrent._spinparking.getSelectedIndex())+"&capacity="+BA.NumberToString(mostCurrent._spincapacity.getSelectedIndex())+"&lat="+mostCurrent._starter._lat+"&lang="+mostCurrent._starter._lang);
RDebugUtils.currentLine=7798809;
 //BA.debugLineNum = 7798809;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="mapsjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data_list = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _facilitydata = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Dim data_list As List";
_data_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="data_list = parser.NextArray";
_data_list = _parser.NextArray();
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="SpinFacility.Add(\"All Facility\")";
mostCurrent._spinfacility.Add("All Facility");
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="For i=0 To data_list.Size-1";
{
final int step9 = 1;
final int limit9 = (int) (_data_list.getSize()-1);
_i = (int) (0) ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Dim facilityData As Map";
_facilitydata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="facilityData = data_list.Get(i)";
_facilitydata.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data_list.Get(_i)));
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="SpinFacility.Add(facilityData.Get(\"name\"))";
mostCurrent._spinfacility.Add(BA.ObjectToString(_facilitydata.Get((Object)("name"))));
 }
};
 }else {
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7733270;
 //BA.debugLineNum = 7733270;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="End Sub";
return "";
}
public static String  _mywebview_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="mapsjamaah";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mywebview_pagefinished"))
	return (String) Debug.delegate(mostCurrent.activityBA, "mywebview_pagefinished", new Object[] {_url});
anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub myWebView_PageFinished (Url As String)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim Obj1 As Reflector";
_obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Obj1.Target=WebView1";
_obj1.Target = (Object)(mostCurrent._webview1.getObject());
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="Obj1.RunMethod2(\"addJavascriptInterface\", \"myNewJ";
_obj1.RunMethod2("addJavascriptInterface","myNewJSMethod","java.lang.String");
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="End Sub";
return "";
}
}