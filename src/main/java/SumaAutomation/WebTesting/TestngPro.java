package SumaAutomation.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngPro {
	WebDriver driver;

	@Test
	public void setup() {
		    // Set up WebDriver (using WebDriverManager to handle browser driver setup)
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.get("https://www.gmail.com");
	}
	
	
}
