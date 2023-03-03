package co.com.store.definitions;

import co.com.store.tasks.AgregarProducto;
import co.com.store.tasks.AnadirVariosProductos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;

import static co.com.store.enums.Diccionario.COMPRA_CON_PRODUCTOS;
import static co.com.store.enums.Diccionario.VARIBLE_NOMBRE_PRODUCTO;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;

import static co.com.store.userinterfaces.CarroComprasInterface.LBL_NOMBRE_PRODUCTO;
import static co.com.store.utils.Utilidades.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoStepDefinition {

    @Cuando("el {actor} agregue un producto al carrito de compras")
    public void agregarProductoCarritoCompras(Actor actor) {
        actor.attemptsTo(
                AgregarProducto.enCarritoCompras(),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor())
        );

    }
    @Entonces("el {actor} podrá observar que se agrego correctamente al carrito de compras")
    public void observarProductoAgregadoCarritoCompras(Actor actor) {
        actor.should(seeThat(
                validarTextos(obtenerTextoElemento(LBL_NOMBRE_PRODUCTO,actor),Serenity.sessionVariableCalled(VARIBLE_NOMBRE_PRODUCTO))
        ));
    }

    @Cuando("el {actor} agregue {string} productos al carrito de compras")
    public void agregarVariosProductosCarritoCompras(Actor actor,String numeroProductos) {
        actor.attemptsTo(
                AnadirVariosProductos.enCarritoCompras(numeroProductos),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor()));
    }
    @Entonces("el {actor} podrá observar que se agregaron {string} correctamente al carrito de compras")
    public void observarProductosAgregados(Actor actor,String numeroProductos) {
        actor.should(seeThat(
                validarTextos(obtenerTamanoTargetRepetido(LBL_NOMBRE_PRODUCTO,actor),numeroProductos)
        ));
    }

}
