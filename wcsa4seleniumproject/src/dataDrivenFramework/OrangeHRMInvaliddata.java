package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMInvaliddata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Flib1 flib1 = new Flib1();
		int rc = flib1.rowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		for(int i=1; i<=rc; i++)
		{
		String username = flib1.readExcelData("./data/orange.xlsx", "invaliddata", 1, 0);
		String password = flib1.readExcelData("./data/orange.xlsx", "invaliddata", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		driver.findElement(By.name("username")).clear();
		}
		driver.quit();
		
		

	}

}
