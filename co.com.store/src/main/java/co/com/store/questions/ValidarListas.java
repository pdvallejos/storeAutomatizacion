package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;
import java.util.stream.Collectors;

public class ValidarListas implements Question<Boolean> {

    private final List<String> datoEsperado;

    private final List<String> datoObtenido;
    public ValidarListas(List<String> datoObtenido, List<String> datoEsperado) {
        this.datoEsperado=datoEsperado;
        this.datoObtenido=datoObtenido;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        List<?> listaOrdenadaEsperada;
        List<?> listaOrdenadaObtenida;
        listaOrdenadaEsperada = datoEsperado.stream().sorted().collect(Collectors.toList());
        listaOrdenadaObtenida = datoObtenido.stream().sorted().collect(Collectors.toList());

        return listaOrdenadaEsperada.equals(listaOrdenadaObtenida);
    }


    public static ValidarListas validarListas(List<String> datoObtenido, List<String> datoEsperado){
        return new ValidarListas(datoObtenido, datoEsperado);
    }
}
