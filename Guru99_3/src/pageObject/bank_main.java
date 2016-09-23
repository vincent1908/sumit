
package pageObject;

import org.testng.annotations.Test;

import utility.Constant;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;

public class bank_main {
	
	WebDriver driver;
	
  @Test
  public void f() throws IOException {
	  
	  //System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	  	  
	  //Setup Firefox driver    	
	  // driver = new FirefoxDriver();
	  // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr48976");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("enenUhy");
 
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    checklogin();
	  
  }
  @BeforeClass
  public void setUp() throws IOException {
	  //launch  firefox
	  System.out.println("Before class ");	
	   System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	   
	   ProfilesIni profile = new ProfilesIni();
	   FirefoxProfile myprofile = profile.getProfile("profile");
	   driver = new FirefoxDriver(myprofile);
	   
	   driver.get(Constant.URL);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	    Runtime.getRuntime().exec("D:\\Sumit\\software\\demo1\\src\\demo1\\login.exe");
	  	 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");	
  }
  
  public void checklogin() throws IOException
  {	   
	  try 	{
		  			  		  	
		  		if(driver.findElement(By.xpath("//ul[@class='menusubnav']/li[15]/a")).isDisplayed())
		  			{			  	
		  				System.out.println("you r logged in111 ");	
		  				String actualTitle = driver.getTitle();
		  				System.out.println(actualTitle);
		  				
		  				if(driver.getTitle().contains("Guru99 Bank Manager HomePage"))
		  				    //Pass
		  				    System.out.println("you r logged in to  Guru99 Bank Manager");
		  				else
		  				    //Fail
		  				    System.out.println("you r not  logged in to  Guru99 Bank Manager correctly");
		  			}
		  		
	  		}
		  	catch (Exception e) 
			  {
		  		Runtime.getRuntime().exec("D:\\Sumit\\software\\Guru99\\src\\bank\\invalid_login.exe");
		  		System.out.println("you r  nott logged in222 ");
			  }
		
  }
  
}
