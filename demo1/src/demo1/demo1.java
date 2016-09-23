package demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;

public class demo1 {
  @Test
  public void f1() throws IOException {

	  System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	  /*   DesiredCapabilities capabilities = DesiredCapabilities.firefox();

	    capabilities.setCapability("marionette", true);capabilities*/
	  
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	     Runtime.getRuntime().exec("D:\\Sumit\\software\\demo1\\src\\demo1\\login.exe");
	     driver.get("http://google.com");

	       System.out.println(driver.getTitle());
	       driver.close();
	       
	  System.out.println("Test1");
  }
  
  @Test
  public void f2() {
	  
	  System.out.println("Test2");
  }
  
  @Test
  public void f3() {
	  
	  System.out.println("Test3");
  }
    
  @BeforeMethod	
  public void beforeMethod() {
	  System.out.println("Begin");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After");
 }

}
