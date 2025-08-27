package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;
import models.UserPayload;

public class UpdateUser extends BaseTest{
	@Test(priority=4)
	public void updateUser() {
		UserPayload user = new UserPayload();
		
		user.setId(200);
		user.setUsername("PragyaS");
		user.setFirstname("Pragya");
		user.setLastname("Sharma");
		user.setEmail("sharma@gmail.com");
		user.setPassword("12345");
		user.setPhone("9988776655");
		user.setUserStatus(0);
		
		Response response = UserEndpoints.createUser(user);
		response.then().statusCode(200)
						.body("message", equalTo("200")).log().all();
}
}
