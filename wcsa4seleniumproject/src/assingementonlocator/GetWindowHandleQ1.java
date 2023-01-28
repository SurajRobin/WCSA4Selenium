package assingementonlocator;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleQ1 {
	// How to close parent and child window without using quit() mwthod?
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	
	 Set<String> alladd = driver.getWindowHandles();
	 Thread.sleep(2000);
	 for (String wh : alladd)
	 {
		 driver.switchTo().window(wh).close();
	 }
	
	}
}
