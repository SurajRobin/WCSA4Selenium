package TakesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GetScreenShotAs_Method {
	
	public static void main(String[] args) throws IOException
	{
		//	RemoteWebDriver rwd = (RemoteWebDriver)driver;
		
		// directly create object to ChromeDriver class
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
	
		WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
		File src = download.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShots/download1.jpg");
		Files.copy(src, dest);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
	 	File dest1 = new File("./screenShots/PageSs.jpg");
	 	Files.copy(src1, dest1);
		
	}
}
