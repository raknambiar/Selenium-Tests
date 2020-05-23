package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonAtribute {
  public static WebDriver driver;
  @Test 
  public void LaunchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  driver = new ChromeDriver();
	  
  }
  @Test (dependsOnMethods = "VerifyYahooTitle")
  public void VerifyGoogleTitle() {
	  driver.get("http://google.com");
	  String PageTitle = driver.getTitle();
	  Assert.assertEquals("Google", PageTitle);
  }
  @Test (dependsOnMethods = "LaunchBrowser")
  public void VerifyYahooTitle() {
	  driver.get("http://yahoo.com");
	  String PageTitle = driver.getTitle();
	  Assert.assertEquals("Yahoo is now a part of Verizon Media", PageTitle);
  }
  @Test (dependsOnMethods = "VerifyGoogleTitle")
  public void CloseBrowser() {
	  driver.close();
  }
}
