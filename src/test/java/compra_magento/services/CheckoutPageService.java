package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.pages.CheckoutPage;

public class CheckoutPageService {
    private CheckoutPage checkoutPage;
    public CheckoutPageService(){
        this.checkoutPage = new CheckoutPage();
    }
    public void respuestasFormulario(

            String userName, String firstName, String lastName, String street, String city, String country,
            String region, String postalCode, String phoneNumber){

        DriverAction.insertText(this.checkoutPage.getNombreUsuario(), userName);

        DriverAction.insertText(this.checkoutPage.getMiNombre(), firstName);

        DriverAction.insertText(this.checkoutPage.getMiApellido(), lastName);

        DriverAction.insertText(this.checkoutPage.getMiCalle(), street);

        DriverAction.insertText(this.checkoutPage.getMiCiudad(), city);

        DriverAction.selectByVisibleText(this.checkoutPage.getOpcPais(), country);

        DriverAction.selectByVisibleText(this.checkoutPage.getMiRegion(), region);

        DriverAction.insertText(this.checkoutPage.getMiCp(), postalCode);

        DriverAction.insertText(this.checkoutPage.getTxt_phoneNumber(), phoneNumber);

        DriverAction.click(this.checkoutPage.getOpcMetodoPago());

        DriverAction.click(this.checkoutPage.getClickNext());
    }
}