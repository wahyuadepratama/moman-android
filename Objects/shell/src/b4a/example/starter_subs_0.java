package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _activityispaused() throws Exception{
try {
		Debug.PushSubsStack("ActivityIsPaused (starter) ","starter",1,starter.processBA,starter.mostCurrent,142);
if (RapidSub.canDelegate("activityispaused")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","activityispaused");
 BA.debugLineNum = 142;BA.debugLine="Sub ActivityIsPaused";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="tasks.Clear";
Debug.ShouldStop(16384);
starter._tasks.runVoidMethod ("Clear");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",1,starter.processBA,starter.mostCurrent,70);
if (RapidSub.canDelegate("application_error")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 70;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Return True";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbitmap() throws Exception{
try {
		Debug.PushSubsStack("CreateBitmap (starter) ","starter",1,starter.processBA,starter.mostCurrent,119);
if (RapidSub.canDelegate("createbitmap")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","createbitmap");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _radius = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 119;BA.debugLine="Sub CreateBitmap As Canvas";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(8388608);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 121;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
Debug.ShouldStop(16777216);
_bmp.runVoidMethod ("InitializeMutable",(Object)(starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 122;BA.debugLine="Dim cvs As Canvas";
Debug.ShouldStop(33554432);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 123;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(67108864);
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 124;BA.debugLine="Dim r As Rect";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 125;BA.debugLine="r.Initialize(0, 0, bmp.Width, bmp.Height)";
Debug.ShouldStop(268435456);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_bmp.runMethod(true,"getWidth")),(Object)(_bmp.runMethod(true,"getHeight")));
 BA.debugLineNum = 126;BA.debugLine="cvs.DrawRect(r, Colors.Transparent, True, 0)";
Debug.ShouldStop(536870912);
_cvs.runVoidMethod ("DrawRect",(Object)((_r.getObject())),(Object)(starter.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(starter.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 127;BA.debugLine="Dim p As Path";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 128;BA.debugLine="p.Initialize(0, 0)";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 129;BA.debugLine="Dim jo As JavaObject = p";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_p.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 130;BA.debugLine="Dim x = 100dip, y = 100dip, radius = 100dip As Fl";
Debug.ShouldStop(2);
_x = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
_y = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
_radius = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 131;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
Debug.ShouldStop(4);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addCircle")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_x),(_y),(_radius),(RemoteObject.createImmutable("CW"))})));
 BA.debugLineNum = 132;BA.debugLine="cvs.ClipPath(p)";
Debug.ShouldStop(8);
_cvs.runVoidMethod ("ClipPath",(Object)((_p.getObject())));
 BA.debugLineNum = 133;BA.debugLine="Return cvs";
Debug.ShouldStop(16);
Debug.CheckDeviceExceptions();if (true) return _cvs;
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _imageviewsmap) throws Exception{
try {
		Debug.PushSubsStack("Download (starter) ","starter",1,starter.processBA,starter.mostCurrent,80);
if (RapidSub.canDelegate("download")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","download", _imageviewsmap);
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("ImageViewsMap", _imageviewsmap);
 BA.debugLineNum = 80;BA.debugLine="Sub Download (ImageViewsMap As Map)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
Debug.ShouldStop(65536);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imageviewsmap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 82;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
Debug.ShouldStop(131072);
starter._tasks.runVoidMethod ("Put",(Object)(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 83;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
Debug.ShouldStop(262144);
_link = BA.ObjectToString(_imageviewsmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 84;BA.debugLine="If cache.ContainsKey(link) Then";
Debug.ShouldStop(524288);
if (starter._cache.runMethod(true,"ContainsKey",(Object)((_link))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="Dim iv As ImageView = ImageViewsMap.GetKeyAt(i)";
Debug.ShouldStop(1048576);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(_imageviewsmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 86;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
Debug.ShouldStop(2097152);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((starter._cache.runMethod(false,"Get",(Object)((_link))))));
 }else 
{ BA.debugLineNum = 87;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",starter._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_link))),starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 88;BA.debugLine="ongoingTasks.Put(link, \"\")";
Debug.ShouldStop(8388608);
starter._ongoingtasks.runVoidMethod ("Put",(Object)((_link)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 89;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(16777216);
_j = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 90;BA.debugLine="j.Initialize(link, Me)";
Debug.ShouldStop(33554432);
_j.runVoidMethod ("_initialize",starter.processBA,(Object)(_link),(Object)(starter.getObject()));
 BA.debugLineNum = 91;BA.debugLine="j.Download(link)";
Debug.ShouldStop(67108864);
_j.runVoidMethod ("_download",(Object)(_link));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawroundbitmap(RemoteObject _cvs,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("DrawRoundBitmap (starter) ","starter",1,starter.processBA,starter.mostCurrent,136);
if (RapidSub.canDelegate("drawroundbitmap")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","drawroundbitmap", _cvs, _bmp);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("cvs", _cvs);
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 136;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
Debug.ShouldStop(128);
 BA.debugLineNum = 137;BA.debugLine="Dim r As Rect";
Debug.ShouldStop(256);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 138;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
Debug.ShouldStop(512);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_cvs.runMethod(false,"getBitmap").runMethod(true,"getWidth")),(Object)(_cvs.runMethod(false,"getBitmap").runMethod(true,"getHeight")));
 BA.debugLineNum = 139;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
Debug.ShouldStop(1024);
_cvs.runVoidMethod ("DrawBitmap",(Object)((_bmp.getObject())),(Object)((starter.mostCurrent.__c.getField(false,"Null"))),(Object)((_r.getObject())));
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
public static RemoteObject  _gps_gpsstatus(RemoteObject _satellites) throws Exception{
try {
		Debug.PushSubsStack("GPS_GpsStatus (starter) ","starter",1,starter.processBA,starter.mostCurrent,53);
if (RapidSub.canDelegate("gps_gpsstatus")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","gps_gpsstatus", _satellites);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _satellite = RemoteObject.declareNull("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
Debug.locals.put("Satellites", _satellites);
 BA.debugLineNum = 53;BA.debugLine="Sub GPS_GpsStatus (Satellites As List)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2097152);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 55;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
Debug.ShouldStop(8388608);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Satellites:"))).runVoidMethod ("Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 57;BA.debugLine="For i = 0 To Satellites.Size - 1";
Debug.ShouldStop(16777216);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_satellites.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 58;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
Debug.ShouldStop(33554432);
_satellite = RemoteObject.createNew ("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
_satellite.setObject(_satellites.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Satellite", _satellite);
 BA.debugLineNum = 59;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(BA.NumberToString(_satellite.runMethod(true,"getPrn")))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getSnr")))),RemoteObject.createImmutable(""))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(BA.ObjectToString(_satellite.runMethod(true,"getUsedInFix"))));
 BA.debugLineNum = 60;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
Debug.ShouldStop(134217728);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getAzimuth")))),RemoteObject.createImmutable(""))))).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getElevation")))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 62;BA.debugLine="Log( sb.ToString)";
Debug.ShouldStop(536870912);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(_sb.runMethod(true,"ToString")));
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
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",1,starter.processBA,starter.mostCurrent,46);
if (RapidSub.canDelegate("gps_locationchanged")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 46;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gpsstatus(RemoteObject _satellites) throws Exception{
try {
		Debug.PushSubsStack("GpsStatus (starter) ","starter",1,starter.processBA,starter.mostCurrent,146);
if (RapidSub.canDelegate("gpsstatus")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","gpsstatus", _satellites);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
RemoteObject _satellite = RemoteObject.declareNull("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
Debug.locals.put("Satellites", _satellites);
 BA.debugLineNum = 146;BA.debugLine="Public Sub GpsStatus (Satellites As List)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(262144);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 148;BA.debugLine="sb.Initialize";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="sb.Append(\"Satellites:\").Append(CRLF)";
Debug.ShouldStop(1048576);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Satellites:"))).runVoidMethod ("Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 150;BA.debugLine="For i = 0 To Satellites.Size - 1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_satellites.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 151;BA.debugLine="Dim Satellite As GPSSatellite = Satellites.Get(i";
Debug.ShouldStop(4194304);
_satellite = RemoteObject.createNew ("anywheresoftware.b4a.gps.GpsSatelliteWrapper");
_satellite.setObject(_satellites.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Satellite", _satellite);
 BA.debugLineNum = 152;BA.debugLine="sb.Append(CRLF).Append(Satellite.Prn).Append($\"";
Debug.ShouldStop(8388608);
_sb.runMethod(false,"Append",(Object)(starter.mostCurrent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(BA.NumberToString(_satellite.runMethod(true,"getPrn")))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getSnr")))),RemoteObject.createImmutable(""))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runVoidMethod ("Append",(Object)(BA.ObjectToString(_satellite.runMethod(true,"getUsedInFix"))));
 BA.debugLineNum = 153;BA.debugLine="sb.Append(\" \").Append($\" $1.2{Satellite.Azimuth}";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" "))).runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getAzimuth")))),RemoteObject.createImmutable(""))))).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_satellite.runMethod(true,"getElevation")))),RemoteObject.createImmutable("")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 155;BA.debugLine="Log( sb.ToString)";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("JobDone (starter) ","starter",1,starter.processBA,starter.mostCurrent,96);
if (RapidSub.canDelegate("jobdone")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _link = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 96;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(1);
starter._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname"))));
 BA.debugLineNum = 98;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(2);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 99;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(4);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runMethod(false,"_getbitmap");Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 100;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(8);
if (starter._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 101;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(16);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {starter._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 102;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
Debug.ShouldStop(32);
_link = BA.ObjectToString(starter._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("link", _link);Debug.locals.put("link", _link);
 BA.debugLineNum = 103;BA.debugLine="If link = Job.JobName Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_link,_job.getField(true,"_jobname"))) { 
 BA.debugLineNum = 104;BA.debugLine="Dim iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(128);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv.setObject(starter._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 105;BA.debugLine="Dim cvs As Canvas = CreateBitmap";
Debug.ShouldStop(256);
_cvs = _createbitmap();Debug.locals.put("cvs", _cvs);Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 106;BA.debugLine="DrawRoundBitmap(cvs, bmp)";
Debug.ShouldStop(512);
_drawroundbitmap(_cvs,_bmp);
 BA.debugLineNum = 107;BA.debugLine="iv.SetBackgroundImage(cvs.Bitmap)";
Debug.ShouldStop(1024);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_cvs.runMethod(false,"getBitmap").getObject())));
 BA.debugLineNum = 108;BA.debugLine="cache.Put(Job.JobName, cvs.Bitmap)";
Debug.ShouldStop(2048);
starter._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname"))),(Object)((_cvs.runMethod(false,"getBitmap").getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 114;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(131072);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname"),starter.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage"))));
 };
 BA.debugLineNum = 116;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("LocationChanged (starter) ","starter",1,starter.processBA,starter.mostCurrent,158);
if (RapidSub.canDelegate("locationchanged")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","locationchanged", _location1);
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 158;BA.debugLine="Public Sub LocationChanged(Location1 As Location)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="lat = Location1.ConvertToMinutes(Location1.Latitu";
Debug.ShouldStop(1073741824);
starter._lat = _location1.runMethod(true,"ConvertToMinutes",(Object)(_location1.runMethod(true,"getLatitude")));
 BA.debugLineNum = 160;BA.debugLine="lang = Location1.ConvertToMinutes(Location1.Longi";
Debug.ShouldStop(-2147483648);
starter._lang = _location1.runMethod(true,"ConvertToMinutes",(Object)(_location1.runMethod(true,"getLongitude")));
 BA.debugLineNum = 161;BA.debugLine="Log( \"Lat = \" & Location1.ConvertToMinutes(Locati";
Debug.ShouldStop(1);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Lat = "),_location1.runMethod(true,"ConvertToMinutes",(Object)(_location1.runMethod(true,"getLatitude"))))));
 BA.debugLineNum = 162;BA.debugLine="Log(\"Lon = \" & Location1.ConvertToMinutes(Locatio";
Debug.ShouldStop(2);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Lon = "),_location1.runMethod(true,"ConvertToMinutes",(Object)(_location1.runMethod(true,"getLongitude"))))));
 BA.debugLineNum = 163;BA.debugLine="Log( $\"Speed = $1.2{Location1.Speed} m/s \"$)";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Speed = "),starter.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.2")),(Object)((_location1.runMethod(true,"getSpeed")))),RemoteObject.createImmutable(" m/s ")))));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
starter._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Private tasks As Map";
starter._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="Private ongoingTasks As Map";
starter._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 13;BA.debugLine="Public GPS1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 14;BA.debugLine="Private gpsStarted As Boolean";
starter._gpsstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 15;BA.debugLine="Public lat, lang As String";
starter._lat = RemoteObject.createImmutable("");
starter._lang = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",1,starter.processBA,starter.mostCurrent,18);
if (RapidSub.canDelegate("service_create")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");
 BA.debugLineNum = 18;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(131072);
 BA.debugLineNum = 21;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(1048576);
starter._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="cache.Initialize";
Debug.ShouldStop(2097152);
starter._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(4194304);
starter._ongoingtasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="GPS1.Initialize(\"GPS\")";
Debug.ShouldStop(8388608);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",1,starter.processBA,starter.mostCurrent,74);
if (RapidSub.canDelegate("service_destroy")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_destroy");
 BA.debugLineNum = 74;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="StopGps";
Debug.ShouldStop(1024);
_stopgps();
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Service_Start (starter) ","starter",1,starter.processBA,starter.mostCurrent,27);
if (RapidSub.canDelegate("service_start")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 27;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",1,starter.processBA,starter.mostCurrent,65);
if (RapidSub.canDelegate("service_taskremoved")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");
 BA.debugLineNum = 65;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGps (starter) ","starter",1,starter.processBA,starter.mostCurrent,32);
if (RapidSub.canDelegate("startgps")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","startgps");
 BA.debugLineNum = 32;BA.debugLine="Public Sub StartGps";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="If gpsStarted = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",starter._gpsstarted,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 34;BA.debugLine="GPS1.Start(0, 0)";
Debug.ShouldStop(2);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 35;BA.debugLine="gpsStarted = True";
Debug.ShouldStop(4);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"True");
 };
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
public static RemoteObject  _stopgps() throws Exception{
try {
		Debug.PushSubsStack("StopGps (starter) ","starter",1,starter.processBA,starter.mostCurrent,39);
if (RapidSub.canDelegate("stopgps")) return b4a.example.starter.remoteMe.runUserSub(false, "starter","stopgps");
 BA.debugLineNum = 39;BA.debugLine="Public Sub StopGps";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="If gpsStarted Then";
Debug.ShouldStop(128);
if (starter._gpsstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 41;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(256);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 42;BA.debugLine="gpsStarted = False";
Debug.ShouldStop(512);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}