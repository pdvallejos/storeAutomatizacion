package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static co.com.store.userinterfaces.CarroComprasInterface.LBL_CARRITO_COMPRAS;
import static co.com.store.userinterfaces.CarroComprasInterface.LBL_PRECIO_TOTAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrCarritoCompras implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LBL_CARRITO_COMPRAS),
                WaitUntil.the(LBL_PRECIO_TOTAL,isVisible()).forNoMoreThan(Duration.ofSeconds(5))
        );
    }

    public static IrCarritoCompras irCarritoCompras(){
        return Tasks.instrumented(IrCarritoCompras.class);
    }
}
