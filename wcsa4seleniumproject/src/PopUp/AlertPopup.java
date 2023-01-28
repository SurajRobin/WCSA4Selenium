package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///D:/WorkSpaceForWCSA4/popup_Alert.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		// now switch the control to popup......
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		// dismiss the alert popup
	//	a.dismiss();
		
		// get text of the alert popup
	//	System.out.println(a.getText());
		
		// use sendkeys method
	//	a.sendKeys("Alert Popup");
	}

}
