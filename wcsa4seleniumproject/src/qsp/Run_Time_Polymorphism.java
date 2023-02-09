package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_Time_Polymorphism {
	// Why we up-cast browser specific classes to web-driver interface?
	
	// to achieve RunTimePolymorphism
	// to achieve generalization
	// to avoid unnecessary methods which comes from TakeScreenshot interface and JavaScriptExecutor Interface

	// How to achieve Run Time Polymorphism?
	
	// here we are declare WebDriver Gobaly
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// By using Scanner class we are reading which browser we want to launch
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the browser Name ");
		String browserValue = sc.nextLine();

		if (browserValue.equalsIgnoreCase("chrome")) {
			// this line is responsible to avoide IllegalStateException
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
																						
			driver = new ChromeDriver();	// we have created object to Launch the Chrome browser
			driver.manage().window().maximize();	// this line is responsible  to maximize the browser window
			driver.get("https://www.instagram.com");	// get method it is use to launch the web application
			Thread.sleep(4000); 	// this is the static wait to provide delay of 4 second in automation script
			driver.close();
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// to avoide IllegalStateException
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(4000);
			driver.close();

		} else if (browserValue.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.msedg.driver", "./drivers/msedgdriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(2000);
			driver.close();
		}

		else {
			System.out.println("Enter valid browser ");
		}

	}
}