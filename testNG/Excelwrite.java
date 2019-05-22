package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Excelwrite {
	WebDriver driver;
	
	
	@Test
	@SuppressWarnings("unused")
	public void login()  throws IOException{
			
			FileInputStream file=new FileInputStream("C:\\Users\\18327\\Documents\\testbook.xlsx");
				
			XSSFWorkbook wb=new XSSFWorkbook(file);
			
		    XSSFSheet sh=wb.getSheet("Sheet2");
		    Row rows=null;
		    
		   String un= sh.getRow(1).getCell(0).getStringCellValue();	    
		String pw=   sh.getRow(1).getCell(1).getStringCellValue();
		   System.out.println("login testbook: "+ un +","+ pw);
			
		driver.findElement(By.name("userName")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.name("login")).click();
		System.out.println("login success");
		
	}
	
	@Test
	public void logout() throws InterruptedException{
  Thread.sleep(1000);
	{
		
	driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	//public static void main(String[] args) {
		
	}
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\18327\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
	
	}

}

