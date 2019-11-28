package stringcompare_package;

public class Stringcompare_Class {

	public static void main(String[] args) 
	{
	
		
		//Equals 
		
		String act_value="charan";
		String exp_value="charan";
		
		//!--->Not equals
		
		if (act_value.equals(exp_value)) 
		{
			
			System.out.println("Value is Present");
			
		} else {
			
			System.out.println("Value is Not Present");

		}
		
		
		//Equals ignore case
		
		String act_value1="reddy";
		String exp_value1="Reddy";
		
		
		if (act_value1.equalsIgnoreCase(exp_value1))
		{
			System.out.println("Value is Present");
			
		} else {
			
			System.out.println("Value is not Present");

		}
		
		
		//Contains
		
		String act_value2="saicharan";
		String exp_value2="ch";
		
		if (act_value2.contains(exp_value2)) 
		{
			
			System.out.println("Value is Present");
			
		} else {
			
			System.out.println("Value is Not Present");

		}

	}

}
