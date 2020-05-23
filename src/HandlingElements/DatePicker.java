package HandlingElements;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException, ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String d = "31/08/2020";
		String DepartDate = "31";
		String DepartMonth = "April";
		
		/*
		 * WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")); 
		 * Select select = new Select(dropDown); Thread.sleep(2000);
		 * select.selectByValue("BLR"); 
		 * String value =select.getFirstSelectedOption().getText();
		 * System.out.println("value="+value); 
		 * WebElement dropDown1 =driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1"));
		 * select = new Select(dropDown1); 
		 * select.selectByValue("CJB"); 
		 * value =select.getFirstSelectedOption().getText();
		 * System.out.println("value="+value);
		 */
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 driver.findElement(By.xpath("//a[contains(text(), 'Bengaluru (BLR)')]")).click();
		
	//	 driver.findElement(By.xpath("//a[contains(text(), 'Chennai (MAA)')]")).click();
		 driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[contains(text(), 'Chennai (MAA)')]")).click();
		
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 String months[] = {"January","February","March","April","May","June","July","August"};
		 Date mydate = df.parse(d);
		 String date = df.format(mydate);
		 System.out.println(date);
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(mydate);
		 int day = cal.get(Calendar.DAY_OF_MONTH);
		 int month = cal.get(Calendar.MONTH);
		 int year = cal.get(Calendar.YEAR);
		 System.out.println(day);
		 System.out.println(months[month]);
		 System.out.println(year);
		 
		 String travelMonth = months[month]+" "+year;
		 System.out.println(travelMonth);	
		 String forwardArrow = "//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span";
		 String monthYearSelection = "//*[@id=\"ui-datepicker-div\"]/div[1]/div/div";
				 //"//div[class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']";
	//	 driver.findElement(By.xpath(forwardArrow)).click();
		 int selection = 
			
		 for(int i=0;i<3;i++) {
			 
			 //table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td"
		 }
		 while(!driver.findElement(By.xpath(monthYearSelection)).getText().equalsIgnoreCase(travelMonth)){
			  driver.findElement(By.xpath(forwardArrow)).click();
			  System.out.println("Sel="+driver.findElement(By.xpath(monthYearSelection)).
			  getText()); 
		}
		System.out.println("linktext="+driver.findElement(By.linkText(Integer.toString(day))).getText());
		driver.findElement(By.linkText(Integer.toString(day))).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		select.selectByValue("2");
		select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		select.selectByValue("2");
		select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		select.selectByValue("2");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		if(driver.getCurrentUrl().contains("https://book.spicejet.com/Select.aspx")) {
			System.out.println("Successful");
		
		}
		else {
			System.out.println("not Successful");
		}
		//*[@id="ctl00_mainContent_rbtnl_Trip_0"]
		//*[@id="ctl00_mainContent_rbtnl_Trip_1"]
		
	}

}
