package restAssuredTests;

import org.testng.Assert;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Trello_RestAssured_CreateListLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key="b8fbc59fce2fad2d234947fc897a3d85";
        String token="ATTA6cc73a4bf543a1bd1d6e9def9a32b556aacc0d485fd67176883c723ad9ee1668A07AF54E";
        Faker faker = new Faker();
        String RandomListName = faker.animal().name();


        //Rest assured base URL
        RestAssured.baseURI = "https://api.trello.com/1/lists";
        String boardID="64891ae60394425f88d9c195";
        
        
        //create request object
        RequestSpecification httpRequest = RestAssured.given();
        
        httpRequest.header("Content-Type", "application/json");
        
        int listingLimit = 0;

        for (int i = 0; i < listingLimit; i++) {
            Response myResponse = httpRequest.post(RestAssured.baseURI + "?name="+RandomListName+"&idBoard="+boardID+"&key="+key+"&token="+token);
            int statusCode = myResponse.getStatusCode();
            listingLimit++;
        }
        System.out.println(listingLimit);
	}

}
