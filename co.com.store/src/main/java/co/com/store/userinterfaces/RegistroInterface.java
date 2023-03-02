package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroInterface {

    public static final Target TXT_NOMBRE=Target
            .the("campo nombre")
            .located(By.id("sign-username"));

    public static final Target TXT_CONTRASENA=Target
            .the("campo contraseña")
            .located(By.id("sign-password"));


    public static final Target BTN_REGISTRARSE=Target
            .the("boton registrarse")
            .located(By.cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(2) div.modal-dialog div.modal-content div.modal-footer > button.btn.btn-primary:nth-child(2)"));

    public static final Target BTN_CERRAR=Target
            .the("campo nombre")
            .located(By.id("sign-username"));





}
