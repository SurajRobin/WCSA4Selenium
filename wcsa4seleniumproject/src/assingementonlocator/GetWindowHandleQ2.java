package assingementonlocator;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleQ2 {
	// How to close child window?
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println("----------------------");
		
		 Set<String> parentAndChild = driver.getWindowHandles();
		 for (String s : parentAndChild)
		 {
			 System.out.println(s);
			 if(!parentwindow.equals(s))
			 {
				driver.switchTo().window(s).close();
			 }
			 else
			 {
				 
			 }
		 }
		
	}
}
