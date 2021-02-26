package SetUp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import utilities.ExcelReader;

public class BaseTest {
	
	public Properties config = new Properties();
	private FileInputStream fis;
	
	public static ExcelReader excel = new ExcelReader("./src/test/resources/excel/ValidateCreateCustomer.xlsx");

	@BeforeSuite
	public void setUp() throws IOException {
		
		 config = new Properties();
		try {
			fis = new FileInputStream("./src/test/resources/Properties/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		config.load(fis);

		RestAssured.baseURI =config.getProperty("baseURL");
		RestAssured.basePath = config.getProperty("basePath");

	}

	@AfterSuite
	public void tearDown() {

	}

}
