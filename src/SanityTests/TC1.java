package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1 {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		if(driver.findElement(By.linkText("Images")).isDisplayed()) {
//		if(Existence == True){
			System.out.println("Gmail exists -success");
		}
		else {
			System.out.println("Gmail does not exist -failed");
			
		}
		driver.close();

	}

}
