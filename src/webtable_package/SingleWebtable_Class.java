package webtable_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWebtable_Class {

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		//Target the Table
		WebElement  tableid=driver.findElement(By.id("dvBseTopGain"));
		
		//How rows are Present in Current Table
		List<WebElement>rows=tableid.findElements(By.tagName("tr"));
		
		WebElement singlerow=rows.get(7);
		
		List<WebElement>col=singlerow.findElements( By.tagName("td"));
		WebElement singlecell=col.get(0);
		
		String celldata=singlecell.getText();
		System.out.println(celldata);
		

	}

}
