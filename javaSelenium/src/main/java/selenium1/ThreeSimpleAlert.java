package selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreeSimpleAlert {
	
	//Type 1  - Simple Alert
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']")).click();
		
		//switch control to Alert
		Alert simplealert = driver.switchTo().alert();
		
		//To print the text of the Alert in the console
		String text = simplealert.getText();
		System.out.println("The text in the alert is "+text);
		
		//To tap Ok CTA
		simplealert.accept();		
		
		//To print the success alert message in the console
		String text2 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text2);
		
		
	}

}
