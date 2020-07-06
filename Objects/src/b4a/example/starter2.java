package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter2 extends  android.app.Service{
	public static class starter2_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter2) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter2.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter2 mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter2.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.starter2");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.starter2", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter2) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
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
                    BA.LogInfo("** Service (starter2) Create **");
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
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter2) Start **");
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
        BA.LogInfo("** Service (starter2) Destroy **");
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
public b4a.example.invoicejamaah _invoicejamaah = null;
public b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public b4a.example.webview _webview = null;
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imageviewsmap) throws Exception{
RDebugUtils.currentModule="starter2";
if (Debug.shouldDelegate(processBA, "download"))
	return (String) Debug.delegate(processBA, "download", new Object[] {_imageviewsmap});
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub Download (ImageViewsMap As Map)";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imageviewsmap.getSize()-1);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
_tasks.Put(_imageviewsmap.GetKeyAt(_i),_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
_link = BA.ObjectToString(_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="If cache.ContainsKey(link) Then";
if (_cache.ContainsKey((Object)(_link))) { 
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_imageviewsmap.GetKeyAt(_i)));
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_cache.Get((Object)(_link))));
 }else 
{RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
if (_ongoingtasks.ContainsKey((Object)(_link))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="ongoingTasks.Put(link, \"\")";
_ongoingtasks.Put((Object)(_link),(Object)(""));
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=13631498;
 //BA.debugLineNum = 13631498;BA.debugLine="j.Initialize(link, Me)";
_j._initialize(processBA,_link,starter2.getObject());
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="j.Download(link)";
_j._download(_link);
 }}
;
 }
};
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="starter2";
if (Debug.shouldDelegate(processBA, "jobdone"))
	return (String) Debug.delegate(processBA, "jobdone", new Object[] {_job});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname));
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap();
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_tasks.getSize()-1);
_i = (int) (0) ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
_link = BA.ObjectToString(_tasks.GetValueAt(_i));
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="If link = Job.JobName Then";
if ((_link).equals(_job._jobname)) { 
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
_iv.setObject((android.widget.ImageView)(_tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="cache.Put(Job.JobName, bmp)";
_cache.Put((Object)(_job._jobname),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="iv.SetBackgroundImage(bmp)";
_iv.SetBackgroundImageNew((android.graphics.Bitmap)(_bmp.getObject()));
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.Log("Error downloading image: "+_job._jobname+anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage);
 };
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=13697042;
 //BA.debugLineNum = 13697042;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter2";
if (Debug.shouldDelegate(processBA, "service_create"))
	return (String) Debug.delegate(processBA, "service_create", null);
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter2";
if (Debug.shouldDelegate(processBA, "service_destroy"))
	return (String) Debug.delegate(processBA, "service_destroy", null);
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter2";
if (Debug.shouldDelegate(processBA, "service_start"))
	return (String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent});
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="Service.StopAutomaticForeground 'Call this when t";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="End Sub";
return "";
}
}