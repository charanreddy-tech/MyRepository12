package webtable_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_class {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Target the Table
		WebElement  tableid=driver.findElement(By.id("dvBseTopGain"));
		
		//How many rows are present in Current Table
		List<WebElement>rows=tableid.findElements(By.tagName("tr"));
		//Count rows
		int rowscount=rows.size();
		System.out.println("RowsCount:=="+rowscount);
		
		for (WebElement eachrow : rows) 
		{
			
			List<WebElement>col=eachrow.findElements(By.tagName("td"));
			
			for (WebElement eachcell: col) 
			{
				
				String celldata=eachcell.getText();
				System.out.println(celldata);
				
			}
			
		}
		
		

	}

}
