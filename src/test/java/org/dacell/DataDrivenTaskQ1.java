package org.dacell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTaskQ1 {
public static void main(String[] args) throws IOException {
	
	File f = new File("C:\\Users\\jeyam\\OneDrive\\Desktop\\Datas1.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("sheet1");
	
	Row row2 = sheet.getRow(1);
	
	//DataDriven TaskQ1 getting total cell count
	for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
		int physicalNumberOfCells = row2.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);
	}
		
	
	//DataDriven Q1 getting Total row count
	int row = sheet.getPhysicalNumberOfRows();
	System.out.println(row);
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
