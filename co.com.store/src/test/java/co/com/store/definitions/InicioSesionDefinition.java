package co.com.store.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import static co.com.store.enums.Diccionario.*;
import static co.com.store.tasks.IniciarSesion.iniciarSesion;

public class InicioSesionDefinition {
    @Cuando("el {actor} suministre las credenciales correctamente")
    public void UsuarioSuministreCredencialesCorrectamente(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(USUARIO.getValor())
                               .conContraseña(CONTRASEÑA.getValor())
        );
    }

    @Entonces("el {actor} podrá observar que ingreso correctamente")
    public void UsuarioPodráObservarIngresoCorrectamente(Actor actor) {

    }

    @Cuando("el {actor} suministre las credenciales de ingreso incorrectamente")
    public void UsuarioSuministreCredencialesIngresoIncorrectamente(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(ACTOR_NAME.getValor())
                        .conContraseña(CONTRASEÑA.getValor())
        );
    }

    @Entonces("el {actor} podrá observar que no inicio sesión correctamente")
    public void UsuarioPodráObservarQueNoInicioSesiónCorrectamente(Actor actor) {

    }

    @Cuando("el {actor} suministre las credenciales de ingreso sin la contraseña")
    public void UsuarioSuministreCredencialesIngresoSinContraseña(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(USUARIO.getValor())
        );
    }

    @Cuando("el {actor} suministre las credenciales de ingreso con username no registrado")
    public void UsuarioSuministreCredencialesIngresoConUsernameNoRegistrado(Actor actor) {
    }
}
