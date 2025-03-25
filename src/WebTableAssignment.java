import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		/*
		 * JavascriptExecutor js = (JavascriptExecutor)driver;
		 * js.executeScript("window.scrollBy(0,560)"); Thread.sleep(2000);
		 * 
		 * int row =
		 * driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		 * int col =
		 * driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[1]"
		 * )).size(); System.out.println(row); System.out.println(col);
		 * 
		 * String data =
		 * driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]")).
		 * getText(); System.out.println(data);
		 */
		
		/*
		 * WebElement container = driver.findElement(By.cssSelector(".table-display"));
		 * System.out.println(container.findElements(By.tagName("tr")).size());
		 * System.out.println(container.findElements(By.tagName("th")).size());
		 * System.out.println(container.findElements(By.tagName("tr")).get(2).getText())
		 * ;
		 */
		
		//driver.findElement(By.id("text")).click();
		Actions a = new Actions(driver);
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		a.moveToElement(driver.findElement(By.id("autocomplete"))).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("Value"));
	}
}
