package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.facebook.com/ ");
	driver.findElement(By.xpath("//a[.='open a app popup window']")).click();
	Thread.sleep(2000);
	driver.quit();
	}

}
