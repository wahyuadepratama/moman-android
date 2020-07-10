
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

public class donationjamaahdetail implements IRemote{
	public static donationjamaahdetail mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public donationjamaahdetail() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("donationjamaahdetail"), "b4a.example.donationjamaahdetail");
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
		pcBA = new PCBA(this, donationjamaahdetail.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbartitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelqurban = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _horizontalscrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _fundneeded = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fundcollected = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _description = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progress = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _edittotal = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _spinpengurus = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _checkguna = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _checkhamba = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _pengurus = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _accountid = RemoteObject.createImmutable("");
public static RemoteObject _publicid = RemoteObject.createImmutable("");
public static RemoteObject _notransaction = RemoteObject.createImmutable("");
public static RemoteObject _account = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public static b4a.example.homejamaah _homejamaah = null;
public static b4a.example.qurbanjamaah _qurbanjamaah = null;
public static b4a.example.codesemua _codesemua = null;
public static b4a.example.poorjamaahdetail _poorjamaahdetail = null;
public static b4a.example.invoicejamaah _invoicejamaah = null;
public static b4a.example.historyjamaah _historyjamaah = null;
public static b4a.example.homestewardship _homestewardship = null;
public static b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public static b4a.example.mapsjamaah _mapsjamaah = null;
public static b4a.example.qurbanstewardship _qurbanstewardship = null;
public static b4a.example.orphansjamaah _orphansjamaah = null;
public static b4a.example.donationjamaah _donationjamaah = null;
public static b4a.example.tpajamaah _tpajamaah = null;
public static b4a.example.tpajamaahdetail _tpajamaahdetail = null;
public static b4a.example.poorjamaah _poorjamaah = null;
public static b4a.example.starter2 _starter2 = null;
public static b4a.example.qurbanstewardshipdetail _qurbanstewardshipdetail = null;
public static b4a.example.webview _webview = null;
  public Object[] GetGlobals() {
		return new Object[] {"account",donationjamaahdetail.mostCurrent._account,"accountId",donationjamaahdetail.mostCurrent._accountid,"Activity",donationjamaahdetail.mostCurrent._activity,"Button1",donationjamaahdetail.mostCurrent._button1,"Button3",donationjamaahdetail.mostCurrent._button3,"CheckGuna",donationjamaahdetail.mostCurrent._checkguna,"CheckHamba",donationjamaahdetail.mostCurrent._checkhamba,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"CustomListView1",donationjamaahdetail.mostCurrent._customlistview1,"Description",donationjamaahdetail.mostCurrent._description,"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"EditTotal",donationjamaahdetail.mostCurrent._edittotal,"FundCollected",donationjamaahdetail.mostCurrent._fundcollected,"FundNeeded",donationjamaahdetail.mostCurrent._fundneeded,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HorizontalScrollView1",donationjamaahdetail.mostCurrent._horizontalscrollview1,"HttpUtils2Service",donationjamaahdetail.mostCurrent._httputils2service,"ImageView1",donationjamaahdetail.mostCurrent._imageview1,"InvoiceJamaah",Debug.moduleToString(b4a.example.invoicejamaah.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",donationjamaahdetail.mostCurrent._mainscroll,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"NavbarTitle",donationjamaahdetail.mostCurrent._navbartitle,"noTransaction",donationjamaahdetail.mostCurrent._notransaction,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelQurban",donationjamaahdetail.mostCurrent._panelqurban,"pengurus",donationjamaahdetail.mostCurrent._pengurus,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"Progress",donationjamaahdetail.mostCurrent._progress,"publicId",donationjamaahdetail.mostCurrent._publicid,"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"QurbanStewardship",Debug.moduleToString(b4a.example.qurbanstewardship.class),"QurbanStewardshipDetail",Debug.moduleToString(b4a.example.qurbanstewardshipdetail.class),"SpinPengurus",donationjamaahdetail.mostCurrent._spinpengurus,"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter2",Debug.moduleToString(b4a.example.starter2.class),"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"WebView",Debug.moduleToString(b4a.example.webview.class),"xui",donationjamaahdetail._xui};
}
}