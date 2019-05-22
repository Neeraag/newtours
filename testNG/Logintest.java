package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Logintest {
	
	WebDriver driver;
	//LoginPage
	
public static By un=By.xpath("//input[@name='userName']");
public static	By pw=By.name("password");
public static	By login_bn=By.name("userName");
static String uname="mercury";

//Regi page
public static By fn=By.name("firstName");



@Test (priority=0)
  public void login() {
	  System.out.println("login");
	  
	  driver.findElement(un).sendKeys(uname);
	  driver.findElement(pw).sendKeys("shekar");
	  driver.findElement(login_bn).click();
	  System.out.println("login success"); 
  
  }
  
  
  
  
  
  @Test(dependsOnMethods="login")
  public void logout() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("SIGN-OFF")).click();
	  
	  System.out.println("logout success");
  }
  
  @BeforeTest
  public void launch() {
	
	  System.out.println("launch");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Documents\\chromedriver_win32\\chromedriver.exe");


	     driver=new ChromeDriver();
			
		driver.get("http://newtours.demoaut.com");
		
	  
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
  }
  
  @AfterTest
  public void exit() {
	  driver.quit();
	  
	  
  
  
  }

}
