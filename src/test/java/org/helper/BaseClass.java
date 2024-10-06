package org.helper;
import java.awt.AWTException; 

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	public static Select s;
	public static Robot r;
	
	
	public static void browserlaunch() {
		
		 driver=new ChromeDriver();
		
	}
	
		public static void launchUrl(String url) {
			driver.get(url);

		}
		
		
		public static void maxWind() {
			
			driver.manage().window().maximize();

		}

		public static void refreshPage() {
			driver.navigate().refresh();

		}
		
		public static void key(WebElement webref,String value) {
			
        webref.sendKeys(value);
		}
		
		public static void cli(WebElement webref) {
			webref.click();

		}
		
		public static void close() {
			driver.close();

		}
		
		public static void select(WebElement webref,String sendkey) {
				 s=new Select(webref);
			
			s.selectByValue(sendkey);
			s.selectByValue(sendkey);
			
		}
		
		
		public static void robo() throws AWTException {
			 r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);

		}
		
		
		public static void snap() throws IOException {
			TakesScreenshot ta=(TakesScreenshot) driver;
			
			File tem = ta.getScreenshotAs(OutputType.FILE);
			
			File per=new File("C:\\Users\\durairaj\\eclipse-workspace\\MavenConfiguration\\target\\auto.png");
			
			FileUtils.copyFile(tem, per);
		

		
		}	
		
		
		public static String datadrive(String work, String sheet, int ro,int cel) throws IOException {
			
			File f=new File("C:\\\\Users\\\\durairaj\\\\eclipse-workspace\\\\MavenConfiguration\\\\drivenexcel\\\\"+work+".xlsx");
			FileInputStream fi=new FileInputStream(f);
				
			Workbook w=new XSSFWorkbook(fi);
			
			Sheet s = w.getSheet(sheet);
							
				Row r = s.getRow(ro);
					
					Cell c = r.getCell(cel);
					int Type = c.getCellType();
					String value= "";
				if (Type==1) {
					
					 value = c.getStringCellValue();
//					System.out.println(value);
//					
				}
					else if (DateUtil.isCellDateFormatted(c)) {
						Date dat = c.getDateCellValue();
						System.out.println(dat);
					SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
					 value = sim.format(dat);
					
//						System.out.println(value);
//					
				}	
					else {
						double dob = c.getNumericCellValue();
						
						long l=(long)dob;
//					 value = String.valueOf(l);	
						
						System.out.println(value);
						
					
					}
			
				return value;
					
			
				
			
			

		}
		
		
		
		
		
		
		
		
}
