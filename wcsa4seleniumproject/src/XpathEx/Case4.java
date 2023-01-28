package XpathEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("//p[.='Ruby' or (.='Java')]"));
		
		driver.findElement(By.xpath("//p[.='Ruby' and (@class='card-title font-weight-bold h6')]"));
	}

}
