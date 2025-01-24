package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveSingleFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml");
		
		//Single Frame
		//switch control to iFrame, by index
		WebDriver frame = driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text);
		
		//To come out from the frame
		driver.switchTo().defaultContent();

	}

}
