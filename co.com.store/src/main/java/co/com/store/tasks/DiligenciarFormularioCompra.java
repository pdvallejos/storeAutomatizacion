package co.com.store.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static co.com.store.userinterfaces.ProcesoCompraInterface.*;
import static co.com.store.utils.Utilidades.esperar;


public class DiligenciarFormularioCompra implements Task {

    private String nombre;

    public DiligenciarFormularioCompra conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    private String pais;

    public DiligenciarFormularioCompra conPais(String pais) {
        this.pais = pais;
        return this;
    }

    private String ciudad;

    public DiligenciarFormularioCompra conCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    private String targetaCredito;

    public DiligenciarFormularioCompra conTargetaCredito(String targetaCredito) {
        this.targetaCredito = targetaCredito;
        return this;
    }

    private String mes;

    public DiligenciarFormularioCompra conMes(String mes) {
        this.mes = mes;
        return this;
    }

    private String year;

    public DiligenciarFormularioCompra conYear(String year) {
        this.year = year;
        return this;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CARRITO_COMPRAS),
                Click.on(BTN_REALIZAR_PEDIDO),

                Clear.field(TXT_NOMBRE),
                Enter.theValue(nombre).into(TXT_NOMBRE),

                Clear.field(TXT_PAIS),
                Enter.theValue(pais).into(TXT_PAIS),

                Clear.field(TXT_CIUDAD),
                Enter.theValue(ciudad).into(TXT_CIUDAD),

                Clear.field(TXT_TARJETA_CREDITO),
                Enter.theValue(targetaCredito).into(TXT_TARJETA_CREDITO),

                Clear.field(TXT_MES),
                Enter.theValue(mes).into(TXT_MES),

                Clear.field(TXT_YEAR),
                Enter.theValue(year).into(TXT_YEAR),

                Click.on(BTN_COMPRA)
        );
        esperar(10).until(ExpectedConditions.alertIsPresent()).getText();
    }

    public static DiligenciarFormularioCompra diligenciarFormularioCompra() {
        return new DiligenciarFormularioCompra();
    }
}

