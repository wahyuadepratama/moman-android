package b4a.example.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_confirmationdonationjamaah{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panelqurban").vw.setLeft((int)((0d / 100 * width)));
views.get("panelqurban").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelqurban").vw.setTop((int)((0d / 100 * height)));
views.get("panelqurban").vw.setHeight((int)((110d / 100 * height)));
views.get("panelinvoice").vw.setTop((int)((2d / 100 * height)));
views.get("panelinvoice").vw.setLeft((int)((3d / 100 * width)));
views.get("panelinvoice").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("panelinvoice").vw.setHeight((int)((views.get("labeldate").vw.getTop())+(views.get("labeldate").vw.getHeight())));
views.get("btnconfirm").vw.setTop((int)((100d / 100 * height)));
views.get("btnconfirm").vw.setHeight((int)((110d / 100 * height) - ((100d / 100 * height))));
views.get("btnconfirm").vw.setLeft((int)((3d / 100 * width)));
views.get("btnconfirm").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("imageview1").vw.setTop((int)((2d / 100 * height)));
views.get("imageview1").vw.setLeft((int)((2d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((25d / 100 * width) - ((2d / 100 * width))));
views.get("imageview1").vw.setHeight((int)((20d / 100 * width)));
views.get("label3").vw.setTop((int)((2d / 100 * height)));
views.get("label3").vw.setLeft((int)((5d / 100 * width)));
views.get("label3").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("label5").vw.setTop((int)((0d / 100 * height)));
views.get("label5").vw.setLeft((int)((5d / 100 * width)));
views.get("label5").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label5").vw.setHeight((int)((5d / 100 * height)*2d));
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("label4").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label4").vw.setLeft((int)((40d / 100 * width)));
views.get("label4").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
views.get("label6").vw.setTop((int)((views.get("label5").vw.getTop())));
views.get("label6").vw.setHeight((int)((views.get("label5").vw.getHeight())));
views.get("label6").vw.setLeft((int)((40d / 100 * width)));
views.get("label6").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
views.get("label7").vw.setTop((int)((2d / 100 * height)));
views.get("label7").vw.setLeft((int)((5d / 100 * width)));
views.get("label7").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label7").vw.setHeight((int)((5d / 100 * height)));
views.get("label8").vw.setTop((int)((views.get("label7").vw.getTop())));
views.get("label8").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label8").vw.setLeft((int)((40d / 100 * width)));
views.get("label8").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
views.get("label9").vw.setTop((int)((0d / 100 * height)));
views.get("label9").vw.setLeft((int)((5d / 100 * width)));
views.get("label9").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
views.get("label9").vw.setHeight((int)((5d / 100 * height)));
views.get("label10").vw.setTop((int)((views.get("label9").vw.getTop())));
views.get("label10").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 48;BA.debugLine="Label10.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label10").vw.setLeft((int)((40d / 100 * width)));
views.get("label10").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 50;BA.debugLine="LblUnpaid.Top = 0%y"[ConfirmationDonationJamaah/General script]
views.get("lblunpaid").vw.setTop((int)((0d / 100 * height)));
//BA.debugLineNum = 51;BA.debugLine="LblUnpaid.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("lblunpaid").vw.setLeft((int)((5d / 100 * width)));
views.get("lblunpaid").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="LblUnpaid.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("lblunpaid").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 54;BA.debugLine="valueUnpaid.Top = LblUnpaid.Top"[ConfirmationDonationJamaah/General script]
views.get("valueunpaid").vw.setTop((int)((views.get("lblunpaid").vw.getTop())));
//BA.debugLineNum = 55;BA.debugLine="valueUnpaid.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("valueunpaid").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 56;BA.debugLine="valueUnpaid.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("valueunpaid").vw.setLeft((int)((40d / 100 * width)));
views.get("valueunpaid").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 58;BA.debugLine="LblPaid.Top = LblUnpaid.Top + LblUnpaid.Height"[ConfirmationDonationJamaah/General script]
views.get("lblpaid").vw.setTop((int)((views.get("lblunpaid").vw.getTop())+(views.get("lblunpaid").vw.getHeight())));
//BA.debugLineNum = 59;BA.debugLine="LblPaid.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("lblpaid").vw.setLeft((int)((5d / 100 * width)));
views.get("lblpaid").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 60;BA.debugLine="LblPaid.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("lblpaid").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 62;BA.debugLine="valuePaid.Top = valueUnpaid.Top + valueUnpaid.Height"[ConfirmationDonationJamaah/General script]
views.get("valuepaid").vw.setTop((int)((views.get("valueunpaid").vw.getTop())+(views.get("valueunpaid").vw.getHeight())));
//BA.debugLineNum = 63;BA.debugLine="valuePaid.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("valuepaid").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 64;BA.debugLine="valuePaid.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("valuepaid").vw.setLeft((int)((40d / 100 * width)));
views.get("valuepaid").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 66;BA.debugLine="LblStatus.Top = LblPaid.Top + LblPaid.Height"[ConfirmationDonationJamaah/General script]
views.get("lblstatus").vw.setTop((int)((views.get("lblpaid").vw.getTop())+(views.get("lblpaid").vw.getHeight())));
//BA.debugLineNum = 67;BA.debugLine="LblStatus.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("lblstatus").vw.setLeft((int)((5d / 100 * width)));
views.get("lblstatus").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 68;BA.debugLine="LblStatus.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("lblstatus").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 70;BA.debugLine="valueStatus.Top = valuePaid.Top + valuePaid.Height"[ConfirmationDonationJamaah/General script]
views.get("valuestatus").vw.setTop((int)((views.get("valuepaid").vw.getTop())+(views.get("valuepaid").vw.getHeight())));
//BA.debugLineNum = 71;BA.debugLine="valueStatus.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("valuestatus").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 72;BA.debugLine="valueStatus.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("valuestatus").vw.setLeft((int)((40d / 100 * width)));
views.get("valuestatus").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 74;BA.debugLine="LblPaymentInformation.Top = LblStatus.Top + LblStatus.Height"[ConfirmationDonationJamaah/General script]
views.get("lblpaymentinformation").vw.setTop((int)((views.get("lblstatus").vw.getTop())+(views.get("lblstatus").vw.getHeight())));
//BA.debugLineNum = 75;BA.debugLine="LblPaymentInformation.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("lblpaymentinformation").vw.setLeft((int)((5d / 100 * width)));
views.get("lblpaymentinformation").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 76;BA.debugLine="LblPaymentInformation.Height=5%y*2"[ConfirmationDonationJamaah/General script]
views.get("lblpaymentinformation").vw.setHeight((int)((5d / 100 * height)*2d));
//BA.debugLineNum = 78;BA.debugLine="valuePaymentInfo.Top = valueStatus.Top + valueStatus.Height"[ConfirmationDonationJamaah/General script]
views.get("valuepaymentinfo").vw.setTop((int)((views.get("valuestatus").vw.getTop())+(views.get("valuestatus").vw.getHeight())));
//BA.debugLineNum = 79;BA.debugLine="valuePaymentInfo.Height=Label3.Height*2"[ConfirmationDonationJamaah/General script]
views.get("valuepaymentinfo").vw.setHeight((int)((views.get("label3").vw.getHeight())*2d));
//BA.debugLineNum = 80;BA.debugLine="valuePaymentInfo.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("valuepaymentinfo").vw.setLeft((int)((40d / 100 * width)));
views.get("valuepaymentinfo").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 82;BA.debugLine="LblConfirmation.Top = LblPaymentInformation.Top + LblPaymentInformation.Height"[ConfirmationDonationJamaah/General script]
views.get("lblconfirmation").vw.setTop((int)((views.get("lblpaymentinformation").vw.getTop())+(views.get("lblpaymentinformation").vw.getHeight())));
//BA.debugLineNum = 83;BA.debugLine="LblConfirmation.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("lblconfirmation").vw.setLeft((int)((5d / 100 * width)));
views.get("lblconfirmation").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 84;BA.debugLine="LblConfirmation.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("lblconfirmation").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 86;BA.debugLine="valueConfirmation.Top = valuePaymentInfo.Top + valuePaymentInfo.Height"[ConfirmationDonationJamaah/General script]
views.get("valueconfirmation").vw.setTop((int)((views.get("valuepaymentinfo").vw.getTop())+(views.get("valuepaymentinfo").vw.getHeight())));
//BA.debugLineNum = 87;BA.debugLine="valueConfirmation.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("valueconfirmation").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 88;BA.debugLine="valueConfirmation.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("valueconfirmation").vw.setLeft((int)((40d / 100 * width)));
views.get("valueconfirmation").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 90;BA.debugLine="PanelWorshipPlace.Top = 2%y + PanelInvoice.Top+PanelInvoice.Height"[ConfirmationDonationJamaah/General script]
views.get("panelworshipplace").vw.setTop((int)((2d / 100 * height)+(views.get("panelinvoice").vw.getTop())+(views.get("panelinvoice").vw.getHeight())));
//BA.debugLineNum = 91;BA.debugLine="PanelWorshipPlace.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panelworshipplace").vw.setLeft((int)((3d / 100 * width)));
views.get("panelworshipplace").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 92;BA.debugLine="PanelWorshipPlace.Height=(Label3.Top*2) + Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("panelworshipplace").vw.setHeight((int)(((views.get("label3").vw.getTop())*2d)+(views.get("label3").vw.getHeight())));
//BA.debugLineNum = 94;BA.debugLine="PanelAnimalPrice.Top = PanelWorshipPlace.Top+PanelWorshipPlace.Height"[ConfirmationDonationJamaah/General script]
views.get("panelanimalprice").vw.setTop((int)((views.get("panelworshipplace").vw.getTop())+(views.get("panelworshipplace").vw.getHeight())));
//BA.debugLineNum = 95;BA.debugLine="PanelAnimalPrice.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panelanimalprice").vw.setLeft((int)((3d / 100 * width)));
views.get("panelanimalprice").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 96;BA.debugLine="PanelAnimalPrice.Height=(Label3.Top*2) + Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("panelanimalprice").vw.setHeight((int)(((views.get("label3").vw.getTop())*2d)+(views.get("label3").vw.getHeight())));
//BA.debugLineNum = 98;BA.debugLine="PanelLabelAnimal.Top = 2%y + PanelAnimalPrice.Top+PanelAnimalPrice.Height"[ConfirmationDonationJamaah/General script]
views.get("panellabelanimal").vw.setTop((int)((2d / 100 * height)+(views.get("panelanimalprice").vw.getTop())+(views.get("panelanimalprice").vw.getHeight())));
//BA.debugLineNum = 99;BA.debugLine="PanelLabelAnimal.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panellabelanimal").vw.setLeft((int)((3d / 100 * width)));
views.get("panellabelanimal").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 100;BA.debugLine="PanelLabelAnimal.Height=(Label3.Top*2) + Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("panellabelanimal").vw.setHeight((int)(((views.get("label3").vw.getTop())*2d)+(views.get("label3").vw.getHeight())));
//BA.debugLineNum = 102;BA.debugLine="PanelTotalOrder.Top = PanelLabelAnimal.Top+PanelLabelAnimal.Height"[ConfirmationDonationJamaah/General script]
views.get("paneltotalorder").vw.setTop((int)((views.get("panellabelanimal").vw.getTop())+(views.get("panellabelanimal").vw.getHeight())));
//BA.debugLineNum = 103;BA.debugLine="PanelTotalOrder.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("paneltotalorder").vw.setLeft((int)((3d / 100 * width)));
views.get("paneltotalorder").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 104;BA.debugLine="PanelTotalOrder.Height=(Label3.Top*2) + Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("paneltotalorder").vw.setHeight((int)(((views.get("label3").vw.getTop())*2d)+(views.get("label3").vw.getHeight())));
//BA.debugLineNum = 106;BA.debugLine="PanelLabelPayment.Top = 2%y + PanelTotalOrder.Top+PanelTotalOrder.Height"[ConfirmationDonationJamaah/General script]
views.get("panellabelpayment").vw.setTop((int)((2d / 100 * height)+(views.get("paneltotalorder").vw.getTop())+(views.get("paneltotalorder").vw.getHeight())));
//BA.debugLineNum = 107;BA.debugLine="PanelLabelPayment.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panellabelpayment").vw.setLeft((int)((3d / 100 * width)));
views.get("panellabelpayment").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 108;BA.debugLine="PanelLabelPayment.Height=(Label3.Top*2) + Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("panellabelpayment").vw.setHeight((int)(((views.get("label3").vw.getTop())*2d)+(views.get("label3").vw.getHeight())));
//BA.debugLineNum = 110;BA.debugLine="PanelPaidInfo.Top = PanelLabelPayment.Top+PanelLabelPayment.Height"[ConfirmationDonationJamaah/General script]
views.get("panelpaidinfo").vw.setTop((int)((views.get("panellabelpayment").vw.getTop())+(views.get("panellabelpayment").vw.getHeight())));
//BA.debugLineNum = 111;BA.debugLine="PanelPaidInfo.SetLeftAndRight(3%x,97%x)"[ConfirmationDonationJamaah/General script]
views.get("panelpaidinfo").vw.setLeft((int)((3d / 100 * width)));
views.get("panelpaidinfo").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 112;BA.debugLine="PanelPaidInfo.Height=LblConfirmation.Top + LblConfirmation.Height"[ConfirmationDonationJamaah/General script]
views.get("panelpaidinfo").vw.setHeight((int)((views.get("lblconfirmation").vw.getTop())+(views.get("lblconfirmation").vw.getHeight())));
//BA.debugLineNum = 114;BA.debugLine="Label11.Top = 2%y"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 115;BA.debugLine="Label11.SetLeftAndRight(5%x,40%x)"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setLeft((int)((5d / 100 * width)));
views.get("label11").vw.setWidth((int)((40d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 116;BA.debugLine="Label11.Height=5%y"[ConfirmationDonationJamaah/General script]
views.get("label11").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 118;BA.debugLine="Label12.Top = Label11.Top"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setTop((int)((views.get("label11").vw.getTop())));
//BA.debugLineNum = 119;BA.debugLine="Label12.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 120;BA.debugLine="Label12.SetLeftAndRight(40%x,92%x)"[ConfirmationDonationJamaah/General script]
views.get("label12").vw.setLeft((int)((40d / 100 * width)));
views.get("label12").vw.setWidth((int)((92d / 100 * width) - ((40d / 100 * width))));
//BA.debugLineNum = 122;BA.debugLine="Label1.SetLeftAndRight(35%x,90%x)"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setLeft((int)((35d / 100 * width)));
views.get("label1").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 123;BA.debugLine="Label2.SetLeftAndRight(35%x,90%x)"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setLeft((int)((35d / 100 * width)));
views.get("label2").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 124;BA.debugLine="LabelDate.SetLeftAndRight(35%x,90%x)"[ConfirmationDonationJamaah/General script]
views.get("labeldate").vw.setLeft((int)((35d / 100 * width)));
views.get("labeldate").vw.setWidth((int)((90d / 100 * width) - ((35d / 100 * width))));
//BA.debugLineNum = 125;BA.debugLine="Label1.Top=2%y"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setTop((int)((2d / 100 * height)));
//BA.debugLineNum = 126;BA.debugLine="Label1.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label1").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 127;BA.debugLine="Label2.Top=Label1.Top+Label1.Height"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop())+(views.get("label1").vw.getHeight())));
//BA.debugLineNum = 128;BA.debugLine="Label2.Height=Label3.Height"[ConfirmationDonationJamaah/General script]
views.get("label2").vw.setHeight((int)((views.get("label3").vw.getHeight())));
//BA.debugLineNum = 129;BA.debugLine="LabelDate.Top=Label2.Top+Label2.Height"[ConfirmationDonationJamaah/General script]
views.get("labeldate").vw.setTop((int)((views.get("label2").vw.getTop())+(views.get("label2").vw.getHeight())));
//BA.debugLineNum = 130;BA.debugLine="LabelDate.Height=Label2.Height"[ConfirmationDonationJamaah/General script]
views.get("labeldate").vw.setHeight((int)((views.get("label2").vw.getHeight())));
//BA.debugLineNum = 132;BA.debugLine="BtnConfirm.Top=PanelPaidInfo.Top+ PanelPaidInfo.Height+2%y"[ConfirmationDonationJamaah/General script]
views.get("btnconfirm").vw.setTop((int)((views.get("panelpaidinfo").vw.getTop())+(views.get("panelpaidinfo").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 133;BA.debugLine="PanelQurban.Height = BtnConfirm.Top+BtnConfirm.Height"[ConfirmationDonationJamaah/General script]
views.get("panelqurban").vw.setHeight((int)((views.get("btnconfirm").vw.getTop())+(views.get("btnconfirm").vw.getHeight())));

}
}