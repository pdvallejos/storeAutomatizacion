package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.store.userinterfaces.LoginInterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private final String userName;

    private final String password;

    public IniciarSesion(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static IniciarSesion conCredenciales(String userName, String password) {
        return instrumented(IniciarSesion.class, userName, password);
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


}
