package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.store.userinterfaces.CarroComprasInterface.BTN_REALIZAR_COMPRA;

public class RealizarCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REALIZAR_COMPRA)
        );
    }
    public static RealizarCompra realizarCompra() {
        return new RealizarCompra();
    }
}
