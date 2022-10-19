package co.com.banistmo.skillhacking.tasks;

import co.com.banistmo.skillhacking.userinterface.ShopWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddShopCart implements Task {

    public static AddShopCart addItems() {
        return Tasks.instrumented(AddShopCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ShopWebPage.ADD_SELENIUM_BOTON),
                Click.on(ShopWebPage.ADD_MASTERING_BOTON),
                Click.on(ShopWebPage.CHECKOUT_BOTON));
    }
}
