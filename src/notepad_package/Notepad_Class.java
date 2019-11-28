package notepad_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Notepad_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			
			  //How to Create Connection from notepad to selenium
			  File fi=new  File("Testdata\\Inputdata12.txt");
			  //Create Connection for FileReader
			  FileReader fr=new FileReader(fi);
			  //Create Connection for Buffered reader
			  BufferedReader br=new BufferedReader(fr);
			  
			  //with out using loops
			  //How to Read the data  from the notepad
//			  String sread=br.readLine();
//			  System.out.println(sread);
//			  
//			  String sread1=br.readLine();
//			  System.out.println(sread1);
//			  
//			  String sread2=br.readLine();
//			  System.out.println(sread2);
//			  
//			  String sread3=br.readLine();
//			  System.out.println(sread3);
			  
//			   By Using loops
			  String sread;
			  while ((sread=br.readLine())!=null) 
			  {
				  
				  System.out.println(sread);
				
			}
			  
			  
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
