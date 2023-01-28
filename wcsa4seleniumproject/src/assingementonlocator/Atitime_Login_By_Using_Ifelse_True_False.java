package assingementonlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Atitime_Login_By_Using_Ifelse_True_False {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		
		WebElement userNameTextBox = driver.findElement(By.name("username"));
		if (userNameTextBox.isDisplayed())
		{
			userNameTextBox.sendKeys("admin");
		}
		else
		{
			System.out.println(" Username is not found ");
		}
		WebElement password = driver.findElement(By.name("pwd"));
		if(password.isDisplayed())
		{
			password.sendKeys("manager");
		}
		else
		{
			System.out.println("password is not found ");
		}
		driver.findElement(By.xpath("//a[.='Login']")).click();
		
	}

}
