package keyboard_package;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class Keyboard_class {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
	
		
		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Create Object for keyboard
		Keyboard kwy=((HasInputDevices)driver).getKeyboard();
		kwy.sendKeys("charan");
		
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys("Reddy");
		
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys("7890224241");
		
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys("charan@1234");
		
		kwy.sendKeys(Keys.TAB);
//		kwy.sendKeys(Keys.ARROW_DOWN);
		kwy.sendKeys("15");
		
		
		kwy.sendKeys(Keys.TAB);
//		kwy.sendKeys(Keys.ARROW_DOWN);
		kwy.sendKeys("Dec");
		
		kwy.sendKeys(Keys.TAB);
//		kwy.sendKeys(Keys.ARROW_DOWN);
		kwy.sendKeys("2001");
		
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.SPACE);
		
		
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.TAB);
		kwy.sendKeys(Keys.ENTER);
		
		
		
		
		
		
		
		
		

	}

}
