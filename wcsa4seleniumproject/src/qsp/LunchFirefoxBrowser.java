package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchFirefoxBrowser 
{
	public static void main(String[] args) 
	{
		// To avoid IllegaleStateException
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
}
