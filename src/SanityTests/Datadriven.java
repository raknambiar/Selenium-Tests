package SanityTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Datadriven {


	public static void main(String[] args) throws BiffException, IOException, InvalidFormatException {
		// TODO Auto-generated method stub
		Datadriven o = new Datadriven();
		File f = new File ("Test.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s = w.getSheetAt(0);
		int rows = s.getPhysicalNumberOfRows();
		int cols = s.getRow(0).getPhysicalNumberOfCells();
		String arr[][]=new String[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			String data = s.getRow(i).getCell(j).getStringCellValue();
			
			arr[i][j] = data;
			}
		}
	
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println("arr["+i+"]["+j+"]="+arr[i][j]);
			}
		}
		
	
		
		/*
		 * File f = new File ("Test.xlsx");
		 * Workbook w = Workbook.getWorkbook(fis);
		 * Sheet s = w.getSheet("Sheet"); 
		 * int columns = s.getColumns(); 
		 * int rows =s.getRows(); 
		 * String inputData[][]=new String[rows][columns]; 
		 * for(int i=0;i<rows;i++) { 
		 * for(int j=0;j<columns;j++) { 
		 * Cell c = s.getCell(j,i);
		 * inputData[i][j]=c.getContents();
		 * System.out.println("inputData="+inputData[i][j]); } }
		 */
	}

}
  