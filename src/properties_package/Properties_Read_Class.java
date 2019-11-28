package properties_package;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Properties_Read_Class {

	public static void main(String[] args)
	{
		
		try {
			
			//How to Create the Connection from Properties files to selenium'
			FileInputStream fi=new FileInputStream("Testdata\\inputdata.properties");
			//Create Object for Properties
			Properties obj=new Properties();
			//Create Connection for Load
			obj.load(fi);
			
			//How to Read the data from Properties 
			String url=obj.getProperty("App_url");
			System.out.println(url);
			
			//Application
			System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    
		    //FB_CReation
		    //LOcatots
		    String Fname_css=obj.getProperty("FB_Fname_css");
		    String Lname_id=obj.getProperty("FB_Lname_id");
		    String mobile_xpath=obj.getProperty("FB_Mobile_xpath");
		    String Password_id=obj.getProperty("FB_Password_id");
		    
		    String Day_id=obj.getProperty("FB_Day_id");
		    
//		    InputData
		    String  fn=obj.getProperty("FB_fname");
		    String ln=obj.getProperty("FB_Lname");
		    String mob=obj.getProperty("FB_mobile");
		    String pwd=obj.getProperty("FB_password");
		    String da=obj.getProperty("FB_Day");
		    
		    driver.findElement(By.cssSelector(Fname_css)).sendKeys(fn);
		    driver.findElement(By.id(Lname_id)).sendKeys(ln);
		    driver.findElement(By.xpath(mobile_xpath)).sendKeys(mob);
		    driver.findElement(By.id(Password_id)).sendKeys(pwd);
		    new Select(driver.findElement(By.id(Day_id))).selectByVisibleText(da);
		    
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
