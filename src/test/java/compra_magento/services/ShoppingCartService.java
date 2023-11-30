package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.pages.ShoppingCartPage;

public class ShoppingCartService {

    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartService(){
        this.shoppingCartPage = new ShoppingCartPage();
    }

    public void procederCompra(){
        DriverAction.click(this.shoppingCartPage.getBtn_proceed_to_checkout());
    }
}
