package excel_poi_package;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel_Read_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			
			//How to Create Connection from excel sheet to selenium
			FileInputStream fi=new FileInputStream("Testdata\\Excel_inputdata12.xlsx");
			//Create  connection for xssfworkbook
			XSSFWorkbook wbook=new XSSFWorkbook(fi);
			//Create Connection for sheet
			XSSFSheet wsht=wbook.getSheet("URL");
			//how to read the data from excel sheet in Runtime
			String app_url=wsht.getRow(1).getCell(0).getStringCellValue();
			System.out.println(app_url);
			
			//Application
		    System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get(app_url);
		    driver.manage().window().maximize();
		    
		    //Another sheet
		   XSSFSheet wsht1=wbook.getSheetAt(1);
		   
		   //How many rows are present in current excel sheet
		   int rc=wsht1.getLastRowNum();
		   System.out.println("RowCount:==="+rc);
		   
		   
		   //For loops
		   for (int i = 0; i <=rc; i++)
		   {
			   
			   String fn=wsht1.getRow(i).getCell(0).getStringCellValue();
			   String ln=wsht1.getRow(i).getCell(1).getStringCellValue();
			   String mob=wsht1.getRow(i).getCell(2).getStringCellValue();
			   String pwd=wsht1.getRow(i).getCell(3).getStringCellValue();
			   String da=wsht1.getRow(i).getCell(4).getStringCellValue();
			   String mon=wsht1.getRow(i).getCell(5).getStringCellValue();
			   String yer=wsht1.getRow(i).getCell(6).getStringCellValue();
			   
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
			// TODO: handle exception
		}

	}

}
