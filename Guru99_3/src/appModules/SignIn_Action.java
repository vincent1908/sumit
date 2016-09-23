package appModules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObject.LogIn_Page;

import utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action {

public static void Execute(WebDriver driver) throws Exception{

	//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

	String sUserName = ExcelUtils.getCellData(1, 1);

	String sPassword = ExcelUtils.getCellData(1, 2);

	//Home_Page.lnk_MyAccount(driver).click();

	LogIn_Page.txtbx_UserName(driver).sendKeys(sUserName);

	LogIn_Page.txtbx_Password(driver).sendKeys(sPassword);

	LogIn_Page.btn_LogIn(driver).click();
		  
		  try 	{
			  			  		  	
			  		if(driver.findElement(By.xpath("//ul[@class='menusubnav']/li[15]/a")).isDisplayed())
			  			{			  	
			  				System.out.println("you r logged in111 ");	
			  				String actualTitle = driver.getTitle();
			  				System.out.println(actualTitle);
			  				
			  				if(driver.getTitle().contains("Guru99 Bank Manager HomePage"))
			  				{
			  					//Pass
			  				System.out.println("you r logged in to  Guru99 Bank Manager");
			  				System.out.println("UserName: " +sUserName + " Password : "+  sPassword + " Status : Pass" );
			  				//ExcelUtils.setCellData("Pass", 1, 3);
			  				
			  				}
			  				else
			  				{
			  				    //Fail
			  				    System.out.println("you r not  logged in to  Guru99 Bank Manager correctly");
			  				// ExcelUtils.setCellData("Fail", 1, 3);
				  				System.out.println("UserName" +sUserName + " Password :"+  sPassword + "Status : fail" );
			  				}
			  				
			  			}
			  			  		
		  		}
			  	catch (Exception e) 
				  {
			  		Runtime.getRuntime().exec("D:\\Sumit\\software\\Guru99\\src\\bank\\invalid_login.exe");
			  		System.out.println("you r  nott logged in222 ");
			  		//ExcelUtils.setCellData("Fail", 1, 3);
	  				System.out.println("UserName" +sUserName + " Password :"+  sPassword + "Status : fail" );
				  }
			
	}


}


