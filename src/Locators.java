import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//implicit wait will tell to wait based on the given time
		//System.getProperty("webdriver.gecko.driver", "D:\\2024 new task\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//FirefoxDriver driver =  new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!676201929245!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiAh6y9BhBREiwApBLHC7HbPEKhjAUaeLpIRYd4YIkvgVirvwiW2B2og_gmWKBd4nn5svqi4BoCtGwQAvD_BwE");
	
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		
		//driver.findElement(By.className("Pke_EE")).sendKeys("samsung tv");
		//driver.findElement(By.xpath("//a[@aria-label='Myntra']")).click();
		//driver.findElement(By.linkText("Nike Shoes")).click();
		driver.findElement(By.linkText("Cart")).click();
		System.out.println(driver.getTitle());
		//driver.quit();
		
		driver.findElement(By.cssSelector("input.zDPmFV")).sendKeys("samsung s25 ultra 5g");
		driver.findElement(By.cssSelector("button.MJG8Up")).click();
		//driver.findElement(By.className("KzDlHZ")).click();
		driver.get("https://www.flipkart.com/samsung-galaxy-s25-ultra-5g-titanium-black-256-gb/p/itm09d676ceb930d?pid=MOBH8K8UVNGVNGKN&lid=LSTMOBH8K8UVNGVNGKNFV5MBM&marketplace=FLIPKART&q=samsung+s25+ultra+5g&store=tyy%2F4io&srno=s_1_1&otracker=AS_QueryStore_OrganicAutoSuggest_1_8_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_8_na_na_na&fm=organic&iid=226162ef-7d8c-4a15-ae9f-90e3f566293f.MOBH8K8UVNGVNGKN.SEARCH&ppt=hp&ppn=homepage&ssid=22axs0xrow0000001739903145769&qH=459ef13bed05f597");
		driver.findElement(By.cssSelector("button.In9uk2")).click();
		
	
	
	}

}
