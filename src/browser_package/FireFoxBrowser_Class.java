package browser_package;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_Class {

	public static void main(String[] args) 
	{
		
		//How to Open FireFox Browser in Runtime
		System.setProperty("webdriver.gecko.driver","Browsers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		//How to Enter Valid URL in Runtime 
		driver.get("http://www.facebook.com");
		
		//How to maximize the Browser in Runtime
		driver.manage().window().maximize();
		
		//How to close the Browser in Run time 
		driver.close();
		
		

	}

}
