package junit_package;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_JunitClass 
{
	public static WebDriver driver;

	@BeforeClass
	public static void FB_Application() 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void FB_Textbox() 
	{
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("charan");
		driver.findElement(By.cssSelector("#u_0_o")).sendKeys("systems");
		driver.findElement(By.id("u_0_r")).sendKeys("charan@`1233");
	}
	
	
	@AfterClass
	public static void FB_DropDown() 
	{
		new Select(driver.findElement(By.id("day"))).selectByIndex(24);
		new Select(driver.findElement(By.xpath("//*[@id='month']"))).selectByValue("10");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
		
	}

}
