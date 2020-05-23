package HandlingElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement chkbox1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		WebElement chkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		if(!chkbox1.isSelected()) {
			System.out.println("Chkbox1 selected");
		}
		else {
			chkbox1.click();
		}
		if(!chkbox2.isSelected()) {
			System.out.println("Chkbox2 selected");
		}
		else {
			chkbox2.click();
		}
	}

}
