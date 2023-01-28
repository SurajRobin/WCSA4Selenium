package testNGPackFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
	static WebDriver driver;
  @Test(description = "This test case for SQL")
  public void sql() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("sql");
	  Reporter.log("Method of class1 ",true);
  }
}
