package ExcelLib;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook w;
	XSSFSheet s;
	public ExcelDataConfig(String excelPath) {
		//select  4 lines and righ click and select surround with the try/catch
		try {
			File f = new File ("Test.xlsx");
			
			w = new XSSFWorkbook(f);
			
		
		}//give only base exception 
		//https://www.youtube.com/watch?v=sbBdj4zIMqY
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public String getData(int sheetnumber, int row, int column) {
		//Moved getSheetAt() to getData method
		s = w.getSheetAt(sheetnumber);
		System.out.println("no. of rows="+s.getLastRowNum());
		String data =s.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
}


