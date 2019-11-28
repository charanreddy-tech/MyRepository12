package junit_package;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Test 
{
	
 public static WebDriver driver;
	@Test
	public void FB1() 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void FB2() 
	{
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("charan");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("systems");
		driver.findElement(By.id("u_0_r")).sendKeys("charan@`1233");
		
	}
	
	@Test
	public void FB3() 
	{
		new Select(driver.findElement(By.id("day"))).selectByIndex(24);
		new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("10");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");

	}

}
