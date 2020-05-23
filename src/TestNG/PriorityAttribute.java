package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityAttribute {
	public WebDriver driver;
	  @Test (priority =1)
	  public void LuanchBrowser() {
		  System.setProperty("webdriver.chrome.driver", "chromedriver");
		  driver = new ChromeDriver();
	  }
	  @Test (priority =2)
	  public void VerifyTitle() {
		    driver.get("https://google.com");
			String PageTitle = driver.getTitle();
			Assert.assertEquals("Google", PageTitle);
	  }
	  @Test (priority =3)
	  public void CloseBrowser() { //Executes the test cases in alphabetical order
		    System.out.println("close browser");
		    driver.close();
	  }
	}

