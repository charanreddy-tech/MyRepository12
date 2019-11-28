package webelement_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement_Class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		String app_url="https://www.facebook.com/r.php";
		driver.get(app_url);
		
		driver.manage().window().maximize();
		
		//FirstName
		String fname_xpath="//input[contains(@id,'u_0_n')]";
		String fname="charan";
		WebElement  ele=driver.findElement(By.xpath(fname_xpath));
		ele.clear();
		ele.sendKeys(fname);
		
		//LastName
		   String lname_id="u_0_p";
		   String lname="reddy";
		   WebElement ele1=driver.findElement(By.id(lname_id));
		   ele1.clear();
		   ele1.sendKeys(lname);
		   
		   //Mobile
		   String mobile_name="reg_email__";
		   String mobile="7890224241";
		   WebElement ele2=driver.findElement(By.name(mobile_name));
		   ele2.clear();
		   ele2.sendKeys(mobile);
		   
		   //Password
		   String password_css="#u_0_z";
		   String pwd="charan@1234";
		   WebElement ele3=driver.findElement(By.cssSelector(password_css));
		   ele3.clear();
		   ele3.sendKeys(pwd);
		   
		   
		   //DropDown
		   //Day
		   String FB_day_id="day";
		   int da=24;
		   Select drop=new Select(driver.findElement(By.id(FB_day_id)));
		   drop.selectByIndex(da);
		   
		   //month
		   String FB_month_name="birthday_month";
		   String month="10";
		   Select drop1=new Select(driver.findElement(By.name(FB_month_name)));
		   drop1.selectByValue(month);
		   
		   //Year
		   String FB_year_css="select[title='Year']";
		   String yer="2001";
		   Select drop2=new Select(driver.findElement(By.cssSelector(FB_year_css)));
		   drop2.selectByVisibleText(yer);
		   
		   //Normal Button
		   String FB_Nbutton_name="websubmit";
		   WebElement ele4=driver.findElement(By.name(FB_Nbutton_name));
		   ele4.click();
		   
		   
		   
		   
		   
		   
		
		
		
		

	}

}
