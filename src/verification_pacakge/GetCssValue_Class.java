package verification_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCssValue_Class {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Target the Forgotten Account
		WebElement forgot=driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]"));
	
		//Target the FirstName 
		WebElement Fname=driver.findElement(By.id("u_0_m"));
		
		//Target the Signup button
		WebElement sign=driver.findElement(By.name("websubmit"));
		
		//GetCssValue
		
		//Forgotten account
		String css=forgot.getCssValue("font-size");
		System.out.println(css);
		
	   String css1=forgot.getCssValue("color");
	   System.out.println(css1);
	   
	   //Firstname
	   String css2=Fname.getCssValue("font-size");
		System.out.println(css2);
		
		  String css3=Fname.getCssValue("color");
		   System.out.println(css3);
		   
		   //Signup
		   
		   String css4=sign.getCssValue("font-size");
			System.out.println(css4);
			
			  String css5=sign.getCssValue("color");
			   System.out.println(css5);

	}

}
