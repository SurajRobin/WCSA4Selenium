package assingementonlocator;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeAssignment50Scaniros {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://127.0.0.1/login.do;jsessionid=20c7p6bq7osjt");
		
		
		// 1 cssSelector shortcut with the help of * for username 
		driver.findElement(By.cssSelector("input[name*='serna']")).sendKeys("admin");

		
		// 2 cssSelector shortcut with the help of $ for password
		driver.findElement(By.cssSelector("input[type$='word']")).sendKeys("manager");
		
		// 3 for ActiTime logo 
	//	driver.findElement(By.cssSelector("img[src*='/login/timer.gif?hash=']")).click();
	//	Thread.sleep(2000);
		
		// 4 for check box click
	//	driver.findElement(By.cssSelector("input[name^='rem']")).click();
	//	Thread.sleep(2000);
		
		// 6 for Actimind Inc 
	//	driver.findElement(By.cssSelector("a[style^='font-size: 10px']")).click();
	//	Thread.sleep(2000);
		
		// 7 for link 
	//	driver.findElement(By.cssSelector("a[id$='enseLink']")).click();
	//	Thread.sleep(2000);
		
		// 8 cssSelector shortcut with the help of ^ for Login Button 
		driver.findElement(By.cssSelector("a[id^='login']")).click();
		// 9 for dropdown 
	//	driver.findElement(By.cssSelector("select[name*='elector.select']")).click();
	//	Thread.sleep(2000);
		
		// 10 for creat new task  
	//	driver.findElement(By.cssSelector("a[href^='javascript: open']")).click();
	//	Thread.sleep(2000);
		
		// 11 view time track 
		driver.findElement(By.cssSelector("a[href^='/user/view_tt.do']")).click();
		
		
		// 12 for task it's not working because total 1 of 80 
	//	driver.findElement(By.cssSelector("img[src*='default/pixel.gif?hash=']")).click();
	//	Thread.sleep(2000);
		
		// 13 for print click 
	//	driver.findElement(By.cssSelector("a[class$='print-link noprint']")).click();
	//	Thread.sleep(2000);
		
		// Save leave Time
	//	driver.findElement(By.cssSelector(" a[href^='/user/submit'] ")).click();
		
		// view time track for
	//	driver.findElement(By.cssSelector(" select[name^='usersS']  ")).click();
		
		// for arrow
	//	driver.findElement(By.cssSelector(" img[scr^='/img/default/view_tt_s']   ")).click();
		
		// for all project and customer active and archive
	//	driver.findElement(By.cssSelector(" td[id*='Selector.cpButton_middleRightC']   ")).click();
		
		// for administator 
	//	driver.findElement(By.cssSelector(" a[href^='/login.']  ")).click();
		
		// billing type 
	//	driver.findElement(By.cssSelector(" a[href^='/administration/b']  ")).click();
		
		// color scheme
	//	driver.findElement(By.cssSelector(" select[name^='colorSc']  ")).click();
		
		// Linces 
	//	driver.findElement(By.cssSelector(" textarea[name^='key'] ")).click();
		
		// create report
	//	driver.findElement(By.cssSelector(" span[unselectable^='on']  ")).click();
		
		// user 
	//	driver.findElement(By.cssSelector(" a[href^='/administration/us']  ")).click();
		
	//	driver.findElement(By.cssSelector(" a[href*='vascript: v'] ")).click();
	//	driver.findElement(By.cssSelector(" td[class$='_header']  ")).click();
	//	driver.findElement(By.cssSelector(" margin: 7px 0 7px 0 ")).click();
		
	//	driver.findElement(By.cssSelector(" td[class*='in_he'] ")).click();
	//	driver.findElement(By.cssSelector(" td[class^='main_he']  ")).click();
		
	//	driver.findElement(By.cssSelector(" select[name$='Scheme']  ")).click();
	//	driver.findElement(By.cssSelector("  span[class$='-day-note']  ")).click();
	//	driver.findElement(By.cssSelector(" td[class$='time-value']  ")).click();
	//	driver.findElement(By.cssSelector(" td[align$='left']  ")).click();
	//	driver.findElement(By.cssSelector(" input[type$='submit']  ")).click();
	//	driver.findElement(By.cssSelector(" div[style$='g:17px 0 0 4px']  ")).click();
	//	driver.findElement(By.cssSelector(" td[class^='middle-left-c']  ")).click();
	//	driver.findElement(By.cssSelector(" input[class^='control']  ")).click();
	//	driver.findElement(By.cssSelector(" input[class^='controlBorder']  ")).click();
	//	driver.findElement(By.cssSelector(" td[class*='lcell tablerightb']  ")).click();
	//	driver.findElement(By.cssSelector(" td[class*='agetit'] ")).click();
	//	driver.findElement(By.cssSelector(" div[class*='int navBotto'] ")).click();
	//	driver.findElement(By.cssSelector(" a[href*='nistration/customization.'] ")).click();
	//	driver.findElement(By.cssSelector(" div[class*='reports-p'] ")).click();
	//	driver.findElement(By.cssSelector(" div[id*='inConte'] ")).click();
	//	driver.findElement(By.cssSelector(" div[class*='int navBot'] ")).click();
		
	//	driver.findElement(By.cssSelector(" body[bgcolor^='#ffffff'] ")).click();
		//  for logout ActiTime
	//	driver.findElement(By.cssSelector(" a[href*='ogin.']   ")).click();
		driver.close();
		
		
		
		
	}

}
