package co.com.store.definitions;

import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import java.util.ArrayList;

import static co.com.store.enums.Diccionario.CAMPO_REGISTRO_FALTANTE;
import static co.com.store.enums.Diccionario.MENSAJE_REGISTRO_EXITOSO;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IrRegistro.irRegistro;
import static co.com.store.tasks.RegistrarUsuario.registrarUsuario;
import static co.com.store.utils.Utilidades.obtenerTextoAlerta;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistrarUsuarioDefinition {

    public ArrayList<String> datosUsuario = Utilidades.generarClientesAleatorios();

    @Cuando("el {actor} suministre las credenciales de registro correctamente")
    public void elUsuarioSuministreLasCredencialesDeRegistroCorrectamente(Actor actor) {
        actor.attemptsTo(
                irRegistro(),
                registrarUsuario().conNombre(datosUsuario.get(11)).conContrasena(datosUsuario.get(3))

        );
    }

    @Entonces("el {actor} podrÃ¡ observar que se registro correctamente")
    public void elUsuarioPodrÃ¡ObservarQueSeRegistroCorrectamente(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), MENSAJE_REGISTRO_EXITOSO.getValor()))
        );

    }

    @Cuando("el {actor} no suministre el campo username en el registro")
    public void elUsuarioNoSuministreElCampoUsernameEnElRegistro(Actor actor) {
        actor.attemptsTo(
                irRegistro(),
                registrarUsuario().conContrasena(datosUsuario.get(3))
        );
    }

    @Entonces("el {actor} podrÃ¡ observar que no se registro correctamente")
    public void elUsuarioPodrÃ¡ObservarQueNoSeRegistroCorrectamente(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), CAMPO_REGISTRO_FALTANTE.getValor()))
        );
    }

    @Cuando("el {actor} no suministre el campo contraseÃ±a en el registro")
    public void elUsuarioNoSuministreElCampoContraseÃ±aEnElRegistro(Actor actor) {
        actor.attemptsTo(
                irRegistro(),
                registrarUsuario().conNombre(datosUsuario.get(11))
        );
    }

    @Cuando("el {actor} no suministre todos los campos en el registro")
    public void elUsuarioNoSuministreTodosLosCamposEnElRegistro(Actor actor) {
        actor.attemptsTo(
                irRegistro(),
                registrarUsuario()
        );
    }
}
