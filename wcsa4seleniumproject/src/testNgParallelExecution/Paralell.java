package testNgParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralell {
	public WebDriver driver;
	@Parameters({"browserName"})
  @Test
  public void demo(String browser) {
	  if (browser.equals("chrome"))
	  {
		  driver = new ChromeDriver();
	  }
	  else if (browser.equals("firefox"))
	  {
		  driver = new FirefoxDriver();
	  }
	  else
	  {
		  Reporter.log("Enter the valid browser",true);
	  }
  }
}
