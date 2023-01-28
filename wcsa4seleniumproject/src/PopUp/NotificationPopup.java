package PopUp;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// if we write ( o.addArguments("--disable-notifications"); ) then notification popup it will not come
		// if we don't write ( o.addArguments("--disable-notifications"); ) then it will come 
		ChromeOptions o = new ChromeOptions();
		
		o.addArguments("--disable-notifications");
		Thread.sleep(2000);
		//  working maximize the window
		o.addArguments("-start-maximized");
		
		WebDriver driver=new ChromeDriver(o);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjv_ObgjOz7AhVIeYsKHYs2A40YABARGgJ0bQ&ohost=www.google.com&cid=CAASJuRoWykJ5eJWEzI-FE47BsMgTq92BIBij-PZWlyoJ4dLjXDOQ3QA&sig=AOD64_0AyuzvZdY3PK-NM-Bc5D5y-s8DfA&q&adurl&ved=2ahUKEwjh797gjOz7AhXRwIsBHaMQCV4Q0Qx6BAgKEAE");

	}

}
