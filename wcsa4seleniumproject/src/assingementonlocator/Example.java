package assingementonlocator;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Example {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		          // NOT PRESENT // ( WebDriver driver ,long timeOutInSeconds )
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		

		
		 
		 
	}

}
