import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
	//dynamic dropdown src to destination
		driver.findElement(By.className("select_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		//driver.findElement(By.xpath("(//a[@value='PAT'])[2]")).click(); using index 
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click(); //using parent child relationship
		
	//Checkbox
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	//radio button opacity
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("Style").contains("1")) {
		System.out.println("is enabled");
		}
			else {
			System.out.println("not enabled");
		}
		
	//radio button
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElements(By.name("ctl00$mainContent$rbtnl_Trip")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		
	//incremental dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	//static drop
		WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//to open the dropdown
		Select drop = new Select(staticdrop);//select method 
		//drop.selectByIndex(1);
		//System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("USD");
		System.out.println(drop.getFirstSelectedOption().getText());
		//drop.selectByVisibleText("AED");
		//System.out.println(drop.getFirstSelectedOption().getText());
		//drop.selectByContainsVisibleText("Select");//select all text which contains Select
		//System.out.println(drop.getFirstSelectedOption().getText());
		
		
	//auto suggested dropdowns
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));// css-> li[class='ui-menu-item'] a
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase("Austria")) {
				option.click();
				System.out.println(driver.findElement(By.id("autosuggest")).getText());
				break;	
				}
		}
				
	// click on search
		driver.findElement(By.xpath("//span/input[@type=\"submit\"]")).click();
		System.out.println(driver.getTitle());
		//h4[@class='product-name'] [text()='Cucumber - 1 Kg']
	}

}
