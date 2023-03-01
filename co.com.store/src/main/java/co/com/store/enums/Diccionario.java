package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),

    VARIBLE_NOMBRE_PRODUCTO("Nombre producto"),

    VARIBLE_LISTA_PRODUCTOS("Lista productos"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers");

    private final String valor;

    public String getValor() {
        return valor;
    }

    Diccionario(String valor) {
        this.valor = valor;
    }
}