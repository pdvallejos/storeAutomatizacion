package co.com.store.utils;

import com.github.javafaker.Faker;
import io.cucumber.java.sl.In;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Locale;

import static co.com.store.userinterfaces.CarroComprasInterface.LBL_NOMBRE_PRODUCTO;

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

    public static String obtenerTamanoTargetRepetido(Target target,Actor actor){
        return Integer.toString(target.resolveAllFor(actor).size());
    }

    public static String sumarPrecios(Target target,Actor actor){
        Integer precioTotal=0;
        for(int x=0;x<target.resolveAllFor(actor).size();x++){
            precioTotal= Integer.parseInt(target.resolveAllFor(actor).get(x).getText())+precioTotal;
        }
        return Integer.toString(precioTotal);
    }

    public static WebDriverWait esperar(int tiempo){
        return new WebDriverWait(SerenityWebdriverManager.inThisTestThread().getCurrentDriver(), Duration.ofSeconds(tiempo));
    }
}


