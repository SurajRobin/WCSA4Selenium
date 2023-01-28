package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class Flib
{
	public String readExcelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();
		return data;
	}
	public int rowCount() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(",/data/Actitime.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		int rc = sheet.getLastRowNum();
		return rc;	
	}
	public void writeExcelData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(2);
		Cell cell = row.createCell(0);
		cell.setCellValue("Suraj");
		
		FileOutputStream fos = new FileOutputStream("./data/Actitime.xlsx");
		wb.write(fos);	
	}
	
}

public class Demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("invalidcreds");
		int rc = sheet.getLastRowNum();

		for (int i = 1; i <= rc; i++) {

			wb.getSheet("invalidcreds");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			System.out.println(cell.getStringCellValue());

		}
	}
}
