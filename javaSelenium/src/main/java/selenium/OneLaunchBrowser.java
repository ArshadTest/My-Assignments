package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
//		FirefoxDriver driver = new FirefoxDriver();
//		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
