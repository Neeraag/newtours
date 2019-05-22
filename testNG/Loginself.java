package testNG;

import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class Loginself {
	WebDriver driver;
	//loginpage
 public static   By un=By.name("userName");
 public static	By pw=By.name("password");
 public static	By login_bn=By.name("login");
	
	//Registration page
	public static By fn= By.name("first name");
	
	
	@Test(priority=0)
	public void login() {
		
		driver.findElement(un).sendKeys("shekar");
		driver.findElement(pw).sendKeys("shekar");
		driver.findElement(login_bn).click();
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
