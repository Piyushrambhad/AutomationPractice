package introduction;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	FileInputStream file = new FileInputStream("D:\\Test.xlsx");
	
    Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
    for(int i=0;i<=4;i++) {
    String Value = s.getRow(i).getCell(0).getStringCellValue();
    System.out.println(Value+"");
    }     
    
    System.out.println("");
    
    String Value = s.getRow(0).getCell(1).getStringCellValue();
    System.out.println(Value+"");
    
    for(int j=1;j<=4;j++) {
    double Value1 =s.getRow(j).getCell(1).getNumericCellValue();
    System.out.println(Value1+"");
   }
	
  }

}
