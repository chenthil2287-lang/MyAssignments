package HomeAssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookaccount {

	public static void main(String[] args) {
		ChromeDriver account= new ChromeDriver();
		account.get("https://en-gb.facebook.com/");
		account.manage().window().maximize();
		
		account.findElement(By.xpath("//a[text()='Create new account']")).click();
		account.findElement(By.name("firstname")).sendKeys("John");
		account.findElement(By.name("lastname")).sendKeys("Mathew");
		account.findElement(By.name("reg_email__")).sendKeys("7657987640");
		account.findElement(By.id("password_step_input")).sendKeys("Takeiteasy$24");
		
		WebElement dp1 = account.findElement(By.name("birthday_day"));
		Select bday= new Select(dp1);
		bday.selectByValue("22");
		
		WebElement dp2 = account.findElement(By.name("birthday_month"));
		Select bmonth= new Select(dp2);
		bmonth.selectByValue("12");
		
		WebElement dp3 = account.findElement(By.name("birthday_year"));
		Select byear= new Select(dp3);
		byear.selectByValue("2000");
		
		account.findElement(By.id("sex")).click();
		
		
			
	}

}
