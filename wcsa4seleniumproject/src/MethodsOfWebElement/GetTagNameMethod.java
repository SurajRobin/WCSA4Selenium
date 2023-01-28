package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(350));
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		
		WebElement usn = driver.findElement(By.name("username"));
		String tagname = usn.getTagName();
		System.out.println(tagname);
		
		
	}

}
