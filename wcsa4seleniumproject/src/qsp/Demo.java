package qsp;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid browser");
		String browserValue = sc.next();
		
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.quit();
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodiver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.quit();
		}
		else if (browserValue.equals("edge"))
		{
			System.setProperty("webdriver.msedg.driver", "./drivers/msedgdiver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.quit();
		}
		else
		{
			System.out.println("Enter the valid browser");
		}
	}
}