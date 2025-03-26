import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://the-internet.herokuapp.com/");
	//click on link multiple window
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	//click on link available on webpage
		driver.findElement(By.partialLinkText("Here")).click();
	//get the window handles of all windows
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String par = it.next();
		String ch = it.next();
		System.out.println(par);
		System.out.println(ch);
	//switch to child window and get the text print it
		driver.switchTo().window(ch);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
	//switch back to par and get the text and print
		driver.switchTo().window(par);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		

	}

}
