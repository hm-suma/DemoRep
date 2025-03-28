package abc;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hnadle_MultipleLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String a = "suma";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//get all links available on webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
	//locate the footer and get the links available only in footer
		WebElement subDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(subDriver.findElements(By.tagName("a")).size());
	//get only 1st column link inspect the 1st column	
		WebElement firstCol = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	//get the links present in 1st column only
		System.out.println(firstCol.findElements(By.tagName("a")).size());
		
	//for loop contains iteration starts from 1st link till nth link/ number of links available in 1st column
		for(int i=1; i<firstCol.findElements(By.tagName("a")).size();i++) 
		{
	//key chord which clicks multiple keys simultaneously
	// it will press ctrl key and enter at the same time
			String clickonLink = Keys.chord(Keys.CONTROL, Keys.ENTER);	
	//sendkeys used to send the key chords to browser
			firstCol.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
			Thread.sleep(5000);
		}
	//get the windown handles of all tabs/windows
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
	//use while loop to get titile from each tabs
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
		
		
	}


