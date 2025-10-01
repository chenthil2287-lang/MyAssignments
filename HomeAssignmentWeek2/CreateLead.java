package HomeAssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver opt = new ChromeDriver();
		opt.get("http://leaftaps.com/opentaps/.");
		opt.manage().window().maximize();
		
		opt.findElement(By.id("username")).sendKeys("democsr");
		opt.findElement(By.id("password")).sendKeys("crmsfa");
		opt.findElement(By.className("decorativeSubmit")).click();
		opt.findElement(By.linkText("CRM/SFA")).click();
		opt.findElement(By.linkText("Leads")).click();
		opt.findElement(By.linkText("Create Lead")).click();
		
				
		opt.findElement(By.id("createLeadForm_firstName")).sendKeys("Chenthil");
		opt.findElement(By.id("createLeadForm_lastName")).sendKeys("Murugan");
		opt.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Corp");
		opt.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Head of Org");
		opt.findElement(By.name("submitButton")).click();
		
		
		
		
		String Name = opt.getTitle();
		System.out.println(Name);
		opt.close();
		
}}

