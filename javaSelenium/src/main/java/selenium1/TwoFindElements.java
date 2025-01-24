package selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoFindElements {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/link.xhtml;jsessionid=node0n6wmp96mk6ardfyayh32qcwv8236982.node0");
		
		//To find the numbers of links in the //a tag in DOM
		//return type of List is WebElement
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		//To get the size
		int size = elements.size();
		System.out.println("The size is "+size);
		
		//To print all the links
//		for (int i = 0; i < elements.size(); i++) {
//			System.out.println(elements);  			// Not correct
//			
//		}
		
		//foreach loop - Advanced for loop - use this for collection
		for (WebElement webElement : elements) {	
			String text = webElement.getText();
			System.out.println(text);
			
			
			
			
		}
		
	}

}
