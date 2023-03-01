package co.com.store.utils;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Locale;

public class Utilidades {

    public static ArrayList<String> generarClientesAleatorios(){
        ArrayList<String> listaCliente = new ArrayList<>();
        Faker usFaker = new Faker(new Locale("en-US"));
        String nombre = usFaker.name().firstName();
        listaCliente.add(nombre);
        String apellido = usFaker.name().lastName();
        listaCliente.add(apellido);
        String correo = nombre+apellido+"@gmail.com";
        listaCliente.add(correo);
        String contrasena = usFaker.bothify("#?#?#?#????"+":::");
        listaCliente.add(contrasena);
        String texto = usFaker.chuckNorris().fact();
        listaCliente.add(texto);
        return listaCliente;
    }
    public static String obtenerTextoElemento(Target target, Actor actor){
        return target.resolveFor(actor).getText();
    }

    public static WebDriverWait esperar(int tiempo){
        return new WebDriverWait(SerenityWebdriverManager.inThisTestThread().getCurrentDriver(), Duration.ofSeconds(tiempo));
    }
}
