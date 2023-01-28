package assingementonlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/Mr-Breeze-Amazone/dp/B07GJKFD4W");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Samsung A70's Mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Samsung']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='128 GB']")).click();
		Thread.sleep(2000);
		
		String price = driver.findElement(By.xpath("//span[.='(Renewed) Samsung Galaxy S20 + (Cosmic Gray, 8GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers']/ancestor::div[@class='sg-col-inner'][1]/descendant::span[@class='a-price-whole']")).getText();
		System.out.println("Is the price of the mobile : "+price);
		driver.close();
	}

}
