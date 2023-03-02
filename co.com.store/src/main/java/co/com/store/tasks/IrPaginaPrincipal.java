package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.store.userinterfaces.ProductosInterface.LBL_HOME;

public class IrPaginaPrincipal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_HOME)
        );
    }

    public static IrPaginaPrincipal irPaginaPrincipal(){
        return Tasks.instrumented(IrPaginaPrincipal.class);
    }
}
