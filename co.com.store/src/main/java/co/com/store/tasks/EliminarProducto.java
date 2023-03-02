package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.time.Duration;
import static co.com.store.enums.Diccionario.PRECIO_BORRAR;
import static co.com.store.enums.Diccionario.PRECIO_TOTAL;
import static co.com.store.userinterfaces.CarroComprasInterface.*;
import static co.com.store.utils.Utilidades.obtenerTextoElemento;
import static co.com.store.utils.Utilidades.sumarPrecios;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class EliminarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.remember(PRECIO_BORRAR.getValor(),obtenerTextoElemento(LBL_PRECIO_PRODUCTO,actor));
        actor.remember(PRECIO_TOTAL.getValor(),sumarPrecios(LBL_PRECIO_PRODUCTO,actor));
        actor.attemptsTo(
                WaitUntil.the(LBL_PRECIO_TOTAL,isPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Click.on(BTN_BORRAR_PRODUCTO)
        );

    }

    public static EliminarProducto enCarritoCompras(){
        return Tasks.instrumented(EliminarProducto.class);
    }
}
