package co.com.store.tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static co.com.store.enums.Diccionario.MENSAJE_CONTACTENOS;
import static co.com.store.userinterfaces.SolicitudContactoInterface.BTN_ENVIAR_MENSAJE;
import static co.com.store.userinterfaces.SolicitudContactoInterface.LNK_CONTACTANOS;
import static co.com.store.userinterfaces.SolicitudContactoInterface.TXT_CORREO;
import static co.com.store.userinterfaces.SolicitudContactoInterface.TXT_MENSAJE;
import static co.com.store.userinterfaces.SolicitudContactoInterface.TXT_NOMBRE;
import static co.com.store.utils.Utilidades.esperar;

public class SolicitudContacto implements Task {

    private String correo;
    public SolicitudContacto conCorreo(String correo) {
        this.correo = correo;
        return this;
    }

    private String nombre;
    public SolicitudContacto conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
    private String mensaje;
    public SolicitudContacto conMensaje(String mensaje) {
        this.mensaje = mensaje;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CONTACTANOS),
                Enter.theValue(correo).into(TXT_CORREO),
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue(mensaje).into(TXT_MENSAJE),
                Click.on(BTN_ENVIAR_MENSAJE)
        );
        String mensajeAlerta = esperar(5).until(ExpectedConditions.alertIsPresent()).getText();
        Serenity.setSessionVariable(MENSAJE_CONTACTENOS).to(mensajeAlerta);
    }

    public static SolicitudContacto solicitudContacto(){
        return new SolicitudContacto();
    }

}
