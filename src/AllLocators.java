import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/otp?wizard_id=j5H1cdGnGXuJdp_zwExdeDLJqnppxwzFGA0uIYLuUyWLGMeXatORHnpgqft6bzbhL_8MQ5SiOm3MnubvlzJD6g");
		//driver.findElement(By.cssSelector("#name")).sendKeys("sumahm");
		//driver.findElement(By.id("email")).sendKeys("suma.amm.526@gmail.com");
		//driver.findElement(By.name("allowMarketingEmails")).click();
		driver.get("https://rahulshettyacademy.com/");
		//driver.findElement(By.linkText("Courses")).click();
		//driver.getTitle();
		driver.findElement(By.partialLinkText("Support")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Blog")).click();
		System.out.println(driver.getTitle());
		//input[@id='email']- xpath //tagname[@atribute='value'], //tagname[@attribute='value'][1]
		//tagname[atributr='valur']- css selector
		//rahulshettyacademy
		
	
	}

}
