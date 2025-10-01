package HomeAssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Chenthil Murugan$12");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		// Dropdown syntax need to learn 
		
		WebElement dropDownSelect = driver.findElement(By.name("industryEnumId"));
		
		Select options = new Select (dropDownSelect);
		// return type important	
		
		options.selectByIndex(3);
		
		WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(dropDown2);
		options1.selectByContainsVisibleText("S-Corporation");
		
		WebElement dropDown3 = driver.findElement(By.id("dataSourceId"));
		Select option2=new Select(dropDown3);
		option2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dropDown4 = driver.findElement(By.id("marketingCampaignId"));
		Select option3= new Select(dropDown4);
		option3.selectByIndex(6);
		
		WebElement dropDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option4=new Select (dropDown5);
		option4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		
		System.out.println("Title of the page:"+ title);
				
		
		// driver.close();
		

		// How to get the title name;
		
		
		
		
		
		
		
		
		
		
	}

}
