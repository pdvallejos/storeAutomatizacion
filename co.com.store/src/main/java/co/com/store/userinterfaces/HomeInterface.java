package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeInterface {
    public static final Target LBL_REGISTRO =Target
            .the("Opción para ir al modulo de registro")
            .located(By.id("signin2"));
}
