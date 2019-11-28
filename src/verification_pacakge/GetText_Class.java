package verification_pacakge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetText_Class {

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
		
		//GetText
		
		//Forgotten account
		String forgottxt=forgot.getText();
		System.out.println(forgottxt);
		
		//FirstName
		String Fnametxt=Fname.getText();
		System.out.println(Fnametxt);
		
		//Sign up
		String signuptxt=sign.getText();
		System.out.println(signuptxt);
		
		
		//Click on Signup button
		sign.click();
		//Target the Error 
		WebElement error=driver.findElement(By.cssSelector("div._5v-0>div"));
		
		String errortxt=error.getText();
		System.out.println(errortxt);
		
		
		
		

	}

}
