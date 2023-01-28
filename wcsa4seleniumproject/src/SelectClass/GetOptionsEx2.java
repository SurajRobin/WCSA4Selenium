package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("file:///D:/WorkSpaceForWCSA4/MultiSelectDropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdownelement);
		
		List<WebElement> allOptions = sel.getOptions();
		for (WebElement opt : allOptions )
		{
			System.out.println(opt.getText());
		}
	}

}
