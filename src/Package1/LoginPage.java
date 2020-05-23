package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By Username = By.id("login1");
	By Password = By.id("password");
	By Login = By.name("proceed");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void typeUsername(String uname) {
		driver.findElement(Username).sendKeys(uname);
	}
	
	public void typePassword(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}
	
	public void Click() {
		driver.findElement(Login).click();
	}

}
