package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class CountryInformationSteps {

    private RequestSpecification request;
    private Response response;

    public CountryInformationSteps(){
    }

    @Given("I want information about the country {string}")
    public void iWantInformationAboutTheCountry(String countryCode) {
        request = given().queryParam("countryCode", countryCode);
    }

    @Then("the system returns status code {int}")
    public void theSystemReturnsStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @When("the information about the country is retrieved")
    public void theInformationAboutTheCountryIsRetrieved() {
        response = request.when().get("https://date.nager.at/Api/v2/CountryInfo");
    }

    @And("the official name {string} and region {string} is returned")
    public void theOfficialNameAndRegionIsReturned(String name, String region) {
        response.then().body("officialName", equalTo(name),
                "region", equalTo(region));
    }
}
