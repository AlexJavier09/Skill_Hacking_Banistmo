package co.com.banistmo.skillhacking.tasks;

import co.com.banistmo.skillhacking.userinterface.CheckoutWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteShopCart implements Task {


    public static DeleteShopCart deleteItem() {
        return Tasks.instrumented(DeleteShopCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CheckoutWebPage.DELETE_BOTON));

    }
}
