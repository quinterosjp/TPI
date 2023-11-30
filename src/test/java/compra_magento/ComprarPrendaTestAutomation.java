package compra_magento;

import compra_magento.services.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;

// Gracias Nelson!

public class ComprarPrendaTestAutomation {

    @BeforeMethod
    public void setUp(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }

    @Test
    public void compraRealizada(){
        HomePageService homePageService = new HomePageService();
        homePageService.seleccionarPrenda();

        RemeraService radiantTeeService = new RemeraService();
        radiantTeeService.configOpcPrenda("2");

        ShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.procederCompra();

        CheckoutPageService checkoutPageService = new CheckoutPageService();
        checkoutPageService.respuestasFormulario
                ("quinterosjp10@gmail.com",
                "Juan Pablo",
                "Quinteros",
                "Ituzaingo 000",
                "Concordia",
                "United States",
                "Texas",
                "32000",
                "3456023065");

        PaymentPageService paymentPageService = new PaymentPageService();
        paymentPageService.checkBilling();
        paymentPageService.pagar();

        SuccessPageService successPageService = new SuccessPageService();
        successPageService.visibleCreateAccount();

        //Titulo = Thank you for your purchase!
        Assert.assertEquals(
                successPageService.getIgual_titulo(),
                "Thank you for your purchase!",
                "El Titulo NO es igual a Thank you for your purchase!"
        );
        //Boton Continue Shopping está habilitado.
        Assert.assertTrue(
                successPageService.botonContinueHabilitado(),
                "Boton 'Continue Shopping' inhabilitado"
        );
        //Boton Create an Account está visible.
        Assert.assertTrue(
                successPageService.createAccountVisible(),
                "Boton 'Create Account' no se ve"
        );
        //Numero de la orden (Your order # is:) es un numero.
        Assert.assertTrue(
                successPageService.esNumero(),
                "Num de orden NO es un Numero"
        );


        successPageService.continuar();
        /*try{
           Thread.sleepd(5000);
        } catch (InterruptedExcepcion e){
         */
    }
}