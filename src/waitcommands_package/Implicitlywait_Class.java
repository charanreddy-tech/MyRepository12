package waitcommands_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicitlywait_Class {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://epass.apcfss.in/");
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Page Load time out
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//SetScript TimeOut
		driver.manage().timeouts().setScriptTimeout(20,TimeUnit.SECONDS);
		
		
		//Switch to Frame
		driver.switchTo().frame("menuFrame");
		
		//Click on Fee
		driver.findElement(By.xpath("//a[contains(.,'Fee Structure')]")).click();
		
		//How to Switch to one Frame to Another Frame
		driver.switchTo().defaultContent();
		
		//Frames
		driver.switchTo().frame("bodyFrame");
		
		new Select(driver.findElement(By.id("univ"))).selectByIndex(8);
		new Select(driver.findElement(By.name("coll_course"))).selectByIndex(5);
		
		
	

	}

}
