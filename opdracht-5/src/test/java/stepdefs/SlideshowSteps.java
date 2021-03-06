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

    @Then("the system returns status code {int}")
    public void theSystemReturnsStatusCode(int statusCode) {
        response.then().statusCode(statusCode);
    }
}
