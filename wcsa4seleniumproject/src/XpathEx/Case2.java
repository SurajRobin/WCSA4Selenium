package XpathEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		driver.findElement(By.xpath("//a[text()='License for using this software']"));
		
	//	driver.findElement(By.xpath("//a[.='License for using this software']"));
	}

}
