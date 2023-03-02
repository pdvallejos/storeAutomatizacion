package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class LoginInterfaces {

    public static final Target LNK_LOGIN = Target.the("ingresa al login")
            .located(cssSelector("#login2"));

    public static final Target TXT_USER = Target.the("ingresa nombre de usuario")
            .located(id("loginusername"));

    public static final Target TXT_PASSWORD = Target.the("ingresa contraseña")
            .located(id("loginpassword"));

    public static final Target BTN_LOGIN = Target.the("presiona boton login")
            .located(cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
}
