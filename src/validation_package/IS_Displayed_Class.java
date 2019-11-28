package validation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IS_Displayed_Class {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Target the Return date
		WebElement  returndate=driver.findElement(By.id("ReturnDate"));
		
		if (returndate.isDisplayed()) 
		{
			System.out.println("Return date is Displayed");
			
		} else {
			
			System.out.println("Return date is Not Displayed");

		}
		
		
		//Click on Round trip
		driver.findElement(By.id("RoundTrip")).click();
		
		if (returndate.isDisplayed()) 
		{
			System.out.println("Return date is Displayed");
			
		} else {
			
			System.out.println("Return date is Not Displayed");

		}

	}

}
