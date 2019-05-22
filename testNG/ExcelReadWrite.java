package testNG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelReadWrite {
	
	
	@SuppressWarnings("unused")
	@Test
	public void Excel() throws IOException{
		
	FileInputStream file=new FileInputStream("C:\\Users\\18327\\Documents\\da.xlsx");
		
	XSSFWorkbook wb=new XSSFWorkbook(file);
	
    XSSFSheet sh=wb.getSheet("Sheet1");
    
    Row rows=null;
    for(int i=0;i<10;i++) {
    sh.createRow(i).createCell(0).setCellValue("Selenium");
    }
    
    FileOutputStream fi=new FileOutputStream("C:\\\\Users\\\\18327\\\\Documents\\\\da.xlsx");
    
    wb.write(fi);
	fi.close();
		
	}
	}


