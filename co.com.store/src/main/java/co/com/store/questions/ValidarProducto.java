package co.com.store.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;


public class ValidarProducto implements Question<Boolean> {

    private final Target target;

    private final Boolean presente;

    public ValidarProducto(Boolean presente,Target target) {
        this.target=target;
        this.presente=presente;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return presente.equals(target.resolveFor(actor).isPresent());
    }

    public static ValidarProducto presente(Boolean presente,Target target){
        return new ValidarProducto(presente,target);
    }
}
