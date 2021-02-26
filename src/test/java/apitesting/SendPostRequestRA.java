package apitesting;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SendPostRequestRA {
//	public static void main(String[] args) {
//
//		Response response = given().auth().basic(
//				"sk_test_51H5GOVHAKiDX6pJUz3X1TYCYS7961mwaxzw4zF9C1vsGach2yMlSkEAszZVGtKlpy8kfZs6JlNDDpXQhL3g6SXcY00XEpxxJTC",
//				"").formParam("name", "Alina Ken").formParam("email", "alya@gmail.com")
//				.formParam("description", "This is new POST request from Rest Assured API")
//				.post("https://api.stripe.com/v1/customers");
//
//		response.prettyPrint();
//		System.out.println(response.getStatusCode());
//	}

	public static void main(String[] args) {

		// String bodyString = (" {\"email\":\"eve.holt@reqres.in\",\"password\" :
		// \"pistol\"}");

//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("email", "alinken75@gmail.com");
//		map.put("firstName", "Alina");
//		map.put("lastName", "Ken");

		Response response = given().contentType(ContentType.JSON).body(new File("./users.json"))
				.post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());

		response = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}

}
