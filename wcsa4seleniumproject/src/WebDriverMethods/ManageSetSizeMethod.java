package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageSetSizeMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Dimension targetSize = new Dimension(550,350);
		driver.manage().window().setSize(targetSize);
		
		
	}

}
