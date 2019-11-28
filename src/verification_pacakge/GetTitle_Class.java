package verification_pacakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle_Class {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		String exp_title="Facebook – log in or sign up";
		
		
		if (act_title.equals(exp_title)) 
		{
			
			System.out.println("Title  is  Present");
			
		} else {
			
			System.out.println("Title is Not Prersent");

		}
		

	}

}
