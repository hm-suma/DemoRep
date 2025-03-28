package abc;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//to open the dropdown
		Select drop = new Select(staticdrop);//select method 
		drop.selectByIndex(1);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("USD");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("AED");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByContainsVisibleText("Select");//select all text which contains Select
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.getOptions();
		
	}

}
