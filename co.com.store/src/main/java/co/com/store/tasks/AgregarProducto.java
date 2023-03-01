package co.com.store.tasks;

import co.com.store.interactions.SeleccionarProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.com.store.userinterfaces.ProductosInterface.LBL_NOMBRE_PRODUCTO;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarProductoAleatorio.enSeccionProductos(LBL_NOMBRE_PRODUCTO)
        );
    }

    public static AgregarProducto enCarritoCompras(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}
