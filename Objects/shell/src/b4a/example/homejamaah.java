
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

public class homejamaah implements IRemote{
	public static homejamaah mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homejamaah() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homejamaah"), "b4a.example.homejamaah");
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
		pcBA = new PCBA(this, homejamaah.class);
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
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelnumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labeluser = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _navbartitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mapbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _qurbanbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _constructionbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelphoto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _orphanbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tpabtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _poorbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _historybtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _logoutbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _historylabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _logoutlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbanner = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
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
		return new Object[] {"Activity",homejamaah.mostCurrent._activity,"address",homejamaah._address,"avatar",homejamaah._avatar,"BackBtn",homejamaah.mostCurrent._backbtn,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"constructionBtn",homejamaah.mostCurrent._constructionbtn,"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"DonationStewardship",Debug.moduleToString(b4a.example.donationstewardship.class),"historyBtn",homejamaah.mostCurrent._historybtn,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"historyLabel",homejamaah.mostCurrent._historylabel,"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",homejamaah.mostCurrent._httputils2service,"id",homejamaah._id,"InvoiceJamaah",Debug.moduleToString(b4a.example.invoicejamaah.class),"LabelName",homejamaah.mostCurrent._labelname,"LabelNumber",homejamaah.mostCurrent._labelnumber,"LabelUser",homejamaah.mostCurrent._labeluser,"logoutBtn",homejamaah.mostCurrent._logoutbtn,"logoutLabel",homejamaah.mostCurrent._logoutlabel,"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",homejamaah.mostCurrent._mainscroll,"mapBtn",homejamaah.mostCurrent._mapbtn,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"Navbar",homejamaah.mostCurrent._navbar,"NavbarTitle",homejamaah.mostCurrent._navbartitle,"orphanBtn",homejamaah.mostCurrent._orphanbtn,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelBanner",homejamaah.mostCurrent._panelbanner,"PanelHome",homejamaah.mostCurrent._panelhome,"PanelMenu",homejamaah.mostCurrent._panelmenu,"PanelPhoto",homejamaah.mostCurrent._panelphoto,"phone",homejamaah._phone,"poorBtn",homejamaah.mostCurrent._poorbtn,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"qurbanBtn",homejamaah.mostCurrent._qurbanbtn,"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"QurbanStewardship",Debug.moduleToString(b4a.example.qurbanstewardship.class),"QurbanStewardshipDetail",Debug.moduleToString(b4a.example.qurbanstewardshipdetail.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter2",Debug.moduleToString(b4a.example.starter2.class),"status",homejamaah._status,"tpaBtn",homejamaah.mostCurrent._tpabtn,"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"types",homejamaah._types,"updated_at",homejamaah._updated_at,"username",homejamaah._username,"WebView",Debug.moduleToString(b4a.example.webview.class),"worship_name",homejamaah._worship_name,"worship_place_address",homejamaah._worship_place_address};
}
}