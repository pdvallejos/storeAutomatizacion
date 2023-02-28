package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarTexto implements Question<Boolean> {
    private final String textoObtenido;

    private final String textoEsperado;

    public ValidarTexto(String textoObtenido, String textoEsperado) {
        this.textoObtenido = textoObtenido;
        this.textoEsperado = textoEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return textoObtenido.equals(textoEsperado);
    }

    public static ValidarTexto validarTextos(String datoObtenido, String datoEsperado){
        return new ValidarTexto(datoObtenido.toUpperCase(), datoEsperado.toUpperCase());
    }
}
