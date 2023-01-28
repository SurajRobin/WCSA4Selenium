package testNGPack;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestValidLogin extends BaseTest {
	
  @Test
  public void validLogin() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  Thread.sleep(1000);
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  Thread.sleep(1000);
	  driver.findElement(By.id("loginButton")).click();
	  driver.quit();
	  
  }
}
