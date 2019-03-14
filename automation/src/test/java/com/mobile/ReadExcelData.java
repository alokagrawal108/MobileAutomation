package com.mobile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	
	XSSFSheet sheet;
	XSSFRow Row;
	XSSFCell Cell;
	@Test
	public void readExcelData() throws IOException {
		
		
	File openFile= new File("C:\\Users\\Alok Agrawal\\git\\repository2\\automation\\TestData\\TestData.xlsx");
	FileInputStream ReadFile = new FileInputStream(openFile);
	XSSFWorkbook Wbook = new XSSFWorkbook(ReadFile);
	sheet = Wbook.getSheet("UserCredential");
	
	int rowCount = sheet.getLastRowNum();
	
	System.out.println(" Total Rows available in Sheet =  " + rowCount);
	
	for (int i=1; i<=rowCount;i++)
		
	{
		
	    Row = sheet.getRow(i);
	    
		int cellCount = Row.getLastCellNum();
		
		String UserName = Row.getCell(0).getStringCellValue();
		String Password = Row.getCell(1).getStringCellValue();
		
		System.out.println (UserName + "  ||  " + Password );
		
		//System.out.println(cellCount);
		
		
		
		/*for (int j=0;j<cellCount;j++)
		{
		
	//int colCount = sheet.getRow(rownum).
	
	String Username = Row.getCell(j).getStringCellValue();
	
	System.out.println(Username);
		}
		*/
	}
	
	}
	
}
