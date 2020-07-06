package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_homestewardship{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelhome").vw.setLeft((int)((0d / 100 * width)));
views.get("panelhome").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelhome").vw.setHeight((int)((100d / 100 * height)));
views.get("panelprofile").vw.setTop((int)((2d / 100 * height)));
views.get("panelprofile").vw.setLeft((int)((2d / 100 * width)));
views.get("panelprofile").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panelphoto").vw.setLeft((int)((35d / 100 * width)));
views.get("panelphoto").vw.setWidth((int)((63d / 100 * width) - ((35d / 100 * width))));
views.get("panelphoto").vw.setHeight((int)((20d / 100 * height)));
views.get("labelname").vw.setHeight((int)((7d / 100 * width)));
views.get("labelnumber").vw.setHeight((int)((7d / 100 * width)));
views.get("labeluser").vw.setHeight((int)((7d / 100 * width)));
views.get("labelrekening").vw.setHeight((int)((7d / 100 * width)));
views.get("labelnorekening1").vw.setHeight((int)((7d / 100 * width)));
views.get("labelnorekening2").vw.setHeight((int)((7d / 100 * width)));
views.get("logout").vw.setHeight((int)((15d / 100 * width)));
views.get("panelphoto").vw.setTop((int)((10d / 100 * width)));
views.get("labelname").vw.setTop((int)((views.get("panelphoto").vw.getTop())+(views.get("panelphoto").vw.getHeight())+(2d / 100 * height)));
views.get("labelnumber").vw.setTop((int)((views.get("labelname").vw.getTop())+(views.get("labelname").vw.getHeight())));
views.get("labeluser").vw.setTop((int)((views.get("labelnumber").vw.getTop())+(views.get("labelnumber").vw.getHeight())));
views.get("labelrekening").vw.setTop((int)((views.get("labeluser").vw.getTop())+(views.get("labeluser").vw.getHeight())));
views.get("labelnorekening1").vw.setTop((int)((views.get("labelrekening").vw.getTop())+(views.get("labelrekening").vw.getHeight())));
views.get("labelnorekening2").vw.setTop((int)((views.get("labelnorekening1").vw.getTop())+(views.get("labelnorekening1").vw.getHeight())));
views.get("logout").vw.setTop((int)((views.get("labelnorekening2").vw.getTop())+(views.get("labelnorekening2").vw.getHeight())));
views.get("panelprofile").vw.setHeight((int)((views.get("panelphoto").vw.getHeight())+(views.get("panelphoto").vw.getTop())+(65d / 100 * width)));

}
}