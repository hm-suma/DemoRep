import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro { 

	public static void main(String[] args) {
		//implements WebDriver agrees to implement the webdriver methods//
		//Invoking the Browser
		//Chrome, Firefox, Safri
		//Chrome-> ChromeDriver(Interface/class) -> gives Methods
		//FirefoxDriver
		//Create ChromeDriver object-> driver
		//Interface -> webDriver( methods have empty body
		
		System.setProperty("webdriver.chrome.driver", "D:\\2024 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//System.getProperty("webdriver.gecko.driver", "D:\\2024 new task\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", "D:\\2024 new task\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver =  new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("github");
		//driver.close();//closes current tab/window currently opened
		//driver.quit();//closes all associated window
		//hitting url on browser has get method


}

}
