package Datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("Test.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		int sheets = w.getNumberOfSheets();
		System.out.println("no. of sheets ="+sheets);
		for(int i =0;i<sheets;i++) { //iterate through each sheet
			if (w.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = w.getSheetAt(i); //grab testData sheet
				
//				System.out.println("sheet ="+sheet); 
				//Iterator<Row> rows = sheet.iterator();
				Iterator<Row> rows = sheet.iterator();//Iterate through each row
				
				Row firstrow = rows.next(); //we are on the first row now
				Iterator<Cell> ce  = firstrow.cellIterator();// iterate through each cell of first row
				int k=0;
				int column=0;
				while(ce.hasNext()) { //looping till the time cell is present
					Cell value = ce.next(); //in first loop, we are on first cell of first row
											//in 2nd loop (if any), we will move to 2nd cell of first row
					if(value.getStringCellValue().equalsIgnoreCase("TC")){
						column = k;
					}
					k++;
				}
				System.out.println("column ="+column); 
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("TC3"))
					{
						//after grabbing "TC3" test case row, we will grab all the cell contents of that row
						Iterator<Cell> cv = r.cellIterator(); //Iterate through each cell of TC3 row
						while(cv.hasNext())
						{
							System.out.println(cv.next().getStringCellValue());
							//a.add(cv.next().getStringCellValue());
							/*Cell c = cv.next();
							if(c.getCellType()==XSSFCell.CELL_TYPE_STRING)
							{
								a.add(c.getStringCellValue());
							}else
							{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}*/
						}
					}
				}
			}
		}
		//return a;
	}
}

		
		
		
		

