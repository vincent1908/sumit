package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.firefox.marionette", "D:\\Users\\gamirtha\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

			
		  	WebDriver driver = new FirefoxDriver();
		  	
		  	// step 1

			driver.get("file:///D://Users//gamirtha//Documents//upload.html");
			
			// step 2
			
			//driver.findElement(By.xpath("//*[@id='1']")).click();
			
			// step 3 & 4 
			
			//Runtime.getRuntime().exec("D:\\Users\\gamirtha\\Documents\\autoit\\upload.exe");

			Runtime.getRuntime().exec("D:\\shr\\vin\\hghgj\\Fileupload.exe");
			
			
			
			Thread.sleep(10000);

			
			driver.quit();
	}

}
