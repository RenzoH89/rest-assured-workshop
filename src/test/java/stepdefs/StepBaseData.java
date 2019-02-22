package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepBaseData {

    RequestSpecification request;
    Response response;

    @Before
    public void setup(){
        //Can be used for setting up data before each test
    }

    @After
    public void tearDown(){
        //Can be used for tearing down data after each test
    }
}
