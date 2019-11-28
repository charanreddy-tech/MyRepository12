package webdriver_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HDFC_Name_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Workspace_11pm\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leads.hdfcbank.com/applications/new_webforms/apply/mobile/Credit-Card_TU.aspx?SourceCode=HNET&Promocode=P4_FlipCoin_AppOnl1_homepage_CC_TU&_ga=2.229590748.196243319.1566434264-1950320065.1566434264");
		driver.manage().window().maximize();
		
		//By Using Name locator for TextBox/webedit
		driver.findElement(By.name("txtName")).sendKeys("sai charan");
		//By Using CssSelector for Rbutton
		driver.findElement(By.cssSelector("label[for='r1s']")).click();
		//By using name locator 
		driver.findElement(By.name("txtDOB")).click();
		//By Using Class name Locator for DropDown
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByIndex(8);
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText("1989");
		
		//By Using linktext locator for links
		driver.findElement(By.linkText("21")).click();
		
		//By Using  name locator for textbox
		driver.findElement(By.name("txtMobile")).sendKeys("7890224241");
		driver.findElement(By.name("txtEmailID")).sendKeys("charan@gmail.com");
		//BY Using name locator for DropDown
		new Select(driver.findElement(By.name("ddlCity"))).selectByVisibleText("HYDERABAD");
		
		//By Using name locator for textbox/webedit
		driver.findElement(By.name("txtPincode")).sendKeys("524001");
		driver.findElement(By.name("txtPancard")).sendKeys("jui789kll");
		//By using name locator for DropDown/listbox
		new Select(driver.findElement(By.name("ddlIncome"))).selectByIndex(5);
		
		//By using name locator for check box
		driver.findElement(By.name("chkAutho")).click();
		
		
		
		
		
	}

}
