package HandlingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("searchLanguage")).click();
		driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]/option[6]")).click();
		/*
		 * WebElement dropDown =
		 * driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")); 
		 * Select select =new Select(dropDown); 
		 * select.selectByVisibleText("Eesti");
		 * 
		 * List <WebElement> e = driver.findElements(By.tagName("option"));
		 * System.out.println("size="+e.size()); 
		 * for(int i=0;i<e.size();i++) {
		 * System.out.println("text ="+e.get(i).getText());
		 * //System.out.println(select.getOptions().get(0).getText()); 
		 * }
		 */
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
	//	Select select = new Select (block);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//to print the links in a particular block
		List<WebElement> links1 = block.findElements(By.tagName("a"));
		System.out.println("size="+links1.size()); 
		/*for(WebElement link:links) {
			System.out.println("links="+link.getText()+"----URL is"+link.getAttribute("href"));
		}*/
		for (WebElement link: links1) {
			System.out.println("links1="+link.getText()+"----URL is"+link.getAttribute("href"));
			
		}
	
		

	}

}
