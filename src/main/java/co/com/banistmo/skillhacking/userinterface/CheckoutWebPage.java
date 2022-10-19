package co.com.banistmo.skillhacking.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutWebPage extends PageObject {

    public static final Target DELETE_BOTON = Target.the("botton the delete a item")
            .located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/form/table/tbody/tr[1]/td[1]/a"));

    public static final Target COST_TOTAL = Target.the("botton the delete a item")
            .located(By.xpath("//*[@id=\"page-34\"]/div/div[1]/div[2]/div/table/tbody/tr[3]/td/strong/span"));

}
