package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class test {
  @Test
  public void f() {
	  System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	  
	 /* DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	  capabilities.setCapability("marionette", true);
	  WebDriver driver = new FirefoxDriver(capabilities);
	  
	*/ WebDriver driver = new FirefoxDriver();
	  driver.get("http://google.com");
	  System.out.println("heloo");
  }
}
