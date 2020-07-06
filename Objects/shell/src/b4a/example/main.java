
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _phone = RemoteObject.createImmutable("");
public static RemoteObject _status = RemoteObject.createImmutable("");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _worship_name = RemoteObject.createImmutable("");
public static RemoteObject _types = RemoteObject.createImmutable("");
public static RemoteObject _address = RemoteObject.createImmutable("");
public static RemoteObject _updated_at = RemoteObject.createImmutable("");
public static RemoteObject _avatar = RemoteObject.createImmutable("");
public static RemoteObject _worship_place_address = RemoteObject.createImmutable("");
public static RemoteObject _server = RemoteObject.createImmutable("");
public static RemoteObject _manager = RemoteObject.declareNull("de.amberhome.objects.preferenceactivity.PreferenceManager");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _editpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _md5string = RemoteObject.createImmutable("");
public static RemoteObject _pstep = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pjam = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelstep = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeljam = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.starter _starter = null;
public static b4a.example.homejamaah _homejamaah = null;
public static b4a.example.qurbanjamaah _qurbanjamaah = null;
public static b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public static b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public static b4a.example.mapsjamaah _mapsjamaah = null;
public static b4a.example.donationstewardship _donationstewardship = null;
public static b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public static b4a.example.homestewardship _homestewardship = null;
public static b4a.example.qurbanstewardship _qurbanstewardship = null;
public static b4a.example.orphansjamaah _orphansjamaah = null;
public static b4a.example.historyjamaah _historyjamaah = null;
public static b4a.example.donationjamaah _donationjamaah = null;
public static b4a.example.codesemua _codesemua = null;
public static b4a.example.tpajamaah _tpajamaah = null;
public static b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public static b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public static b4a.example.poorjamaah _poorjamaah = null;
public static b4a.example.invoicejamaah _invoicejamaah = null;
public static b4a.example.starter2 _starter2 = null;
public static b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public static b4a.example.webview _webview = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"address",main._address,"avatar",main._avatar,"BtnLogin",main.mostCurrent._btnlogin,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"DonationStewardship",Debug.moduleToString(b4a.example.donationstewardship.class),"EditPassword",main.mostCurrent._editpassword,"EditUsername",main.mostCurrent._editusername,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",main.mostCurrent._httputils2service,"id",main._id,"InvoiceJamaah",Debug.moduleToString(b4a.example.invoicejamaah.class),"labeljam",main.mostCurrent._labeljam,"Labelstep",main.mostCurrent._labelstep,"MainScroll",main.mostCurrent._mainscroll,"manager",main._manager,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"md5string",main.mostCurrent._md5string,"Navbar",main.mostCurrent._navbar,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelLogin",main.mostCurrent._panellogin,"phone",main._phone,"pjam",main.mostCurrent._pjam,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"pstep",main.mostCurrent._pstep,"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"QurbanStewardship",Debug.moduleToString(b4a.example.qurbanstewardship.class),"QurbanStewardshipDetail",Debug.moduleToString(b4a.example.qurbanstewardshipdetail.class),"server",main._server,"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter2",Debug.moduleToString(b4a.example.starter2.class),"status",main._status,"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"types",main._types,"updated_at",main._updated_at,"username",main._username,"WebView",Debug.moduleToString(b4a.example.webview.class),"worship_name",main._worship_name,"worship_place_address",main._worship_place_address};
}
}