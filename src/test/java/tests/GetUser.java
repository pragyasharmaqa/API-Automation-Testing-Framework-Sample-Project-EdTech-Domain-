package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;

public class GetUser extends BaseTest {
	
	@Test (priority=2)
	public void getuserdetails() {
		
	Response response = UserEndpoints.getUser();	
	response.then().statusCode(200)
		.body("id", equalTo(101)).log().all();
	}
}
