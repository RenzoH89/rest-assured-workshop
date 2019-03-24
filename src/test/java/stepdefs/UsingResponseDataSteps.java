package stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;

public class UsingResponseDataSteps {

    private Response posts;
    private Response users;
    ;

    @When("I retrieve information about the blog posts")
    public void iRetrieveInformationAboutBlogPosts() {
        // perhaps visit the below website in your browser to see that this api does
        posts = when().get("https://jsonplaceholder.typicode.com/posts");
        String postsString = posts.asString();
        System.out.println("posts " + postsString);
    }

    @Then("at least one post with title {string} is returned")
    public void thePostWithTitleIsReturned(String title) {
        posts.then().body(containsString(title));
    }


    @When("I retrieve information about the users")
    public void iRetrieveInformationAboutTheUsers() {
        // perhaps visit the below website in your browser to see that this api does
        users = when().get("https://jsonplaceholder.typicode.com/users");
        String usersString = users.asString();
        System.out.println("users " + usersString);
    }

    @Then("at least one user with username {string} is returned")
    public void theUserWithUsernameIsReturned(String username) {
        users.then().body(containsString(username));
    }

    //    Scenario 3
    @When("I retrieve information about the author of the first blog post")
    public void iRetreiveUserInformation() {
//        String postsUID =  posts.jsonPath().getString("userId");
//        System.out.println("postsUID=" + postsUID);
//        userid[0]
//        String specifcUserInfo =  when().get("https://jsonplaceholder.typicode.com/users/1");
    }
}
