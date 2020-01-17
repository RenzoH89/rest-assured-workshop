package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class AuthenticationSteps {

    private RequestSpecification request;
    private Response response;

    @Given("my credentials are {string} and {string}")
    public void myCredentialsAreAnd(String username, String password) {
        //Opdracht: maak een request waarbij er basis authenticatie meegestuurd wordt
        throw new cucumber.api.PendingException();
    }

    @When("I try to log in")
    public void iTryToLogIn() {
        response = request.when().get("https://httpbin.org/basic-auth/user/passwd");
    }

    @Then("the system grants me access")
    public void theSystemGrantsMeAccess() {
        //Opdracht: Controleer de statuscode van de response en de waarde van het element "authenticated"
        throw new cucumber.api.PendingException();
    }
}
