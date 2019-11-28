package navigate_package;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		//Another method to Enter valid URL in Runtime
		driver.navigate().to("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//Click on Forgotten account
		driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]")).click();
		
		//Backward
		driver.navigate().back();
		
		//Forward
		driver.navigate().forward();
		
		//Refresh
		driver.navigate().refresh();

	}

}
