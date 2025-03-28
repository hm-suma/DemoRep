package abc;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.findElement(By.tagName("h1")).getText());
		//https://rahulshettyacademy.com/dropdownsPractise/
		//https://rahulshettyacademy.com/dropdownsPractise/
		
	}

}
