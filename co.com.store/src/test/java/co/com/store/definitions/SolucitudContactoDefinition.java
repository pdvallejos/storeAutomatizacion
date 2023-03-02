package co.com.store.definitions;

import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.AlertText;

import java.util.ArrayList;

import static co.com.store.enums.Diccionario.MENSAJE_CONTACTENOS_EXITOSO;
import static co.com.store.enums.Diccionario.MENSAJE_CONTACTENOS_FALLIDO;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.SolicitudContacto.solicitudContacto;
import static co.com.store.utils.Utilidades.obtenerTextoAlerta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SolucitudContactoDefinition {

    public ArrayList<String> listaCliente = Utilidades.generarClientesAleatorios();

    @Cuando("el {actor} realice una solicitud de contacto")
    public void realiceSolicitudContacto(Actor actor) {
        actor.attemptsTo(
                solicitudContacto().conCorreo(listaCliente.get(2))
                        .conNombre(listaCliente.get(0)+listaCliente.get(1))
                        .conMensaje(listaCliente.get(4))
        );
    }

    @Entonces("el {actor} podra observar que se realizo la solicitud de contacto exitosamente")
    public void podraObservarQueRealizoSolicitudContactoExitosamente(Actor actor) {
        actor.should(seeThat(
                validarTextos(obtenerTextoAlerta(), MENSAJE_CONTACTENOS_EXITOSO.getValor())
        ));
    }

    @Cuando("el {actor} realice una solicitud de contacto sin completar el campo correo")
    public void realiceSolicitudContactoCompletarCampoCorreo(Actor actor) {
        actor.attemptsTo(
                solicitudContacto().conCorreo(listaCliente.get(10))
                        .conNombre(listaCliente.get(0)+listaCliente.get(1))
                        .conMensaje(listaCliente.get(4))
        );
    }

    @Cuando("el {actor} realice una solicitud de contacto sin completar el campo nombre del contacto")
    public void realiceSolicitudContactoCompletarCampoNombreContacto(Actor actor) {
        actor.attemptsTo(
                solicitudContacto().conCorreo(listaCliente.get(2))
                        .conNombre(listaCliente.get(10))
                        .conMensaje(listaCliente.get(4))
        );
    }

    @Cuando("el {actor} realice una solicitud de contacto sin completar todos los campos")
    public void realiceSolicitudContactoCompletarTodosLosCampos(Actor actor) {
        actor.attemptsTo(
                solicitudContacto().conCorreo(listaCliente.get(10))
                        .conNombre(listaCliente.get(10))
                        .conMensaje(listaCliente.get(10))
        );
    }

    @Entonces("el {actor} podra observar que no se realizo la solicitud de contacto")
    public void podraObservarQueNoRealizoSolicitudContacto(Actor actor) {
        actor.should(seeThat(
                validarTextos(obtenerTextoAlerta(), MENSAJE_CONTACTENOS_FALLIDO.getValor())
        ));
    }

}
