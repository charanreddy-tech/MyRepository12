package modular_package;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Repo_Class 
{
	
	public static WebDriver driver;
	
	public static void HDFC_Application() 
	{
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get(Inputdata_class.HDFC_App_URL);
		driver.manage().window().maximize();
	}
	
	public static void HDFC_Cards() 
	{
		driver.findElement(Locators_class.HDFC_Fname_xpath).sendKeys(Inputdata_class.HDFC_Fname);
		driver.findElement(Locators_class.HDFC_Rbutton_css).click();
		driver.findElement(Locators_class.HDFC_DOB_name).click();
		new  Select(driver.findElement(Locators_class.HDFC_Month_class)).selectByVisibleText(Inputdata_class.HDFC_month);
		new Select(driver.findElement(Locators_class.HDFC_Year_class)).selectByVisibleText(Inputdata_class.HDFC_year);
		driver.findElement(Locators_class.HDFC_day_linktext).click();
		driver.findElement(Locators_class.HDFC_Mobile_id).sendKeys(Inputdata_class.HDFC_Mobile);

	}
	
	public static void ALert() 
	{
		driver.switchTo().alert().accept();
	}
	
	public static void CaptureScreenShot(String imgaename) 
	{
		try {
			
			 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src, new File("screens\\"+imgaename+".png"));
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
