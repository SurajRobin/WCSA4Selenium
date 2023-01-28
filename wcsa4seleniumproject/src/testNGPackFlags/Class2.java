package testNGPackFlags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
	static WebDriver driver;
  @Test(enabled = true)
  public void f() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("Manual testing");
	  Reporter.log("method of class2",true);
  }
}
