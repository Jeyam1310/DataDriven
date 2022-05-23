package org.dacell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTaskQ3 {
public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\jeyam\\OneDrive\\Desktop\\Datas1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("sheet1");

		Row createRow = sheet.createRow(11);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Inserted Value");
		
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
}
}
