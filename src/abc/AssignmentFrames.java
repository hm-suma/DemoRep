package abc;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\2025 new task\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://the-internet.herokuapp.com/");
	//click on nested frame link
		driver.findElement(By.linkText("Nested Frames")).click();
	//switch to main frame there is 1 frameset main frame
		driver.switchTo().frame(0);
	//first switch to middle frame 
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
	//from middle frame get the text
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
	

	}

}
