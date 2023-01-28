package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		WebElement download = driver.findElement(By.xpath("//a[.='Downloads']"));
		
		Rectangle rect = download.getRect();
		int xAxis = rect.getX();
		int yAxis = rect.getY();
		int height = rect.getHeight();
		int width = rect.getWidth();
		System.out.println(xAxis);
		System.out.println(yAxis);
		System.out.println(height);
		System.out.println(width);
		
	}

}
