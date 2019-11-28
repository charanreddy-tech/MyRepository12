package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Relative_Class {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Basic Relative xpath
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("charan");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("reddy");
		
		//By Using contains
		driver.findElement(By.xpath("//input[contains(@name,'ail__')]")).sendKeys("7890224241");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_y')]")).sendKeys("charan@123");
		
		//with out using contains
		new Select(driver.findElement(By.xpath("//select[(@title='Day')]"))).selectByIndex(23);
		new Select(driver.findElement(By.xpath("//*[(@id='month')]"))).selectByValue("8");
		new Select(driver.findElement(By.xpath("//select[(@name='birthday_year')]"))).selectByVisibleText("2001");
		
		//Starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_7')]")).click();
		
		//Ends with
//		driver.findElement(By.xpath("//*[ends-with(@id,'u_0_15')]")).click();
//		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_15')]")).click();
		
		//By Using Text() method for links
//		driver.findElement(By.xpath("//a[contains(text(),'Forgotten account?')]")).click();
		
		//By Using DOT method for links
		driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]")).click();
		
		
		
		
		
	}

}
