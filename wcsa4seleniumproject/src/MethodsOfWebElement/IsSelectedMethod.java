package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		
		WebElement checkBox = driver.findElement(By.name("remember"));
	
		boolean status1 = checkBox.isSelected();
		System.out.println(status1);
	
		checkBox.click();
		Thread.sleep(2000);
		
		boolean status2 = checkBox.isSelected();
		System.out.println(status2);
		
		
	}

}
