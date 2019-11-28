package verification_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute_Class {

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
		
		//GertAttribute
		
		//Forgotten account
		String at=forgot.getAttribute("href");
		System.out.println(at);
		
		//FirstName
		String at1=Fname.getAttribute("name");
		System.out.println(at1);
		
		String at2=Fname.getAttribute("class");
		System.out.println(at2);
		
		//Signup
		
		String at3=sign.getAttribute("type");
		System.out.println(at3);
		
		String at4=sign.getAttribute("id");
		System.out.println(at4);
		
	}

}
