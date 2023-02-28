package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retoSura.userinterfaces.gui.ValidarCompra.TXT_CONFIRMACION;

public class ValidarCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_CONFIRMACION.resolveFor(actor).getText();

    }

    public static ValidarCompra validarCompra() {
        return new ValidarCompra();
    }


}
