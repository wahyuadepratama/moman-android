package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listhistoryjamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panellistitem").vw.setLeft((int)((0d / 100 * width)));
views.get("panellistitem").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panellistitem").vw.setHeight((int)((100d / 100 * height)));
views.get("panellistitem").vw.setTop((int)((0d / 100 * height)));
views.get("panellistqurban").vw.setTop((int)((2d / 100 * height)));
views.get("panellistqurban").vw.setLeft((int)((3d / 100 * width)));
views.get("panellistqurban").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("panellistqurban").vw.setHeight((int)((views.get("panellistitem").vw.getHeight())-(views.get("panellistqurban").vw.getTop())-(2d / 100 * height)));
views.get("lbltransaction").vw.setLeft((int)((5d / 100 * width)));
views.get("lbltransaction").vw.setWidth((int)((32d / 100 * width) - ((5d / 100 * width))));
views.get("lbltransaction").vw.setHeight((int)((15d / 100 * height)));
views.get("lbltransaction").vw.setTop((int)((5d / 100 * height)));
views.get("transname").vw.setLeft((int)((views.get("lbltransaction").vw.getLeft())+(views.get("lbltransaction").vw.getWidth())));
views.get("transname").vw.setWidth((int)((89d / 100 * width) - ((views.get("lbltransaction").vw.getLeft())+(views.get("lbltransaction").vw.getWidth()))));
views.get("transname").vw.setHeight((int)((views.get("lbltransaction").vw.getHeight())));
views.get("transname").vw.setTop((int)((5d / 100 * height)));
views.get("lbldate").vw.setLeft((int)((views.get("lbltransaction").vw.getLeft())));
views.get("lbldate").vw.setWidth((int)((views.get("lbltransaction").vw.getLeft() + views.get("lbltransaction").vw.getWidth()) - ((views.get("lbltransaction").vw.getLeft()))));
views.get("lbldate").vw.setHeight((int)((views.get("lbltransaction").vw.getHeight())));
views.get("lbldate").vw.setTop((int)((views.get("lbltransaction").vw.getTop())+(views.get("lbltransaction").vw.getHeight())));
views.get("datetrans").vw.setLeft((int)((views.get("lbldate").vw.getLeft())+(views.get("lbldate").vw.getWidth())));
views.get("datetrans").vw.setWidth((int)((views.get("transname").vw.getLeft() + views.get("transname").vw.getWidth()) - ((views.get("lbldate").vw.getLeft())+(views.get("lbldate").vw.getWidth()))));
views.get("datetrans").vw.setHeight((int)((views.get("lbltransaction").vw.getHeight())));
views.get("datetrans").vw.setTop((int)((views.get("transname").vw.getTop())+(views.get("transname").vw.getHeight())));
views.get("lblstatus").vw.setLeft((int)((views.get("lbltransaction").vw.getLeft())));
views.get("lblstatus").vw.setWidth((int)((views.get("lbltransaction").vw.getLeft() + views.get("lbltransaction").vw.getWidth()) - ((views.get("lbltransaction").vw.getLeft()))));
views.get("lblstatus").vw.setHeight((int)((views.get("lbltransaction").vw.getHeight())));
views.get("lblstatus").vw.setTop((int)((views.get("lbldate").vw.getTop())+(views.get("lbldate").vw.getHeight())));
views.get("statustransc").vw.setLeft((int)((views.get("lbldate").vw.getLeft())+(views.get("lbldate").vw.getWidth())));
views.get("statustransc").vw.setWidth((int)((views.get("transname").vw.getLeft() + views.get("transname").vw.getWidth()) - ((views.get("lbldate").vw.getLeft())+(views.get("lbldate").vw.getWidth()))));
views.get("statustransc").vw.setHeight((int)((views.get("lbltransaction").vw.getHeight())));
views.get("statustransc").vw.setTop((int)((views.get("lblstatus").vw.getTop())));
views.get("btnshow").vw.setTop((int)((60d / 100 * height)));
views.get("btnshow").vw.setHeight((int)((85d / 100 * height) - ((60d / 100 * height))));
views.get("btnshow").vw.setLeft((int)((60d / 100 * width)));
views.get("btnshow").vw.setWidth((int)((89d / 100 * width) - ((60d / 100 * width))));

}
}