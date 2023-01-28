package Assignments_Total_10_1st;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_No_04 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//i[@id='gh-shop-ei']")).click();
		driver.findElement(By.xpath("//a[.='Jewelry & watches']")).click();
		driver.findElement(By.xpath("//span[.='Watches, Parts & Accessories']")).click();
		driver.findElement(By.xpath("//a[.='Watches']")).click();
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("apple watches");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		Thread.sleep(2000);
		
		List<WebElement> listOfProduct = driver.findElements(By.xpath("//div[@class='s-item__title']"));
		for(WebElement options:listOfProduct)
		{
			System.out.println(options.getText());
			Thread.sleep(2000);
			
		}
	}

}
