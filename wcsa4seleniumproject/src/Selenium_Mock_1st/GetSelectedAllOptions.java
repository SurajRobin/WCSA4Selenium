package Selenium_Mock_1st;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedAllOptions {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/WorkSpaceForWCSA4/MultiSelectDropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdownelement);
		
		for (int i=1; i<5;i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> allOptions = sel.getAllSelectedOptions();
		for (WebElement opt : allOptions )
		{
			System.out.println(opt.getText());
			Thread.sleep(2000);
		}
		driver.close();
		
		
		
		
	}

}
