package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.pages.HomePage;

public class HomePageService {

    private HomePage homePages;

    public HomePageService(){
        this.homePages = new HomePage();
    }

    public void seleccionarPrenda(){
        DriverAction.click(this.homePages.getLink_prenda());
    }
}
