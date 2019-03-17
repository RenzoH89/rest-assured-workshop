package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jackson.Login;
import jackson.Page;
import jackson.User;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserSteps {

    private RequestSpecification request;
    private Response response;

    @Given("my credentials are {string} and {string}")
    public void myCredentialsAreAnd(String email, String password) {
        //Opdracht: Maak gebruik van de Login class het request bericht samen te stellen ob basis van een object
        throw new cucumber.api.PendingException();
    }

    @Given("I want to retrieve the oldest set of users from the system")
    public void iWantToRetrieveTheOldestSetOfUsersFromTheSystem() {
        request = given().queryParam("page", 1);
    }

    @When("the list of users is retrieved")
    public void theListOfUsersIsRetrieved() {
        response = request.when().get("https://reqres.in/api/users");
    }

    @When("I try to login")
    public void iTryToLogin() {
        response = request.post("https://reqres.in/api/login");
    }

    @Then("the system returns {int} users from a total of {int}")
    public void theSystemReturnsUsersFromATotalOf(int returnedUsers, int totalUsers) {
        Page page = response.as(Page.class);
        List<User> users = page.getUsers();
        assertThat(page.getTotal(), equalTo(totalUsers));
        assertThat(users.size(), equalTo(returnedUsers));
    }

    @And("the returned page number is equal to {int}")
    public void theReturnedPageNumberIsEqualTo(int pageNumber) {
        Page pages = response.as(Page.class);
        assertThat(pages.getPage(), equalTo(pageNumber));
    }

    @Then("the system grants me access")
    public void theSystemGrantsMeAccess() {
        response.then().statusCode(200);
        response.then().body(containsString("token"));
    }
}
