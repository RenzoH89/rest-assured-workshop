package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.Request;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class ExchangeRateSteps {

    private RequestSpecification request;
    private Response response;

    @Given("I want to compare the rate of {string} against {string} at {string}")
    public void iWantToCompareTheRateOfToAgainst(String currencyToCheck, String baseCurrency, String date) {
        /*
         * Opdracht: Het request wat we gaan versturen heeft meerdere parameters nodig (2 query Parameters en een Path parameter):
         * currencyToCheck --> queryParameter (symbols)
         * baseCurrency --> queryParameter (base)
         * date --> pathParam (date)
        */
        throw new cucumber.api.PendingException();
        // request = given()...
    }

    @When("the information about the exchange rate is retrieved for this date")
    public void theInformationAboutTheExchangeRateIsRetrievedForThisDate() {
        response = request.when().get("https://api.exchangeratesapi.io/{date}");
    }

    @Then("the rate of {string} is {double}")
    public void theRateOfIs(String currencyToCheck, double currencyRate) {
        //Opdracht: Controleer in de response de huidige koers voor de gekozen valuta
        throw new cucumber.api.PendingException();
        // response.then()...
    }
}
