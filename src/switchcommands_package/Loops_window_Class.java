package switchcommands_package;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Loops_window_Class {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//How many windows are present  in the Current Browser
		Set<String>allwindows=driver.getWindowHandles();
		
		//windows count
		int windowscount=allwindows.size();
		System.out.println(windowscount);
		
		//By using loops
		for (String  eachwindow : allwindows)
		{
			
			driver.switchTo().window(eachwindow);
			String pagetitle=driver.getTitle();
			System.out.println("Each PageTitle:===="+pagetitle);
			
			
//			if (pagetitle.equals("Reliance Industries Limited")) 
//			{
//				driver.close();
//				
//			}
			
		}
		driver.close();
//		driver.quit();
		
		
		

	}

}
