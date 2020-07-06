package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mapsjamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelmaps").vw.setTop((int)((0d / 100 * height)));
views.get("panelmaps").vw.setHeight((int)((110d / 100 * height)));
views.get("panelmaps").vw.setLeft((int)((0d / 100 * width)));
views.get("panelmaps").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("webview1").vw.setTop((int)((0d / 100 * height)));
views.get("webview1").vw.setHeight((int)((70d / 100 * height)));
views.get("webview1").vw.setLeft((int)((0d / 100 * width)));
views.get("webview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelsearchmap").vw.setTop((int)((views.get("webview1").vw.getTop())+(views.get("webview1").vw.getHeight())));
views.get("panelsearchmap").vw.setLeft((int)((0d / 100 * width)));
views.get("panelsearchmap").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelsearchmap").vw.setHeight((int)((130d / 100 * height)-(views.get("panelsearchmap").vw.getTop())));
views.get("pnlname").vw.setTop((int)((2d / 100 * height)));
views.get("pnlname").vw.setHeight((int)((8d / 100 * height)));
views.get("pnlname").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlname").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("editname").vw.setTop((int)((0d / 100 * height)));
views.get("editname").vw.setLeft((int)((0d / 100 * width)));
views.get("editname").vw.setWidth((int)((96d / 100 * width) - ((0d / 100 * width))));
views.get("editname").vw.setHeight((int)((views.get("pnlname").vw.getHeight())));
views.get("pnlcapacity").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlcapacity").vw.setWidth((int)((49d / 100 * width) - ((2d / 100 * width))));
views.get("pnlcapacity").vw.setTop((int)((views.get("pnlname").vw.getTop())+(views.get("pnlname").vw.getHeight())+(2d / 100 * height)));
views.get("pnlcapacity").vw.setHeight((int)((views.get("pnlname").vw.getHeight())));
views.get("pnlevent").vw.setLeft((int)((51d / 100 * width)));
views.get("pnlevent").vw.setWidth((int)((98d / 100 * width) - ((51d / 100 * width))));
views.get("pnlevent").vw.setTop((int)((views.get("pnlname").vw.getTop())+(views.get("pnlname").vw.getHeight())+(2d / 100 * height)));
views.get("pnlevent").vw.setHeight((int)((views.get("pnlname").vw.getHeight())));
views.get("spincapacity").vw.setTop((int)((0d / 100 * height)));
views.get("spincapacity").vw.setHeight((int)((views.get("pnlcapacity").vw.getHeight())));
views.get("spincapacity").vw.setLeft((int)((0d / 100 * width)));
views.get("spincapacity").vw.setWidth((int)((45d / 100 * width) - ((0d / 100 * width))));
views.get("spinevent").vw.setTop((int)((0d / 100 * height)));
views.get("spinevent").vw.setHeight((int)((views.get("pnlevent").vw.getHeight())));
views.get("spinevent").vw.setLeft((int)((0d / 100 * width)));
views.get("spinevent").vw.setWidth((int)((45d / 100 * width) - ((0d / 100 * width))));
views.get("pnlfacility").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlfacility").vw.setWidth((int)((49d / 100 * width) - ((2d / 100 * width))));
views.get("pnlfacility").vw.setTop((int)((views.get("pnlcapacity").vw.getTop())+(views.get("pnlcapacity").vw.getHeight())+(2d / 100 * height)));
views.get("pnlfacility").vw.setHeight((int)((views.get("pnlcapacity").vw.getHeight())));
views.get("pnlparking").vw.setLeft((int)((51d / 100 * width)));
views.get("pnlparking").vw.setWidth((int)((98d / 100 * width) - ((51d / 100 * width))));
views.get("pnlparking").vw.setTop((int)((views.get("pnlevent").vw.getTop())+(views.get("pnlevent").vw.getHeight())+(2d / 100 * height)));
views.get("pnlparking").vw.setHeight((int)((views.get("pnlevent").vw.getHeight())));
views.get("spinfacility").vw.setTop((int)((0d / 100 * height)));
views.get("spinfacility").vw.setHeight((int)((views.get("pnlfacility").vw.getHeight())));
views.get("spinfacility").vw.setLeft((int)((0d / 100 * width)));
views.get("spinfacility").vw.setWidth((int)((45d / 100 * width) - ((0d / 100 * width))));
views.get("spinparking").vw.setTop((int)((0d / 100 * height)));
views.get("spinparking").vw.setHeight((int)((views.get("pnlparking").vw.getHeight())));
views.get("spinparking").vw.setLeft((int)((0d / 100 * width)));
views.get("spinparking").vw.setWidth((int)((45d / 100 * width) - ((0d / 100 * width))));
views.get("btnsearch").vw.setTop((int)((views.get("pnlfacility").vw.getTop())+(views.get("pnlfacility").vw.getHeight())+(2d / 100 * height)));
views.get("btnsearch").vw.setLeft((int)((2d / 100 * width)));
views.get("btnsearch").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("btnsearch").vw.setHeight((int)((views.get("pnlname").vw.getHeight())));

}
}