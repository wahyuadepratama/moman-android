package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_poorjamaahdetail{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelqurban").vw.setLeft((int)((0d / 100 * width)));
views.get("panelqurban").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelqurban").vw.setHeight((int)((100d / 100 * height)));
views.get("pnltotal").vw.setLeft((int)((2d / 100 * width)));
views.get("pnltotal").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("pnlpengurus").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlpengurus").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("checkguna").vw.setLeft((int)((2d / 100 * width)));
views.get("checkguna").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("checkhamba").vw.setLeft((int)((2d / 100 * width)));
views.get("checkhamba").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("pnltotal").vw.setHeight((int)((8d / 100 * height)));
views.get("pnlpengurus").vw.setHeight((int)((views.get("pnltotal").vw.getHeight())));
views.get("checkguna").vw.setHeight((int)((views.get("pnltotal").vw.getHeight())));
views.get("checkhamba").vw.setHeight((int)((views.get("pnltotal").vw.getHeight())));
views.get("pnltotal").vw.setTop((int)((2d / 100 * height)));
views.get("pnlpengurus").vw.setTop((int)((views.get("pnltotal").vw.getTop())+(views.get("pnltotal").vw.getHeight())+(2d / 100 * height)));
views.get("checkguna").vw.setTop((int)((views.get("pnlpengurus").vw.getTop())+(views.get("pnlpengurus").vw.getHeight())+(2d / 100 * height)));
views.get("checkhamba").vw.setTop((int)((views.get("checkguna").vw.getTop())+(views.get("checkguna").vw.getHeight())+(2d / 100 * height)));
views.get("button1").vw.setTop((int)((100d / 100 * height)-(10d / 100 * height)));
views.get("button1").vw.setHeight((int)((98d / 100 * height) - ((100d / 100 * height)-(10d / 100 * height))));
views.get("button1").vw.setLeft((int)((2d / 100 * width)));
views.get("button1").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("edittotal").vw.setLeft((int)((0d / 100 * width)));
views.get("edittotal").vw.setWidth((int)((96d / 100 * width) - ((0d / 100 * width))));
views.get("edittotal").vw.setTop((int)((0d / 100 * height)));
views.get("edittotal").vw.setHeight((int)((views.get("pnltotal").vw.getHeight())));
views.get("spinpengurus").vw.setLeft((int)((0d / 100 * width)));
views.get("spinpengurus").vw.setWidth((int)((96d / 100 * width) - ((0d / 100 * width))));
views.get("spinpengurus").vw.setTop((int)((0d / 100 * height)));
views.get("spinpengurus").vw.setHeight((int)((views.get("pnlpengurus").vw.getHeight())));

}
}