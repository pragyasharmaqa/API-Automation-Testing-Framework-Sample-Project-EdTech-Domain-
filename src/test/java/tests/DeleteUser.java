package tests;

//import org.testng.annotations.Test;

import base.BaseTest;
import endpoints.UserEndpoints;
import io.restassured.response.Response;

public class DeleteUser extends BaseTest {
	
	
	public void deleteUserTest() {
		
		Response response = UserEndpoints.deleteUser();
		
		response.then().statusCode(200).log().all();
	}

}
