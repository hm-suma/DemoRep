package abc;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPstatus {

	public static void main(String[] args) {
	//browser behavior can be set using chromeoptions
		ChromeOptions options =  new ChromeOptions();
	//accepts the insure sites
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.get("https://badssl.com");
		driver.get("https://expired.badssl.com/");
	//to add or delete cookies
	//driver.manage().addCookie(null);
	//driver.manage().deleteAllCookies();
	//driver.manage().deleteCookieNamed("something");
	//driver.manage().getCookieNamed("some");
	// chromeoptions used to add extensions(firepath), proxcy, to block the pop-up window, to handle SSL cerfications
	
		
		System.out.println(driver.getTitle());
	//options.addExtensions();
	//options.setCapability("proxcy", "value");
		
	}

}
