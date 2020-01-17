package stepdefs;

import cucumber.api.java.en.Then;

import java.util.Map;

import static org.hamcrest.core.IsEqual.equalTo;

public class CommonSteps {

    private BaseSteps data;

    public CommonSteps(BaseSteps data){
        this.data = data;
    }

    @Then("the system returns status code {int}")
    public void theSystemReturnsStatusCode(int statusCode) {
        data.response.then().statusCode(statusCode);
    }

    @Then("the response includes the following:")
    public void theResponseIncludesTheFollowing(Map<String, String> responseValues) {
        for(Map.Entry<String, String> field : responseValues.entrySet()){
            data.response.then().body(field.getKey(), equalTo(field.getValue()));
        }
    }
}
