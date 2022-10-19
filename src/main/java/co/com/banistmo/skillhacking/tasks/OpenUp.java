package co.com.banistmo.skillhacking.tasks;

import co.com.banistmo.skillhacking.userinterface.CheckoutWebPage;
import co.com.banistmo.skillhacking.userinterface.PracticeAutomationWebPage;
import co.com.banistmo.skillhacking.userinterface.ShopWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private PracticeAutomationWebPage practiceAutomationWebPage;
    public static OpenUp theWebPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(practiceAutomationWebPage));
    }
}
