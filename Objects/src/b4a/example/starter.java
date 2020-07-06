package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends  android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        BA.LogInfo("** Service (starter) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static anywheresoftware.b4a.gps.GPS _gps1 = null;
public static boolean _gpsstarted = false;
public static String _lat = "";
public static String _lang = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
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
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.starter2 _starter2 = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _activityispaused() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "activityispaused"))
	return (String) Debug.delegate(processBA, "activityispaused", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub ActivityIsPaused";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="tasks.Clear";
_tasks.Clear();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error"))
	return (Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper  _createbitmap() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper) Debug.delegate(processBA, "createbitmap", null);
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
float _x = 0f;
float _y = 0f;
float _radius = 0f;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub CreateBitmap As Canvas";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
_bmp.InitializeMutable(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="r.Initialize(0, 0, bmp.Width, bmp.Height)";
_r.Initialize((int) (0),(int) (0),_bmp.getWidth(),_bmp.getHeight());
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="cvs.DrawRect(r, Colors.Transparent, True, 0)";
_cvs.DrawRect((android.graphics.Rect)(_r.getObject()),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim p As Path";
_p = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="p.Initialize(0, 0)";
_p.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Dim jo As JavaObject = p";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim x = 100dip, y = 100dip, radius = 100dip As Fl";
_x = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_y = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
_radius = (float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
_jo.RunMethod("addCircle",new Object[]{(Object)(_x),(Object)(_y),(Object)(_radius),(Object)("CW")});
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="cvs.ClipPath(p)";
_cvs.ClipPath((android.graphics.Path)(_p.getObject()));
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="End Sub";
return null;
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imageviewsmap) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "download"))
	return (String) Debug.delegate(processBA, "download", new Object[] {_imageviewsmap});
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Download (ImageViewsMap As Map)";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imageviewsmap.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
_tasks.Put(_imageviewsmap.GetKeyAt(_i),_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
_link = BA.ObjectToString(_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="If cache.ContainsKey(link) Then";
if (_cache.ContainsKey((Object)(_link))) { 
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_imageviewsmap.GetKeyAt(_i)));
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_link))));
 }else 
{RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
if (_ongoingtasks.ContainsKey((Object)(_link))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="ongoingTasks.Put(link, \"\")";
_ongoingtasks.Put((Object)(_link),(Object)(""));
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="j.Initialize(link, Me)";
_j._initialize(processBA,_link,starter.getObject());
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="j.Download(link)";
_j._download(_link);
 }}
;
 }
};
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="End Sub";
return "";
}
public static String  _drawroundbitmap(anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "drawroundbitmap"))
	return (String) Debug.delegate(processBA, "drawroundbitmap", new Object[] {_cvs,_bmp});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
_r.Initialize((int) (0),(int) (0),_cvs.getBitmap().getWidth(),_cvs.getBitmap().getHeight());
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
_cvs.DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),(android.graphics.Rect)(anywheresoftware.b4a.keywords.Common.Null),(android.graphics.Rect)(_r.getObject()));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public static String  _gps_gpsstatus(anywheresoftware.b4a.objects.collections.List _satellites) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_gpsstatus"))
	return (String) Debug.delegate(processBA, "gps_gpsstatus", new Object[] {_satellites});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
anywheresoftware.b4a.gps.GpsSatelliteWrapper _satellite = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub GPS_GpsStatus (Satellites As List)";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
_sb.Append("Satellites:").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="For i = 0 To Satellites.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_satellites.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
_satellite = new anywheresoftware.b4a.gps.GpsSatelliteWrapper();
_satellite.setObject((android.location.GpsSatellite)(_satellites.Get(_i)));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(BA.NumberToString(_satellite.getPrn())).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getSnr()))+"")).Append(" ").Append(BA.ObjectToString(_satellite.getUsedInFix()));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
_sb.Append(" ").Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getAzimuth()))+"")).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getElevation()))+""));
 }
};
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Log( sb.ToString)";
anywheresoftware.b4a.keywords.Common.Log(_sb.ToString());
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="End Sub";
return "";
}
public static String  _gps_locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gps_locationchanged"))
	return (String) Debug.delegate(processBA, "gps_locationchanged", new Object[] {_location1});
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
public static String  _gpsstatus(anywheresoftware.b4a.objects.collections.List _satellites) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "gpsstatus"))
	return (String) Debug.delegate(processBA, "gpsstatus", new Object[] {_satellites});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
