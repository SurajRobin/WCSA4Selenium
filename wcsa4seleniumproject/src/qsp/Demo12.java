package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=74238127911&hvpone=&hvptwo=&hvadid=610644609009&hvpos=&hvnetw=g&hvrand=12881455945166710721&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301452&hvtargid=kwd-29089120&hydadcr=5496_2359482&gclid=Cj0KCQiA54KfBhCKARIsAJzSrdo_-giGnvhUtEsiJh730L3_WlcTOl9ne4cW1F-x345nN0SizutdUg4aArNMEALw_wcB");
		WebElement text = driver.findElement(By.id("glow-ingress-line1"));
		System.out.println(text.getText());

	}

}
