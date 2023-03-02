package co.com.store.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LlernarCamposCompra implements Interaction {

    private final Target target;
    private final String dato;

    public LlernarCamposCompra(Target target, String dato) {
        this.target = target;
        this.dato = dato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                Clear.field(target).performAs(actor);
                Enter.theValue(dato).into(target).performAs(actor);
    }

    public static LlernarCamposCompra llernarCamposCompra(Target target, String dato){
        return new LlernarCamposCompra(target,dato);
    }
}
