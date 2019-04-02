package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class BlogSteps {

    private Response posts;
    private Response users;

    @When("I retrieve information about the blog posts")
    public void iRetrieveInformationAboutBlogPosts() {
        // perhaps visit the below website in your browser to see that this api does
        posts = when().get("https://jsonplaceholder.typicode.com/posts");
    }

    @Then("at least one post with title {string} is returned")
    public void thePostWithTitleIsReturned(String title) {
        posts.then().body("title", hasItem(containsString(title)));
    }


    @When("I retrieve information about the users")
    public void iRetrieveInformationAboutTheUsers() {
        // perhaps visit the below website in your browser to see that this api does
        users = when().get("https://jsonplaceholder.typicode.com/users");
    }

    @Then("at least one user with username {string} is returned")
    public void theUserWithUsernameIsReturned(String username) {
        users.then().body("username", hasItem(containsString(username)));
    }

    @When("I retrieve information about the author of the first blog post")
    public void iRetrieveUserInformationFromFirstBlogPost() {
        //Zoek op basis van de eerste post uit de response de bijbehorende met de volgende url:
        //https://jsonplaceholder.typicode.com/users/{idOfUser} waarbij {idOfUser}
        // vervangen dient te worden met het id van de user uit de vorige response.
        throw new cucumber.api.PendingException();
    }
}
