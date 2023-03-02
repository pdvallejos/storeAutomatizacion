package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),
    ACTOR_NAME ("Fabricio"),
    RUTA_DRIVERS ("src/test/resources/drivers"),


    VALIDACION_COMPRA_EXITOSA("Thank you for your purchase!"),

    MENSAJE_CONTACTENOS("Respuesta que se envia"),
    MENSAJE_CONTACTENOS_EXITOSO("Thanks for the message!!"),
    MENSAJE_CONTACTENOS_FALLIDO("Please complete all the information"),

    MENSAJE_VALIDACION_COMPRA("respuesta de la alerta"),
    MENSAJE_NOMBRE_COMPRA_FALLIDA("Please fill out Name and Creditcard."),

    VALIDACION_DILIGENCIAR_CAMPOS ("error durante el proceso de diligenciamiento de campos");
    private final String valor;
}