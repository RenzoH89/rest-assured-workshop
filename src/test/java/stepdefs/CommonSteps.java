package stepdefs;

import cucumber.api.java.en.Then;

public class CommonSteps {

    StepBaseData data;

    public CommonSteps(StepBaseData data){
        this.data = data;
    }

    @Then("the system returned status code {int}")
    public void theSystemReturnedStatusCode(int statusCode) {
        data.response.then().statusCode(statusCode);
    }
}
