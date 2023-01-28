package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("file:///D:/WorkSpaceForWCSA4/MultiSelectDropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdownelement);
		
		String options = sel.getWrappedElement().getText();
		System.out.println(options);
	}	
}
