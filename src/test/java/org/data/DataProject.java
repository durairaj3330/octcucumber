package org.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProject {
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\durairaj\\eclipse-workspace\\MavenConfiguration\\drivenexcel\\newproject.xlsx");
		
				
				Workbook book=new XSSFWorkbook();
		
				
				Sheet sheet = book.createSheet("durairaj");
				
		Row row = sheet.createRow(1);
		Cell cell1 = row.createCell(2);
		Cell cell2 = row.createCell(3);
		
		cell1.setCellValue("durairaj52524");
		cell2.setCellValue("Hema@123");
		
		FileOutputStream file=new FileOutputStream(f);
		 	
		book.write(file);	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
