package co.com.store.exceptions;

public class ProcesoCompraException extends RuntimeException {

    public ProcesoCompraException(String mensaje) {
        super(mensaje);
    }

    public ProcesoCompraException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }




}
