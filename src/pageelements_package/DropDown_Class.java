package pageelements_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Class {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Target the DropDown
		Select drop=new Select(driver.findElement(By.xpath("//*[contains(@id,'month')]")));
		
		///How many objects are present in Current DropDown
		List<WebElement>allobjects=drop.getOptions();
		//Count the values are present in Current DropDown
		int valuescount=allobjects.size();
		System.out.println("ValuesCount:==="+valuescount);
		
		//with out using loops
//		String valuename=allobjects.get(12).getText();
//		System.out.println("ValuesName:==="+valuename);
//		drop.selectByVisibleText(valuename);
		
		//By Using loops
		for (int i = 0; i < valuescount; i++)
		{
			String valuenames=allobjects.get(i).getText();
			System.out.println(valuenames);
			drop.selectByVisibleText(valuenames);
			
		}
		
		
		

	}

}
