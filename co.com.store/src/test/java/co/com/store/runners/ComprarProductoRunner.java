package co.com.store.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/comprar_producto.feature"},
        glue = {"co.com.store.definitions"},
        tags = "@section02"
)
public class ComprarProductoRunner {
}
