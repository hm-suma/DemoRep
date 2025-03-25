import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Standalone {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/client/");
		
		driver.findElement(By.id("userEmail")).sendKeys("sumahm@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Sumahm@123");
		driver.findElement(By.id("login")).click();
		
		List<WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
		/*
		 * Optional<WebElement> prod = items.stream().filter(item->
		 * item.findElement(By.tagName("b")).getText().equals(itemName)).findFirst().or(
		 * null);
		 */
		
		for(int i=0;i<items.size();i++) 
		{
		String name = items.get(i).getText();
		Thread.sleep(2000);
		if(name.contains("IPHONE 13 PRO")) 
		{
			w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".btn.w-10.rounded"))).get(i).click();
		}
		}
		
		
	}
}
