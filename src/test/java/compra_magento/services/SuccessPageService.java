package compra_magento.services;

import compra_magento.DriverAction;
import compra_magento.pages.SuccessPage;
import org.apache.commons.lang3.StringUtils;

public class SuccessPageService {

    private SuccessPage successPage;

    public SuccessPageService(){
        this.successPage = new SuccessPage();
    }

    public void continuar(){
        DriverAction.click(this.successPage.getBtn_continue());
    }

    public void carritoVisible(){
        DriverAction.isDisplayed(this.successPage.getBtn_cart());
    }

    public Boolean botonContinueHabilitado(){
        return DriverAction.isEnabled(this.successPage.getBtn_continue());
    }

    public Boolean esNumero(){
        String order = DriverAction.getText(this.successPage.getTxt_your_order());
        String[] parts = order.split(": ");
        String numero = parts[1].substring(0, parts[1].length() - 1); // Elimina el ultimo caracter de la cadena (.)
        return StringUtils.isNumeric(numero); // Retorna True si la cadena es un numero
    }

    public Boolean createAccountVisible(){
        return DriverAction.isDisplayed(this.successPage.getBtn_create_an_account());
    }

    public String getIgual_titulo(){
        return DriverAction.getText(this.successPage.getTxt_titulo());
    }

    public void visibleCreateAccount(){
        DriverAction.isEnabled(this.successPage.getBtn_create_an_account());
    }

}

