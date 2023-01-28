package MethodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Of_WebElement_13 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("--------getText() Method----------");
		WebElement text = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(text.getText());
		System.out.println(text.isDisplayed());
		System.out.println("----------Text of the webelement----------");
		
		System.out.println("--------getTagName() Method----------");
		WebElement tagname = driver.findElement(By.xpath("//button[.=' Login ']"));
		System.out.println(tagname.getTagName());
		System.out.println("****************************************************************************************************************");
		
		System.out.println("--------getAttribute() Method----------");
		WebElement attributeName = driver.findElement(By.xpath("//button[.=' Login ']"));
		System.out.println(attributeName.getAttribute("type"));
		
		System.out.println("--------getCssValue() Method----------");
		WebElement css = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(css.getCssValue("font-family"));
		
		System.out.println("----------isEnabled() Method----------");
		WebElement logInButton1 = driver.findElement(By.xpath("//button[@type='submit']"));
		logInButton1.submit();
		Thread.sleep(3000);
		System.out.println(logInButton1.isEnabled());
		
		System.out.println("----------sendkeys() & clear() Method----------");
		WebElement clr = driver.findElement(By.name("username"));
		clr.sendKeys("Admin");
		clr.clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		
		
		System.out.println("----------submit() Method----------");
		WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	//	logInButton.submit();
		Thread.sleep(3000);
		System.out.println(logInButton.isEnabled());
	//	driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item toggle'])[1]")).click();
		
		driver.close();
	}

}
