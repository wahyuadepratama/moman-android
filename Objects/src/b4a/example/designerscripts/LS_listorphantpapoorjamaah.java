package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listorphantpapoorjamaah{

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
views.get("mosquename").vw.setTop((int)((5d / 100 * height)));
views.get("address").vw.setLeft((int)((5d / 100 * width)));
views.get("address").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("address").vw.setHeight((int)((15d / 100 * height)));
views.get("address").vw.setTop((int)((views.get("mosquename").vw.getTop())+(views.get("mosquename").vw.getHeight())+(6d / 100 * height)));
views.get("status").vw.setLeft((int)((5d / 100 * width)));
views.get("status").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("status").vw.setHeight((int)((views.get("address").vw.getHeight())));
views.get("status").vw.setTop((int)((views.get("address").vw.getTop())+(views.get("address").vw.getHeight())+(2d / 100 * height)));
views.get("worshipplace").vw.setLeft((int)((5d / 100 * width)));
views.get("worshipplace").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("worshipplace").vw.setHeight((int)((views.get("status").vw.getHeight())));
views.get("worshipplace").vw.setTop((int)((views.get("status").vw.getTop())+(views.get("status").vw.getHeight())+(2d / 100 * height)));
views.get("btndonationhere").vw.setTop((int)((71d / 100 * height)));
views.get("btndonationhere").vw.setHeight((int)((90d / 100 * height) - ((71d / 100 * height))));
views.get("btndonationhere").vw.setLeft((int)((50d / 100 * width)));
views.get("btndonationhere").vw.setWidth((int)((89d / 100 * width) - ((50d / 100 * width))));

}
}