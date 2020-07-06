package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_webview{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelmaps").vw.setTop((int)((0d / 100 * height)));
views.get("panelmaps").vw.setHeight((int)((110d / 100 * height)));
views.get("panelmaps").vw.setLeft((int)((0d / 100 * width)));
views.get("panelmaps").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("webview1").vw.setTop((int)((0d / 100 * height)));
views.get("webview1").vw.setHeight((int)((views.get("panelmaps").vw.getHeight())));
views.get("webview1").vw.setLeft((int)((0d / 100 * width)));
views.get("webview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}