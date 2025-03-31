package SumaAcademy.PraticePro;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAuto {
	WebDriver driver;

	@Test(priority = 1)
	public void invokeBro()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority = 2)
	public void loginPage()
	{
		driver.close();
	}
}

