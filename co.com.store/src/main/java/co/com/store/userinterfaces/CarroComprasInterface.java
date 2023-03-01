package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarroComprasInterface {

    public static final Target LBL_CARRITO_COMPRAS=Target
            .the("Opción para ir al carrito de compras")
            .located(By.id("cartur"));

    public static final Target BTN_REALIZAR_COMPRA=Target
            .the("Botón para realizar compra")
            .located(By.cssSelector("button[class='btn btn-success']"));

    public static final Target BTN_BORRAR_PRODUCTO=Target
            .the("Botón para eliminar producto carrito de compras")
            .located(By.xpath("//a[contains(text(),'Delete')]"));

    public static final Target LBL_NOMBRE_PRODUCTO=Target
            .the("Nombre del producto agregado en el carrito")
            .located(By.xpath("//tr[@class='success']/td[2]"));

}
