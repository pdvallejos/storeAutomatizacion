package co.com.store.tasks;

import co.com.store.interactions.SeleccionarProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static co.com.store.userinterfaces.ProductosInterface.BTN_ADD_TO_CART;
import static co.com.store.userinterfaces.ProductosInterface.LBL_NOMBRE_PRODUCTO;
import static co.com.store.utils.Utilidades.esperar;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionarProductoAleatorio.enSeccionProductos(LBL_NOMBRE_PRODUCTO),
                Click.on(BTN_ADD_TO_CART)
        );
        esperar(10).until(ExpectedConditions.alertIsPresent()).accept();


    }

    public static AgregarProducto enCarritoCompras(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}
