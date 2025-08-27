  
package endpoints;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import models.UserPayload;


public class UserEndpoints {

	public static Response createUser(UserPayload payload) {
		return 
				given()
					.contentType("application/json")
					.accept("application/json")
					.body(payload)
				.when()
					.post("user");
	}
	
	public static Response getUser() {
		return
				given()
					.contentType("application/json")
					.accept("application/json")
				.when()
					.get("user/PragyaS");
	}
	
	public static Response loginUser() {
		return
				given()
				.contentType("application/json")
				.accept("application/json")
				.queryParams("username", "PragyaS")
				.queryParam("password", "123456")
				.when()
					.get("user/login");
					
	}
	
	public static Response logoutUser() {
		return
				given()
					.contentType("application/json")
					.accept("application/json")
				.when()
					.get("user/logout");
	}
	
	public static Response updateUser(UserPayload payload) {
		return 
				given()
					.contentType("application/json")
					.accept("application/json")
					.body(payload)
				.when()
					.post("user/PragyaS");
	}
	
	public static Response deleteUser() {
		return
				given()
				.contentType("application/json")
				.accept("application/json")
				.when().delete("user/PragyaS");
	}
	
	
	
}
