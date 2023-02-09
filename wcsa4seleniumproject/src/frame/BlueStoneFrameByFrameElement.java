package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrameByFrameElement {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		
		// switch the controls to frame
		
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.id("chat-icon")).click();// clicking on chat box
		
		
		driver.switchTo().defaultContent();
		 WebElement target1 = driver.findElement(By.id("chat-fc-name"));
		 target1.sendKeys("Admin");
		 target1.clear();
		 WebElement target2 = driver.findElement(By.id("chat-fc-email"));
				 target2.sendKeys("surajmulani1998@gmail.com");
				 target2.clear();
		
		
	}

}
