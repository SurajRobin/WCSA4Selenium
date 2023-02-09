package assingementonlocator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_and_Inspect_SeleniumDevApp {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.selenium.dev/downloads/");

		WebElement trgt = driver.findElement(By.xpath("//a[.='Downloads']"));
		
		// Object for Actions Class
		Actions act = new Actions(driver);

		act.moveToElement(trgt);
		Thread.sleep(2000);
		act.contextClick().perform();
		
		// Object for Robot Class
		Robot robot = new Robot();
		
		// for loop using to press down key 5 times
		for (int i = 0; i < 6; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		
		// Click On Inspect option
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
