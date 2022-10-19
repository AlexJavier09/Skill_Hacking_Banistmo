package co.combanistmo.skillhacking.stepdefinitions;

import co.com.banistmo.skillhacking.model.DataList;
import co.com.banistmo.skillhacking.questions.ValidatePrice;
import co.com.banistmo.skillhacking.tasks.AddShopCart;
import co.com.banistmo.skillhacking.tasks.DeleteShopCart;
import co.com.banistmo.skillhacking.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ShopCartStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the webpage is on practice automation testing$")
    public void theWebpageIsOnPracticeAutomationTesting() {
        OnStage.theActorCalled("alex").wasAbleTo(OpenUp.theWebPage());
    }


    @When("^the user navigate to find the courses to proceed to the checkout$")
    public void theUserNavigateToFindTheCoursesToProccedToTheCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddShopCart.addItems());
    }

    @When("^the user delete one item of the checkout$")
    public void theUserDeleteOneItemOfTheCheckout() {
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteShopCart.deleteItem());
    }

    @Then("^the user will see the price lowest$")
    public void theUserWillSeeThePriceLowest(List<DataList> dataList) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidatePrice.comparePrice(dataList)));
    }

}
