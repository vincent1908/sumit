package a;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Screenshot_test {
  @Test
  public void f() throws IOException {
	  
  	   System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	   WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    
	    Runtime.getRuntime().exec("D:\\Sumit\\software\\demo1\\src\\demo1\\login.exe");
	    
	    
	    driver.get("http://google.com");
	    
	//Open calculator - perform add 2+2 and take screen shots    
	    WebElement we=driver.findElement(By.id("gs_htif0"));
	    we.sendKeys("calculator");
	    
	    driver.findElement(By.xpath("//*[@id='sblsbb']/button")).click();
	    

	    driver.findElement(By.xpath("//*[@id='rso']/div[2]/div[6]/div/h3/a")).click();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    //click 2+7 = 9
	    
	    driver.findElement(By.xpath("/html/body/table[4]/tbody/tr[1]/td[3]/center/form/table/tbody/tr[2]/td/div/input[2]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/table[4]/tbody/tr[1]/td[3]/center/form/table/tbody/tr[2]/td/div/input[4]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//html/body/table[4]/tbody/tr[1]/td[3]/center/form/table/tbody/tr[2]/td/div/input[9]")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//html/body/table[4]/tbody/tr[1]/td[3]/center/form/table/tbody/tr[3]/td/div/input")).click();

	       File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       //The below method will save the screen shot in d drive with name "screenshot.png"
	          FileUtils.copyFile(scrFile, new File("D:\\screenshot123.png"));
	    
	    System.out.println(driver.getTitle());
	    System.out.println("Test");
    }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

}
