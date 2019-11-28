package browser_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_Class {

	public static void main(String[] args) 
	{
		
		//How to open Chrome Browser in Runtime
		System.setProperty("webdriver.chrome.driver","Browsers\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		
		//How to Enter valid URL in Runtime Browser
		driver.get("http://www.gmail.com");
		
		//How to  maximize the Browser in Runtime
		driver.manage().window().maximize();
		
		//how to Close the Browser in Runtiume
		driver.close();
		
	}

}
