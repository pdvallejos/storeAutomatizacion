package co.com.store.definitions;

import co.com.store.questions.ValidarProducto;
import co.com.store.tasks.AgregarProducto;
import co.com.store.tasks.AnadirVariosProductos;
import co.com.store.tasks.EliminarProducto;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import static co.com.store.enums.Diccionario.COMPRA_CON_PRODUCTOS;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;
import static co.com.store.tasks.IrPaginaPrincipal.irPaginaPrincipal;

import static co.com.store.userinterfaces.CarroComprasInterface.LBL_NOMBRE_PRODUCTO;
import static co.com.store.userinterfaces.CarroComprasInterface.LBL_PRECIO_PRODUCTO;
import static co.com.store.utils.Utilidades.restarPrecios;
import static co.com.store.utils.Utilidades.sumarPrecios;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RemoverProductoDefinition {

    @Cuando("el {actor} elimine un producto que ha sido agregado al carrito de compras")
    public void eliminarProducto(Actor actor) {
        actor.attemptsTo(
                AgregarProducto.enCarritoCompras(),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor()),
                EliminarProducto.enCarritoCompras()
        );
    }

    @Entonces("el {actor} podrá observar que se eliminó correctamente el producto del carrito de compras")
    public void observarProductoEliminado(Actor actor) {
        actor.should(seeThat(
                        ValidarProducto.presente(false,LBL_NOMBRE_PRODUCTO)
        ));
    }

    @Y("el {actor} elimine un producto de {string} en el carrito de compras")
    public void eliminarProductoUnico(Actor actor,String numeroProductos) {
        actor.attemptsTo(
                AnadirVariosProductos.enCarritoCompras(numeroProductos),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor()),
                EliminarProducto.enCarritoCompras(),
                irPaginaPrincipal(),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor())
        );
    }

    @Entonces("el {actor} podrá observar que se modifica el precio total de la compra")
    public void observarPrecioTotalModificado(Actor actor) {
        actor.should(seeThat(
                validarTextos(sumarPrecios(LBL_PRECIO_PRODUCTO,actor),restarPrecios(actor))
        ));
    }
}
