package co.com.store.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import static co.com.store.enums.Diccionario.VARIBLE_LISTA_PRODUCTOS;
import static co.com.store.enums.Diccionario.VARIBLE_NOMBRE_PRODUCTO;

public class SeleccionarProductoAleatorio implements Interaction {

    private final Target target;

    //private List<String> productos;
    public SeleccionarProductoAleatorio(Target target) {
        this.target=target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int productoSeleccionar = ThreadLocalRandom.current().nextInt(target.resolveAllFor(actor).size());
        Serenity.setSessionVariable(VARIBLE_NOMBRE_PRODUCTO).to(target.resolveAllFor(actor).get(productoSeleccionar).getText());
        target.resolveAllFor(actor).get(productoSeleccionar).click();

    }

    public static SeleccionarProductoAleatorio enSeccionProductos(Target target){
        return new SeleccionarProductoAleatorio(target);
    }
}
