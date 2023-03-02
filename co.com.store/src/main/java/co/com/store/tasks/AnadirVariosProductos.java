package co.com.store.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static co.com.store.tasks.IrPaginaPrincipal.irPaginaPrincipal;
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
                    irPaginaPrincipal());
        }
    }

    public static AnadirVariosProductos enCarritoCompras(String numeroProductos){
        return Tasks.instrumented(AnadirVariosProductos.class,numeroProductos);
    }
}
