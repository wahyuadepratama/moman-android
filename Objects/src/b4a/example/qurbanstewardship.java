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

public class qurbanstewardship extends Activity implements B4AActivity{
	public static qurbanstewardship mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.qurbanstewardship");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (qurbanstewardship).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.qurbanstewardship");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.qurbanstewardship", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (qurbanstewardship) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (qurbanstewardship) Resume **");
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
		return qurbanstewardship.class;
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
        BA.LogInfo("** Activity (qurbanstewardship) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (qurbanstewardship) Resume **");
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
public static String _idworshipplace = "";
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelqurban = null;
public anywheresoftware.b4a.objects.LabelWrapper _navbartitle = null;
public b4a.example3.customlistview _clv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panellistitem = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _projectname = null;
public anywheresoftware.b4a.objects.LabelWrapper _idpro = null;
public anywheresoftware.b4a.objects.LabelWrapper _fundneed = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _fundcollect = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _worshipplace = null;
public anywheresoftware.b4a.objects.LabelWrapper _idworship = null;
public anywheresoftware.b4a.objects.LabelWrapper _ldatetime = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndonationhere = null;
public anywheresoftware.b4a.objects.ButtonWrapper _qurban = null;
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
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
mostCurrent._activity.LoadLayout("BottomNavigation",mostCurrent.activityBA);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
mostCurrent._mainscroll.getPanel().LoadLayout("List",mostCurrent.activityBA);
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="MainScroll.Height = 100%y";
mostCurrent._mainscroll.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="NavbarTitle.Text=\"Qurban Confirmation\"";
mostCurrent._navbartitle.setText(BA.ObjectToCharSequence("Qurban Confirmation"));
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="NavbarTitle.TextSize = 20";
mostCurrent._navbartitle.setTextSize((float) (20));
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Qurban.SetBackgroundImage(LoadBitmap(File.DirAsse";
mostCurrent._qurban.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cow_green.png").getObject()));
RDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="CLV.Clear";
mostCurrent._clv._clear();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/qurban/c";
mostCurrent._codesemua._executeurlget(mostCurrent.activityBA,mostCurrent._main._server+"api/qurban/confirmation?id="+mostCurrent._homestewardship._worship,"LoadData",qurbanstewardship.getObject());
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return "";
}
public static String  _clv_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clv_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "clv_itemclick", new Object[] {_index,_value});
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub CLV_ItemClick (Index As Int, Value As Object)";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
_item = mostCurrent._clv._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="p = CLV.GetPanel(item)";
_p = mostCurrent._clv._getpanel(_item);
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
_idselected = _a.GetView((int) (0)).GetView((int) (5)).getText();
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="Log(idSelected)";
anywheresoftware.b4a.keywords.Common.Log(_idselected);
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanstewardshipdetail.getObject()));
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createitem(int _width,String _id,String _from,String _donation,String _total,String _datetimes,String _status) throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createitem", new Object[] {_width,_id,_from,_donation,_total,_datetimes,_status});
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub CreateItem(Width As Int, id As String,";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, Width, 30%y)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (30),mostCurrent.activityBA));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="p.LoadLayout(\"ListQurbanConfirmation\")";
_p.LoadLayout("ListQurbanConfirmation",mostCurrent.activityBA);
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="ProjectName.Text = \"Qurban \"&Donation";
mostCurrent._projectname.setText(BA.ObjectToCharSequence("Qurban "+_donation));
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="IDpro.Text = id";
mostCurrent._idpro.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="FundNeed.Text = \"From : \"&from";
mostCurrent._fundneed.setText(BA.ObjectToCharSequence("From : "+_from));
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="WorshipPlace.Text = \"Datetime : \"&datetimes";
mostCurrent._worshipplace.setText(BA.ObjectToCharSequence("Datetime : "+_datetimes));
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="If Donation = \"project\" Then";
if ((_donation).equals("project")) { 
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="FundCollect.Text = \"Donation : Infaq Mosque Deve";
mostCurrent._fundcollect.setText(BA.ObjectToCharSequence("Donation : Infaq Mosque Development ("+_total+")"));
 }else 
{RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Else If Donation = \"orphanage\" Then";
if ((_donation).equals("orphanage")) { 
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="FundCollect.Text = \"Donation : Infaq Orphans (\"&";
mostCurrent._fundcollect.setText(BA.ObjectToCharSequence("Donation : Infaq Orphans ("+_total+")"));
 }else 
{RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Else If Donation = \"tpa\" Then";
if ((_donation).equals("tpa")) { 
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="FundCollect.Text = \"Donation : Infaq TPA/MDA (\"&";
mostCurrent._fundcollect.setText(BA.ObjectToCharSequence("Donation : Infaq TPA/MDA ("+_total+")"));
 }else 
{RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="Else If Donation = \"poor\" Then";
if ((_donation).equals("poor")) { 
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="FundCollect.Text = \"Donation : Infaq Poor (\"&tot";
mostCurrent._fundcollect.setText(BA.ObjectToCharSequence("Donation : Infaq Poor ("+_total+")"));
 }else {
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="FundCollect.Text = \"Qurban : \"&Donation&\" (\"&tot";
mostCurrent._fundcollect.setText(BA.ObjectToCharSequence("Qurban : "+_donation+" ("+_total+")"));
 }}}}
;
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="If status = False Then";
if ((_status).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=7733272;
 //BA.debugLineNum = 7733272;BA.debugLine="LDatetime.Text = \"Status: Checking\"";
mostCurrent._ldatetime.setText(BA.ObjectToCharSequence("Status: Checking"));
RDebugUtils.currentLine=7733273;
 //BA.debugLineNum = 7733273;BA.debugLine="LDatetime.TextColor = Colors.Red";
mostCurrent._ldatetime.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=7733275;
 //BA.debugLineNum = 7733275;BA.debugLine="LDatetime.Text = \"Status: Confirmed\"";
mostCurrent._ldatetime.setText(BA.ObjectToCharSequence("Status: Confirmed"));
RDebugUtils.currentLine=7733276;
 //BA.debugLineNum = 7733276;BA.debugLine="LDatetime.TextColor = Colors.Green";
mostCurrent._ldatetime.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=7733277;
 //BA.debugLineNum = 7733277;BA.debugLine="BtnDonationHere.Visible = False";
mostCurrent._btndonationhere.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=7733280;
 //BA.debugLineNum = 7733280;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.getObject()));
RDebugUtils.currentLine=7733281;
 //BA.debugLineNum = 7733281;BA.debugLine="End Sub";
return null;
}
public static String  _donation_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "donation_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "donation_click", null);
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub Donation_Click";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="StartActivity(DonationStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._donationstewardship.getObject()));
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If Job.Success = True Then";
if (_job._success==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
_res = _job._getstring();
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"LoadData")) {
case 0: {
RDebugUtils.currentLine=7798796;
 //BA.debugLineNum = 7798796;BA.debugLine="Try";
try {RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="data=parser.NextArray";
_data = _parser.NextArray();
RDebugUtils.currentLine=7798799;
 //BA.debugLineNum = 7798799;BA.debugLine="If data.Size-1 > 0 Then";
if (_data.getSize()-1>0) { 
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="For i=0 To data.Size -1";
{
final int step12 = 1;
final int limit12 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="a = data.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_data.Get(_i)));
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="CLV.Add(CreateItem(CLV.AsView.Width,a.Get(\"";
mostCurrent._clv._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitem(mostCurrent._clv._asview().getWidth(),BA.ObjectToString(_a.Get((Object)("id"))),BA.ObjectToString(_a.Get((Object)("username"))),BA.ObjectToString(_a.Get((Object)("animal_type"))),BA.ObjectToString(_a.Get((Object)("fund"))),BA.ObjectToString(_a.Get((Object)("datetime"))),BA.ObjectToString(_a.Get((Object)("confirmation")))).getObject())),(Object)(""));
RDebugUtils.currentLine=7798806;
 //BA.debugLineNum = 7798806;BA.debugLine="CLV.AsView.Height = (PanelListItem.Height+2";
mostCurrent._clv._asview().setHeight((int) ((mostCurrent._panellistitem.getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA))*mostCurrent._clv._getsize()));
 }
};
RDebugUtils.currentLine=7798809;
 //BA.debugLineNum = 7798809;BA.debugLine="PanelQurban.Height= CLV.AsView.Height + 10%y";
