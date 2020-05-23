package SanityTests;

import ExcelLib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelDataConfig Excel = new ExcelDataConfig("Test.xlsx");
		System.out.println(Excel.getData(0, 1, 0));
	}

}
