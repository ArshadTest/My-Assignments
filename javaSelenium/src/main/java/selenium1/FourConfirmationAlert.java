package selenium1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourConfirmationAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		//To inspect the alert
		Alert alert = driver.switchTo().alert();
		
		//To tap cancel on the popup
		alert.dismiss();
		
		//To enter the message in the console
		String userClicked = driver.findElement(By.xpath("//span[text()='User Clicked : Cancel']")).getText();
		System.out.println(userClicked);
		
	}

}
