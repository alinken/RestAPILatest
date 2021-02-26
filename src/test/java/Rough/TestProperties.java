package Rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) throws IOException {

		Properties config = new Properties();
		FileInputStream fis = new FileInputStream("./config.properties");
		config.load(fis);

	}
}