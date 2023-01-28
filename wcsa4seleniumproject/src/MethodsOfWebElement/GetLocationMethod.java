package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		WebElement download = driver.findElement(By.xpath("//a[.='Downloads']"));
		
		Point location = download.getLocation();
		int xAxis = location.getX();
		int yAxis = location.getY();
		System.out.println(xAxis+ " is the X axis ");
		System.out.println(yAxis+ " is the Y axis ");
	}

}
