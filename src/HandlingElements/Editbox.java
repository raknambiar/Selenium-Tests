package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("http://google.com");
		//Enter value in the edit box
		WebElement Editbox = driver.findElement(By.name("q"));
		Editbox.sendKeys("Rishan wants to solve Rubiks cube");
		//Return /capture value
		System.out.println(Editbox.getAttribute("value"));
		System.out.println(Editbox.getText());
		//Return displayed status
		System.out.println(Editbox.isDisplayed());
		//Return enabled status
		System.out.println(Editbox.isEnabled());
		Thread.sleep(5000);
		//clear the value
		Editbox.clear();
		driver.close();
		
	}

}
