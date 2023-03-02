package co.com.store.tasks;

import co.com.store.interactions.SeleccionarProductoAleatorio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static co.com.store.userinterfaces.ProductosInterface.*;
import static co.com.store.utils.Utilidades.esperar;

public class AnadirVariosProductos implements Task {

    private final String numeroProductos;

    public AnadirVariosProductos(String numeroProductos) {
        this.numeroProductos = numeroProductos;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        int numeroProductosInt=Integer.parseInt(numeroProductos);
        for(int x=0;x<numeroProductosInt;x++){
            actor.attemptsTo(
                    AgregarProducto.enCarritoCompras(),
                    Click.on(LBL_HOME));
        }
    }

    public static AnadirVariosProductos enCarritoCompras(String numeroProductos){
        return Tasks.instrumented(AnadirVariosProductos.class,numeroProductos);
    }
}
