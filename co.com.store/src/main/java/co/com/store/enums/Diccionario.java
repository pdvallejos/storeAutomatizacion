package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers");




    private final String valor;

    Diccionario(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}