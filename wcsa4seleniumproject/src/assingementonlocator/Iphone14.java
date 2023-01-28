package assingementonlocator;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone14 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iPhone14");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]")).click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Thread.sleep(1000);

		Set<String> childWindow = driver.getWindowHandles();
		for (String s : childWindow) {
			driver.switchTo().window(s);
		}
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='512 GB']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411019");
		driver.findElement(By.xpath("//span[.='Check']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add to cart']")).click();

	}

}
