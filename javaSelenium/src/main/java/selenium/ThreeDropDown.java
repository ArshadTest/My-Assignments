package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThreeDropDown {

	public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/crmsfa/control/findLeads");
			driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			driver.findElement(By.className("loginButton")).click();	
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			//Adding WebElement for dropdown element
			//Adding to remove duplication or repetation
			//dropdown field
			WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//element.click(); - Not needed here
			
			//dropdown class
			Select dropdown = new Select(element);
			
			//dropdown methods
//			dropdown.selectByIndex(4);
			
//			dropdown.selectByValue("LEAD_CONFERENCE");
			
			dropdown.selectByVisibleText("Partner");
			 
			WebElement element2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			//element.click(); - Not needed here
			
			Select dropdown2 = new Select(element2);
			
			dropdown2.selectByValue("OWN_PUBLIC_CORP");
			
			
			
	}

}
