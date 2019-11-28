package verification_pacakge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetPageSource_Class {

	public static void main(String[] args)
{
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		String act_pagesource=driver.getPageSource();
		
		String exp_pagesource="Facebook";
		
		if (act_pagesource.contains(exp_pagesource)) 
		{
			
			System.out.println("Page source is Present");
			
		} else {
			
			System.out.println("Page Source is Not Present");

		}

	}

}
