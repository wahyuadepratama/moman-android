package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listqurbanjamaah{

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
views.get("mosquename").vw.setLeft((int)((5d / 100 * width)));
views.get("mosquename").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("mosquename").vw.setHeight((int)((20d / 100 * height)));
views.get("mosquename").vw.setTop((int)((2d / 100 * height)));
views.get("qurbancow").vw.setLeft((int)((5d / 100 * width)));
views.get("qurbancow").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("qurbancow").vw.setHeight((int)((16d / 100 * height)));
views.get("qurbancow").vw.setTop((int)((views.get("mosquename").vw.getTop())+(views.get("mosquename").vw.getHeight())));
views.get("btnqurbanhere").vw.setTop((int)((50d / 100 * height)));
views.get("btnqurbanhere").vw.setHeight((int)((70d / 100 * height) - ((50d / 100 * height))));
views.get("btnqurbanhere").vw.setLeft((int)((50d / 100 * width)));
views.get("btnqurbanhere").vw.setWidth((int)((89d / 100 * width) - ((50d / 100 * width))));

}
}