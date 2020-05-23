package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BeforeAfterClass {
	public static WebDriver driver;
   
  @BeforeClass
  public void LaunchBrowser() {
	  System.out.println("Launch browser");
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  driver = new ChromeDriver();
  }
  @Test (priority =1)
  public void VerifyTitle() {
	    driver.get("https://google.com");
		String PageTitle = driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
  }
  @Test (priority =2)
  public void VerifyYahooTitle() {
	  driver.get("http://yahoo.com");
	  String PageTitle = driver.getTitle();
	  Assert.assertEquals("Yahoo is now a part of Verizon Media", PageTitle);
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("close browser");
  driver.close();
  }

}
