package testNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MouseHoverElement {
	
	ChromeDriver driver;
	

	@Test (priority=0)
  public void login() throws InterruptedException {
	  System.out.println("login");
	  
	  //driver.findElement(Logintest.un).sendKeys(Logintest.uname);//for lauch from login test
	//  driver.findElement(Logintest.pw).sendKeys("shekar");
	//  Thread.sleep(1000);
	//  driver.findElement(Logintest.login_bn).click();
	//  System.out.println("login success"); 
  
	  
  }
	
 // @Test
  public void mouseHover() throws InterruptedException {
	  Thread.sleep(10000);
	WebElement element= driver.findElement(By.linkText("Products"));
	
	Actions mouse=new Actions(driver);
	mouse.moveToElement(element).build().perform();
	Thread.sleep(10000);
	
	element= driver.findElement(By.linkText("Cards"));
	mouse.moveToElement(element).build().perform();
	Thread.sleep(3000);
	element= driver.findElement(By.linkText("Credit Cards"));
	mouse.moveToElement(element).click().build().perform();
	Thread.sleep(3000);
	String windowtitle=driver.getTitle();
	
	if(windowtitle.contains("Credit Cards")) {
		System.out.println("Credit Card link found and working");
	}
	else
	{
		System.out.println("Credit Card link not found and not working");
	}
  }
  
  
  
  @BeforeTest
  public void Launchapp() {
	  System.out.println("launch");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\18327\\Documents\\chromedriver_win32\\chromedriver.exe");


	     driver=new ChromeDriver();
			
		driver.get("http://hdfcbank.com");
		
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void exit() {
	  
	//  driver.quit();
  }
	  
  }



