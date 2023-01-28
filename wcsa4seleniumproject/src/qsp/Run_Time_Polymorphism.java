package qsp;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_Time_Polymorphism {
	// to achive RunTimePolymorphism
	// to achive generlization
	// to avoid unnecessery methods

	// here we are declare WebDriver Gobaly
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the browser Name ");
		String browserValue = sc.nextLine();

		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");// to avoide
																						// IllegalStateException
			driver = new ChromeDriver();// to Launch Chrome browser
			driver.manage().window().maximize();// to maximaize browser
			driver.get("https://www.instagram.com");
			Thread.sleep(4000); // to provide delay of 4 sec to script
			driver.close();// to close the browser
		}

		else if (browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");// to avoide IllegalStateException
			driver = new FirefoxDriver();// to Launch Firefox browser
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			Thread.sleep(4000);// to provide delay
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
			System.out.println(" Enter valid browser ");
		}

	}
}