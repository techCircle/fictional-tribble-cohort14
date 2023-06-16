package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class paysTrelloCodeCreateCard {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://api.trello.com/1/cards";

		// Create request object
		RequestSpecification httpRequest = RestAssured.given();

		String key = "b8fbc59fce2fad2d234947fc897a3d85";
		String token = "ATTA6cc73a4bf543a1bd1d6e9def9a32b556aacc0d485fd67176883c723ad9ee1668A07AF54E";
		String listId = "648a60765340c042c57c2f88"; // Replace with your actual board ID

		httpRequest.header("Content-Type", "application/json");

		int maxCards = 3000;
		int numCards = 0;

		// Create cards until the maximum limit is reached
		while (numCards < maxCards) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "Card from eclipse" + (numCards + 1));
			requestBody.put("idList", listId); // Replace with the ID of the target list
			requestBody.put("key", key);
			requestBody.put("token", token);

			Response myResponse = httpRequest.body(requestBody.toString()).post();

			int statusCode = myResponse.getStatusCode();
			if (statusCode == 200) {
				numCards++;
				System.out.println("Card " + numCards + " created");
			} else {
				System.out.println("Failed to create card");
				myResponse.prettyPrint(); // Print the response for further inspection
				break; // Stop creating cards if an error occurs
			}
		}

		// Print the number of cards created
		System.out.println("Number of cards created: " + numCards);
	}

}
