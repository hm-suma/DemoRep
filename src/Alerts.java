import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String a = "suma";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//alert press ok
		driver.findElement(By.id("name")).sendKeys(a);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//confirm button , ok or dismiss
		driver.findElement(By.id("name")).sendKeys(a);
		driver.findElement(By.xpath("//fieldset[@class='pull-right']/input[3]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		// 
		driver.findElement(By.id("openwindow")).click();
		//driver.switchTo().newWindow(null);
		driver.close();
		
	}

}
