package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsjamaah_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(1);
mapsjamaah.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsJamaah\")";
Debug.ShouldStop(2);
mapsjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsJamaah")),mapsjamaah.mostCurrent.activityBA);
 BA.debugLineNum = 35;BA.debugLine="MainScroll.Panel.Height = PanelMaps.Height";
Debug.ShouldStop(4);
mapsjamaah.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsjamaah.mostCurrent._panelmaps.runMethod(true,"getHeight"));
 BA.debugLineNum = 36;BA.debugLine="MainScroll.Height = 100%y - MainScroll.Top";
Debug.ShouldStop(8);
mapsjamaah.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsjamaah.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),mapsjamaah.mostCurrent.activityBA),mapsjamaah.mostCurrent._mainscroll.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 39;BA.debugLine="WebView1.JavaScriptEnabled=True";
Debug.ShouldStop(64);
mapsjamaah.mostCurrent._webview1.runMethod(true,"setJavaScriptEnabled",mapsjamaah.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="WebView1.LoadUrl(Main.server&\"api/maps?search=nof";
Debug.ShouldStop(128);
mapsjamaah.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/maps?search=nofilter&lat="),mapsjamaah.mostCurrent._starter._lat,RemoteObject.createImmutable("&lang="),mapsjamaah.mostCurrent._starter._lang)));
 BA.debugLineNum = 42;BA.debugLine="NavbarTitle.Text = \"Maps\"";
Debug.ShouldStop(512);
mapsjamaah.mostCurrent._navbartitle.runMethod(true,"setText",BA.ObjectToCharSequence("Maps"));
 BA.debugLineNum = 43;BA.debugLine="NavbarTitle.TextSize = 20";
Debug.ShouldStop(1024);
mapsjamaah.mostCurrent._navbartitle.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 45;BA.debugLine="events.Initialize";
Debug.ShouldStop(4096);
mapsjamaah.mostCurrent._events.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="facilities.Initialize";
Debug.ShouldStop(8192);
mapsjamaah.mostCurrent._facilities.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="capacities.Initialize";
Debug.ShouldStop(16384);
mapsjamaah.mostCurrent._capacities.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="parking.Initialize";
Debug.ShouldStop(32768);
mapsjamaah.mostCurrent._parking.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="SpinCapacity.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(65536);
mapsjamaah.mostCurrent._spincapacity.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="SpinFacility.DropdownBackgroundColor = Colors.Whi";
Debug.ShouldStop(131072);
mapsjamaah.mostCurrent._spinfacility.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="SpinEvent.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(262144);
mapsjamaah.mostCurrent._spinevent.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 52;BA.debugLine="SpinParking.DropdownBackgroundColor = Colors.Whit";
Debug.ShouldStop(524288);
mapsjamaah.mostCurrent._spinparking.runMethod(true,"setDropdownBackgroundColor",mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 53;BA.debugLine="CodeSemua.SetBackgroundTintList(EditName, Colors.";
Debug.ShouldStop(1048576);
mapsjamaah.mostCurrent._codesemua.runVoidMethod ("_setbackgroundtintlist",mapsjamaah.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mapsjamaah.mostCurrent._editname.getObject()),(Object)(mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(mapsjamaah.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Pause (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,86);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(4194304);
mapsjamaah.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsjamaah.processBA,(Object)((mapsjamaah.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.mapsjamaah parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.mapsjamaah parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,56);
if (RapidSub.canDelegate("activity_resume")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 57;BA.debugLine="CodeSemua.ExecuteUrlGet(Main.server&\"api/getfacil";
Debug.ShouldStop(16777216);
parent.mostCurrent._codesemua.runVoidMethod ("_executeurlget",mapsjamaah.mostCurrent.activityBA,(Object)(RemoteObject.concat(parent.mostCurrent._main._server,RemoteObject.createImmutable("api/getfacility"))),(Object)(BA.ObjectToString("LoadData")),(Object)(mapsjamaah.getObject()));
 BA.debugLineNum = 59;BA.debugLine="SpinCapacity.Add(\"All Capacity\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("All Capacity")));
 BA.debugLineNum = 60;BA.debugLine="SpinCapacity.Add(\"0 - 100\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("0 - 100")));
 BA.debugLineNum = 61;BA.debugLine="SpinCapacity.Add(\"100 - 300\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("100 - 300")));
 BA.debugLineNum = 62;BA.debugLine="SpinCapacity.Add(\"300 - 500\")";
Debug.ShouldStop(536870912);
parent.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("300 - 500")));
 BA.debugLineNum = 63;BA.debugLine="SpinCapacity.Add(\"> 500\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._spincapacity.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("> 500")));
 BA.debugLineNum = 65;BA.debugLine="SpinEvent.Add(\"All Worship Place\")";
Debug.ShouldStop(1);
parent.mostCurrent._spinevent.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("All Worship Place")));
 BA.debugLineNum = 66;BA.debugLine="SpinEvent.Add(\"Masjid\")";
Debug.ShouldStop(2);
parent.mostCurrent._spinevent.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Masjid")));
 BA.debugLineNum = 67;BA.debugLine="SpinEvent.Add(\"Mushalla\")";
Debug.ShouldStop(4);
parent.mostCurrent._spinevent.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Mushalla")));
 BA.debugLineNum = 69;BA.debugLine="SpinParking.Add(\"All Parking Area\")";
Debug.ShouldStop(16);
parent.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("All Parking Area")));
 BA.debugLineNum = 70;BA.debugLine="SpinParking.Add(\"0 - 50\")";
