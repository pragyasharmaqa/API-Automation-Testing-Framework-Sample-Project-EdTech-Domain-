package base;

import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.ConfigReader;

public class BaseTest {

	@BeforeMethod
	public void setup() {
		RestAssured.baseURI = ConfigReader.get("baseURI");
		
	}
	
	public Response post(String endpoint, Object body) {
		return RestAssured.given().contentType("application/json").body(body)
				.post(endpoint).then().log().all().extract().response();
	}
	
}
