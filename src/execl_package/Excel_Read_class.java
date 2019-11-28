package execl_package;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read_class {

	public static void main(String[] args)
	{
	
		try {
			
			//How to Create Connection from Selenium to Excel sheet
			FileInputStream fi=new FileInputStream("Testdata\\Excel_inputdata.xls");
			//Create Connection for workbook 
			Workbook wbook=Workbook.getWorkbook(fi);
			//Crate Connection for sheet
			Sheet wsht=wbook.getSheet("URL");
			
			//How to read the data from excel sheet in Runtime
			String app_url=wsht.getCell(0, 1).getContents();
			System.out.println(app_url);
			
			//Application
			System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get(app_url);
			driver.manage().window().maximize();
			
			//Another sheet
			Sheet wsht1=wbook.getSheet(1);
			
			//How many rows are present in Current excel sheet
		    int rc=wsht1.getRows();
		    System.out.println(rc);
		    
		    //Loops
		    for (int i = 1; i < rc; i++) 
		    {
		    	
		    	String fn=wsht1.getCell(0,i).getContents();
		    	String ln=wsht1.getCell(1,i).getContents();
		    	String mob=wsht1.getCell(2,i).getContents();
		    	String pwd=wsht1.getCell(3,i).getContents();
		    	String da=wsht1.getCell(4,i).getContents();
		    	String mon=wsht1.getCell(5,i).getContents();
		    	String yer=wsht1.getCell(6,i).getContents();
		    	
		    	//FirstName
		    	driver.findElement(By.id("u_0_m")).clear();
		    	driver.findElement(By.id("u_0_m")).sendKeys(fn);
		    	//Lastname
		    	driver.findElement(By.cssSelector("#u_0_o")).clear();
		    	driver.findElement(By.cssSelector("#u_0_o")).sendKeys(ln);
		    	
		    	//Mobile
		    	driver.findElement(By.id("u_0_r")).clear();
		    	driver.findElement(By.id("u_0_r")).sendKeys(mob);
		    	
		    	//Password
		    	driver.findElement(By.xpath("//input[@id='u_0_w']")).clear();
		    	driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys(pwd);
		    	
		    	new Select(driver.findElement(By.id("day"))).selectByVisibleText(da);
		    	new Select(driver.findElement(By.id("month"))).selectByVisibleText(mon);
		    	new Select(driver.findElement(By.id("year"))).selectByVisibleText(yer);
		    	
		    	
				
			}
		    
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
