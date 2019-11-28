package validation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected_Class {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		//Target the Oneway
		WebElement oneway=driver.findElement(By.cssSelector("#OneWay"));
		
		if (oneway.isSelected()) 
		{
			System.out.println("Oneway is Selected");
			
		} else {
			
			System.out.println("Oneway is Not Selected");

		}
		
		
		//Click on Roundtrip
		driver.findElement(By.id("RoundTrip")).click();
		
		if (oneway.isSelected()) 
		{
			System.out.println("Oneway is Selected");
			
		} else {
			
			System.out.println("Oneway is Not Selected");

		}
		
		
	}

}
