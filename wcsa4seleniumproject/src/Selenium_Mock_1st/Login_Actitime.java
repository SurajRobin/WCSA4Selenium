package Selenium_Mock_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitime {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		 driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		
		WebElement userNameTextBox = driver.findElement(By.name("username"));
		if (userNameTextBox.isDisplayed())
		{
			userNameTextBox.sendKeys("admin");
		}
		else
		{
			System.out.println("username is wrong ");
		}
		Thread.sleep(2000);
		userNameTextBox.clear();
		
		WebElement password = driver.findElement(By.name("pwd"));
		
		if(password.isDisplayed())
		{
			password.sendKeys("manager");
		}
		else
		{
			System.out.println("password Wrong");
		}
		Thread.sleep(2000);
		password.clear();
		
	//	driver.findElement(By.xpath("//a[.='Login']")).click();
	}

}
