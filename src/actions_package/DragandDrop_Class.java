package actions_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Class {

	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Click on Droppable
		driver.findElement(By.linkText("Droppable")).click();
		
		//Frames
		driver.switchTo().frame(0);
		
		//Target the Drag
		WebElement  src=driver.findElement(By.xpath("//div[contains(.,'Drag me to my target')]"));
		
		//Target the Drop
		WebElement dsc=driver.findElement(By.xpath("//div[contains(.,'Drop here')]"));
		
		//Create Object for Actions
		Actions obj=new Actions(driver);
//		obj.clickAndHold(src).moveToElement(dsc).release(src).build().perform();
		
		//Another method for Drag and Drop
		obj.dragAndDrop(src, dsc).build().perform();
		
		
		

	}

}
