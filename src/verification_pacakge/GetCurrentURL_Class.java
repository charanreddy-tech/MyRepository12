package verification_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentURL_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		//GetCurrent URL
		
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		
		String exp_url="https://www.facebook.com/r.php";
		
		
		if (act_url.equals(exp_url)) 
		{
			driver.findElement(By.id("u_0_n")).sendKeys("charan");
			
			System.out.println("Current URL is Present");
			
		} else {
			
			System.out.println("Current URL is Not Present");

		}
		
		
		
	}

}
