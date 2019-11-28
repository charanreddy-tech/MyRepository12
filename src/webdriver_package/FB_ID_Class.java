package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_ID_Class {

	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//By Using  ID Locator for Textbox/webedit
		driver.findElement(By.id("u_0_l")).sendKeys("charan");
		driver.findElement(By.id("u_0_n")).sendKeys("reddy");
		driver.findElement(By.id("u_0_q")).sendKeys("7890224241");
		driver.findElement(By.id("u_0_x")).sendKeys("charan@12334");

		//By Using ID Locator for DropDown/Listbox
		
		//Day
		new Select(driver.findElement(By.id("day"))).selectByIndex(12);
		new Select(driver.findElement(By.id("day"))).selectByValue("20");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("23");
		
		//Month
		new Select(driver.findElement(By.id("month"))).selectByIndex(6);
		new Select(driver.findElement(By.id("month"))).selectByValue("10");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Mar");
		
		//year
		new Select(driver.findElement(By.id("year"))).selectByIndex(31);
		new Select(driver.findElement(By.id("year"))).selectByValue("2001");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2006");
		
		//By Using ID Locator for Radio Button
//		driver.findElement(By.id("u_0_9")).click();
		
		//BY using ID Locator for Normal Button/web button
		driver.findElement(By.id("u_0_15")).click();
		
	//By Using linktext locator for links
//		driver.findElement(By.linkText("Forgotten account?")).click();
//		driver.findElement(By.linkText("Facebook Lite")).click();
		
		//BY Using Partial link text locator for links
		driver.findElement(By.partialLinkText("Lite")).click();
		
		
		
		
		
		
		
		
		
	}

}
