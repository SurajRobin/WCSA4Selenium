package Assignments_Total_10_1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scenario_No_01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers.geckodriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
	}

}
