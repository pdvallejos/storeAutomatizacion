package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.store.userinterfaces.HomeInterface.LBL_REGISTRO;

public class IrRegistro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_REGISTRO)
        );
    }

    public static IrRegistro irRegistro() {
        return Tasks.instrumented(IrRegistro.class);
    }
}
