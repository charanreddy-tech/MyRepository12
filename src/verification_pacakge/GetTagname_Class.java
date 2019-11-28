package verification_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagname_Class {

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
		
		//GetTagname
		
		String  tag=forgot.getTagName();
		System.out.println("Tagname for Forgotten Account:=="+tag);
		
		String tag1=Fname.getTagName();
		System.out.println("Tagname for FirstName:==="+tag1);
		
		String tag2=sign.getTagName();
		System.out.println("Tagname for Signup:==="+tag2);
		
		

	}

}
