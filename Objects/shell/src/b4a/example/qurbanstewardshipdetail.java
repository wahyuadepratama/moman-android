
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

public class qurbanstewardshipdetail implements IRemote{
	public static qurbanstewardshipdetail mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public qurbanstewardshipdetail() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("qurbanstewardshipdetail"), "b4a.example.qurbanstewardshipdetail");
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
		pcBA = new PCBA(this, qurbanstewardshipdetail.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelqurban = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnconfirm = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _navbartitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label12 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _note = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _part11 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
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
public static b4a.example.webview _webview = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",qurbanstewardshipdetail.mostCurrent._activity,"BtnConfirm",qurbanstewardshipdetail.mostCurrent._btnconfirm,"CodeSemua",Debug.moduleToString(b4a.example.codesemua.class),"DonationJamaah",Debug.moduleToString(b4a.example.donationjamaah.class),"DonationJamaahDetail",Debug.moduleToString(b4a.example.donationjamaahdetail.class),"DonationStewardship",Debug.moduleToString(b4a.example.donationstewardship.class),"HistoryJamaah",Debug.moduleToString(b4a.example.historyjamaah.class),"HomeJamaah",Debug.moduleToString(b4a.example.homejamaah.class),"HomeStewardship",Debug.moduleToString(b4a.example.homestewardship.class),"HttpUtils2Service",qurbanstewardshipdetail.mostCurrent._httputils2service,"InvoiceJamaah",Debug.moduleToString(b4a.example.invoicejamaah.class),"Label1",qurbanstewardshipdetail.mostCurrent._label1,"Label10",qurbanstewardshipdetail.mostCurrent._label10,"Label12",qurbanstewardshipdetail.mostCurrent._label12,"Label2",qurbanstewardshipdetail.mostCurrent._label2,"Label4",qurbanstewardshipdetail.mostCurrent._label4,"Label5",qurbanstewardshipdetail.mostCurrent._label5,"Label6",qurbanstewardshipdetail.mostCurrent._label6,"Label7",qurbanstewardshipdetail.mostCurrent._label7,"Label8",qurbanstewardshipdetail.mostCurrent._label8,"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",qurbanstewardshipdetail.mostCurrent._mainscroll,"MapsJamaah",Debug.moduleToString(b4a.example.mapsjamaah.class),"NavbarTitle",qurbanstewardshipdetail.mostCurrent._navbartitle,"Note",qurbanstewardshipdetail.mostCurrent._note,"OrphansJamaah",Debug.moduleToString(b4a.example.orphansjamaah.class),"OrphansJamaahDetail",Debug.moduleToString(b4a.example.orphansjamaahdetail.class),"PanelQurban",qurbanstewardshipdetail.mostCurrent._panelqurban,"Part10",qurbanstewardshipdetail.mostCurrent._part10,"Part11",qurbanstewardshipdetail.mostCurrent._part11,"Part2",qurbanstewardshipdetail.mostCurrent._part2,"Part3",qurbanstewardshipdetail.mostCurrent._part3,"Part4",qurbanstewardshipdetail.mostCurrent._part4,"Part5",qurbanstewardshipdetail.mostCurrent._part5,"Part6",qurbanstewardshipdetail.mostCurrent._part6,"Part7",qurbanstewardshipdetail.mostCurrent._part7,"Part8",qurbanstewardshipdetail.mostCurrent._part8,"Part9",qurbanstewardshipdetail.mostCurrent._part9,"PoorJamaah",Debug.moduleToString(b4a.example.poorjamaah.class),"PoorJamaahDetail",Debug.moduleToString(b4a.example.poorjamaahdetail.class),"QurbanJamaah",Debug.moduleToString(b4a.example.qurbanjamaah.class),"QurbanJamaahDetail",Debug.moduleToString(b4a.example.qurbanjamaahdetail.class),"QurbanStewardship",Debug.moduleToString(b4a.example.qurbanstewardship.class),"Starter",Debug.moduleToString(b4a.example.starter.class),"Starter2",Debug.moduleToString(b4a.example.starter2.class),"TpaJamaah",Debug.moduleToString(b4a.example.tpajamaah.class),"TpaJamaahDetail",Debug.moduleToString(b4a.example.tpajamaahdetail.class),"WebView",Debug.moduleToString(b4a.example.webview.class)};
}
}