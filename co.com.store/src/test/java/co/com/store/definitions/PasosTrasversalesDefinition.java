package co.com.store.definitions;

import co.com.store.tasks.AbrirPagina;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.apache.log4j.PropertyConfigurator;

import static co.com.store.enums.Diccionario.ACTOR_NAME;
import static co.com.store.enums.Diccionario.URL_BASE;
import static co.com.store.enums.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class PasosTrasversalesDefinition {

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que el {actor} se encuentra en la tienda")
    public void queUsuarioEntrarTienda(Actor actor) {
        PropertyConfigurator.configure(LOG4J_PROPERTIES_FILE_PATH.getValue());
        actor.attemptsTo(AbrirPagina.enUrl(URL_BASE.getValor())
        );
    }
}
