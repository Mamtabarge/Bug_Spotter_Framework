package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception   {
		
		String filepath="C:\\Users\\Shubhu\\eclipse-workspace\\Bug_Spotter_Framework\\TestData\\Data.xlsx";
		FileInputStream file=new  FileInputStream(filepath);
		
	    wb=new XSSFWorkbook(file);	
	}
	public String getStringData(String Sheetname,int row, int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}

}
