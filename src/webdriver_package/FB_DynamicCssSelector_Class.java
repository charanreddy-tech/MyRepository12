package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_DynamicCssSelector_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Some times Starting chars will change in Runtime("^")
		driver.findElement(By.cssSelector("input[aria-label^='First name']")).sendKeys("sai charan");
		driver.findElement(By.cssSelector("input[name^='lastname']")).sendKeys("reddy");
		
		//Some times Ending chars will change in Runtime("$")
		driver.findElement(By.cssSelector("input[name$='reg_email__']")).sendKeys("7890224241");
		driver.findElement(By.cssSelector("input[id$='u_0_y']")).sendKeys("charan@1234");
		
		//By Using Contains("*")
		new Select(driver.findElement(By.cssSelector("select[title*='Da']"))).selectByIndex(26);
		new Select(driver.findElement(By.cssSelector("select[name*='birthday_month']"))).selectByValue("11");
		new Select(driver.findElement(By.cssSelector("select[id*='year']"))).selectByVisibleText("2001");

		//Parent to child
		driver.findElement(By.cssSelector("span._5k_2>input")).click();
		driver.findElement(By.cssSelector("div._1lch>button")).click();
		
		//nth- child
//		driver.findElement(By.cssSelector("div#pageFooter>div>ul>li:nth-child(8)>a")).click();
		
		//nth-of-type
		driver.findElement(By.cssSelector("div#pageFooter>div>ul>li:nth-of-type(11)>a")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
