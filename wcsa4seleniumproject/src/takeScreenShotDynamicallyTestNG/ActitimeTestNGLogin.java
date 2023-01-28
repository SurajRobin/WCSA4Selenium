package takeScreenShotDynamicallyTestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomeListner.class)
public class ActitimeTestNGLogin extends BaseTest {
  @BeforeMethod
  public void setUp() {
	  initialization();
  }
  @Test
  public void loginPage() {
	  SoftAssert sa = new SoftAssert();
	  String loginPageTitle = driver.getTitle();
	  sa.assertEquals(loginPageTitle, "actiTIME - Login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  
  }
  @Test(priority = 1)
  public void homePage() throws InterruptedException
  {
	  SoftAssert sa = new SoftAssert();
	  String loginPageTitle = driver.getTitle();
	  sa.assertEquals(loginPageTitle, "actiTIME - Login");
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  
	  String homePageTitle = driver.getTitle();
	  Assert.assertEquals(homePageTitle, "actiTIME - Enter Time-Track");
	  driver.findElement(By.id("SubmitTTButton")).click();
	  
	  
	  
  }
  @AfterMethod
  public void teardown()
  {
	  driver.quit();
  }
}
