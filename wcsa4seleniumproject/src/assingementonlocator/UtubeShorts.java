package assingementonlocator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtubeShorts 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.youtube.com/"); 
		
		List<WebElement> countviews = driver.findElements(By.xpath("//span[@id='video-title']"));
		
		
		for (WebElement w : countviews)
		{
			String c = w.getText();
			System.out.println(c);	
		}
		
		List<WebElement> shortsnames = driver.findElements(By.xpath("//span[@id='video-title']/ancestor::div[@class='style-scope ytd-rich-shelf-renderer'][1]/descendant::span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		Thread.sleep(2000);
		for (WebElement we : shortsnames)
		{
			String s = we.getText();
			System.out.println(s);	
		}
	}
}
