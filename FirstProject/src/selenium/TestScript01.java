package selenium;

/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


/**
 * 
 * @author Krishna Rungta
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
 */

public class TestScript01 {

    

    public static void main(String[] args) throws Exception {	  
	
    	//Setup Firefox driver    	
    	
    	
    	
    	System.setProperty("webdriver.firefox.marionette", "D:\\Users\\gamirtha\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

    	WebDriver driver;
    	
    	ProfilesIni profile = new ProfilesIni();
 	   FirefoxProfile myprofile = profile.getProfile("testing");
 	   driver = new FirefoxDriver(myprofile);
 	   driver.get("http://www.demo.guru99.com/V4/"); 
		
	  	//WebDriver driver = new FirefoxDriver();
	  	
	  	//Runtime.getRuntime().exec("D:\\shr\\vin\\hghgj\\capProxy1.exe");
	  	
    	//String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	//driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr48976");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("enenUhy");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    
	    String title = driver.getTitle();
	    
	    System.out.println(title);
	    
//	    if ((title = "Guru99 Bank Manager HomePage"){
//	    	Runtime.getRuntime().exec("D:\\shr\\vin\\hghgj\\guruInvalid.exe");
//	    }
//	    else{
//	    	driver.close();
//	    }
//	    
	    }
	

    }

