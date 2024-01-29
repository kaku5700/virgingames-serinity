package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.CurrencySteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.annotations.Title;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;


public class MyStepDefs {

    @Steps
    CurrencySteps steps;

    @Title("Getting all Bingo games and verifying all currency.")
    @When("User Send Get Request to Bingo Endpoint with currency as {string}")
    public void userSendGetRequestToBingoEndpointWithCurrencyAs(String currency) {
        steps.getAllDataByEndPoint(currency);
    }

    @Title("Getting all Bingo games and verifying currency is GBP,Euro,SEK.")
    @Then("I verify currency is in {string}")
    public void iVerifyCurrencyIsIn(String currency) {
        List<HashMap<String, Object>> expectedCurrency = steps.getAllDataByEndPoint(currency);
        Assert.assertTrue(expectedCurrency.contains(currency));
    }
}
