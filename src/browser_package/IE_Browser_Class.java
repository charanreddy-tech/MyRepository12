package browser_package;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE_Browser_Class {

	public static void main(String[] args) 
	{
	
		//How to open IE Browser in Runtime
		System.setProperty("webdriver.ie.driver", "Browsers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		//How to enter valid URL in Runtime
		driver.get("http://www.gmail.com");

		//How to  maximize the Browser in Runtime
		driver.manage().window().maximize();
		
		//how to Close the Browser in Runtiume
		driver.close();
	}

}
