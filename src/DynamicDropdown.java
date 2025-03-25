import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.className("select_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		//driver.findElement(By.xpath("(//a[@value='PAT'])[2]")).click(); using index 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click(); //using parent child relationship
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("Style").contains("0.5")) {
			System.out.println("is enabled");
		}
		else {
			System.out.println("not enabled");
		}
	}

}
