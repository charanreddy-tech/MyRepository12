package excel_poi_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			//How to Create Connection from excel sheet to Selenium
			FileInputStream fi=new FileInputStream("Testdata\\Excel_inputdata12.xlsx");
			//Create Connection for xssfwork book
			XSSFWorkbook wbook=new XSSFWorkbook(fi);
			//Create Connection for sheet
			XSSFSheet wsht=wbook.getSheetAt(1);
			
			//How to write the data into excel sheet in Runtime
			wsht.getRow(0).createCell(7).setCellValue("Result");
			wsht.getRow(1).createCell(7).setCellValue("pass");
			wsht.getRow(2).createCell(7).setCellValue("Fail");
			
			wbook.write(new FileOutputStream("logfiles\\poioutfile.xlsx"));
			
			//You can save the file in Runtime
			wbook.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
