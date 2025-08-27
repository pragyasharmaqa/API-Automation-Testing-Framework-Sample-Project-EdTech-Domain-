package tests;

import java.util.ArrayList;
import java.util.List;
import org.testng.annotations.Test;
import base.BaseTest;
import endpoints.PetEndpoints;
import io.restassured.response.Response;
import models.PetPayload;
import models.PetPayload.Category.Tag;

public class CreatePet extends BaseTest{

	@Test (priority=1)
	public void addPet() {
		//common 
		PetPayload pet = new PetPayload();
		
		pet.setId(0);
		
		PetPayload.Category category = new PetPayload.Category(3, "Pug");
		pet.setCategory(category);
		
		pet.setName("Coal");
		
		List<String> photoUrls = new ArrayList<>();
		photoUrls.add("coalphoto.ie");
		pet.setPhotoUrls(photoUrls);
		
		List<Tag> tags = new ArrayList<>();
		tags.add(new Tag(1, "dog1")); // id=0, name="dog1"
		pet.setTags(tags);
		
		pet.setStatus("available");
		
		Response response = PetEndpoints.createPet(pet);
		
		response.then().statusCode(200)
						.log().all();
		
		
		
	}
}
