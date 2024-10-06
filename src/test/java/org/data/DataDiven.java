package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class DataDiven {
	public static void main(String[] args) throws IOException {
	;
		File f=new File("C:\\Users\\durairaj\\eclipse-workspace\\MavenConfiguration\\drivenexcel\\data.xlsx");
		FileInputStream fi=new FileInputStream(f);
			
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("login");
		
		
		System.out.println(s.getPhysicalNumberOfRows());
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j <r.getPhysicalNumberOfCells() ; j++) {
				
				Cell c = r.getCell(j);
				int Type = c.getCellType();
				
			if (Type==1) {
				
				String value = c.getStringCellValue();
				System.out.println(value);
				
			}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dat = c.getDateCellValue();
					System.out.println(dat);
				SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
				String value = sim.format(dat);
				
					System.out.println(value);
				
			}	
				else {
					double dob = c.getNumericCellValue();
					
					long l=(long)dob;
				String value = String.valueOf(l);	
					
					System.out.println(value);
					
				}
			
		
			
				
			}	
			
		}
		
		
	}
	
}		
				
				
		
				
				
			
			
			
	

