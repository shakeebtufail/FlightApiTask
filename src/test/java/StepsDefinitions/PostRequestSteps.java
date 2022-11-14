package StepsDefinitions;

import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.builder.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.TestDataBuild;
import resources.Utils;

public class PostRequestSteps {
	RequestSpecification req;
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;
	ResponseSpecification responseSpecification;
	TestDataBuild testData = new TestDataBuild();
	
	
	@Given("Fetch Calendar Fares Payload with {string} {string} {string} {string} {string}")
	public void fetch_calendar_fares_payload_with(String from, String to, String departure, String returns, String cabin) throws IOException {

		try {
			req = Utils.createRequestSpecification("fetchCalendarFares", testData.getCalendarFares(from, to, departure, returns, cabin));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		response = RestAssured.given(req).post();

		res = given().spec(req).body(testData.getCalendarFares(from, to, departure, returns, cabin));
		
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
	}

	
	@When("user calls {string} with POST https request")
	public void user_calls_with_https_request(String str1) {
		
	   response = RestAssured.given(req).post();
	   
	}
	@Then("the API call is successful with response code 200")
	public void the_api_call_is_successful_with_response_code() {
		assertEquals(200, response.getStatusCode());
	}
	@Then("status in response code is {string}")
	public void status_in_response_code_is(String string) {
	    assertEquals(true, response.getStatusLine().endsWith(string));
	    
	}


}
