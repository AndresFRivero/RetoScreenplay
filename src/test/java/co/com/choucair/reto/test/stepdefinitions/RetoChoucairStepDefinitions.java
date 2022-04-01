package co.com.choucair.reto.test.stepdefinitions;

import co.com.chocair.reto.model.RetoData;
import co.com.chocair.reto.questions.Answer;
import co.com.chocair.reto.task.InPlatform;
import co.com.chocair.reto.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoChoucairStepDefinitions {

    @Before()
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Andres wants to make a new register at Utest\\.com platform$")
    public void thanAndresWantsToMakeANewRegisterAtUtestComPlatform() throws Exception{
        OnStage.theActorCalled("Andrés").wasAbleTo(OpenUp.onThePage());
    }


    @When("^he goes at register form on Utest\\.com platform$")
    public void heGoesAtRegisterFormOnUtestComPlatform(List<RetoData> retoData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(InPlatform.in(
                retoData.get(0).getFirstName(),
                retoData.get(0).getLastName(),
                retoData.get(0).getEmail(),
                retoData.get(0).getLanguage(),
                retoData.get(0).getPassword(),
                retoData.get(0).getConfirmPassword()));
    }

    @Then("^he fills and save all data provided$")
    public void heFillsAndSaveAllDataProvided(List<RetoData> retoData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retoData.get(0).getMessageConfirm())));
    }
}
