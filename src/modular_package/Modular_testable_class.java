package modular_package;

import org.testng.annotations.Test;

public class Modular_testable_class 
{
  @Test(priority=0)
  public void Application()
  {
	  Repo_Class.HDFC_Application1();
	  Repo_Class.CaptureScreenShot("HDFC");
  }
  
  @Test(priority=1)
  public void HDFC_cards() 
  {
	  Repo_Class.HDFC_Cards();
	  Repo_Class.CaptureScreenShot("HDFC_cards");
  }
}
