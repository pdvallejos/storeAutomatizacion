package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        //return TXT_CONFIRMACION.resolveFor(actor).getText();
return "hola";
    }

    public static ValidarCompra validarCompra() {
        return new ValidarCompra();
    }


}
