package co.com.store.definitions;

import co.com.store.models.FrontDTO;
import co.com.store.questions.ObtenerNombreUsuario;
import co.com.store.tasks.VerificarUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static co.com.store.enums.Diccionario.ACTOR_NAME;
import static co.com.store.enums.Diccionario.ALERTA_COMPLETAR_CAMPOS;
import static co.com.store.enums.Diccionario.ALERTA_CONTRASEÑA_INVALIDA;
import static co.com.store.enums.Diccionario.ALERTA_USUARIO_INEXISTENTE;
import static co.com.store.enums.Diccionario.PASSWORD;
import static co.com.store.enums.Diccionario.PASSWORD_INCORRECTO;
import static co.com.store.enums.Diccionario.USUARIO;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IniciarSesion.iniciarSesion;
import static co.com.store.utils.Utilidades.obtenerTextoAlerta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class InicioSesionDefinition {
    @Cuando("el {actor} suministre las credenciales correctamente")
    public void UsuarioSuministreCredencialesCorrectamente(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(USUARIO.getValor())
                               .conContraseña(PASSWORD.getValor())
        );
    }

    @Entonces("el {actor} podrá observar que ingreso correctamente")
    public void UsuarioPodráObservarIngresoCorrectamente(Actor actor) {
        FrontDTO informacionUsuario = new ObtenerNombreUsuario().answeredBy(actor);
        actor.attemptsTo(
                VerificarUsuario.entre(informacionUsuario, USUARIO.getValor())
        );

    }

    @Cuando("el {actor} suministre las credenciales de ingreso incorrectamente")
    public void UsuarioSuministreCredencialesIngresoIncorrectamente(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(ACTOR_NAME.getValor())
                        .conContraseña(PASSWORD.getValor())
        );
    }

    @Entonces("el {actor} podrá observar la alerta que el usuario no existe")
    public void UsuarioPodraObservarAlertaUsuarioNoExiste(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), ALERTA_USUARIO_INEXISTENTE.getValor()))
        );
    }

    @Cuando("el {actor} suministre las credenciales de ingreso sin la contraseña")
    public void UsuarioSuministreCredencialesIngresoSinContraseña(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(USUARIO.getValor())
        );
    }

    @Entonces("el {actor} podrá observar la alerta de que debe completar todos los campos")
    public void UsuarioPodráObservarAlertaDebeCompletarTodosLosCampos(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), ALERTA_COMPLETAR_CAMPOS.getValor()))
        );
    }

    @Cuando("el {actor} suministre las credenciales de ingreso con contraseña no valida")
    public void UsuarioSuministreCredencialesIngresoConContrasenaNoValida(Actor actor) {
        actor.attemptsTo(
                iniciarSesion().conUsuario(USUARIO.getValor())
                        .conContraseña(PASSWORD_INCORRECTO.getValor())
        );
    }

    @Entonces("el {actor} podrá observar la alerta de que la contraseña es invalida")
    public void UsuarioPodráObservarAlertaContrasenaInvalida(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), ALERTA_CONTRASEÑA_INVALIDA.getValor()))
        );
    }
}