Debug.ShouldStop(32);
parent.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("0 - 50")));
 BA.debugLineNum = 71;BA.debugLine="SpinParking.Add(\"50 - 100\")";
Debug.ShouldStop(64);
parent.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("50 - 100")));
 BA.debugLineNum = 72;BA.debugLine="SpinParking.Add(\"100 - 200\")";
Debug.ShouldStop(128);
parent.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("100 - 200")));
 BA.debugLineNum = 73;BA.debugLine="SpinParking.Add(\"> 200\")";
Debug.ShouldStop(256);
parent.mostCurrent._spinparking.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("> 200")));
 BA.debugLineNum = 75;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1.runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 76;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsjamaah.processBA,(Object)((parent.mostCurrent._starter._gps1.runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 79;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(16384);
parent.mostCurrent._starter._rp.runVoidMethod ("CheckAndRequest",mapsjamaah.processBA,(Object)(parent.mostCurrent._starter._rp.getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 80;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsjamaah.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 81;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
Debug.ShouldStop(65536);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsjamaah.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
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
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnsearch_click() throws Exception{
try {
		Debug.PushSubsStack("btnSearch_Click (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,115);
if (RapidSub.canDelegate("btnsearch_click")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","btnsearch_click");
 BA.debugLineNum = 115;BA.debugLine="Sub btnSearch_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 119;BA.debugLine="Log(Main.server&\"api/maps?search=filter&name=\"&Ed";
Debug.ShouldStop(4194304);
mapsjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(mapsjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/maps?search=filter&name="),mapsjamaah.mostCurrent._editname.runMethod(true,"getText"),RemoteObject.createImmutable("&type="),mapsjamaah.mostCurrent._spinevent.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&park="),mapsjamaah.mostCurrent._spinparking.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&capacity="),mapsjamaah.mostCurrent._spincapacity.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&lat="),mapsjamaah.mostCurrent._starter._lat,RemoteObject.createImmutable("&lang="),mapsjamaah.mostCurrent._starter._lang)));
 BA.debugLineNum = 121;BA.debugLine="MyWebViewSetting.setLoadWithOverviewMode(WebView1";
Debug.ShouldStop(16777216);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setLoadWithOverviewMode",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="MyWebViewSetting.setUseWideViewPort(WebView1, Tru";
Debug.ShouldStop(33554432);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setUseWideViewPort",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 123;BA.debugLine="MyWebViewSetting.setSupportZoom(WebView1, True)";
Debug.ShouldStop(67108864);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setSupportZoom",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 124;BA.debugLine="MyWebViewSetting.setDefaultTextEncodingName(WebVi";
Debug.ShouldStop(134217728);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setDefaultTextEncodingName",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(RemoteObject.createImmutable("utf-8")));
 BA.debugLineNum = 125;BA.debugLine="MyWebViewSetting.setPluginState(WebView1, \"ON\")";
Debug.ShouldStop(268435456);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setPluginState",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(RemoteObject.createImmutable("ON")));
 BA.debugLineNum = 126;BA.debugLine="MyWebViewSetting.getDOMStorageEnabled(WebView1)";
Debug.ShouldStop(536870912);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getDOMStorageEnabled",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 127;BA.debugLine="MyWebViewSetting.getLoadsImagesAutomatically(WebV";
Debug.ShouldStop(1073741824);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getLoadsImagesAutomatically",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 128;BA.debugLine="MyWebViewSetting.setGeolocationEnabled(WebView1,";
Debug.ShouldStop(-2147483648);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setGeolocationEnabled",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 129;BA.debugLine="MyWebViewSetting.getCacheMode(WebView1)";
Debug.ShouldStop(1);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getCacheMode",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 130;BA.debugLine="MyWebViewSetting.getAllowFileAccess(WebView1)";
Debug.ShouldStop(2);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getAllowFileAccess",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 131;BA.debugLine="MyWebViewSetting.getLightTouchEnabled(WebView1)";
Debug.ShouldStop(4);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getLightTouchEnabled",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 132;BA.debugLine="MyWebViewSetting.getSaveFormData(WebView1)";
Debug.ShouldStop(8);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getSaveFormData",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 133;BA.debugLine="MyWebViewSetting.getSavePassword(WebView1)";
Debug.ShouldStop(16);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getSavePassword",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 134;BA.debugLine="MyWebViewSetting.getUserAgentString(WebView1)";
Debug.ShouldStop(32);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getUserAgentString",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 135;BA.debugLine="MyWebViewSetting.getUseWideViewPort(WebView1)";
Debug.ShouldStop(64);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("getUseWideViewPort",(Object)((mapsjamaah.mostCurrent._webview1.getObject())));
 BA.debugLineNum = 136;BA.debugLine="MyWebViewSetting.setAllowFileAccess(WebView1, Tru";
Debug.ShouldStop(128);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setAllowFileAccess",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 137;BA.debugLine="MyWebViewSetting.setAppCacheEnabled(WebView1, Tru";
Debug.ShouldStop(256);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setAppCacheEnabled",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 138;BA.debugLine="MyWebViewSetting.setMediaPlaybackRequiresUserGest";
Debug.ShouldStop(512);
mapsjamaah.mostCurrent._mywebviewsetting.runVoidMethod ("setMediaPlaybackRequiresUserGesture",(Object)((mapsjamaah.mostCurrent._webview1.getObject())),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 139;BA.debugLine="WebView1.LoadUrl(Main.server&\"api/maps?search=fil";
Debug.ShouldStop(1024);
mapsjamaah.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(mapsjamaah.mostCurrent._main._server,RemoteObject.createImmutable("api/maps?search=filter&name="),mapsjamaah.mostCurrent._editname.runMethod(true,"getText"),RemoteObject.createImmutable("&type="),mapsjamaah.mostCurrent._spinevent.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&park="),mapsjamaah.mostCurrent._spinparking.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&capacity="),mapsjamaah.mostCurrent._spincapacity.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable("&lat="),mapsjamaah.mostCurrent._starter._lat,RemoteObject.createImmutable("&lang="),mapsjamaah.mostCurrent._starter._lang)));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MainScroll As ScrollView";
mapsjamaah.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelMaps As Panel";
mapsjamaah.mostCurrent._panelmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
mapsjamaah.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsjamaah.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewSetting As WebViewSettings";
mapsjamaah.mostCurrent._mywebviewsetting = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 20;BA.debugLine="Dim events,facilities, capacities, parking As Map";
mapsjamaah.mostCurrent._events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._facilities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._capacities = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
mapsjamaah.mostCurrent._parking = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 22;BA.debugLine="Private EditName As EditText";
mapsjamaah.mostCurrent._editname = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private SpinCapacity As Spinner";
mapsjamaah.mostCurrent._spincapacity = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private SpinEvent As Spinner";
mapsjamaah.mostCurrent._spinevent = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private SpinFacility As Spinner";
mapsjamaah.mostCurrent._spinfacility = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private SpinParking As Spinner";
mapsjamaah.mostCurrent._spinparking = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnSearch As Button";
mapsjamaah.mostCurrent._btnsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private NavbarTitle As Label";
mapsjamaah.mostCurrent._navbartitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,90);
if (RapidSub.canDelegate("jobdone")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _data_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _facilitydata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 90;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="If Job.Success = True Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),mapsjamaah.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 93;BA.debugLine="Dim res As String";
Debug.ShouldStop(268435456);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 94;BA.debugLine="res = Job.GetString 'menyimpan json dalam bentuk";
Debug.ShouldStop(536870912);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 95;BA.debugLine="Dim parser As JSONParser 'mengambil data dalam b";
Debug.ShouldStop(1073741824);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 96;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 98;BA.debugLine="Dim data_list As List";
Debug.ShouldStop(2);
_data_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_list", _data_list);
 BA.debugLineNum = 99;BA.debugLine="data_list = parser.NextArray";
Debug.ShouldStop(4);
_data_list = _parser.runMethod(false,"NextArray");Debug.locals.put("data_list", _data_list);
 BA.debugLineNum = 101;BA.debugLine="SpinFacility.Add(\"All Facility\")";
Debug.ShouldStop(16);
mapsjamaah.mostCurrent._spinfacility.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("All Facility")));
 BA.debugLineNum = 102;BA.debugLine="For i=0 To data_list.Size-1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_data_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 103;BA.debugLine="Dim facilityData As Map";
Debug.ShouldStop(64);
_facilitydata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("facilityData", _facilitydata);
 BA.debugLineNum = 104;BA.debugLine="facilityData = data_list.Get(i)";
Debug.ShouldStop(128);
_facilitydata.setObject(_data_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 105;BA.debugLine="SpinFacility.Add(facilityData.Get(\"name\"))";
Debug.ShouldStop(256);
mapsjamaah.mostCurrent._spinfacility.runVoidMethod ("Add",(Object)(BA.ObjectToString(_facilitydata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 109;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4096);
mapsjamaah.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage"))));
 BA.debugLineNum = 110;BA.debugLine="ToastMessageShow(\"Error: \" & Job.ErrorMessage, T";
Debug.ShouldStop(8192);
mapsjamaah.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage")))),(Object)(mapsjamaah.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 112;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mywebview_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("myWebView_PageFinished (mapsjamaah) ","mapsjamaah",11,mapsjamaah.mostCurrent.activityBA,mapsjamaah.mostCurrent,142);
if (RapidSub.canDelegate("mywebview_pagefinished")) return b4a.example.mapsjamaah.remoteMe.runUserSub(false, "mapsjamaah","mywebview_pagefinished", _url);
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Url", _url);
 BA.debugLineNum = 142;BA.debugLine="Sub myWebView_PageFinished (Url As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(16384);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 144;BA.debugLine="Obj1.Target=WebView1";
Debug.ShouldStop(32768);
_obj1.setField ("Target",(mapsjamaah.mostCurrent._webview1.getObject()));
 BA.debugLineNum = 148;BA.debugLine="Obj1.RunMethod2(\"addJavascriptInterface\", \"myNewJ";
Debug.ShouldStop(524288);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("addJavascriptInterface")),(Object)(BA.ObjectToString("myNewJSMethod")),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}