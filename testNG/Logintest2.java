package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest2 {
	WebDriver driver;
	
	@Test(priority=0)
	public void login() {
		
		driver.findElement(By.name("userName")).sendKeys("shekar");
		driver.findElement(By.name("password")).sendKeys("shekar");
		driver.findElement(By.name("login")).click();
		System.out.println("login success");
		
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		
	driver.findElement(By.linkText("SIGN-OFF")).click();

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
