package readexceldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis2 = new FileInputStream("./data/TestData.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis2);
		Sheet sheet2 = wb2.getSheet("IPL");
		int rc = sheet2.getLastRowNum();
		System.out.println(rc);
		
		
		System.out.println("Team and team names :- ");
		for (int i=0; i<rc; i++)
		{
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); // provide the excel sheet file path
		Workbook wb = WorkbookFactory.create(fis); // make the file for read
		Sheet sheet = wb.getSheet("IPL"); // take sheet name
		Row row = sheet.getRow(i); // get row value
		Cell cell = row.getCell(0); // get cell value
		String teamname = cell.getStringCellValue(); // it will give the value present in cell
		System.out.println(teamname); // print the data
		
		
		}
		for (int i1=0; i1<rc; i1++)
		{
			FileInputStream fis1 = new FileInputStream("./data/TestData.xlsx");
			Workbook wb1 = WorkbookFactory.create(fis1);
			Sheet sheet1 = wb1.getSheet("IPL");
			Row row1 = sheet1.getRow(i1);
			Cell cell1 = row1.getCell(1);
			String captainname = cell1.getStringCellValue();
			System.out.println(captainname);
		}
		

	}

}
