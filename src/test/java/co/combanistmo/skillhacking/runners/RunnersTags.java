package co.combanistmo.skillhacking.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BasketShopCart.feature",
        glue = "co.combanistmo.skillhacking.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnersTags {
}
