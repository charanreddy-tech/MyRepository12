package parameter_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Class 
{
	public static WebDriver driver;
	
	@Parameters({"Browser"})
	@Test(priority=0)
	public void Application(String url) 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@Parameters({"FB_username_id","FB_password_id","FB_username","FB_password"})
	@Test(priority=1)
	public void FB_login(String uid_id,String pwd_id,String uid,String pwd) 
	{
		
		driver.findElement(By.id(uid_id)).sendKeys(uid);
		driver.findElement(By.id(pwd_id)).sendKeys(pwd);
		
	}

}
