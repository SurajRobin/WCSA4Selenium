package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		
		// switch the control to the frame
		
		 WebElement frameelement = driver.findElement(By.xpath("fc_widget"));
		 Thread.sleep(2000);
		 driver.switchTo().frame(frameelement);
		 Thread.sleep(2000);
		 frameelement.findElement(By.id("chat-icon")).click(); 
		
		
	}

}
