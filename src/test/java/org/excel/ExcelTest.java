package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTest {
	public static  void main(String[] args) throws IOException {
		//1. mentioning file location
		File f= new File("C:\\Users\\Admin\\eclipse-workspace\\MavenTask\\Book1.xlsx");
		//2. read the file
		FileInputStream fin= new FileInputStream(f);
		//type of work book
		Workbook w= new XSSFWorkbook(fin);
		//to get the sheet
		Sheet s = w.getSheet("info");
		
		//to get the physical number of rows
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			//to get physical number of cells
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			int cellType = c.getCellType();
			if (cellType==1) {
				String value1 = c.getStringCellValue();
				System.out.println(value1);
				}
			else if (cellType==0) {
if (DateUtil.isCellDateFormatted(c)) {
	Date d = c.getDateCellValue();
	SimpleDateFormat simple= new SimpleDateFormat("dd,MMMM,yyyy");
	String value1 = simple.format(d);
System.out.println(value1);}		
else {
double phone = c.getNumericCellValue();
long l= (long)phone;
 String value1 = String.valueOf(l);
 System.out.println(value1);
}

			}
			
		}
		
		}

		
		
	}

}
