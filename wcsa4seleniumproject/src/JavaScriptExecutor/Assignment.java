package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///D:/WorkSpaceForWCSA4/Both%20disabled%20and%20enabled%20web%20element.html");
		
		WebElement usn = driver.findElement(By.id("i2"));
		WebElement pwd = driver.findElement(By.xpath("(//input[@id='i2'])[2]"));
		if (usn.isEnabled())
		{
			usn.sendKeys("Admin");
			System.out.println("If Block Is Executed");
		}
		else
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("document.getElementById('i2').value = 'Admin';");
			System.out.println("Else Block Is Executed");
		}
		Thread.sleep(2000);
		
		if(pwd.isEnabled())
		{
			pwd.sendKeys("Manager");
			System.out.println("If Block Is Executed");
		}
		else
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Thread.sleep(2000);
			js.executeScript("document.getElementById('i2').value = 'Admin';");
			System.out.println("Else Block Is Executed");
			
		}
		
	}

}
