package tests;

//import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.PetEndpoints;
import io.restassured.response.Response;

public class GetPetByStatus extends BaseTest  {
	@Test (priority=3)
	public void getPetByStatus1() {
		
	Response response = PetEndpoints.getPetByStatus();	
	response.then().statusCode(200)
		.log().all();
	}
	
}
