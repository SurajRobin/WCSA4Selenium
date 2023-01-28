package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=14xq0jznhgnz7");
		
		Flib flib = new Flib();
		
		int rc = flib.rowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		
		for(int i=1; i<=rc; i++)
		{
		String username = flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", 1, 0);
		
		String password = flib.readExcelData("./data/ActitimeTestData.xlsx", "invalidcreds", 1, 1);

		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.name("username")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).clear();
		
		}
		driver.quit();

	}

}
