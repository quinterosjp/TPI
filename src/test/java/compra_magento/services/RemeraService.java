package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.pages.Remera;

public class RemeraService {

    private Remera remeraPage;

    public RemeraService(){
        this.remeraPage = new Remera();
    }

    public void configOpcPrenda(String cantidad){

        DriverAction.click(this.remeraPage.getSuTalle());

        DriverAction.click(this.remeraPage.getSuColor());

        DriverAction.insertText(this.remeraPage.getTxt_qty(), cantidad);

        DriverAction.click(this.remeraPage.getBtn_add_to_cart());

        DriverAction.click(this.remeraPage.getLink_shopping_cart());
    }
}
