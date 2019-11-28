package properties_package;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties_Write {

	public static void main(String[] args) 
	{
	
		 try {
			 
			   FileOutputStream fo=new FileOutputStream("logfiles\\Outputdata13.properties");
			   
			   //Create Object for Properties
			   Properties obj=new Properties();
			   
			   //How to write the data into the Properties in Runtime
			   obj.setProperty("Username","charan");
			   obj.setProperty("Password","charan@1233");
			   //Create connection for store
			   obj.store(fo, "FBLogin_Inputdata");
			   
			   
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
