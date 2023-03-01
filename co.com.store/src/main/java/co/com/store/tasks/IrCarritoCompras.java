package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.store.userinterfaces.CarroComprasInterface.LBL_CARRITO_COMPRAS;

public class IrCarritoCompras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_CARRITO_COMPRAS)
        );
    }

    public static IrCarritoCompras irCarritoCompras(){
        return Tasks.instrumented(IrCarritoCompras.class);
    }
}
