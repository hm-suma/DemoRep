package abc;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://jqueryui.com/droppable/");
	//how many frames are there
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	//switch to respective frame/ main frame 
		driver.switchTo().frame(0);
	//get the frames and store it in variable
		WebElement src = driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
		WebElement dest = driver.findElement(By.cssSelector(".ui-widget-header.ui-droppable"));
	//to perform drag and drop use actions class
		Actions s = new Actions(driver);
	//mention src and dest
		s.dragAndDrop(src, dest).build().perform();
	//switch back to outside frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();
	}

}
