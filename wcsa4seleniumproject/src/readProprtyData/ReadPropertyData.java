package readProprtyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/Config.properties"); // provid the path of property file
		
		Properties prop = new Properties(); // to read the data
		prop.load(fis); // use to read the file
		String data = prop.getProperty("Key");
		System.out.println(data);
		
	}

}
