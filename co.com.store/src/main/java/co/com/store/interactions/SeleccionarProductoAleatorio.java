package co.com.store.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.concurrent.ThreadLocalRandom;

public class SeleccionarProductoAleatorio implements Interaction {

    private final Target target;
    public SeleccionarProductoAleatorio(Target target) {
        this.target=target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int productoSeleccionar = ThreadLocalRandom.current().nextInt(target.resolveAllFor(actor).size());
        target.resolveAllFor(actor).get(productoSeleccionar).click();
    }

    public static SeleccionarProductoAleatorio enSeccionProductos(Target target){
        return new SeleccionarProductoAleatorio(target);
    }
}
