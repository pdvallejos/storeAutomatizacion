package co.com.store.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class LlenarCampos implements Interaction {

    private final Target target;
    private final String dato;

    public LlenarCampos(Target target, String dato) {
        this.target = target;
        this.dato = dato;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
                Clear.field(target).performAs(actor);
                Enter.theValue(dato).into(target).performAs(actor);
    }

    public static LlenarCampos llernarCamposCompra(Target target, String dato){
        return new LlenarCampos(target,dato);
    }
}
