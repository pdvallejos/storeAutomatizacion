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
    MENSAJE_CONTACTENOS("Respuesta que se envia"),
    MENSAJE_CONTACTENOS_EXITOSO("Thanks for the message!!"),

    PRECIO_BORRAR("Precio a borrar"),

    PRECIO_TOTAL("Precio total antes"),
    MENSAJE_CONTACTENOS_FALLIDO("Please complete all the information");

    public String getValor() {
        return valor;
    }
}