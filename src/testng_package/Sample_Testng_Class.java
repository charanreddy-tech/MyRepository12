package testng_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample_Testng_Class {
  @Test
  public void f()
  {
	  System.out.println("1st testcase is pass:---@test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before method is pass:----@before method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method is pass:----@After method");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Before class is pass:---@Before class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After class is pass:----@After class");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test is pass:----@Before test");
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After test is pass:----@After test");
	  
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("Before suite is pass:---@Before suite");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("Aftetr suite is pass:----@After suite");
  }
  
  @Test
  public void test() 
  {
	
	  System.out.println("2nd Test case  is pass:-----@Test");
  }
  
  
  @Test
  public void test1() 
  {
	
	  System.out.println("3rd Test case  is pass:-----@Test");
  }


}
