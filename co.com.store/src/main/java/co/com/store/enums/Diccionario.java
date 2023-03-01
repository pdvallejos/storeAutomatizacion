package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),

    VARIBLE_NOMBRE_PRODUCTO("Nombre producto"),

    ACTOR_NAME ("Fabricio");

    private final String valor;
    
}