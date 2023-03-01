package co.com.store.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.*;


public class ValidarCompraInterface {

    public static final Target TXT_VALIDACION_COMPRA_EXITOSA = Target.the("boton comprar")
            .located(xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
}
