package compra_magento.pages;

import org.openqa.selenium.By;

public class HomePage {

    private By link_prenda = By.xpath("//a[normalize-space()='Radiant Tee']");

    public By getLink_prenda(){
        return link_prenda;
    }
}