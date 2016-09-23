package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import pageObjects.*;

import utility.Constant;

// Import Package utility.*

import utility.ExcelUtils;

import appModules.SignIn_Action;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		// This is to open the Excel file. Excel path, file name and the sheet
		// name are parameters to this method

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		System.setProperty("webdriver.firefox.marionette",
				"D:\\Users\\gamirtha\\Downloads\\geckodriver-v0.9.0-win64\\geckodriver.exe");

		ProfilesIni profile = new ProfilesIni();
	 	   FirefoxProfile myprofile = profile.getProfile("testing");
	 	   driver = new FirefoxDriver(myprofile);
		
	 	  Runtime.getRuntime().exec("D:\\shr\\vin\\hghgj\\capProxy1.exe");
//		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(Constant.URL);

		SignIn_Action.Execute(driver);

		System.out.println("Login Successfully, now it is the time to Log Off buddy.");

		Home_Page.lnk_LogOut(driver).click();

		driver.quit();

		// This is to send the PASS value to the Excel sheet in the result
		// column.

		ExcelUtils.setCellData("Pass", 1, 3);

	}

}