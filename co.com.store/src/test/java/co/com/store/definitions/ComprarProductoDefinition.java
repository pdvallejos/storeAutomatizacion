package co.com.store.definitions;

import co.com.store.models.FormularioCompraModel;
import co.com.store.utils.Utilidades;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;

import static co.com.store.enums.Diccionario.VALIDACION_COMPRA_EXITOSA;
import static co.com.store.questions.ValidarCompra.validarCompra;
import static co.com.store.tasks.DiligenciarFormularioCompra.conPais;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;


public class ComprarProductoDefinition {


    private FormularioCompraModel formularioCompraModel;

    @Cuando("el {actor} ingresa productos al carrito de compras")
    public void ingresaProductosAlCarritoDeCompras(Actor actor) {


    }

    @Y("el {actor} realiza el proceso de compra")
    public void realizaElProcesoLaCompra(Actor actor) {
        formularioCompraModel= new FormularioCompraModel();
        Utilidades datosUsuario = new Utilidades();
        formularioCompraModel =  datosUsuario.DatosEnvioCompra();
        actor.attemptsTo(

                conPais(formularioCompraModel.getPais())
                        .conNombre(formularioCompraModel.getNombre())
                        .conCiudad(formularioCompraModel.getCiudad())
                        .conTargetaCredito(formularioCompraModel.getTargetaCredito())
                        .conMes(formularioCompraModel.getMes())
                        .conYear(formularioCompraModel.getYear())
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
        formularioCompraModel= new FormularioCompraModel();
        Utilidades datosUsuario = new Utilidades();
        formularioCompraModel =  datosUsuario.DatosEnvioCompra();
        actor.attemptsTo(

                conPais(formularioCompraModel.getPais())
                        .conCiudad(formularioCompraModel.getCiudad())
                        .conTargetaCredito(formularioCompraModel.getTargetaCredito())
                        .conMes(formularioCompraModel.getMes())
                        .conYear(formularioCompraModel.getYear())
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
