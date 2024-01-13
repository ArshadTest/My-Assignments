package week2.day1HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.className("x-panel-header")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VVDN Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arshad");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Amaanullah");
		
		WebElement dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select option=new Select(dropdown);
		option.selectByIndex(4);
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select option1=new Select(dropdown1);
		option1.selectByVisibleText("Automobile");
		
		WebElement dd3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select opt3=new Select(dd3);
		opt3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		//- Verify the title of the current web page - check and do
		driver.close();
	}

}
