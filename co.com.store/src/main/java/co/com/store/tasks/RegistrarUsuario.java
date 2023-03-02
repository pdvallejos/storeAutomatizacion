package co.com.store.tasks;

import co.com.store.interactions.LlenarCampos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.store.userinterfaces.RegistroInterface.BTN_REGISTRARSE;
import static co.com.store.userinterfaces.RegistroInterface.TXT_CONTRASENA;
import static co.com.store.userinterfaces.RegistroInterface.TXT_NOMBRE;

public class RegistrarUsuario implements Task {

    private String nombre;

    public RegistrarUsuario conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    private String contrasena;

    public RegistrarUsuario conContrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LlenarCampos.LlenarCampos(TXT_NOMBRE, nombre + "*123"),
                LlenarCampos.LlenarCampos(TXT_CONTRASENA, contrasena + "*123"),
                Click.on(BTN_REGISTRARSE)
        );
    }

    public static RegistrarUsuario registrarUsuario() {
        return Tasks.instrumented(RegistrarUsuario.class);
    }
}
