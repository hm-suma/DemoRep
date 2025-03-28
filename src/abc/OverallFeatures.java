package abc;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OverallFeatures {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addExtensions();
		options.getBrowserVersion();
	//accepts insecure sites if true is mentioned
		options.setAcceptInsecureCerts(true);
		//options.setCapability(proxy, false);
		System.setProperty("webdriver.chrome.driver", "D:\\\\2025 new task\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().addCookie(null);
		driver.manage().deleteAllCookies();
		driver.manage().getCookieNamed(null);
		driver.get("https://rahulshettyacademy.com/");
		driver.findElement(By.id("name")).sendKeys("suma");
		driver.findElement(By.cssSelector("tagname.classname/tagname#id/tagname[class='value']")).sendKeys("aaaa");
		driver.findElement(By.xpath("//tagname[@class='value']/tagname[text()='value']")).click();
		
	//dropdowns can be selected using select class
		WebElement drop = driver.findElement(By.id("some"));
		Select sel = new Select(drop);
		sel.selectByContainsVisibleText("india");
		sel.selectByIndex(0);
		sel.selectByValue("IND");
		sel.selectByVisibleText("india");
		sel.deselectAll();//when checkbox kind of dropdowns are available
		sel.deselectByIndex(0);
		
	//alerts are independent of webpage and cannot be inspected so use switchto()
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("sumahm@gmail.com");
		
	//window handles to handles different tabs/windows
	//set of window handles -> these are strings so use set class
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		System.out.println(driver.switchTo().window(child).getTitle());
		System.out.println(driver.switchTo().window(parent).getTitle());
		
	//action class for mouse keyboard operations, caps, keydown keyup, drag and drop
	//using driver we have to make an action on elements
		Actions a = new Actions(driver);
		WebElement acc = driver.findElement(By.id("acc"));
	//move to element move hover 
		a.moveToElement(acc).build().perform();
	//right click on the element 
		a.moveToElement(acc).contextClick().build().perform();
		WebElement text = driver.findElement(By.id("textbox"));
	//go to text box-> click-> hold shift and type-> it should display caps letter double click on it 
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
		
	//frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	//frames are within the container or independent of webpage, so use switch to frames
	//switch to frame 0 if there are multiple frames on webpage
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("name"));
		WebElement dest = driver.findElement(By.id("list"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(src, dest).build().perform();
	//to come out of frame
		driver.switchTo().defaultContent();
	// if nested frames-> switch to specific frame and do operation
		driver.switchTo().frame(driver.findElement(By.id("name")));
		driver.findElement(By.id("text")).getText();
		
		
		
		
		
	}

}
