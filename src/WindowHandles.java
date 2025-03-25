import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.partialLinkText("Material")).click();
	//use set class to handle the windows
		Set<String> window = driver.getWindowHandles();
	//use iterator class to iterator the window handles
		Iterator<String> it = window.iterator();
	//to select the window handle starts with 0 index
		String par = it.next();
		System.out.println(par);
		String child = it.next();
	//switch to child window
		System.out.println(driver.switchTo().window(child));
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	//parse/split string at run time 
		String store = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim( ).split(" ")[0];
	//switch to child window
		driver.switchTo().window(par);
		driver.findElement(By.id("username")).sendKeys(store);
		
	
	}

}
