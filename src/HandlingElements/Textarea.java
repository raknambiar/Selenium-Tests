package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("http://google.com");
		//Enter value in the edit box
		WebElement Textarea = driver.findElement(By.className("NKcBbd"));
		System.out.println(Textarea.getText());
		driver.close();

	}

}
