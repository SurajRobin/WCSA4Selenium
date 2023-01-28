package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("SurajMulani");
		Thread.sleep(2000);
		username.clear();
		
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Thread.sleep(2000);
		password.sendKeys("Suraj8080");
		password.clear();
		driver.navigate().refresh();

	
	}

}
