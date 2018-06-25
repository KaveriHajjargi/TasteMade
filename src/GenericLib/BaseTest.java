package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constants {
	public static WebDriver driver;
	
    @BeforeMethod
	public  void openapp()
	{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	 driver =new FirefoxDriver();
       driver.get(URL);
       
       String title=driver.getTitle();
       Reporter.log(title,true);
       
     }
 
     @AfterMethod
     public void closeapp()
    {
    	driver.close();
    }
}