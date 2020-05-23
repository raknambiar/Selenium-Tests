package Package2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Package1.LoginPage;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		LoginPage login = new LoginPage(driver);
		login.typeUsername("admin");
		login.typePassword("admin123");
		login.Click();
		
		String url = driver.getCurrentUrl();
		if(url.equals("http://www.grcit/com/build3/admin/index.php")){
			System.out.println("Successful");
		}
		else {
			System.out.println("Unsuccessful");
		}
		
		driver.close();			
	}
}
