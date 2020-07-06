
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

public class qurbanstewardship implements IRemote{
	public static qurbanstewardship mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public qurbanstewardship() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("qurbanstewardship"), "b4a.example.qurbanstewardship");
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
		pcBA = new PCBA(this, qurbanstewardship.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _idselected = RemoteObject.createImmutable("");
public static RemoteObject _idworshipplace = RemoteObject.createImmutable("");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelqurban = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _navbartitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _clv = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _panellistitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _projectname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _idpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fundneed = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _fundcollect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _worshipplace = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _idworship = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ldatetime = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btndonationhere = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _qurban = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.homejamaah _homejamaah = null;
public static b4a.example.qurbanjamaah _qurbanjamaah = null;
public static b4a.example.qurbanjamaahdetail _qurbanjamaahdetail = null;
public static b4a.example.orphansjamaahdetail _orphansjamaahdetail = null;
public static b4a.example.mapsjamaah _mapsjamaah = null;
public static b4a.example.donationstewardship _donationstewardship = null;
public static b4a.example.donationjamaahdetail _donationjamaahdetail = null;
public static b4a.example.homestewardship _homestewardship = null;
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
		return new Object[] {"Activity",qurbanstewardship.mostCurrent._activity,"BtnDonationHere",qurbanstewardship.mostCurrent._btndonationhere,"CLV",qurbanstewardship.mostCurrent._clv,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"DonationStewardship",Debug.moduleToString(b4a.example.donationstewardship.class),"FundCollect",qurbanstewardship.mostCurrent._fundcollect,"FundNeed",qurbanstewardship.mostCurrent._fundneed,"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",qurbanstewardship.mostCurrent._httputils2service,"IDpro",qurbanstewardship.mostCurrent._idpro,"idSelected",qurbanstewardship._idselected,"IDworship",qurbanstewardship.mostCurrent._idworship,"idWorshipplace",qurbanstewardship._idworshipplace,"InvoiceJamaah",Debug.moduleToString(b4a.example.invoicejamaah.class),"LDatetime",qurbanstewardship.mostCurrent._ldatetime,"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",qurbanstewardship.mostCurrent._mainscroll,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"NavbarTitle",qurbanstewardship.mostCurrent._navbartitle,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelListItem",qurbanstewardship.mostCurrent._panellistitem,"PanelQurban",qurbanstewardship.mostCurrent._panelqurban,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"ProjectName",qurbanstewardship.mostCurrent._projectname,"Qurban",qurbanstewardship.mostCurrent._qurban,"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"QurbanStewardshipDetail",Debug.moduleToString(b4a.example.qurbanstewardshipdetail.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter2",Debug.moduleToString(b4a.example.starter2.class),"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"WebView",Debug.moduleToString(b4a.example.webview.class),"WorshipPlace",qurbanstewardship.mostCurrent._worshipplace,"xui",qurbanstewardship._xui};
}
}