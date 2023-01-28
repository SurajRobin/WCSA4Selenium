package testNGPackFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 { // Enabled Flag
  @Test(enabled = true) // if we want to dont execute this method then use enabled flag is false
  public void sql() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.navigate().to("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("SQL");
	  Reporter.log("this is Slq method",true);
	  driver.quit();
	  
  }
}
