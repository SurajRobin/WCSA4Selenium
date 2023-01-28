package testNGPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestValidLogin2 {
	static WebDriver driver;
  @Test
  @Parameters({"browser","Url","usn","pass"})
  public void setUp(String browserValue, String url, String username, String password  ) throws InterruptedException {
	  if (browserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
			driver.get(url);
			
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			  driver.findElement(By.name("pwd")).sendKeys(password);
			  Thread.sleep(2000);
			  driver.findElement(By.id("loginButton")).click();
			  
	  }
	  else if (browserValue.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
			driver.get(url);
			
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			  driver.findElement(By.name("pwd")).sendKeys(password);
			  Thread.sleep(2000);
			  driver.findElement(By.id("loginButton")).click();
	  }
	  else
	  {
		  Reporter.log("Enter the valid browser name",true);
	  }
  }
}
