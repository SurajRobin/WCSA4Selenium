package keyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActitimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"validcreds");
		
		String url = flib.readPropertyData(PROP_PATH, "Url");
		String username = flib.readPropertyData(PROP_PATH, "Username");
		String password = flib.readPropertyData(PROP_PATH, "Password");
		
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		

	}

}
