package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class webview_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (webview) ","webview",22,webview.mostCurrent.activityBA,webview.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) return b4a.example.webview.remoteMe.runUserSub(false, "webview","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 24;BA.debugLine="Activity.LoadLayout(\"BottomNavigation\")";
Debug.ShouldStop(8388608);
webview.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("BottomNavigation")),webview.mostCurrent.activityBA);
 BA.debugLineNum = 25;BA.debugLine="MainScroll.Panel.LoadLayout(\"WebView\")";
Debug.ShouldStop(16777216);
webview.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("WebView")),webview.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="WebView1.JavaScriptEnabled=True";
Debug.ShouldStop(67108864);
webview.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",webview.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 28;BA.debugLine="WebView1.LoadUrl(Main.server)";
Debug.ShouldStop(134217728);
webview.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(webview.mostCurrent._main._server));
 BA.debugLineNum = 30;BA.debugLine="TopNavbar.Visible = False";
Debug.ShouldStop(536870912);
webview.mostCurrent._topnavbar.runMethod(true,"setVisible",webview.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="MainScroll.Top = 0%y";
Debug.ShouldStop(1073741824);
webview.mostCurrent._mainscroll.runMethod(true,"setTop",webview.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),webview.mostCurrent.activityBA));
 BA.debugLineNum = 32;BA.debugLine="Web.SetBackgroundImage(LoadBitmap(File.DirAssets,";
Debug.ShouldStop(-2147483648);
webview.mostCurrent._web.runVoidMethod ("SetBackgroundImageNew",(Object)((webview.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(webview.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("domain_green.png"))).getObject())));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (webview) ","webview",22,webview.mostCurrent.activityBA,webview.mostCurrent,39);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.webview.remoteMe.runUserSub(false, "webview","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (webview) ","webview",22,webview.mostCurrent.activityBA,webview.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.webview.remoteMe.runUserSub(false, "webview","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private MainScroll As ScrollView";
webview.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private WebView1 As WebView";
webview.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TopNavbar As Panel";
webview.mostCurrent._topnavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private Navbar As Panel";
webview.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Web As Button";
webview.mostCurrent._web = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}