package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.store.userinterfaces.ValidarCompraInterface.TXT_VALIDACION_COMPRA_EXITOSA;

public class ValidarCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_VALIDACION_COMPRA_EXITOSA.resolveFor(actor).getText();
    }

    public static ValidarCompra validarCompra() {
        return new ValidarCompra();
    }

}
