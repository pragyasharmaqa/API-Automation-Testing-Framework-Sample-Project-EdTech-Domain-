package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.PetEndpoints;
import io.restassured.response.Response;

public class GetPetById extends BaseTest{

	@Test (priority=2)
	public void getPetByStatus1() {
		
	Response response = PetEndpoints.getPetById();	
	response.then().statusCode(200)
		.log().all();
	}
}
