package co.com.store.definitions;

import co.com.store.questions.ValidarProducto;
import co.com.store.tasks.EliminarProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;
import static co.com.store.tasks.IrPaginaPrincipal.irPaginaPrincipal;
import static co.com.store.userinterfaces.CarroComprasInterface.*;
import static co.com.store.utils.Utilidades.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RemoverProductoDefinition {

    @Y("el {actor} elimine un producto")
    public void eliminarProductoUnico(Actor actor) {
        actor.attemptsTo(
                EliminarProducto.enCarritoCompras(),
                irPaginaPrincipal(),
                irCarritoCompras()
        );
    }

    @Entonces("el {actor} podrá observar que se eliminó correctamente el producto del carrito de compras")
    public void observarProductoEliminado(Actor actor) {
        actor.should(seeThat(
                        ValidarProducto.presente(false,LBL_NOMBRE_PRODUCTO)
        ));
    }

    @Entonces("el {actor} podrá observar que se modifica el precio total de la compra")
    public void observarPrecioTotalModificado(Actor actor) {
        actor.should(seeThat(
                validarTextos(sumarPrecios(LBL_PRECIO_PRODUCTO,actor),restarPrecios(actor))
        ));
    }
}
