package PopUp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowBasedPopupNaukari {

	public static void main(String[] args) throws IOException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_TargetCPA&gclid=CjwKCAiAqt-dBhBcEiwATw-ggB0onFYFqqk2jlwYFVCHyYBv2nKnX022wM8pTHT3cQXhZ9Ns8g0R0BoCSRoQAvD_BwE&gclsrc=aw.ds");
		 driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		 
		 Runtime.getRuntime().exec("D:\\WorkSpaceForWCSA4\\Naukri File Upload PopUp.exe");
	
	}
}
