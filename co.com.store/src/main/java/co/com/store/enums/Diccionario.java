package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),
    ACTOR_NAME ("Fabricio"),
    USUARIO ("lalo123"),
    PASSWORD("12345678"),
    MENSAJE_REGISTRO_EXITOSO("Sign up successful."),
    CAMPO_REGISTRO_FALTANTE ("Please fill out Username and Password."),
    PASSWORD_INCORRECTO("sarasa"),
    SALUDO("Welcome ");

    private final String valor;
}