package co.com.choucair.reto.test.stepdefinitions;

import co.com.choucair.reto.test.questions.Answer;
import co.com.choucair.reto.test.task.InPlatform;
import co.com.choucair.reto.test.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RetoChoucairStepDefinitions {

    @Before()
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to make a new register at Utest\\.com platform$")
    public void thanAndresWantsToMakeANewRegisterAtUtestComPlatform() {
        OnStage.theActorCalled("Andrés").wasAbleTo(OpenUp.onThePage());
    }


    @When("^he goes at register form on Utest\\.com platform$")
    public void heGoesAtRegisterFormOnUtestComPlatform() {
        OnStage.theActorInTheSpotlight().attemptsTo(InPlatform.in());
    }

    @Then("^he fills and save all data provided$")
    public void heFillsAndSaveAllDataProvided() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Welcome to the world's largest community of freelance software testers!")));
    }
}
