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
//BA.debugLineNum = 18;BA.debugLine="Profile.SetLeftAndRight(15%x,25%x)"[BottomNavigation/General script]
views.get("profile").vw.setLeft((int)((15d / 100 * width)));
views.get("profile").vw.setWidth((int)((25d / 100 * width) - ((15d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="Profile.Top = 2%y"[BottomNavigation/General script]
views.get("profile").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 20;BA.debugLine="Profile.Width = 50"[BottomNavigation/General script]
views.get("profile").vw.setWidth((int)(50d));
//BA.debugLineNum = 21;BA.debugLine="Profile.Height = 50"[BottomNavigation/General script]
views.get("profile").vw.setHeight((int)(50d));
//BA.debugLineNum = 23;BA.debugLine="LProfile.SetLeftAndRight(14%x,26%x)"[BottomNavigation/General script]
views.get("lprofile").vw.setLeft((int)((14d / 100 * width)));
views.get("lprofile").vw.setWidth((int)((26d / 100 * width) - ((14d / 100 * width))));
//BA.debugLineNum = 24;BA.debugLine="LProfile.Top = Profile.Height"[BottomNavigation/General script]
views.get("lprofile").vw.setTop((int)((views.get("profile").vw.getHeight())));
//BA.debugLineNum = 27;BA.debugLine="Donation.SetLeftAndRight(36%x,46%x)"[BottomNavigation/General script]
views.get("donation").vw.setLeft((int)((36d / 100 * width)));
views.get("donation").vw.setWidth((int)((46d / 100 * width) - ((36d / 100 * width))));
//BA.debugLineNum = 28;BA.debugLine="Donation.Top = 2%y"[BottomNavigation/General script]
views.get("donation").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="Donation.Width = 50"[BottomNavigation/General script]
views.get("donation").vw.setWidth((int)(50d));
//BA.debugLineNum = 30;BA.debugLine="Donation.Height = 50"[BottomNavigation/General script]
views.get("donation").vw.setHeight((int)(50d));
//BA.debugLineNum = 32;BA.debugLine="LDonation.SetLeftAndRight(33%x,47%x)"[BottomNavigation/General script]
views.get("ldonation").vw.setLeft((int)((33d / 100 * width)));
views.get("ldonation").vw.setWidth((int)((47d / 100 * width) - ((33d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="LDonation.Top = Profile.Height"[BottomNavigation/General script]
views.get("ldonation").vw.setTop((int)((views.get("profile").vw.getHeight())));
//BA.debugLineNum = 36;BA.debugLine="Qurban.SetLeftAndRight(55%x,65%x)"[BottomNavigation/General script]
views.get("qurban").vw.setLeft((int)((55d / 100 * width)));
views.get("qurban").vw.setWidth((int)((65d / 100 * width) - ((55d / 100 * width))));
//BA.debugLineNum = 37;BA.debugLine="Qurban.Top = 2%y"[BottomNavigation/General script]
views.get("qurban").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 38;BA.debugLine="Qurban.Width = 50"[BottomNavigation/General script]
views.get("qurban").vw.setWidth((int)(50d));
//BA.debugLineNum = 39;BA.debugLine="Qurban.Height = 50"[BottomNavigation/General script]
views.get("qurban").vw.setHeight((int)(50d));
//BA.debugLineNum = 41;BA.debugLine="LQurban.SetLeftAndRight(54%x,66%x)"[BottomNavigation/General script]
views.get("lqurban").vw.setLeft((int)((54d / 100 * width)));
views.get("lqurban").vw.setWidth((int)((66d / 100 * width) - ((54d / 100 * width))));
//BA.debugLineNum = 42;BA.debugLine="LQurban.Top = Profile.Height"[BottomNavigation/General script]
views.get("lqurban").vw.setTop((int)((views.get("profile").vw.getHeight())));
//BA.debugLineNum = 45;BA.debugLine="Web.SetLeftAndRight(76%x,86%x)"[BottomNavigation/General script]
views.get("web").vw.setLeft((int)((76d / 100 * width)));
views.get("web").vw.setWidth((int)((86d / 100 * width) - ((76d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="Web.Top = 2%y"[BottomNavigation/General script]
views.get("web").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 47;BA.debugLine="Web.Width = 50"[BottomNavigation/General script]
views.get("web").vw.setWidth((int)(50d));
//BA.debugLineNum = 48;BA.debugLine="Web.Height = 50"[BottomNavigation/General script]
views.get("web").vw.setHeight((int)(50d));
//BA.debugLineNum = 50;BA.debugLine="LWeb.SetLeftAndRight(72%x,88%x)"[BottomNavigation/General script]
views.get("lweb").vw.setLeft((int)((72d / 100 * width)));
views.get("lweb").vw.setWidth((int)((88d / 100 * width) - ((72d / 100 * width))));
//BA.debugLineNum = 51;BA.debugLine="LWeb.Top = Profile.Height"[BottomNavigation/General script]
views.get("lweb").vw.setTop((int)((views.get("profile").vw.getHeight())));

}
}