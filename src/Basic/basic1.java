package Basic;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.equalTo;

public class basic1 {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://maps.googleapis.com";
		
		given().param("location", "-33.8670522,151.1957362").
		param("radius", "1500").
		param("type", "restaurant").
		param("keyword", "cruise").
		param("key", "AIzaSyBOs2nf7PTv41VXTIDn0u0IzYj4dEzF7tw").
		when().get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].name",equalTo("Cruise Bar"));
		
		
	}

}
