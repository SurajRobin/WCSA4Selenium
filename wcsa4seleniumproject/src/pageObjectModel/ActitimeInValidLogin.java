package pageObjectModel;

import java.io.IOException;

public class ActitimeInValidLogin extends BestTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BestTest bt = new BestTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i=1; i<=rc; i++)
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			lp.actitimeInvalidLogin(invalidUsername, invalidPassword);
			
		}
		bt.closeBrowser();
		
		
	}

}
