package co.com.store.tasks;

import co.com.store.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static co.com.store.userinterfaces.LoginInterfaces.*;
import static co.com.store.utils.Utilidades.esperar;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    private String userName;

    private String password;

    private String correo;
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
                Esperar.unMomento(2),
                Enter.theValue(userName).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
        String alerta = esperar(5).until(ExpectedConditions.alertIsPresent()).getText();
    }

    public static IniciarSesion iniciarSesion() { return new IniciarSesion();}
}
