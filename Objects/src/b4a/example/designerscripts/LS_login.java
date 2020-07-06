package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_login{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panellogin").vw.setLeft((int)((0d / 100 * width)));
views.get("panellogin").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panellogin").vw.setTop((int)((0d / 100 * height)));
views.get("panellogin").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("imagelogin").vw.setTop((int)((10d / 100 * height)));
views.get("imagelogin").vw.setTop((int)((10d / 100 * height)));
views.get("imagelogin").vw.setHeight((int)((30d / 100 * height) - ((10d / 100 * height))));
views.get("imagelogin").vw.setLeft((int)((35d / 100 * width)));
views.get("imagelogin").vw.setWidth((int)((65d / 100 * width) - ((35d / 100 * width))));
views.get("editusername").vw.setTop((int)((35d / 100 * height)));
views.get("editusername").vw.setHeight((int)((43d / 100 * height) - ((35d / 100 * height))));
views.get("editpassword").vw.setTop((int)((45d / 100 * height)));
views.get("editpassword").vw.setHeight((int)((53d / 100 * height) - ((45d / 100 * height))));
views.get("editusername").vw.setLeft((int)((10d / 100 * width)));
views.get("editusername").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("editpassword").vw.setLeft((int)((10d / 100 * width)));
views.get("editpassword").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("btnlogin").vw.setTop((int)((55d / 100 * height)));
views.get("btnlogin").vw.setHeight((int)((63d / 100 * height) - ((55d / 100 * height))));
views.get("btnlogin").vw.setLeft((int)((10d / 100 * width)));
views.get("btnlogin").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
views.get("pstep").vw.setTop((int)((65d / 100 * height)));
views.get("pstep").vw.setHeight((int)((75d / 100 * height) - ((65d / 100 * height))));
views.get("pstep").vw.setLeft((int)((10d / 100 * width)));
views.get("pstep").vw.setWidth((int)((52d / 100 * width) - ((10d / 100 * width))));
views.get("pjam").vw.setTop((int)((65d / 100 * height)));
views.get("pjam").vw.setHeight((int)((75d / 100 * height) - ((65d / 100 * height))));
views.get("pjam").vw.setLeft((int)((51d / 100 * width)));
views.get("pjam").vw.setWidth((int)((90d / 100 * width) - ((51d / 100 * width))));
views.get("labelstep").vw.setTop((int)((0d / 100 * height)));
views.get("labelstep").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("labelstep").vw.setLeft((int)((0d / 100 * width)));
views.get("labelstep").vw.setWidth((int)((42d / 100 * width) - ((0d / 100 * width))));
views.get("labeljam").vw.setTop((int)((0d / 100 * height)));
views.get("labeljam").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("labeljam").vw.setLeft((int)((0d / 100 * width)));
views.get("labeljam").vw.setWidth((int)((39d / 100 * width) - ((0d / 100 * width))));

}
}