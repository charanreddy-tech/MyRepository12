package switchcommands_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Class {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://secure.icicidirect.com/IDirectTrading/customer/customeroverview.aspx?filename=CorpAcc");
		driver.manage().window().maximize();
		
		//Click on Submit
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#btnSubmit")).click();
		
		//How to handle the Alert text in runtime
		String alttxt=driver.switchTo().alert().getText();
		System.out.println(alttxt);
		
		//How to handle the Alert in Runtime
		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		//Another method to handle Alert in Runtime
		driver.switchTo().alert().dismiss();
		
		

	}

}
