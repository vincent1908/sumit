package pageObject;

import java.io.IOException;

import org.openqa.selenium.*;

//import utility.Log;

public class LogIn_Page {

	static WebElement element = null;

public static WebElement txtbx_UserName(WebDriver driver){

    element = driver.findElement(By.name("uid"));

	//Log.info("Username text box found");

    return element;

    }

public static WebElement txtbx_Password(WebDriver driver){

    element = driver.findElement(By.name("password"));

	//Log.info("Password text box found");

    return element;

    }

public static WebElement btn_LogIn(WebDriver driver){

    element = driver.findElement(By.name("btnLogin"));

	//Log.info("Submit button found");

    return element;

    }

}


