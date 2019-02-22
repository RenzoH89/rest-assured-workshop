package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class CountryInformationSteps {

    private StepBaseData data;
    private RequestSpecification request;

    public CountryInformationSteps(StepBaseData data){
        this.data = data;
    }

    @Given("I want information about the country {string}")
    public void iWantInformationAboutTheCountry(String countryCode) {
        request = given().queryParam("countryCode", countryCode);
    }

    @When("the information about the country is retrieved")
    public void theInformationAboutTheCountryIsRetrieved() {
        data.response = request.when().get("https://date.nager.at/Api/v2/CountryInfo");
    }
}
