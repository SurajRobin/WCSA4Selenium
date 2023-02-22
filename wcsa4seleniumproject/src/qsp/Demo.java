package qsp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		WebElement target = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[5]"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		
		WebElement target1 = driver.findElement(By.xpath("(//div[@class='CXW8mj'])[2]"));
		act.doubleClick(target1).perform();
		
		WebElement target2 = driver.findElement(By.xpath("//h1[.='Mobile Phones']"));
		act.contextClick(target2).perform();
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}
}