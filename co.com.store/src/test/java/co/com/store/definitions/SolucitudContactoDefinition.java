package co.com.store.definitions;

import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.AlertText;
import org.openqa.selenium.Alert;

import java.util.ArrayList;

import static co.com.store.tasks.SolicitudContacto.solicitudContacto;

public class SolucitudContactoDefinition {

    public ArrayList<String> listaCliente = Utilidades.generarClientesAleatorios();
    final AlertText alerta = new AlertText();

    @Cuando("el {actor} realice una solicitud de contacto")
    public void realiceSolicitudContacto(Actor actor) {
        actor.attemptsTo(
                solicitudContacto().conCorreo(listaCliente.get(2))
                        .conNombre(listaCliente.get(0)+listaCliente.get(1))
                        .conMensaje(listaCliente.get(4))
        );
        actor.wasAbleTo((Performable) AlertText.currentlyVisible());
    }

    @Entonces("podra observar que se realizo la solicitud de contacto exitosamente")
    public void podraObservarQueRealizoSolicitudContactoExitosamente() {

    }

    @Cuando("realice una solicitud de contacto sin completar el campo correo")
    public void realiceSolicitudContactoCompletarCampoCorreo() {
    }

    @Cuando("realice una solicitud de contacto sin completar el campo nombre del contacto")
    public void realiceSolicitudContactoCompletarCampoNombreContacto() {
    }

    @Cuando("realice una solicitud de contacto sin completar todos los campos")
    public void realiceSolicitudContactoCompletarTodosLosCampos() {
    }

    @Entonces("podra observar que no se realizo la solicitud de contacto")
    public void podraObservarQueNoRealizoSolicitudContacto() {
    }

}
