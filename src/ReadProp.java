import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/rakeshjanardhanan/eclipse-workspace/Selenium Tests/src/Config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("browser")); //should be exact match
		String browsername = prop.getProperty("browser");
		if(browsername.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			WebDriver driver = new ChromeDriver();		
		}
		else if(browsername.contains("FF")) {
			WebDriver driver = new FirefoxDriver();		
		}
		else {
			System.out.println("no browser details given");
		}
	}
}	
