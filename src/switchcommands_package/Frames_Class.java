package switchcommands_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Class {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		
		//Switch to Frame
		driver.switchTo().frame("menuFrame");
		
		//Click on Fee Structure
		driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]")).click();
		
		
		//How to Switch to one Frame to Another frame 
		driver.switchTo().defaultContent();
		
		//Frames
		driver.switchTo().frame("bodyFrame");
		new Select(driver.findElement(By.id("univ"))).selectByIndex(4);
		
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("coll_course"))).selectByValue("3130");
		
		Thread.sleep(5000);
		new Select(driver.findElement(By.cssSelector("#courseYearId"))).selectByVisibleText("3");
		
		new Select(driver.findElement(By.name("ac_year"))).selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@value='Get Report']")).click();
		
		
		
		
		
		
		

	}

}
