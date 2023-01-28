package pageObjectModel;

import java.io.IOException;

public class ActitimeValidLogin extends BestTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		// for open the browser
		BestTest bt = new BestTest();
		bt.openBrowser();
		
		// read the data from property file
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.actitimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH,"Password"));
		bt.closeBrowser();
	}

}
