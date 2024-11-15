package SeleniumPackage2.SeleniumProject2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Ease_DDT 
{
	static String userName;
    static String passWord;
	public void DDT() throws EncryptedDocumentException, IOException
{

 FileInputStream f1=new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\SeleniumProject2\\AirIndiaData\\AirIndia.xlsx");
 Workbook w1=WorkbookFactory.create(f1);
 userName=NumberToTextConverter.toText(w1.getSheet("AirIndiaLogin").getRow(1).getCell(0).getNumericCellValue()); 
 passWord=w1.getSheet("AirIndiaLogin").getRow(1).getCell(1).getStringCellValue(); 
}
}
