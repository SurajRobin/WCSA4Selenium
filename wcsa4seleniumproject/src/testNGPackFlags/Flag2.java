package testNGPackFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 { // invocationCount Flag
	static WebDriver driver;
  @Test(invocationCount = 5)
  public void invocationCount() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.navigate().to("https://www.google.com/");
	  Reporter.log("this is invocationCount method",true);
	  driver.close();
	  
  }
}
