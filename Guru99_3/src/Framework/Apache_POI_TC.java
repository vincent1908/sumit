
package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

//Import Package utility.*
import utility.Constant;
import utility.ExcelUtils;

//Import appModules
import appModules.SignIn_Action;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet
		// name are parameters to this method

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		
		System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	  	  
		ProfilesIni profile = new ProfilesIni();
	 	   FirefoxProfile myprofile = profile.getProfile("testing");
	 	   driver = new FirefoxDriver(myprofile);
		
		   driver.get(Constant.URL);
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			  
		   Runtime.getRuntime().exec("D:\\Sumit\\software\\demo1\\src\\demo1\\login.exe");		  	 
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		   SignIn_Action.Execute(driver);
		   		    
		   //System.out.println("Login Successfully, now it is the time to Log Off buddy.");

		//Home_Page.lnk_LogOut(driver).click();

		//driver.quit();

		// This is to send the PASS value to the Excel sheet in the result
		// column.

		//ExcelUtils.setCellData("Pass", 1, 3);
	}

}