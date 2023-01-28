package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentTitle = driver.getTitle();
		String parentWindowAdd = driver.getWindowHandle();
		System.out.println(parentWindowAdd);
		
		Set<String> bothWindowAdd = driver.getWindowHandles();
		System.out.println(bothWindowAdd);
		for (String s : bothWindowAdd)
		{
			Thread.sleep(2000);
			String childTitle = driver.switchTo().window(s).getTitle();
			Thread.sleep(2000);
			System.out.println(childTitle);
			
			driver.switchTo().window(s).manage().window().maximize();
			
			
			if(!parentTitle.equals(childTitle))
			{
				driver.manage().window().maximize();
			}
			else
			{
				driver.close();
				
			}
			
		}
		driver.switchTo().window(parentWindowAdd).manage().window().minimize();
		
		
		
		
		
		
		
		
		
	}

}
