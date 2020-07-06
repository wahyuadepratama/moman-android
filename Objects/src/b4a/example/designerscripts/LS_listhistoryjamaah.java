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
views.get("transname").vw.setLeft((int)((5d / 100 * width)));
views.get("transname").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("transname").vw.setHeight((int)((20d / 100 * height)));
views.get("transname").vw.setTop((int)((5d / 100 * height)));
views.get("datetrans").vw.setLeft((int)((5d / 100 * width)));
views.get("datetrans").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("datetrans").vw.setHeight((int)((16d / 100 * height)));
views.get("datetrans").vw.setTop((int)((views.get("transname").vw.getTop())+(views.get("transname").vw.getHeight())));
views.get("totaltrans").vw.setLeft((int)((5d / 100 * width)));
views.get("totaltrans").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("totaltrans").vw.setHeight((int)((16d / 100 * height)));
views.get("totaltrans").vw.setTop((int)((views.get("transname").vw.getTop())+(views.get("transname").vw.getHeight())+(15d / 100 * height)));
views.get("btnshow").vw.setTop((int)((60d / 100 * height)));
views.get("btnshow").vw.setHeight((int)((85d / 100 * height) - ((60d / 100 * height))));
views.get("btnshow").vw.setLeft((int)((50d / 100 * width)));
views.get("btnshow").vw.setWidth((int)((89d / 100 * width) - ((50d / 100 * width))));

}
}