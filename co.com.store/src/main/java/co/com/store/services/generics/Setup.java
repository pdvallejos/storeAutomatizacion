package co.com.store.services.generics;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static co.com.store.enums.Diccionario.ACTOR_NAME;
import static co.com.store.enums.Diccionario.RUTA_DRIVERS;
import static co.com.store.enums.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;


public class Setup {
    protected WebDriver webdriver;
    protected Actor actor = Actor.named(ACTOR_NAME.getValor());
    protected void setupGeneral() {
        setupLog4j();
        WebDriverManager.chromedriver().cachePath(RUTA_DRIVERS.getValor()).setup();
        webdriver = new ChromeDriver(configurarChrome());

    }

    private ChromeOptions configurarChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        return options;
    }

    private void setupLog4j() {
        PropertyConfigurator.configure(LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}
