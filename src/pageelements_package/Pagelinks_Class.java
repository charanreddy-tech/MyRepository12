package pageelements_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagelinks_Class {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//How many links are present in Current page 
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		//Count the Links are present in Current page 
		int linkscount=alllinks.size();
		System.out.println("AlllinksCount:===="+linkscount);
		
		//with out using loops
//		String linkname=alllinks.get(26).getText();
//		System.out.println("LinkName:==="+linkname);
//		driver.findElement(By.linkText(linkname)).click();
		
		//By using loops
		for (int i = 0; i < linkscount; i++)
		{
			String linknames=alllinks.get(i).getText();
			System.out.println(linknames);
			
			
		}
		
		
		
				
		

	}

}
