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
    SALUDO("Welcome "),
    VARIBLE_NOMBRE_PRODUCTO("Nombre producto"),
    VALIDACION_COMPRA_EXITOSA("Thank you for your purchase!"),
    MENSAJE_CONTACTENOS_EXITOSO("Thanks for the message!!"),
    MENSAJE_CONTACTENOS_FALLIDO("Please complete all the information"),
    MENSAJE_VALIDACION_COMPRA("respuesta de la alerta"),
    MENSAJE_COMPRA_CAMPOS_INCORRECTOS("Please fill out Name and Creditcard."),
    VALIDACION_DILIGENCIAR_CAMPOS ("error durante el proceso de diligenciamiento de campos"),
    MENSAJE_COMPRA_FALLIDO("please add products to shopping cart"),
    PRECIO_BORRAR("Precio a borrar"),
    COMPRA_CON_PRODUCTOS("Con productos"),
    PRECIO_TOTAL("Precio total antes");

    private final String valor;
    
}