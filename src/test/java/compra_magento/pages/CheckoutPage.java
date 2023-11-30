package compra_magento.pages;

import org.openqa.selenium.By;
public class CheckoutPage {
    private By nombreUsuario = By.id("customer-email");
    private By miNombre = By.name("firstname");
    private By miApellido = By.name("lastname");
    private By miCalle = By.name("street[0]");
    private By miCiudad = By.name("city");
    private By opcPais = By.name("country_id");
    private By miRegion = By.name("region_id");
    private By miCp = By.name("postcode");
    private By miNum = By.name("telephone");
    private By opcMetodoPago = By.name("ko_unique_1");
    private By clickNext = By.xpath("//button[@class='button action continue primary']");


    public By getOpcPais(){
        return opcPais;
    }
    public By getMiRegion(){
        return miRegion;
    }
    public By getNombreUsuario() {
        return nombreUsuario;
    }
    public By getMiNombre() {
        return miNombre;
    }
    public By getMiApellido() {
        return miApellido;
    }
    public By getMiCalle() {
        return miCalle;
    }
    public By getMiCiudad() {
        return miCiudad;
    }
    public By getMiCp() {
        return miCp;
    }
    public By getTxt_phoneNumber() {
        return miNum;
    }
    public By getOpcMetodoPago() {
        return opcMetodoPago;
    }
    public By getClickNext() {
        return clickNext;
    }
}