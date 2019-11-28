package validation_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IS_Enabled_Class {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		//Select My Account
		new Select(driver.findElement(By.id("open_account"))).selectByValue("C");
		//Click on My Account
		driver.findElement(By.xpath("//*[@value='Open my Account']")).click();
		
		//Select my City
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("FML_USR_ADDRSS_CTY_DROP"))).selectByIndex(5);
		
		//Target the state
		WebElement state=driver.findElement(By.id("FML_USR_ADDRSS_STTE_DIS"));
		
		if (state.isEnabled()) 
		{
			
			state.sendKeys("HYDERABAD");
			System.out.println("State is Enabled");
			
		} else {
			
			System.out.println("state is not Enabled");

		}
		
		
		
		//Select my City
				Thread.sleep(3000);
				new Select(driver.findElement(By.name("FML_USR_ADDRSS_CTY_DROP"))).selectByVisibleText("Others");
				

				if (state.isEnabled()) 
				{
					
					state.sendKeys("HYDERABAD");
					System.out.println("State is Enabled");
					
				} else {
					
					System.out.println("state is not Enabled");

				} 
				
	}

}
