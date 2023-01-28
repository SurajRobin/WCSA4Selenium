package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlecectByIndexMethod_ShowAllOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(2000);
		driver.get("file:///D:/WorkSpaceForWCSA4/SingleSelectDropdown.html");

		List<WebElement> dropdownelement = driver.findElements(By.xpath("//select[@id='i1']"));
		for (WebElement w : dropdownelement)
		{
			String c = w.getText();
			System.out.print(c);	
		}

	}

}
