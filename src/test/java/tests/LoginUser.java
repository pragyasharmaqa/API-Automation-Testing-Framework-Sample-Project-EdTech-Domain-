package tests;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;

public class LoginUser extends BaseTest {

	@Test (priority=3)
	void LoginUserdetails() {
		Response response = UserEndpoints.loginUser();
		response.then().statusCode(200)
		.body("code", equalTo(200)).log().all();
	}
}
