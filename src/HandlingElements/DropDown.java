package HandlingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Launch the browser
	//	driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//------------------------------using normal method - not accurate always------------
	//	driver.findElement(By.name("country")).sendKeys("ALGERIA");
	//	driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
	//-----------------------------------------------------------------------------------
	//------------------------------Using dropDown---------------------------------------
		WebElement dropDown = driver.findElement(By.id("searchLanguage"));
		Select select =new Select(dropDown);
	//	select.selectByVisibleText("Eesti");
		select.selectByValue("hi"); 
		
		String value = select.getFirstSelectedOption().getText();
		System.out.println("value="+value);
	//HTML the attribute will always have a value - select this for other languages.
	// -----------------------------or directly as below.---------------------------------
	//	Select dropDown = new Select(driver.findElement(By.name("country")));
	//	Select dropDown = new Select(driver.findElement(By.id("searchLanguage")));
	//	dropDown.selectByIndex(2);
	//	dropDown.selectByVisibleText("Eesti");
	//------------------------------------------------------------------------------------
		//Item count
	//	List<WebElement> e = dropDown.getOptions();
	//	int itemCount =e.size();
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println(values.size());
	//	System.out.println(itemCount);
	//	driver.close();
	}

}
