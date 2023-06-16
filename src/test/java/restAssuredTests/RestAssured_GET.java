package restAssuredTests;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_GET {

	public static void main(String[] args) {
		

		//set the base URL
		RestAssured.baseURI = "https://reqres.in/api/user?page=2";
		
		//Create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//response object
		Response myResponse = httpRequest.request(Method.GET);
		
		
		
		//start validation and verification
		
		
//		//prints in a single format
//		String responseBody = myResponse.getBody().asString();
//		
//		//prints in json format
//		System.out.println("This is my Response Message: " + myResponse.getBody().asPrettyString());
//		
//		
		//prints in json format //also printing extra data about data (metadata)
		System.out.println("This is my Response Message: " + myResponse.then().log().all());

		
		//status code
		System.out.println(myResponse.getStatusCode());
		Assert.assertEquals(myResponse.getStatusCode(), 200 );
		

	}

}
