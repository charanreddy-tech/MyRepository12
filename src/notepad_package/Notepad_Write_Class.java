package notepad_package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Notepad_Write_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			 File fo=new File("logfiles\\outputdata12.txt");
			 //Create Connection for Filewriter
			 FileWriter fw=new FileWriter(fo);
			 //Create Connection for Bufferewriter
			 BufferedWriter bw=new BufferedWriter(fw);
			 
			 //How to write the data into notepad in Runtime'
			 bw.write("http://www.gmail.com");
			 bw.newLine();
			 
			 bw.write("charan");
			 
			 
			 //you can save the file in runtime
			 bw.close();
			 
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
