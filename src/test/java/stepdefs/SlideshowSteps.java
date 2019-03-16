package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class SlideshowSteps {

    private Response response;

    @When("I retrieve information about a slideshow")
    public void iRetrieveInformationAboutASampleSlideshow() {
        response =  when().get("https://httpbin.org/json");
    }

    @Then("the author of the slideshow is {string}")
    public void theAuthorOfTheSlideshowIs(String author) {
        response.then().body("slideshow.author", equalTo(author));
    }

    @And("the slideshow contains {int} slides")
    public void theSlideshowContainsSlides(int slides) {
        response.then().body("slideshow.slides.size()", equalTo(slides));
    }

    @Then("the title of the slideshow is {string}")
    public void theTitleOfTheSlideShowIs(String title) {
        //TODO: Schrijf hier de code om het title element uit de JSON te valideren
        throw new cucumber.api.PendingException();
    }

    @Then("the statuscode {int} is returned")
    public void theStatuscodeIsReturned(int statusCode) {
        //TODO: Schrijf hier de code de status code te controleren
        throw new cucumber.api.PendingException();

    }
}
