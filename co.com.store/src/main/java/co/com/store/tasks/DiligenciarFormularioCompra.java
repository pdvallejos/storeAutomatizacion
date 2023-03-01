package co.com.store.tasks;

import co.com.store.models.FormularioCompraBuilder;
import co.com.store.models.FormularioCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.store.userinterfaces.ProcesoCompraInterface.*;


public class DiligenciarFormularioCompra implements Task {

    FormularioCompraModel formularioCompraModel;
    public DiligenciarFormularioCompra(FormularioCompraModel formularioCompraModel) {
        this.formularioCompraModel = formularioCompraModel;
    }

    public static FormularioCompraBuilder conPais(String pais) {
        return new FormularioCompraBuilder(pais);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_CARRITO_COMPRAS),
                Click.on(BTN_REALIZAR_PEDIDO),

                Clear.field(TXT_NOMBRE),
                Enter.theValue(formularioCompraModel.getNombre()).into(TXT_NOMBRE),

                Clear.field(TXT_PAIS),
                Enter.theValue(formularioCompraModel.getPais()).into(TXT_PAIS),

                Clear.field(TXT_CIUDAD),
                Enter.theValue(formularioCompraModel.getCiudad()).into(TXT_CIUDAD),

                Clear.field(TXT_TARJETA_CREDITO),
                Enter.theValue(formularioCompraModel.getTargetaCredito()).into(TXT_TARJETA_CREDITO),

                Clear.field(TXT_MES),
                Enter.theValue(formularioCompraModel.getMes()).into(TXT_MES),

                Clear.field(TXT_YEAR),
                Enter.theValue(formularioCompraModel.getYear()).into(TXT_YEAR),

                Click.on(BTN_COMPRA)
        );
    }
}
