package abc;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//String name = driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']")).getText();
		//System.out.println(name);
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<product.size();i++) 
		{
		String name = product.get(i).getText();
		if(name.contains("Cucumber")) 
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			break;
		}
		}
	}
		
}

