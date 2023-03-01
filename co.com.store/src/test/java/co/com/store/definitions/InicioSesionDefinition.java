package co.com.store.definitions;

import co.com.store.tasks.IniciarSesion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static co.com.store.tasks.SolicitudContacto.solicitudContacto;

public class InicioSesionDefinition {
    @Cuando("el {actor} suministre las credenciales correctamente")
    public void UsuarioSuministreCredencialesCorrectamente(Actor actor) {
        actor.attemptsTo(
                IniciarSesion.conCredenciales("user", "password")
        );
    }

    @Entonces("el {actor} podrá observar que ingreso correctamente")
    public void UsuarioPodráObservarIngresoCorrectamente(Actor actor) {

    }

    @Cuando("el {actor} suministre las credenciales de ingreso incorrectamente")
    public void UsuarioSuministreCredencialesIngresoIncorrectamente(Actor actor) {

    }

    @Entonces("el {actor} podrá observar que no inicio sesión correctamente")
    public void UsuarioPodráObservarQueNoInicioSesiónCorrectamente(Actor actor) {

    }

    @Cuando("el {actor} suministre las credenciales de ingreso sin la contraseña")
    public void UsuarioSuministreCredencialesIngresoSinContraseña(Actor actor) {

    }

    @Cuando("el {actor} suministre las credenciales de ingreso con username no registrado")
    public void UsuarioSuministreCredencialesIngresoConUsernameNoRegistrado(Actor actor) {
    }
}
