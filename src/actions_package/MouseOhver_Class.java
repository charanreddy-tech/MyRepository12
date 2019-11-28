package actions_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOhver_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
       //Implicitly wait
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  //Close popupCloseButton
	  driver.findElement(By.className("popupCloseButton")).click();
	  
	   //Target the pay
	  WebElement pay=driver.findElement(By.xpath("//a[@title='Pay']"));
		
		//Create Object for Actions
		Actions obj=new Actions(driver);
		obj.moveToElement(pay).build().perform();
		
		//Click on Credit Cards link
		driver.findElement(By.xpath("//span[@ng-click='accordionBehaviour(\"/personal/pay/cards/credit-cards\")']")).click();
		
		
		
		
		
				
		
	}

}
