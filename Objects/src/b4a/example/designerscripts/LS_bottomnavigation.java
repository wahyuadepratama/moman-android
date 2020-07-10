package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_bottomnavigation{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 3;BA.debugLine="TopNavbar.SetLeftAndRight(0%x,100%x)"[BottomNavigation/General script]
views.get("topnavbar").vw.setLeft((int)((0d / 100 * width)));
views.get("topnavbar").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="TopNavbar.Top = 0%y"[BottomNavigation/General script]
views.get("topnavbar").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 5;BA.debugLine="TopNavbar.Height=8%y"[BottomNavigation/General script]
views.get("topnavbar").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="NavbarTitle.SetLeftAndRight(5%x,80%x)"[BottomNavigation/General script]
views.get("navbartitle").vw.setLeft((int)((5d / 100 * width)));
views.get("navbartitle").vw.setWidth((int)((80d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="NavbarTitle.SetTopAndBottom(0%y,8%y)"[BottomNavigation/General script]
views.get("navbartitle").vw.setTop((int)((0d / 100 * height)));
views.get("navbartitle").vw.setHeight((int)((8d / 100 * height) - ((0d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="Navbar.SetLeftAndRight(0%x,100%x)"[BottomNavigation/General script]
views.get("navbar").vw.setLeft((int)((0d / 100 * width)));
views.get("navbar").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="MainScroll.SetLeftAndRight(0%x,100%x)"[BottomNavigation/General script]
views.get("mainscroll").vw.setLeft((int)((0d / 100 * width)));
views.get("mainscroll").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 11;BA.debugLine="MainScroll.Top = TopNavbar.Height"[BottomNavigation/General script]
views.get("mainscroll").vw.setTop((int)((views.get("topnavbar").vw.getHeight())));
//BA.debugLineNum = 12;BA.debugLine="MainScroll.Height = 100%y"[BottomNavigation/General script]
views.get("mainscroll").vw.setHeight((int)((100d / 100 * height)));
//BA.debugLineNum = 14;BA.debugLine="Navbar.Top = MainScroll.Height - 10%y"[BottomNavigation/General script]
views.get("navbar").vw.setTop((int)((views.get("mainscroll").vw.getHeight())-(10d / 100 * height)));
//BA.debugLineNum = 15;BA.debugLine="Navbar.Height=10%y"[BottomNavigation/General script]
views.get("navbar").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 17;BA.debugLine="PanelProfile.Width = 50%x"[BottomNavigation/General script]
views.get("panelprofile").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 18;BA.debugLine="PanelProfile.Left=0%x"[BottomNavigation/General script]
views.get("panelprofile").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 19;BA.debugLine="PanelProfile.Top = 0%y"[BottomNavigation/General script]
views.get("panelprofile").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="PanelProfile.Height = Navbar.Height"[BottomNavigation/General script]
views.get("panelprofile").vw.setHeight((int)((views.get("navbar").vw.getHeight())));
//BA.debugLineNum = 22;BA.debugLine="PanelQurban.Width = 50%x"[BottomNavigation/General script]
views.get("panelqurban").vw.setWidth((int)((50d / 100 * width)));
//BA.debugLineNum = 23;BA.debugLine="PanelQurban.Left=PanelProfile.Width+PanelProfile.Left"[BottomNavigation/General script]
views.get("panelqurban").vw.setLeft((int)((views.get("panelprofile").vw.getWidth())+(views.get("panelprofile").vw.getLeft())));
//BA.debugLineNum = 24;BA.debugLine="PanelQurban.Top = 0%y"[BottomNavigation/General script]
views.get("panelqurban").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="PanelQurban.Height =Navbar.Height"[BottomNavigation/General script]
views.get("panelqurban").vw.setHeight((int)((views.get("navbar").vw.getHeight())));
//BA.debugLineNum = 28;BA.debugLine="Profile.Width = 5%x"[BottomNavigation/General script]
views.get("profile").vw.setWidth((int)((5d / 100 * width)));
//BA.debugLineNum = 29;BA.debugLine="Profile.Left=(PanelProfile.Width-Profile.Width)/2"[BottomNavigation/General script]
views.get("profile").vw.setLeft((int)(((views.get("panelprofile").vw.getWidth())-(views.get("profile").vw.getWidth()))/2d));
//BA.debugLineNum = 30;BA.debugLine="Profile.Top = 2%y"[BottomNavigation/General script]
views.get("profile").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 31;BA.debugLine="Profile.Height = Profile.Width"[BottomNavigation/General script]
views.get("profile").vw.setHeight((int)((views.get("profile").vw.getWidth())));
//BA.debugLineNum = 33;BA.debugLine="LProfile.Width = 20%x"[BottomNavigation/General script]
views.get("lprofile").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 34;BA.debugLine="LProfile.Left=(PanelProfile.Width-LProfile.Width)/2"[BottomNavigation/General script]
views.get("lprofile").vw.setLeft((int)(((views.get("panelprofile").vw.getWidth())-(views.get("lprofile").vw.getWidth()))/2d));
//BA.debugLineNum = 35;BA.debugLine="LProfile.Top = Profile.Height+Profile.Top"[BottomNavigation/General script]
views.get("lprofile").vw.setTop((int)((views.get("profile").vw.getHeight())+(views.get("profile").vw.getTop())));
//BA.debugLineNum = 36;BA.debugLine="LProfile.Height = 8%y"[BottomNavigation/General script]
views.get("lprofile").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 39;BA.debugLine="Qurban.Width = 5%x"[BottomNavigation/General script]
views.get("qurban").vw.setWidth((int)((5d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="Qurban.Left=(PanelQurban.Width-Qurban.Width)/2"[BottomNavigation/General script]
views.get("qurban").vw.setLeft((int)(((views.get("panelqurban").vw.getWidth())-(views.get("qurban").vw.getWidth()))/2d));
//BA.debugLineNum = 41;BA.debugLine="Qurban.Top = 2%y"[BottomNavigation/General script]
views.get("qurban").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 42;BA.debugLine="Qurban.Height = Qurban.Width"[BottomNavigation/General script]
views.get("qurban").vw.setHeight((int)((views.get("qurban").vw.getWidth())));
//BA.debugLineNum = 44;BA.debugLine="LQurban.Width = 20%x"[BottomNavigation/General script]
views.get("lqurban").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 45;BA.debugLine="LQurban.Left=(PanelQurban.Width-LQurban.Width)/2"[BottomNavigation/General script]
views.get("lqurban").vw.setLeft((int)(((views.get("panelqurban").vw.getWidth())-(views.get("lqurban").vw.getWidth()))/2d));
//BA.debugLineNum = 46;BA.debugLine="LQurban.Top = Qurban.Height+Qurban.Top"[BottomNavigation/General script]
views.get("lqurban").vw.setTop((int)((views.get("qurban").vw.getHeight())+(views.get("qurban").vw.getTop())));
//BA.debugLineNum = 47;BA.debugLine="LQurban.Height = 8%y"[BottomNavigation/General script]
views.get("lqurban").vw.setHeight((int)((8d / 100 * height)));

}
}