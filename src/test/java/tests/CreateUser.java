package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;
import models.UserPayload;
import static org.hamcrest.Matchers.equalTo;

public class CreateUser extends BaseTest {

	@Test(priority=1)
	public void testCreateUser() {
		UserPayload user = new UserPayload();
		
		user.setId(101);
		user.setUsername("PragyaS");
		user.setFirstname("Pragya");
		user.setLastname("Sharma");
		user.setEmail("sharmapragya312@gmail.com");
		user.setPassword("123456");
		user.setPhone("9988776655");
		user.setUserStatus(1);
		
		Response response = UserEndpoints.createUser(user);
		response.then().statusCode(200)
						.body("message", equalTo("101")).log().all();
		
	}
	
}
