package HandlingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')] ")).click();
		//Get a handle to open an alert, prompt or confirmation
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		//click on ok button
		alert.accept();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println("result ="+result);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')] ")).click();
		alert =driver.switchTo().alert();
		Thread.sleep(2000);
		//click on cancel button
		alert.dismiss();
		result = driver.findElement(By.id("result")).getText();
	//	System.out.println("result1 ="+result);
		Assert.assertEquals("You clicked: Cancel", result);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')] ")).click();
		alert =driver.switchTo().alert();
		//get the text which is present on the alert
		System.out.println("text on alert="+alert.getText());
		alert.sendKeys("Hello");
		Thread.sleep(5000);
		alert.accept();
		result = driver.findElement(By.id("result")).getText();
		System.out.println("result1 ="+result);
		
		
	}

}