mostCurrent._panelqurban.setHeight((int) (mostCurrent._clv._asview().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA)));
RDebugUtils.currentLine=7798810;
 //BA.debugLineNum = 7798810;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
mostCurrent._clv._sv.setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=7798811;
 //BA.debugLineNum = 7798811;BA.debugLine="CLV.AsView.Height = CLV.AsView.Height";
mostCurrent._clv._asview().setHeight(mostCurrent._clv._asview().getHeight());
RDebugUtils.currentLine=7798812;
 //BA.debugLineNum = 7798812;BA.debugLine="MainScroll.Panel.Height = PanelQurban.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._panelqurban.getHeight());
 };
 } 
       catch (Exception e24) {
			processBA.setLastException(e24);RDebugUtils.currentLine=7798817;
 //BA.debugLineNum = 7798817;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 break; }
}
;
 }else {
RDebugUtils.currentLine=7798822;
 //BA.debugLineNum = 7798822;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.Log("Error: "+_job._errormessage);
RDebugUtils.currentLine=7798823;
 //BA.debugLineNum = 7798823;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_job._errormessage),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7798825;
 //BA.debugLineNum = 7798825;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=7798826;
 //BA.debugLineNum = 7798826;BA.debugLine="End Sub";
return "";
}
public static String  _panellistitem_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panellistitem_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "panellistitem_click", null);
int _item = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _a = null;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub PanelListItem_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
_item = mostCurrent._clv._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA))));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim p As B4XView";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="p = CLV.GetPanel(item)";
_p = mostCurrent._clv._getpanel(_item);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Dim a As B4XView";
_a = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="a = p.GetView(0)";
_a = _p.GetView((int) (0));
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="idSelected=a.GetView(0).GetView(5).Text";
_idselected = _a.GetView((int) (0)).GetView((int) (5)).getText();
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="Log(idSelected)";
anywheresoftware.b4a.keywords.Common.Log(_idselected);
RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="StartActivity(QurbanStewardshipDetail)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._qurbanstewardshipdetail.getObject()));
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="End Sub";
return "";
}
public static String  _profile_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "profile_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "profile_click", null);
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub Profile_Click";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="StartActivity(HomeStewardship)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homestewardship.getObject()));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public static String  _qurban_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "qurban_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "qurban_click", null);
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Qurban_Click";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public static String  _web_click() throws Exception{
RDebugUtils.currentModule="qurbanstewardship";
if (Debug.shouldDelegate(mostCurrent.activityBA, "web_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "web_click", null);
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Web_Click";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="StartActivity(WebView)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._webview.getObject()));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return "";
}
}