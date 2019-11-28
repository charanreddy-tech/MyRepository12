package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip_DefaultCssSelector_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		//Some times Object have both ID and ClassName
		driver.findElement(By.cssSelector("input#FromTag.keyValue")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.cssSelector("input#ToTag.keyValue")).sendKeys("London, GB - All airports (LON)");
		
		//SOme times Object have only ID
		driver.findElement(By.cssSelector("#DepartDate")).click();
		///SOme times Object have only ClassName
		driver.findElement(By.cssSelector(".nextMonth ")).click();
		
		//BY using linktext locator for links
		driver.findElement(By.linkText("13")).click();
		
		//Single Properties
	    new Select(driver.findElement(By.cssSelector("select[tabindex='7']"))).selectByIndex(3);
		new Select(driver.findElement(By.cssSelector("select[name='childs']"))).selectByValue("2");
		
		//Double Properties
		new Select(driver.findElement(By.cssSelector("select[name='infants'][size='1']"))).selectByVisibleText("1");
		driver.findElement(By.cssSelector("input[value='Search flights'][title='Search flights']")).click();
		
		

	}

}
