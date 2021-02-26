package apitesting;

import static io.restassured.RestAssured.given;

import  io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

public class SendGetRA {

	/*
	 * Set authentication: Basic Auth/Bearer token using Headers
	 * 
	 * Request --> set of request specifications
	 * 
	 * Response --> do validations
	 * 
	 * 
	 * 
	 */
//	public static void main(String[] args) {
//
//		Response response = given().params("limit", 3).auth().basic(
//				"sk_test_51H5GOVHAKiDX6pJUz3X1TYCYS7961mwaxzw4zF9C1vsGach2yMlSkEAszZVGtKlpy8kfZs6JlNDDpXQhL3g6SXcY00XEpxxJTC",
//				"").get("https://api.stripe.com/v1/customers");
//
//		// response.prettyPrint();
//		String jsonResponse = response.asString();
//		System.out.println(jsonResponse);
//
//		System.out.println("Response code --> " + response.statusCode());
//
//		// given().contentType(ContentType.JSON);
//		// given().contentType("application/json");
//		// given().header("content-type","application/json").auth().basic(userName,
//		// password);
//
//	}

	public static void main(String[] args) {
		Response response = given().header("Authorization",
				"Bearer sk_test_51H5GOVHAKiDX6pJUz3X1TYCYS7961mwaxzw4zF9C1vsGach2yMlSkEAszZVGtKlpy8kfZs6JlNDDpXQhL3g6SXcY00XEpxxJTC")
				.get("https://api.stripe.com/v1/customers/cus_Hi1JrzjI0UxjFR");

		response.prettyPrint();
	}

}
