package assingementonlocator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Oranage_HRM_Robot_Actions {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
	//	 WebElement target = driver.findElement(By.xpath("//button[@type='submit']"));
		 WebElement target = driver.findElement(By.xpath("//h5[.='Login']"));
		
		 Actions actions = new Actions(driver);
		 Thread.sleep(2000);
		 
		 actions.moveToElement(target).perform();
		 Thread.sleep(2000);
		 actions.doubleClick().perform();
		 
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_C);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_C);
		 Thread.sleep(2000);
		 
		 WebElement target1 = driver.findElement(By.name("username"));
		 actions.moveToElement(target1).perform();
		 target1.click();
		 
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 
		 
		 
		 
		 
	}

}
