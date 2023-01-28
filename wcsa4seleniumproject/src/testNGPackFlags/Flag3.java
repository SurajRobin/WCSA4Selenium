package testNGPackFlags;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 { // dependsOnMethods flag
	static WebDriver driver;
  @Test
  public void login() {
	  Reporter.log("login method",true);
  }
  @Test(dependsOnMethods = "login")
  public void userCreate() {
	  Reporter.log("userCreate method",true);
  }
  @Test(dependsOnMethods = "userCreate")
  public void logout() {
	  Reporter.log("logout method",true);
  }
}
