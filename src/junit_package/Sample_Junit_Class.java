package junit_package;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample_Junit_Class {

	@Test
	public void test() 
	{
		System.out.println("1st TestCase is Pass:--@test");
	}
	
	@Before
	public void Before() 
	{
		System.out.println("Before test is pass:--@before");
	}
	
	@After
	public void After() 
	{
		System.out.println("After test is pass:--@after");
	}
	
	
	@BeforeClass
	public static void BeforeClass() 
	{
		System.out.println("Before class is pass:---@Before Class");
	}
	
	@AfterClass
	public static void AfterClass() 
	{
		System.out.println("After class is pass:---@AfterClass");
	}
	
	@Test
	public void test1() 
	{
		System.out.println("2nd test is pass:---@Test");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("3rd test is pass:---@test");
		
	}
	

}
