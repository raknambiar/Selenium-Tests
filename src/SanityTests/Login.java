package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://google.com");
		//Thread.sleep(5000);
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.navigate().to("https://yahoo.com");
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
		WebElement Gmail = driver.findElement(By.className("gb_g"));
		System.out.println(Gmail.getText());
		boolean Enabled = Gmail.isEnabled();
		System.out.println(Enabled);
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("news UK");
		Thread.sleep(5000);
		
	
		driver.findElement(By.name("btnK")).click();
		URL = driver.getCurrentUrl();
		System.out.println(URL);
//		Search.click();
	//	driver.navigate().to("www.youtube.com");
	//	driver.navigate().back();
		driver.close();
		System.out.println("opened google");
	}

}
