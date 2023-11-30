package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.DriverManager;
import compra_magento.pages.PaymentPage;

public class PaymentPageService {

    private PaymentPage paymentPage;

    public PaymentPageService(){
        this.paymentPage = new PaymentPage();
    }
    public void pagar(){
        DriverAction.click(this.paymentPage.getBtn_placeOrder());
    }
    public void checkBilling(){
        DriverAction.isEnabled(paymentPage.getBtn_placeOrder());

        Boolean isCheck = DriverManager.getDriver().findElement(paymentPage.getInpt_check()).isSelected();

        if(isCheck == false){
            DriverManager.getDriver().findElement(this.paymentPage.getInpt_check()).click();
        }
    }
}