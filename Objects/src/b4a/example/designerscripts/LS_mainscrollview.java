package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainscrollview{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("navbar").vw.setLeft((int)((0d / 100 * width)));
views.get("navbar").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("mainscroll").vw.setLeft((int)((0d / 100 * width)));
views.get("mainscroll").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("navbar").vw.setTop((int)((0d / 100 * height)));
views.get("navbar").vw.setHeight((int)((8d / 100 * height)));
views.get("mainscroll").vw.setTop((int)((views.get("navbar").vw.getTop())+(views.get("navbar").vw.getHeight())));
views.get("backbtn").vw.setLeft((int)((5d / 100 * width)));
views.get("backbtn").vw.setWidth((int)((12d / 100 * width) - ((5d / 100 * width))));
views.get("backbtn").vw.setTop((int)((3d / 100 * height)));
views.get("backbtn").vw.setHeight((int)((5.5d / 100 * height) - ((3d / 100 * height))));
views.get("navbartitle").vw.setLeft((int)((15d / 100 * width)));
views.get("navbartitle").vw.setWidth((int)((80d / 100 * width) - ((15d / 100 * width))));
views.get("navbartitle").vw.setTop((int)((0d / 100 * height)));
views.get("navbartitle").vw.setHeight((int)((8d / 100 * height) - ((0d / 100 * height))));

}
}