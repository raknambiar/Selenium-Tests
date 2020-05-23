package HandlingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("http://google.com");
		Thread.sleep(2000);
		//Navigate to another browser
		driver.navigate().to("https://yahoo.com");
		//Return current URL
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		// Navigate back
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//Navigate forward
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		//Maximize the window
		driver.manage().window().maximize();
		//Get the page Title
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		//Retrun page Source
	//	System.out.println(driver.getPageSource());
		//Return Window Handle
		System.out.println(driver.getWindowHandle());
		//close the browser
		driver.close();
		//close all opened browsesr
		//driver.quit();
	}

}
