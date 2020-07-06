package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_qurbanjamaahdetail{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelqurban").vw.setLeft((int)((0d / 100 * width)));
views.get("panelqurban").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelqurban").vw.setHeight((int)((130d / 100 * height)));
views.get("pnlpengurus").vw.setLeft((int)((2d / 100 * width)));
views.get("pnlpengurus").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("pnlpengurus").vw.setHeight((int)((views.get("edittext1").vw.getHeight())));
views.get("pnlpengurus").vw.setTop((int)((2d / 100 * height)));
views.get("spinpengurus").vw.setLeft((int)((0d / 100 * width)));
views.get("spinpengurus").vw.setWidth((int)((96d / 100 * width) - ((0d / 100 * width))));
views.get("spinpengurus").vw.setTop((int)((0d / 100 * height)));
views.get("spinpengurus").vw.setHeight((int)((views.get("pnlpengurus").vw.getHeight())));
views.get("edittext1").vw.setLeft((int)((2d / 100 * width)));
views.get("edittext1").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("edittext1").vw.setHeight((int)((8d / 100 * height)));
views.get("edittext1").vw.setTop((int)((views.get("pnlpengurus").vw.getTop())+(views.get("pnlpengurus").vw.getHeight())+(2d / 100 * height)));
views.get("button1").vw.setHeight((int)((8d / 100 * height)));
views.get("button1").vw.setLeft((int)((2d / 100 * width)));
views.get("button1").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("button1").vw.setTop((int)((views.get("edittext1").vw.getTop())+(views.get("edittext1").vw.getHeight())+(2d / 100 * height)));

}
}