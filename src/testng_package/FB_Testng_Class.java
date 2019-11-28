package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FB_Testng_Class
{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void FB_Application() 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FB_textbox() 
	{
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("charan");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("systems");
		driver.findElement(By.id("u_0_r")).sendKeys("charan@`1233");
	}
	
	
	@AfterClass(enabled=false)
	public void FB_dropdown() 
	{
		new Select(driver.findElement(By.id("day"))).selectByIndex(24);
		new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("10");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
	}

}
