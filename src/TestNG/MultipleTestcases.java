package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTestcases {
	
	public WebDriver driver;
  @Test
  public void LuanchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  driver = new ChromeDriver();
  }
  @Test
  public void VerifyTitle() {
	    driver.get("https://google.com");
		String PageTitle = driver.getTitle();
		Assert.assertEquals("Google", PageTitle);
  }
  @Test
  public void ZloseBrowser() { //Executes the test cases in alphabetical order
	    System.out.println("close browser");
	    driver.close();
  }
}
