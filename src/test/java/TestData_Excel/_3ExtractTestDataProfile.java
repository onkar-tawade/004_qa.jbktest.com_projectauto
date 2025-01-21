package TestData_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _3ExtractTestDataProfile {

	
	
	public static Object[][] ProfileTestData() throws IOException {
		
		 DataFormatter df = new DataFormatter(); /// Dataformatter is useful for Format the data into one type of data using its method.

		
		 FileInputStream file = new FileInputStream("C:\\Users\\Omkar\\eclipse-workspace\\com.qajbktest.Project.Automation\\ExcelSheets\\_3ProfileData.xlsx");
	
	
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
	    
		 XSSFSheet sheet = workbook.getSheet("Sheet1");

	     
		 int rows = sheet.getLastRowNum();
		 int columns = sheet.getRow(0).getLastCellNum();
		  
		 Object obj[][] = new Object[rows+1][columns];
		    
		    for(int i=0; i <= rows; i++) {
		    
		    	XSSFRow currentrow = sheet.getRow(i);
		    	for(int j=0 ; j< columns ; j++) {
		    		XSSFCell currentcell = currentrow.getCell(j);

		    		obj[i][j]= df.formatCellValue(currentcell);
		    	}
		    }  
			return obj;

		  }
	
	
	
	
	
	
//	public static void main(String[] args) throws IOException {
//		_2ExtractTestDataForSignUP ext = new _2ExtractTestDataForSignUP();
//
//		Object [][] obj = ext.SignUpTestData();
//		
//		for (Object[] objects : obj) {
//			System.out.println(objects.toString());
//		}
//	}
	
}



