package modular_package;

import org.openqa.selenium.By;

public class Locators_class 
{
	
	public static By HDFC_Fname_xpath=By.xpath("//input[@title='Name']");
	public static By HDFC_Rbutton_css=By.cssSelector("label[for='r1s']");
	public static By HDFC_DOB_name=By.name("txtDOB");
	public static By HDFC_Month_class=By.className("ui-datepicker-month");
	public static By HDFC_Year_class=By.xpath("//select[@data-handler='selectYear']");
	public static By HDFC_day_linktext=By.linkText("24");
	public static By HDFC_Mobile_id=By.id("txtMobile");
	
	

}
