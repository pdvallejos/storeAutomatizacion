package co.com.store.utils;

import co.com.store.tasks.DiligenciarFormularioCompra;
import com.github.javafaker.Faker;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Locale;

import static co.com.store.enums.Diccionario.MENSAJE_VALIDACION_COMPRA;
import static co.com.store.tasks.DiligenciarFormularioCompra.diligenciarFormularioCompra;

public class Utilidades {


    public static ArrayList<String> generarClientesAleatorios() {
        ArrayList<String> listaCliente = new ArrayList<>();
        Faker usFaker = new Faker(new Locale("en-US"));
        String nombre = usFaker.name().firstName();
        listaCliente.add(nombre);
        String apellido = usFaker.name().lastName();
        listaCliente.add(apellido);
        String correo = nombre + apellido + "@gmail.com";
        listaCliente.add(correo);
        String contrasena = usFaker.bothify("#?#?#?#????" + ":::");
        listaCliente.add(contrasena);
        String texto = usFaker.chuckNorris().fact();
        listaCliente.add(texto);
        String pais = usFaker.address().country();
        listaCliente.add(pais);
        String ciudad = usFaker.address().city();
        listaCliente.add(ciudad);
        String tarjetaCredito = usFaker.finance().creditCard();
        listaCliente.add(tarjetaCredito);
        String mes = usFaker.options().option("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto");
        listaCliente.add(mes);
        String year = String.valueOf(usFaker.number().numberBetween(2000, 2023));
        listaCliente.add(year);
        String vacio = "";
        listaCliente.add(vacio);
        return listaCliente;
    }

    /**
     * Funcion que se encarga de diligenciar el formulario de compra
     *
     * @param nombre         nombre del cliente generado
     * @param tarjetaCredito numero de tarjeta de credito generada
     * @return el formulario de compra
     */
    public static DiligenciarFormularioCompra DiligenciarDatosCliente(String nombre, String tarjetaCredito) {
        ArrayList<String> datosCompra = Utilidades.generarClientesAleatorios();
        return diligenciarFormularioCompra().conNombre(nombre)
                .conPais(datosCompra.get(5))
                .conCiudad(datosCompra.get(6))
                .conTargetaCredito(tarjetaCredito)
                .conMes(datosCompra.get(8))
                .conYear(datosCompra.get(9));
    }

    public static String obtenerTextoElemento(Target target, Actor actor) {
        return target.resolveFor(actor).getText();
    }


    public static WebDriverWait esperar(int tiempo) {
        return new WebDriverWait(SerenityWebdriverManager.inThisTestThread().getCurrentDriver(), Duration.ofSeconds(tiempo));
    }

    /**
     * Funcion que se encarga de obtener el texto de la alerta de validacion
     */
    public static void obtenerTextoAlerta() {
        String mensajeAlerta = esperar(10).until(ExpectedConditions.alertIsPresent()).getText();
        Serenity.setSessionVariable(MENSAJE_VALIDACION_COMPRA).to(mensajeAlerta);
    }

}


