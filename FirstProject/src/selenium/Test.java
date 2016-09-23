package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Test {

 public static void main(String[] args) {
   //Creating WebDriver Object
    System.out.println("Launch Home page using Get Method");
    System.setProperty("webdriver.chrome.driver", "D:\\Users\\gamirtha\\Desktop\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
   //Opens the given URL using Get Method
    driver.get("http://www.uftHelp.com");
   //Click on Contact Us Link
    System.out.println("Open Contact Us page");
    driver.findElement(By.id("contact-Us")).click();
   //Using Back Command, go back to "Home" page
    System.out.println("Navigate Back to Home Page");
    driver.navigate().back();
   // Using Forward Command, go to "Contact Us" link
    System.out.println("Navigate Forward to Contact Us Page ");
    driver.navigate().forward();
    //Refresh the page
    System.out.println("Refresh the Contact Us Page ");
    driver.navigate().refresh();
   //Using To command, open the Selenium Page
    System.out.println("Navigate To Selenium Page");
    driver.navigate().to("http://www.ufthelp.com/p/selenium.html");
    System.out.println("Close the Browser");
   //Closing the Browser
    driver.close();

 }

}
