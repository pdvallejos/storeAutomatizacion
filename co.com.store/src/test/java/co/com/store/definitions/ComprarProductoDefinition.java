package co.com.store.definitions;

import co.com.store.tasks.AgregarProducto;

import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import java.util.ArrayList;

import static co.com.store.enums.Diccionario.COMPRA_CON_PRODUCTOS;
import static co.com.store.enums.Diccionario.MENSAJE_COMPRA_CAMPOS_INCORRECTOS;
import static co.com.store.enums.Diccionario.MENSAJE_COMPRA_FALLIDO;
import static co.com.store.enums.Diccionario.MENSAJE_VALIDACION_COMPRA;
import static co.com.store.enums.Diccionario.VALIDACION_COMPRA_EXITOSA;
import static co.com.store.questions.ValidarTexto.validarTextos;
import static co.com.store.tasks.IrCarritoCompras.irCarritoCompras;
import static co.com.store.tasks.RealizarCompra.realizarCompra;
import static co.com.store.userinterfaces.ValidarCompraInterface.TXT_VALIDACION_COMPRA_EXITOSA;
import static co.com.store.utils.Utilidades.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class ComprarProductoDefinition {

    public ArrayList<String> datosCompra = Utilidades.generarClientesAleatorios();


    @Cuando("el {actor} ingresa productos al carrito de compras")
    public void ingresaProductosAlCarritoDeCompras(Actor actor) {
        actor.attemptsTo(
                AgregarProducto.enCarritoCompras(),
                irCarritoCompras(COMPRA_CON_PRODUCTOS.getValor())
        );

    }

    @Y("el {actor} realiza el proceso de compra")
    public void realizaElProcesoLaCompra(Actor actor) {
        actor.attemptsTo(
                realizarCompra(),
                DiligenciarDatosCliente(datosCompra.get(1), datosCompra.get(7))
        );
    }

    @Entonces("el {actor} visualiza un mensaje de compra exitosa")
    public void seVisualizaUnMensajeDeCompraExitosa(Actor actor) {
        actor.should(

                seeThat(validarTextos(obtenerTextoElemento(TXT_VALIDACION_COMPRA_EXITOSA, actor), VALIDACION_COMPRA_EXITOSA.getValor()))
        );
    }

    @Y("el {actor} realiza el proceso de compra sin completar el campo nombre")
    public void realizaElProcesoDeCompraSinCompletarElCampoNombre(Actor actor) {

        actor.attemptsTo(
                realizarCompra(),
                DiligenciarDatosCliente(datosCompra.get(10), datosCompra.get(7))
        );
        obtenerTextoAlerta();
    }

    @Entonces("el {actor} visualiza una alerta de campo requerido")
    public void seVisualizaUnaAlertaDeCampoRequerido(Actor actor) {
        actor.should(
                seeThat(validarTextos(obtenerTextoAlerta(), MENSAJE_COMPRA_CAMPOS_INCORRECTOS.getValor()))
        );


    }

    @Y("el {actor} realiza el proceso de compra sin completar el campo tarjeta de credito")
    public void realizaElProcesoDeCompraSinCompletarElCampoTarjetaDeCredito(Actor actor) {
        actor.attemptsTo(
                realizarCompra(),
                DiligenciarDatosCliente(datosCompra.get(1), datosCompra.get(10))
        );
    }

    @Cuando("el {actor} realiza el proceso de compra sin productos en el carrito")
    public void realizaElProcesoDeCompraSinProductosEnElCarrito(Actor actor) {
        actor.attemptsTo(
                irCarritoCompras(""),
                realizarCompra()
        );
    }

    @Entonces("el {actor} visualiza un mensaje de error")
    public void laCompraNoSeRealizaCorrectamente(Actor actor) {
        actor.should(
                seeThat(validarTextos(MENSAJE_VALIDACION_COMPRA.getValor(), MENSAJE_COMPRA_FALLIDO.getValor()))
        );

    }
}
