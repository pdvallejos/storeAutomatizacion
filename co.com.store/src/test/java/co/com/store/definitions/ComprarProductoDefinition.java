package co.com.store.definitions;

import co.com.store.tasks.AgregarProducto;
import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;

import java.util.ArrayList;

import static co.com.store.enums.Diccionario.VALIDACION_COMPRA_EXITOSA;
import static co.com.store.questions.ValidarCompra.validarCompra;
import static co.com.store.tasks.DiligenciarFormularioCompra.diligenciarFormularioCompra;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class ComprarProductoDefinition {

    public ArrayList<String> datosCompra = Utilidades.generarClientesAleatorios();


    @Cuando("el {actor} ingresa productos al carrito de compras")
    public void ingresaProductosAlCarritoDeCompras(Actor actor) {
        actor.attemptsTo(
            AgregarProducto.enCarritoCompras()
        );

    }

    @Y("el {actor} realiza el proceso de compra")
    public void realizaElProcesoLaCompra(Actor actor) {
        actor.attemptsTo(
                diligenciarFormularioCompra().conNombre(datosCompra.get(0))
                        .conPais(datosCompra.get(5))
                        .conCiudad(datosCompra.get(6))
                        .conTargetaCredito(datosCompra.get(7))
                        .conMes(datosCompra.get(8))
                        .conYear(datosCompra.get(9))
        );
    }

    @Entonces("el {actor} visualiza un mensaje de compra exitosa")
    public void seVisualizaUnMensajeDeCompraExitosa(Actor actor) {
        actor.should(
          seeThat("el mensaje de compra es correcto",validarCompra(),equalTo(VALIDACION_COMPRA_EXITOSA.getValor()))
        );
    }

    @Y("el {actor} realiza el proceso de compra sin completar el campo nombre")
    public void realizaElProcesoDeCompraSinCompletarElCampoNombre(Actor actor) {
        actor.attemptsTo(
                diligenciarFormularioCompra().conNombre(datosCompra.get(0))
                        .conPais(datosCompra.get(5))
                        .conCiudad(datosCompra.get(6))
                        .conTargetaCredito(datosCompra.get(7))
                        .conMes(datosCompra.get(8))
                        .conYear(datosCompra.get(9))
        );
    }

    @Entonces("se visualiza una alerta de campo requerido")
    public void seVisualizaUnaAlertaDeCampoRequerido() {
    }

    @Y("realiza el proceso de compra sin completar el campo tarjeta de credito")
    public void realizaElProcesoDeCompraSinCompletarElCampoTarjetaDeCredito() {
    }

    @Cuando("el {actor} realiza el proceso de compra sin productos en el carrito")
    public void realizaElProcesoDeCompraSinProductosEnElCarrito(Actor actor) {
    }

    @Entonces("la compra no se realiza correctamente")
    public void laCompraNoSeRealizaCorrectamente() {
    }
}
