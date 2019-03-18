package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class UserSteps {
    private RequestSpecification request;
    private Response response;


    @Given("a user with name and job is about to be created")
    public void aUserWithNameAndJobIsAboutToBeCreated() {
        //Opdracht: Creeer een request met een JSON body. Content-Type in de header 'moet' application/json zijn.
        throw new cucumber.api.PendingException();
        //request = given()...
    }

    @When("the user is created in the system")
    public void theUserIsCreatedInTheSystem() {
        response = request.when().post("https://reqres.in/api/users");
    }

    @Then("an id and creation date for this user is returned")
    public void anIdAndCreationDateForThisUserIsReturned() {
        /* Opdracht: Verifieer dat er een id en creation date terug komt.
        *  Controleer voor de creationDate of deze gelijk aan vandaag is.
        *  Je kan daarvoor de getToday methode uit deze klasse gebruiken
        */
        throw new cucumber.api.PendingException();
        // response.then()...
    }

    @And("the response contains the name and job of the created user")
    public void theResponseContainsTheNameAndJobOfTheCreatedUser() {
        //Verifieer de name en job elementen uit de response
        throw new cucumber.api.PendingException();
        // response.then()...
    }

    //Hulp methodes
    private String getToday(){
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
