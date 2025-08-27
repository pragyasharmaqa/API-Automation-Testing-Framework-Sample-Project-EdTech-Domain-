package endpoints;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import models.PetPayload;
import utils.ConfigReader;

public class PetEndpoints {
	 public static long createdPetId; // will store the dynamically generated pet ID
	 static ConfigReader config;
	 
	public static Response createPet(PetPayload payload) {
		config = new ConfigReader();
		Response res = 
				given()
					.contentType(config.get("contentType")) //common
					.accept(config.get("accept"))		//common
					.body(payload)
				.when()
					.post("pet");
		
		  // Save the ID from the response
        createdPetId = res.jsonPath().getLong("id");
        return res;
	}
	
	public static Response getPetByStatus() {
		return
				given()
					.contentType(config.get("contentType"))
					.accept(config.get("accept"))
				.when()
					.get("pet/findByStatus?status=available");
	}
	
	public static Response getPetById() {
		return
				given()
					.contentType(config.get("contentType"))
					.accept(config.get("accept"))
				.when()
					.get("pet/" + createdPetId ); //use stored id from above
	}
	
	public static Response updatePet() {
		return 
				given()
					.contentType("application/x-www-form-urlencoded")
					.accept(config.get("accept"))
					.formParam("name", "Smokey")
					.formParam("status", "available")
				.when()
					.post("pet/" + createdPetId );
	}
}
