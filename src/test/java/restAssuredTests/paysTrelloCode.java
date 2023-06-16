package restAssuredTests;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class paysTrelloCode {

	public static void main(String[] args) {
		// Rest Assured base URL
		RestAssured.baseURI = "https://api.trello.com/1/lists";

		// Create request object
		RequestSpecification httpRequest = RestAssured.given();

		String key = "b8fbc59fce2fad2d234947fc897a3d85";
		String token = "ATTA6cc73a4bf543a1bd1d6e9def9a32b556aacc0d485fd67176883c723ad9ee1668A07AF54E";
		String boardId = "64891ae60394425f88d9c195";

		httpRequest.header("Content-Type", "application/json");

		int numLists = 0;

		// Create lists until the maximum limit is reached
		while (true) {
			JSONObject requestBody = new JSONObject();
			requestBody.put("name", "LegendOfTheLists" + (numLists + 1));
			requestBody.put("idBoard", boardId);
			requestBody.put("key", key);
			requestBody.put("token", token);

			Response myResponse = httpRequest.body(requestBody.toString()).post();

			int statusCode = myResponse.getStatusCode();
			if (statusCode == 200) {
				numLists++;
				System.out.println("List " + numLists + " created");
			} else {
				System.out.println("Failed to create list");
				myResponse.prettyPrint(); // Print the response for further inspection
				break; // Stop creating lists if an error occurs
			}
		}

		// Print the number of lists created
		System.out.println("Number of lists created: " + numLists);
	}

}
