package restAssuredTests;

import org.testng.Assert;

import com.github.javafaker.Faker;
import com.github.javafaker.FunnyName;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RestAssured_API_Trello_CreateBoard {

	public static void main(String[] args) {
		Faker faker = new Faker();
		String key = "b8fbc59fce2fad2d234947fc897a3d85";
		String token = "ATTA6cc73a4bf543a1bd1d6e9def9a32b556aacc0d485fd67176883c723ad9ee1668A07AF54E";
		String RandomBoardName = faker.dragonBall().character();


		//Rest assured base URL
		RestAssured.baseURI = "https://api.trello.com/1/boards";
		
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+RandomBoardName+"&key="+key+"&token="+token);
		
		/////        https://api.trello.com/1/boards/?name=CallOfDuty&key={{key}}&token={{token}}
		
		int statusCode = myResponse.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
	}

}
