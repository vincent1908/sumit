package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

// import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleDemo {

	public  void main(String args[]) throws InterruptedException, IOException {

		System.setProperty("webdriver.firefox.marionette", "D:\\Users\\gamirtha\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		
		
		Thread.sleep(10000);

		
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
		
		driver.quit();

	}

}
