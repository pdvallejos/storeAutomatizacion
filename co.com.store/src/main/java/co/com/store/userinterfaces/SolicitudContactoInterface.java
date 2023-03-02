package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.cssSelector;
public class SolicitudContactoInterface {

    SolicitudContactoInterface(){}

    public static final Target LNK_CONTACTANOS = Target
            .the("Link contactanos")
            .located(cssSelector("ul :nth-child(2) .nav-link"));

    public static final Target TXT_CORREO = Target
            .the("Escribir Correo")
            .located(id("recipient-email"));

    public static final Target TXT_NOMBRE = Target
            .the("Escribir Nombre")
            .located(id("recipient-name"));

    public static final Target TXT_MENSAJE = Target
            .the("Escribir el Mensaje")
            .located(id("message-text"));

    public static final Target BTN_ENVIAR_MENSAJE = Target
            .the("Boton Enviar Mensaje")
            .located(cssSelector("#exampleModal :nth-child(1) .btn-primary"));

}
