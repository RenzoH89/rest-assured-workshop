package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class SlideshowSteps {

    private Response response;

    @When("I retrieve information about a sample slideshow")
    public void iRetrieveInformationAboutASampleSlideshow() {
        response =  when().get("https://httpbin.org/json");
    }

    @Then("the author {string} is returned")
    public void theAuthorIsReturned(String author) {
        response.then().body("slideshow.author", equalTo(author));
    }

    @And("the slideshow contains {int} slides")
    public void theSlideshowContainsSlides(int slides) {
        response.then().body("slideshow.slides.size()", equalTo(slides));
    }
}
