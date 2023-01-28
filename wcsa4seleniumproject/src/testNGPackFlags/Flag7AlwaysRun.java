package testNGPackFlags;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Flag7AlwaysRun { // alwaysRun flag
  @Test
  public void m1() {
	 Assert.fail();
	Reporter.log("this is m1 method",true);
  }
  @Test(dependsOnMethods = "m1", alwaysRun = true)
  public void m2() {
	
	Reporter.log("this is m2 method",true);
  }
}
