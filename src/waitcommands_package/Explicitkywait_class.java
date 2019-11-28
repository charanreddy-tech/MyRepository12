package waitcommands_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitkywait_class {

	public static void main(String[] args) 
	{
		

		System.setProperty("webdriver.chrome.driver","E:\\Selenium_workspace_4_30AM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		//Explicitly wait
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		driver.findElement(By.id("u_0_m")).sendKeys("charan");
		
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		driver.findElement(By.id("u_0_o")).sendKeys("systems");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_r")));
		driver.findElement(By.id("u_0_r")).sendKeys("7890224241");
		
		

	}

}
