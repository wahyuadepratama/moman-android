package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter2_subs_0 {


public static RemoteObject  _download(RemoteObject _imageviewsmap) throws Exception{
try {
		Debug.PushSubsStack("Download (starter2) ","starter2",19,starter2.processBA,starter2.mostCurrent,29);
if (RapidSub.canDelegate("download")) return b4a.example.starter2.remoteMe.runUserSub(false, "starter2","download", _imageviewsmap);
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("ImageViewsMap", _imageviewsmap);
 BA.debugLineNum = 29;BA.debugLine="Sub Download (ImageViewsMap As Map)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
Debug.ShouldStop(536870912);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imageviewsmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 31;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
Debug.ShouldStop(1073741824);
starter2._tasks.runVoidMethod ("Put",(Object)(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 32;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
Debug.ShouldStop(-2147483648);
_link = BA.ObjectToString(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 33;BA.debugLine="If cache.ContainsKey(link) Then";
Debug.ShouldStop(1);
if (starter2._cache.runMethod(true,"ContainsKey",(Object)((_link))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 34;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
Debug.ShouldStop(2);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 35;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
Debug.ShouldStop(4);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((starter2._cache.runMethod(false,"Get",(Object)((_link))))));
 }else 
{ BA.debugLineNum = 36;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",starter2._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_link))),starter2.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 37;BA.debugLine="ongoingTasks.Put(link, \"\")";
Debug.ShouldStop(16);
starter2._ongoingtasks.runVoidMethod ("Put",(Object)((_link)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 38;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(32);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 39;BA.debugLine="j.Initialize(link, Me)";
Debug.ShouldStop(64);
_j.runVoidMethod ("_initialize",starter2.processBA,(Object)(_link),(Object)(starter2.getObject()));
 BA.debugLineNum = 40;BA.debugLine="j.Download(link)";
Debug.ShouldStop(128);
_j.runVoidMethod ("_download",(Object)(_link));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (starter2) ","starter2",19,starter2.processBA,starter2.mostCurrent,45);
if (RapidSub.canDelegate("jobdone")) return b4a.example.starter2.remoteMe.runUserSub(false, "starter2","jobdone", _job);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 45;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(8192);
starter2._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname"))));
 BA.debugLineNum = 47;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16384);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(32768);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 49;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(65536);
if (starter2._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 50;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(131072);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {starter2._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 51;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
Debug.ShouldStop(262144);
_link = BA.ObjectToString(starter2._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 52;BA.debugLine="If link = Job.JobName Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_link,_job.getField(true,"_jobname"))) { 
 BA.debugLineNum = 53;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(1048576);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(starter2._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 54;BA.debugLine="cache.Put(Job.JobName, bmp)";
Debug.ShouldStop(2097152);
starter2._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname"))),(Object)((_bmp.getObject())));
 BA.debugLineNum = 55;BA.debugLine="iv.SetBackgroundImage(bmp)";
Debug.ShouldStop(4194304);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_bmp.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 60;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(134217728);
starter2.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname"),starter2.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage"))));
 };
 BA.debugLineNum = 62;BA.debugLine="Job.Release";
Debug.ShouldStop(536870912);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 9;BA.debugLine="Private cache As Map";
starter2._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Private tasks As Map";
starter2._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Private ongoingTasks As Map";
starter2._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter2) ","starter2",19,starter2.processBA,starter2.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) return b4a.example.starter2.remoteMe.runUserSub(false, "starter2","service_create");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(16384);
starter2._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="cache.Initialize";
Debug.ShouldStop(32768);
starter2._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(65536);
starter2._ongoingtasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter2) ","starter2",19,starter2.processBA,starter2.mostCurrent,25);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.starter2.remoteMe.runUserSub(false, "starter2","service_destroy");
 BA.debugLineNum = 25;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter2) ","starter2",19,starter2.processBA,starter2.mostCurrent,20);
if (RapidSub.canDelegate("service_start")) return b4a.example.starter2.remoteMe.runUserSub(false, "starter2","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 20;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Service.StopAutomaticForeground 'Call this when t";
Debug.ShouldStop(2097152);
starter2.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}