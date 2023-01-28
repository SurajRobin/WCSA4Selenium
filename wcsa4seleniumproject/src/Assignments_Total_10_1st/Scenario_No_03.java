package Assignments_Total_10_1st;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_No_03 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./drivers.geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frm);
		
		WebElement src = driver.findElement(By.xpath("//html"));
		
		 WebElement target = driver.findElement(By.id("droppable"));
		 Thread.sleep(3000);
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src, target).perform();
		 Thread.sleep(3000);
	}

}
