package assingementonlocator;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Zomato",Keys.ENTER);
		driver.findElement(By.xpath("//h3[.='Zomato']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("Biryani");
		driver.findElement(By.xpath("//a[.='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("Continue with Google")).click();
		
	
	}

}
