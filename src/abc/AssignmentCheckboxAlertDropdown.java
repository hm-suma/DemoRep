package abc;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentCheckboxAlertDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//click on 2nd checkbox
		driver.findElement(By.id("checkBoxOption2")).click();
	//use getattribute to get the value/label 
		System.out.println(driver.findElement(By.id("checkBoxOption2")).getAttribute("value"));
	// store that grabbed value in variable
		String value = driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
	//create a action method
		Actions a = new Actions(driver);
	//move to respective item and send the grabbed value and click in dropdown
		a.moveToElement(driver.findElement(By.id("dropdown-class-example"))).click().sendKeys(value).click().build().perform();
	//move to respective item click and send the grabbed value
		a.moveToElement(driver.findElement(By.id("name"))).click().sendKeys(value).build().perform();
	//click on alert and get the text 
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	//verify the grabbed value is present
		if(text.contains(value))
		{
			System.out.println(text);
		}
		
	}

}
