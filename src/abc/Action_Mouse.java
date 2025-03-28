package abc;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\2024 new task\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.amazon.com/");
		WebElement acc = driver.findElement(By.id("nav-link-accountList"));
	//to do advanced selenium interactions
		Actions a = new Actions(driver);
		
	//move to text box -> click-> shift-> enter iphone in caps //double click for selecting
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform();
	// move to acc and hover the mouse and right click
		a.moveToElement(acc).contextClick().build().perform();
		
		
	
	}
}
