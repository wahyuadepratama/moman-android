package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_listdonationjamaah{

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
views.get("projectname").vw.setLeft((int)((5d / 100 * width)));
views.get("projectname").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("projectname").vw.setHeight((int)((20d / 100 * height)));
views.get("projectname").vw.setTop((int)((5d / 100 * height)));
views.get("fundneed").vw.setLeft((int)((5d / 100 * width)));
views.get("fundneed").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("fundneed").vw.setHeight((int)((10d / 100 * height)));
views.get("fundneed").vw.setTop((int)((views.get("projectname").vw.getTop())+(views.get("projectname").vw.getHeight())+(6d / 100 * height)));
views.get("fundcollect").vw.setLeft((int)((5d / 100 * width)));
views.get("fundcollect").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("fundcollect").vw.setHeight((int)((views.get("fundneed").vw.getHeight())));
views.get("fundcollect").vw.setTop((int)((views.get("fundneed").vw.getTop())+(views.get("fundneed").vw.getHeight())+(2d / 100 * height)));
views.get("worshipplace").vw.setLeft((int)((5d / 100 * width)));
views.get("worshipplace").vw.setWidth((int)((89d / 100 * width) - ((5d / 100 * width))));
views.get("worshipplace").vw.setHeight((int)((views.get("fundcollect").vw.getHeight())));
views.get("worshipplace").vw.setTop((int)((views.get("fundcollect").vw.getTop())+(views.get("fundcollect").vw.getHeight())+(2d / 100 * height)));
views.get("btndonationhere").vw.setTop((int)((71d / 100 * height)));
views.get("btndonationhere").vw.setHeight((int)((90d / 100 * height) - ((71d / 100 * height))));
views.get("btndonationhere").vw.setLeft((int)((50d / 100 * width)));
views.get("btndonationhere").vw.setWidth((int)((89d / 100 * width) - ((50d / 100 * width))));

}
}