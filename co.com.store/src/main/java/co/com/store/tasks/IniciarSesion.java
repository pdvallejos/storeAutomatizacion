package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.store.userinterfaces.LoginInterfaces.LNK_LOGIN;
import static co.com.store.userinterfaces.LoginInterfaces.TXT_USER;
import static co.com.store.userinterfaces.LoginInterfaces.TXT_PASSWORD;
import static co.com.store.userinterfaces.LoginInterfaces.BTN_LOGIN;

public class IniciarSesion implements Task {

    private String userName;
    private String password;

    public IniciarSesion conUsuario(String userName) {
        this.userName = userName;
        return this;
    }
    public IniciarSesion conContraseña(String password) {
        this.password = password;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_LOGIN),
                Enter.theValue(userName).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }
    public static IniciarSesion iniciarSesion() { return new IniciarSesion();}
}
