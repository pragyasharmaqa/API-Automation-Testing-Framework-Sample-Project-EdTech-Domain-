package tests;

//import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.PetEndpoints;
import io.restassured.response.Response;

public class UpdatePet extends BaseTest {
	@Test(priority=4)
	public void updateUser() {

		
		Response response = PetEndpoints.updatePet();
		response.then().statusCode(200)
						.log().all();
}
}
