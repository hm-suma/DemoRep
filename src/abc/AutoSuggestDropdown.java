package abc;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));// css-> li[class='ui-menu-item'] a
		
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("Austria")) {
				option.click();
				//System.out.println(driver.findElement(By.id("autosuggest")).getText());
				break;
				
			}
		}

		System.out.println(driver.findElement(By.id("autosuggest")).getDomAttribute("Value"));
		
	}

}
