package switchcommands_package;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itrator_window_Class {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Click on Check PNR Status link
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		
		//Click on Cancel trains tickets link
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Cancel trains tickets']")).click();
		
		//Create object for Allwindows
		Set<String>allwindows=driver.getWindowHandles();
		
		//How many windows are present in current Browser
		int windowscount=allwindows.size();
		System.out.println("WindowsCount:==="+windowscount);
		
		//Create Object for Iterator
		Iterator<String>itr=allwindows.iterator();
		
		//with out using loops
		String mainwindow=itr.next();
		String cancelwindow=itr.next();
		String pnrwindow=itr.next();
		
		//How to switch to one window to Another 
		//Main window
		driver.switchTo().window(mainwindow);
		System.out.println("MainWindowTitle:-----"+driver.getTitle());
		
		//pnr window
		driver.switchTo().window(pnrwindow);
		System.out.println("PNRWindowTitle:==="+driver.getTitle());
		
		//Cancel Window 
		driver.switchTo().window(cancelwindow);
		System.out.println("CancelWindowTitle:==="+driver.getTitle());
		
		//Switch to PNR window
		driver.switchTo().window(pnrwindow);
		
		driver.findElement(By.id("pnr")).sendKeys("123456789012");
		driver.findElement(By.id("get_status_button")).click();
		
		//Switch to main window
		driver.switchTo().window(mainwindow);
		
		
		
				
		
		
		
		
		
		
		

	}

}
