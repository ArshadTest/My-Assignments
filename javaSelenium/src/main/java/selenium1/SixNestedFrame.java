package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml");
		
		//switch to 1st iFrame
		driver.switchTo().frame(2);
		
		//switch to 2nd iFrame
		driver.switchTo().frame("frame2");
		
		//Then click the button
		driver.findElement(By.id("Click")).click();
		
		//Return to parent frame or previous frame
		driver.switchTo().parentFrame();
		
		//Return to default frame
		driver.switchTo().defaultContent();
		
		//WebElement
		WebElement element = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(element);

	}

}
