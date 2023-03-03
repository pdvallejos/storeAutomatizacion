package co.com.store.tasks;

import co.com.store.models.FrontDTO;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import static co.com.store.enums.Diccionario.SALUDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarUsuario implements Task {

    private static FrontDTO usuarioWeb;
    private final String usuario;
    public VerificarUsuario(FrontDTO usuarioWeb, String usuario) {
        this.usuarioWeb = usuarioWeb;
        this.usuario = usuario;
    }

    public static Performable entre(FrontDTO usuarioWeb, String usuario){
        return instrumented(VerificarUsuario.class, usuarioWeb, usuario);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(usuarioWeb.getUsuario()).isEqualTo(SALUDO.getValor() + usuario));

    }
}
