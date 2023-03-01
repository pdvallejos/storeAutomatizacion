package co.com.store.definitions;

import co.com.store.services.generics.Setup;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.store.enums.Diccionario.URL_BASE;

public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 InicioSesionDefinition extends Setup {
    @Dado("que el usuario se encuentra en la tienda")
    public void queUsuarioEntrarTienda() {
        setupGeneral();
        actor.can(BrowseTheWeb.with(webdriver));
        actor.attemptsTo(Open.url(URL_BASE.getValor())
        );
    }
}
