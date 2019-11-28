package execl_package;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Write_Class {

	public static void main(String[] args) 
	{
		try {
			
			
			//How to Create connection from excel sheet to Selenium
			FileOutputStream fo=new FileOutputStream("logfiles\\Outputdata134.xls");
			//Create Connection for writable  workbook
			WritableWorkbook wbook=Workbook.createWorkbook(fo);
			//Create Connection for wriatble sheet
			WritableSheet wsht =wbook.createSheet("Result", 0);
			//How to write the data into excel sheet in Runtime
			Label ab=new Label(0, 0,"Application");
			wsht.addCell(ab);
			
			Label ac=new Label(0, 1, "http://www.gmail.com");
			wsht.addCell(ac);
			
			wbook.write();
			
			//You can save the files in Runtime
			wbook.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
