package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///D:/WorkSpaceForWCSA4/Confirmation_popup.html");
		driver.findElement(By.xpath("//button[.='click me! ']")).click();
		
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
	//	a.accept();
	//	a.sendKeys("Suraj");
		System.out.println(a.getText());
	}

}
