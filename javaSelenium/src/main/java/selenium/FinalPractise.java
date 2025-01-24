package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FinalPractise {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/crmsfa/control/findLeads");
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("loginButton")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		// To create a dropdown
		
		WebElement element = driver.findElement(By.id("createLeadForm_currencyUomId"));
		
		Select dropdown = new Select(element);
		//dropdown.selectByIndex(2);
		
		//dropdown.selectByValue("BBD");
		
		dropdown.selectByVisibleText("BRL - Brazilian Real");
		
		/*
		 * To learn the Basic Xpath 
		 * Attribute Based Xpath - //input[@name='USERNAME']
		 * Text Based Xpath - //a[text()='Create new account'] 
		 * Partial Attribute Based Xpath - //input[contains(@id,'identify_')] 
		 * Partial text Based Xpath - //button[contains(text(),'Sear')] 
		 * Collection Based Xpath - (//div[@class='x-panel-header'])[5]
		 * 
		 * To Learn the Advance Xpath 
		 * Parent to Child 
		 * - Basic Xpath of the Parent/tagName of the Child //div[@class='ac-input-container']/input
		 * GrandParent to GrandChild 
		 * - Basic Xpath of the GrandParent//tagName of the GrandChild //div[@class='nav-search-field ']//input
		 * Child to Parent
		 * - Basic Xpath of the Child/parent::tagName of the Parent //input[@id='twotabsearchtextbox']/parent::div
		 * GrandChild to GrandParent
		 * - Basic Xpath of the GrandChild/ancestor::tagName of the GrandParent
		 * //input[@id='twotabsearchtextbox']/ancestor::div[@class='nav-search-field ']
		 * (//input[@name='reg_email__']/ancestor::div) [12]
		 */
		
		//To get the title of the Webpage
		String title = driver.getTitle();
		System.out.println("The title is "+title);
		
		if (title.contains("Create")) {
			System.out.println("The title is correct");
		} else {
			System.out.println("The title is wrong");
		}
		
		//To get Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The current URL is "+currentUrl);
		
		//To print the Text of Webpage in the console
		String text = driver.findElement(By.linkText("eCommerce")).getText();
		System.out.println("The Webpage text is "+text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
