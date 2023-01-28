package Assignments_Total_10_1st;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_No_06 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='Diamond'])[1]")).click();
		
		List<WebElement> price1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement o : price1)
		{
			System.out.println(o.getText());
		}
		
		WebElement target1 = driver.findElement(By.xpath("//span[.=' Popular ']"));
		act.moveToElement(target1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
		
		List<WebElement> price2 = driver.findElements(By.xpath("//span[@class='new-price']"));
		for (WebElement o1 : price2)
		{
			System.out.println("Price------ Low--- To ---High---"+o1.getText());
		}
	}

}
