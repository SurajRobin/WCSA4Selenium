package assingementonlocator;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eliminate_Duplicate_Treeset {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///D:/WorkSpaceForWCSA4/MultiSelectDropdown.html");
		
		WebElement dropdownelement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropdownelement);
		// to get options of dropdown
		List<WebElement> alloptions = sel.getOptions();
		
		TreeSet<String> s = new TreeSet<String>();
		for( int i=0; i<alloptions.size(); i++)
		{
			WebElement opts = alloptions.get(i);
			String values = opts.getText();
			 // to add the text of webElement by removing duplicate & insertion order won't be maintained..
			s.add(values);
		
		}
		for (String options : s)
		{
			System.out.println(options);
		}

		

	}

}
