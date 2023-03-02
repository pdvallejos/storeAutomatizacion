package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.store.userinterfaces.CarroComprasInterface.BTN_BORRAR_PRODUCTO;

public class EliminarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BORRAR_PRODUCTO)
        );
    }

    public static EliminarProducto enCarritoCompras(){
        return Tasks.instrumented(EliminarProducto.class);
    }
}
