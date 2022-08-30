package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String GetData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
		
	
  FileInputStream file=new FileInputStream("C:\\Users\\chait\\OneDrive\\Documents\\KiteZerodha\\src\\test\\resources\\DataSheet.xlsx");
     String Excel=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
     
     return Excel;

	}
	}
