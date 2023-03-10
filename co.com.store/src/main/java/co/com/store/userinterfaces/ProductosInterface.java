package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosInterface {

    ProductosInterface(){}

    public static final Target LBL_NOMBRE_PRODUCTO=Target
            .the("Titulo de cada producto que redirige a compra")
            .located(By.cssSelector("a[class='hrefch']"));

    public static final Target BTN_ADD_TO_CART=Target
            .the("Botón para añadir producto al carrito")
            .located(By.cssSelector("a[class='btn btn-success btn-lg']"));

    public static final Target LBL_HOME=Target
            .the("Titulo para acceder al home de la tienda")
            .located(By.xpath("//a[contains(text(),'Home')]"));

}