anywheresoftware.b4a.gps.GpsSatelliteWrapper _satellite = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub GpsStatus (Satellites As List)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
_sb.Append("Satellites:").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="For i = 0 To Satellites.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_satellites.getSize()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
_satellite = new anywheresoftware.b4a.gps.GpsSatelliteWrapper();
_satellite.setObject((android.location.GpsSatellite)(_satellites.Get(_i)));
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(BA.NumberToString(_satellite.getPrn())).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getSnr()))+"")).Append(" ").Append(BA.ObjectToString(_satellite.getUsedInFix()));
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
_sb.Append(" ").Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getAzimuth()))+"")).Append((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_satellite.getElevation()))+""));
 }
};
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="Log( sb.ToString)";
anywheresoftware.b4a.keywords.Common.Log(_sb.ToString());
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "jobdone"))
	return (String) Debug.delegate(processBA, "jobdone", new Object[] {_job});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname));
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tasks.getSize()-1);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
_link = BA.ObjectToString(_tasks.GetValueAt(_i));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="If link = Job.JobName Then";
if ((_link).equals(_job._jobname)) { 
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Dim cvs As Canvas = CreateBitmap";
_cvs = _createbitmap();
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="DrawRoundBitmap(cvs, bmp)";
_drawroundbitmap(_cvs,_bmp);
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="iv.SetBackgroundImage(cvs.Bitmap)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cvs.getBitmap().getObject()));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="cache.Put(Job.JobName, cvs.Bitmap)";
_cache.Put((Object)(_job._jobname),(Object)(_cvs.getBitmap().getObject()));
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.Log("Error downloading image: "+_job._jobname+anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage);
 };
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="End Sub";
return "";
}
public static String  _locationchanged(anywheresoftware.b4a.gps.LocationWrapper _location1) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "locationchanged"))
	return (String) Debug.delegate(processBA, "locationchanged", new Object[] {_location1});
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub LocationChanged(Location1 As Location)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="lat = Location1.ConvertToMinutes(Location1.Latitu";
_lat = _location1.ConvertToMinutes(_location1.getLatitude());
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="lang = Location1.ConvertToMinutes(Location1.Longi";
_lang = _location1.ConvertToMinutes(_location1.getLongitude());
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Log( \"Lat = \" & Location1.ConvertToMinutes(Locati";
anywheresoftware.b4a.keywords.Common.Log("Lat = "+_location1.ConvertToMinutes(_location1.getLatitude()));
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Log(\"Lon = \" & Location1.ConvertToMinutes(Locatio";
anywheresoftware.b4a.keywords.Common.Log("Lon = "+_location1.ConvertToMinutes(_location1.getLongitude()));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Log( $\"Speed = $1.2{Location1.Speed} m/s \"$)";
anywheresoftware.b4a.keywords.Common.Log(("Speed = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_location1.getSpeed()))+" m/s "));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create"))
	return (String) Debug.delegate(processBA, "service_create", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="GPS1.Initialize(\"GPS\")";
_gps1.Initialize("GPS");
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy"))
	return (String) Debug.delegate(processBA, "service_destroy", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="StopGps";
_stopgps();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _stopgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "stopgps"))
	return (String) Debug.delegate(processBA, "stopgps", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub StopGps";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If gpsStarted Then";
if (_gpsstarted) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="GPS1.Stop";
_gps1.Stop();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="gpsStarted = False";
_gpsstarted = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start"))
	return (String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent});
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved"))
	return (String) Debug.delegate(processBA, "service_taskremoved", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _startgps() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "startgps"))
	return (String) Debug.delegate(processBA, "startgps", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub StartGps";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If gpsStarted = False Then";
if (_gpsstarted==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="GPS1.Start(0, 0)";
_gps1.Start(processBA,(long) (0),(float) (0));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="gpsStarted = True";
_gpsstarted = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="End Sub";
return "";
}
}