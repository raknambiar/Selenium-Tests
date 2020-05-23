package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String URL = driver.getCurrentUrl();
		Thread.sleep(2000);
		if(URL.contains("https://en.wikipedia.org/")) {
			System.out.println("internal link opening on another page -success");
		}
		else {
			System.out.println("external link opening on another page -failed");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("selenium.dev")).click();
		URL = driver.getCurrentUrl();
		if(!(URL.contains("https://en.wikipedia.org/"))) {
			System.out.println("external link opening on another page -success");
		}
		else {
			System.out.println("internal link opening on another page -failed");
		}
		driver.close();	
	}

}
