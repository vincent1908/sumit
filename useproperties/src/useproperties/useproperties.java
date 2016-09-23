package useproperties;

import org.testng.annotations.Test;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver; 


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class useproperties {
  @Test
  public void f() {
	  
	  File file = new File("D:/Sumit/software/useproperties/src/useproperties/objects.properties");
	  FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		//load properties file
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	  
	   WebDriver driver ;
	   System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	   driver =new FirefoxDriver();
	   
	   String url,unm,pwd;
	   
	  url= prop.getProperty("URL");
	  unm= prop.getProperty("Email");
	  pwd= prop.getProperty("Password");
	  System.out.println("url is  : "+ url);
	  System.out.println("Email_ID is  : "+ unm);
	  System.out.println("Password is  : "+ pwd);
			  
	 driver.get(prop.getProperty("URL"));
	 driver.findElement(By.id("MemberLoginForm_LoginForm_Email")).sendKeys(prop.getProperty("Email"));
	 driver.findElement(By.id("MemberLoginForm_LoginForm_Password")).sendKeys(prop.getProperty("Password"));
	 driver.findElement(By.id("MemberLoginForm_LoginForm_action_dologin")).click();
   
	   System.out.println("Test1");
	  
  }
  
    @Test
  public void second() {
	  System.out.println("Test2"); 
  }
  
  
  @Test
  public void third() {
	  System.out.println("Test3");   
  }
  

  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BEFORE CLASS");
	    }

  @AfterClass
  public void afterClass() {
	  System.out.println("AFTER CLASS");
  }

}
