package take;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class screenshot2 {
	
	WebDriver driver;
	int i=1;
	
  @Test
  public void f() throws Exception {
	  
      System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
      
       driver = new FirefoxDriver();

	  Runtime.getRuntime().exec("D:\\Sumit\\software\\demo1\\src\\demo1\\login.exe");
      driver.get("http://web2.0calc.com/");    
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      
      captureScreen();
            
     driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,"t"));
        
       
   //driver.findElement(By.tagName("html")).sendKeys(ctrlZero);
    
       System.out.println("test");
 //driver.quit();
  }
  
  public void captureScreen() {
	    File desc;
	        try {
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       
	        desc= new File("D://screenshot/" + i + ".sht_"+ System.currentTimeMillis()+".png");
	        FileUtils.copyFile(source, desc); 
	        i=i+1;
	    }
	    catch(IOException e) {
	    	e.getMessage();
	    }
	}
}

