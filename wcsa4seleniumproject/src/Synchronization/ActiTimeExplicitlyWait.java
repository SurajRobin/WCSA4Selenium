package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=21xu37skbto0o");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Boolean check = wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		System.out.println(check);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Boolean check1 = wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		System.out.println(check1);
		driver.close();		
		
	}
}
