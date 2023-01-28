package WebDriverMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.switchTo().activeElement().sendKeys("bag");
		Thread.sleep(2000);
		WebElement suggestions = driver.findElement(By.xpath("//div[@class='wM6W7d']"));
		
		String textofWebElement = suggestions.getText();
			System.out.println(textofWebElement);
	}

}
