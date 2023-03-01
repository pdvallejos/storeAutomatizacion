package co.com.store.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class ProcesoCompraInterface  {

    public static final Target LNK_CARRITO_COMPRAS = Target
            .the("link carrito de compras")
            .located(linkText("Cart"));

    public static final Target BTN_REALIZAR_PEDIDO = Target
            .the("link carrito de compras")
            .located(cssSelector(" button.btn.btn-success"));

    public static final Target TXT_NOMBRE = Target
            .the("campo nombre")
            .located(id("name"));

    public static final Target TXT_PAIS = Target
            .the("campo pais")
            .located(id("country"));

    public static final Target TXT_CIUDAD = Target
            .the("campo ciudad")
            .located(id("city"));

    public static final Target TXT_TARJETA_CREDITO = Target
            .the("campo tarjeta de credito")
            .located(id("card"));

    public static final Target TXT_MES = Target
            .the("campo mes")
            .located(id("month"));

    public static final Target TXT_YEAR = Target
            .the("campo mes")
            .located(id("year"));

    public static final Target BTN_COMPRA = Target
            .the("boton comprar")
            .located(cssSelector("body.modal-open:nth-child(2) div.modal.fade.show:nth-child(3) div.modal-dialog div.modal-content > div.modal-footer button.btn.btn-primary"));








}
