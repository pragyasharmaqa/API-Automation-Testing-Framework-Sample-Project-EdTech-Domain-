package tests;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import base.BaseTest;
import io.restassured.response.Response;
import models.UserPayload;

public class Create2 extends BaseTest{
	@Test
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
		
		Response response = post("user", user);
		response.then().statusCode(200)
						.body("message", equalTo("101")).log().all();
		
	}
}
