package TestCases;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import SetUp.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateCustomerTest extends BaseTest {

	@Test()
	public void validateCreateCustomerAPIWithValidSecretKey(String name, String email, String description) {

		Response response = given().auth().basic(config.getProperty("validSecretKey"), "").formParam("email", email)
				.formParam("description", description).post(config.getProperty("customerAPIEndPoint"));

		response.prettyPrint();

		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);

	}

	@Test( )
	public void validateCreateCustomerAPIWithInValidSecretKey() {
		RestAssured.baseURI = "https://api.stripe.com";
		RestAssured.basePath = "/v1";

		Response response = given().auth().basic(config.getProperty("invalidSecretKey"), "")
				.formParam("email", "afasa@gmai.com").formParam("description", "Adding the first customer")
				.post(config.getProperty("customerAPIEndPoint"));

		response.prettyPrint();

		System.out.println(response.getStatusCode());

		Assert.assertEquals(response.getStatusCode(), 200);

	}
}
