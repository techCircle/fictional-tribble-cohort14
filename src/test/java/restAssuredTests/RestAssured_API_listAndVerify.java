package restAssuredTests;

import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class RestAssured_API_listAndVerify {

	public static void main(String[] args) {
		

		
		RestAssured.given().param("key", "")
							.param("token", "")
							.get("https://api.trello.com/1/members/me/boards").then()
							.statusCode(200)
							.body("id[0]", equalTo("639934485040e50604d485c8")).body("name", hasItems("Shafkat Board","SampleBoard"));
		
		
		
		System.out.println("passed");
		
		
		
		
		

	}

}
