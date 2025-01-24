package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourLearnImplicitWait {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//After Lauching the always add implicit wait - minimum 5 sec to max 30 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arshad");
		
		// To get title of the webpage
		String title = driver.getTitle();
		System.out.println("The title: "+title);
		
		// To get current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current URL: "+currentUrl);
		
		//To check if the Title is correct
		if (title.contains("Facebook")) {
			System.out.println("The title is correct");
			
		}
		else {
			System.out.println("The title is incorrect");
	}
		//To print a data from the webpage into the console
		String text = driver.findElement(By.xpath("//p[@class='_58mv']")).getText();
		System.out.println(text);
		
		if (text.contains("People")) {
			System.out.println("It contains right text");
		} else {
			System.out.println("The text is wrong");
		}
		
		
		
		
		
	}
	
}
