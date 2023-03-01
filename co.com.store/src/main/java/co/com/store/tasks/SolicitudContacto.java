package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.DoubleClickOnElement;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.store.userinterfaces.SolicitudContacto.BTN_ENVIAR_MENSAJE;
import static co.com.store.userinterfaces.SolicitudContacto.LNK_CONTACTANOS;
import static co.com.store.userinterfaces.SolicitudContacto.TXT_CORREO;
import static co.com.store.userinterfaces.SolicitudContacto.TXT_MENSAJE;
import static co.com.store.userinterfaces.SolicitudContacto.TXT_NOMBRE;

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
//                unMomento(3)
        );
    }

    public static SolicitudContacto solicitudContacto(){
        return new SolicitudContacto();
    }

}
