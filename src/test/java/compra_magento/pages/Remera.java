package compra_magento.pages;

import org.openqa.selenium.By;

public class Remera {

    private By suTalle = By.id("option-label-size-143-item-169");
    private By suColor = By.id("option-label-color-93-item-50");
    private By txt_qty = By.id("qty");
    private By btn_add_to_cart = By.id("product-addtocart-button");
    private By link_shopping_cart = By.xpath("//a[normalize-space()='shopping cart']");

    public By getSuTalle(){
        return suTalle;
    }

    public By getSuColor(){
        return suColor;
    }

    public By getTxt_qty(){
        return txt_qty;
    }

    public By getBtn_add_to_cart(){
        return btn_add_to_cart;
    }

    public By getLink_shopping_cart(){
        return link_shopping_cart;
    }
}