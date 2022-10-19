package co.com.banistmo.skillhacking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShopWebPage extends PageObject {

    public static final Target ADD_SELENIUM_BOTON = Target.the("botton to add Selenium ruby course")
            .located(By.xpath("//*[@id=\"content\"]/ul/li[7]/a[2]"));

    public static final Target ADD_MASTERING_BOTON = Target.the("botton to add Mastering Javascript course")
            .located(By.xpath("//*[@id=\"content\"]/ul/li[6]/a[2]"));

    public static final Target CHECKOUT_BOTON = Target.the("botton to go Checkout")
            .located(By.xpath("//*[@id=\"wpmenucartli\"]/a"));


}
