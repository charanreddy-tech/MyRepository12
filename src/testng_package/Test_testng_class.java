package testng_package;

import org.testng.annotations.Test;

public class Test_testng_class
{
	
	@Test(priority=0,enabled=false)
	public void ax() 
	{
		System.out.println("1st testcase is pass:--ax");
	}
	
	
	@Test(priority=1,enabled=false)
	public void ab() 
	{
		System.out.println("2nd testcase is pass:--ab");
	}
	
	
	
	@Test(priority=2)
	public void al() 
	{
		System.out.println("3rd testcase is pass:--al");
	}
	
	
	
	
	@Test(priority=3,enabled=false)
	public void az() 
	{
		System.out.println("4th testcase is pass:--az");
	}
	
	
	
	@Test(priority=4)
	public void aa() 
	{
		System.out.println("5th testcase is pass:--aa");
	}
	
	
	
	@Test(priority=5)
	public void au() 
	{
		System.out.println("6th testcase is pass:--au");
	}
	

}
