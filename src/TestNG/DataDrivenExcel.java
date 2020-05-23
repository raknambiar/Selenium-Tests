package TestNG;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataDrivenExcel {
  public WebDriver driver;
  @Test(dataProvider = "readEx")
  public void login(String uname, String pwd) {
	  System.out.println("uname="+uname);
	  System.out.println("pwd="+pwd);
	  driver = new ChromeDriver();
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  driver.findElement(By.id("login1")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pwd);
	  driver.findElement(By.name("proceed")).click();
	  String s = driver.getCurrentUrl();
	  if(s.contains("somethin")) {
		  System.out.println("failed");
	  }
  }
 
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }


  @DataProvider //(name = "test")
  public Object[][] readEx() throws InvalidFormatException, IOException {
	    File f = new File ("Test.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(f);
		int sheet = w.getNumberOfSheets();
		XSSFSheet s = w.getSheetAt(0);
		int rows = s.getPhysicalNumberOfRows();
		int cols = s.getRow(0).getPhysicalNumberOfCells();
		String arr[][]=new String[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			String data = s.getRow(i).getCell(j).getStringCellValue();
			
			arr[i][j] = data;
	//		System.out.println("arr="+arr[i][j]);
			}
		}
		return arr;
		
  }
}
