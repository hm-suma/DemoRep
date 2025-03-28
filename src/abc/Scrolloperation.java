package abc;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolloperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		int sum = 0;
		List<WebElement> value = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));
		for(int i=0;i<value.size();i++)
		{
			 sum = sum + Integer.parseInt(value.get(i).getText());
		} 
		System.out.println(sum);
		
		int expval = Integer.parseInt(driver.findElement(By.xpath("//div[text()=' Total Amount Collected: 296 ']")).getText().split(":")[1].trim( ));
		Assert.assertEquals(sum, expval);
	}

}
