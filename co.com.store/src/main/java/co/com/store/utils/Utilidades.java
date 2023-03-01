package co.com.store.utils;

import co.com.store.models.FormularioCompraModel;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.Locale;

public class Utilidades {

    FormularioCompraModel formularioCompraModel;

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


    public FormularioCompraModel DatosEnvioCompra(){
        Faker faker = new Faker();

        formularioCompraModel = new FormularioCompraModel();

        formularioCompraModel.setNombre(faker.name().fullName());
        formularioCompraModel.setPais(faker.address().country());
        formularioCompraModel.setCiudad(faker.address().city());
        formularioCompraModel.setTargetaCredito(faker.finance().creditCard());
        formularioCompraModel.setMes("febrero");
        formularioCompraModel.setYear("1999");

        return formularioCompraModel;

    }
}
