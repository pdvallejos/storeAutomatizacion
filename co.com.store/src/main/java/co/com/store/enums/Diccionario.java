package co.com.store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Diccionario {

    URL_BASE  ("https://www.demoblaze.com/"),
    ACTOR_NAME ("Fabricio"),
    VARIBLE_NOMBRE_PRODUCTO("Nombre producto"),
    RUTA_DRIVERS ("src/test/resources/drivers"),


    VALIDACION_COMPRA_EXITOSA("Thank you for your purchase!"),

    MENSAJE_CONTACTENOS("Respuesta que se envia"),
    MENSAJE_CONTACTENOS_EXITOSO("Thanks for the message!!"),
    MENSAJE_CONTACTENOS_FALLIDO("Please complete all the information"),

    MENSAJE_VALIDACION_COMPRA("respuesta de la alerta"),
    MENSAJE_COMPRA_CAMPOS_INCORRECTOS("Please fill out Name and Creditcard."),

    VALIDACION_DILIGENCIAR_CAMPOS ("error durante el proceso de diligenciamiento de campos"),

    MENSAJE_COMPRA_FALLIDO("please add products to shopping cart"),

    PRECIO_BORRAR("Precio a borrar"),

    PRECIO_TOTAL("Precio total antes");


    private final String valor;
}