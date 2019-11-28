package dataprovider_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Class 
{
	
	public static WebDriver driver;
	
	@Test(dataProvider="getdata")
	public void FB_login(String uid,String pwd) 
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(uid);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
	}
	
	
	@DataProvider
	public static Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
		
		//1st row
		data[0][0]="charan1";
		data[0][1]="charan@123";
		
		//2nd row
		data[1][0]="charan2";
		data[1][1]="chraan@1234";
		
		//3rd row
		data[2][0]="charan3";
		data[2][1]="charan@12345";
		
	
		return data;
	}
	
	@BeforeClass
	public void FB_Application() 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
	}

}
