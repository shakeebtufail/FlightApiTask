package StepsDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Utils;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GetRequestSteps extends Utils {
	Response response;
	RequestSpecification req;
	
	@Given("Fetch Airports Payload")
	public void fetch_airports_payload() {
		try {
			req = Utils.createRequestSpecification("fetchAirports");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@When("user calls {string} with GET https request")
	public void user_calls_with_https_request(String string) {
	   response = RestAssured.given(req).get();
	}

	@Then("status in fetch airports response code is {int}")
	public void status_in_response_code_is(Integer int1) {
		assertEquals(int1, Integer.valueOf(response.getStatusCode()));
		
	}
	@Then("status in fetch airports response is {string}")
	public void status_in_response_code_is(String string) {
		assertEquals(true, response.getStatusLine().endsWith(string));
	    
	}
}
