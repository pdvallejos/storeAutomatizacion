package co.com.store.definitions;

import co.com.store.tasks.AgregarProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoStepDefinition {

    @Cuando("el {actor} agregue un producto al carrito de compras")
    public void agregarProductoCarritoCompras(Actor actor) {
        actor.attemptsTo(AgregarProducto.enCarritoCompras());
        actor.attemptsTo(
                irCarritoCompras()
        );

    }
    @Entonces("el {actor} podrá observar que se agrego correctamente al carrito de compras")
    public void observarProductoAgregadoCarritoCompras(Actor actor) {


    }
}
