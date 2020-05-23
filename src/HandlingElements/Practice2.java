package HandlingElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/18913/scorecard/1158064/west-indies-vs-england-3rd-test-england-tour-of-wi-2018-19");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[1]/td"));
		System.out.println("rows ="+rows.size()+"cols="+cols.size());
		/*
		 * System.out.print(driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[1]/td[1]"
		 * )).getText()+"  ");
		 * System.out.println("rows ="+rows.size()+"cols="+cols.size()); for(int
		 * i=1;i<=10;i++) { for(int j=1;j<=cols.size();j++) {
		 * System.out.print(driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr["
		 * +i+"]/td["+j+"]")).getText()+"  "); } System.out.println(); }
		 */
		driver.close();

	}

}
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/thead/tr/th[1]
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[2]/tbody/tr[2]/td[1]/a
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[3]/td[1]/a
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[1]/td[1]/a
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[3]/td[2]/span/span
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[3]/td[3]
//*[@id="main-container"]/div/div[2]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/div/table[1]/tbody/tr[1]/td[3]