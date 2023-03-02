package co.com.store.definitions;

import co.com.store.questions.ValidarProducto;
import co.com.store.tasks.AgregarProducto;
import co.com.store.tasks.EliminarProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;
import static co.com.store.userinterfaces.CarroComprasInterface.LBL_NOMBRE_PRODUCTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RemoverProductoDefinition {

    @Cuando("el {actor} elimine un producto que ha sido agregado al carrito de compras")
    public void eliminarProductoCarritoCompras(Actor actor) {
        actor.attemptsTo(
                AgregarProducto.enCarritoCompras(),
                irCarritoCompras(),
                EliminarProducto.enCarritoCompras()
        );
    }
    @Entonces("el {actor} podrá observar que se eliminó correctamente el producto del carrito de compras")
    public void observarProductoEliminado(Actor actor) {
        actor.should(seeThat(
                        ValidarProducto.presente(false,LBL_NOMBRE_PRODUCTO)
        ));
    }

    @Cuando("remueva un producto repetido del carrito de compras")
    public void remuevaUnProductoRepetidoDelCarritoDeCompras() {

    }
    @Entonces("podrá observar que se removio correctamente del carrito de compras")
    public void podráObservarQueSeRemovioCorrectamenteDelCarritoDeCompras() {

    }
}
