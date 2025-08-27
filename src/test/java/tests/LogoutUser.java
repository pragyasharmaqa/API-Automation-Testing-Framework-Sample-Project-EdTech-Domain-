package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;

public class LogoutUser extends BaseTest {

	@Test(priority=5)
	void logoutUser() {
		Response response = UserEndpoints.logoutUser();
		response.then().statusCode(200)
			.log().all();
		
}
}
