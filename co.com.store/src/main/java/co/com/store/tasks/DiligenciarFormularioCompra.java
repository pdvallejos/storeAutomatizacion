package co.com.store.tasks;


import co.com.store.exceptions.ProcesoCompraException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.store.enums.Diccionario.VALIDACION_DILIGENCIAR_CAMPOS;
import static co.com.store.interactions.LlernarCamposCompra.llernarCamposCompra;
import static co.com.store.userinterfaces.ProcesoCompraInterface.*;


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

        try {
            actor.attemptsTo(
                    llernarCamposCompra(TXT_NOMBRE, nombre),
                    llernarCamposCompra(TXT_PAIS, pais),
                    llernarCamposCompra(TXT_CIUDAD, ciudad),
                    llernarCamposCompra(TXT_TARJETA_CREDITO, targetaCredito),
                    llernarCamposCompra(TXT_MES, mes),
                    llernarCamposCompra(TXT_YEAR, year),
                    Click.on(BTN_COMPRA)
            );
        } catch (Exception exception) {
            throw new ProcesoCompraException(VALIDACION_DILIGENCIAR_CAMPOS.getValor(), exception);
        }


    }


    public static DiligenciarFormularioCompra diligenciarFormularioCompra() {
        return Tasks.instrumented(DiligenciarFormularioCompra.class);
    }
}

