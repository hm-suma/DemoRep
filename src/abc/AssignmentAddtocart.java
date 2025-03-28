package abc;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentAddtocart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(6));
	//username pass
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
	//radio button click on user
		driver.findElement(By.xpath("(//div/label)[4]/span[2]")).click();
		//System.out.println(driver.findElement(By.xpath("(//div/p)[2]")).getText());
	//alert box select okay
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#okayBtn")));
		driver.findElement(By.cssSelector("button#okayBtn")).click();
	//to select dropdown
		WebElement drop = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(drop);
		s.selectByValue("consult");
		System.out.println(s.getFirstSelectedOption().getText());
	//select checkbox 
		driver.findElement(By.cssSelector("input#terms")).click();
	//click on submit/sign in
		driver.findElement(By.id("signInBtn")).click();
		
	//to add all the items to cart	
		//div.col-lg-9 container //div/button[text()='Add '] add items
		List<WebElement> items = driver.findElements(By.xpath("//div/button[text()='Add ']"));
		for(int i=0;i<items.size();i++)
		{
			String name = items.get(i).getText();//store the add text in name object
			System.out.println(name);
			if(name.contains("Add"))
			{
			w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-info")));
			driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();
			}
		}
	//click on checkout button
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	//click on next checkout
	/*
	 * driver.findElement(By.cssSelector("button.btn.btn-success")).click(); //enter
	 * country on auto suggested text box
	 * driver.findElement(By.id("country")).sendKeys("ind");
	 * w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(
	 * "//div[@class='suggestions']/ul/li"))); List<WebElement> countryList =
	 * driver.findElements(By.xpath("//div[@class='suggestions']/ul/li"));
	 * 
	 * for(WebElement country: countryList) {
	 * if(country.getText().equalsIgnoreCase("India")) { country.click();
	 * //System.out.println(driver.findElement(By.id("country")).getText()); } } //
	 * driver.findElement(By.cssSelector("input#checkbox2")).click();
	 */
	}	
	}
		
		
