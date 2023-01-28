package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestTest implements IAutoConstant {
	
	static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		Flib flib = new Flib();
		
		String browserValue = flib.readPropertyData(PROP_PATH, "Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");
		
		if (browserValue.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
		}
		else if(browserValue.equals("firefox")) 
		{
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(url);
			
		}
		else 
		{
			System.out.println("Enter the valid browser");
		}
	}
		
		public void closeBrowser()
		{
			driver.quit();
		}
	

}
