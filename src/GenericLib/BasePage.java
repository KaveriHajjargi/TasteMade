package GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage extends BaseTest{
	
	public static void elementtobeclick(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void verifytitle(String actual)
	{
		String title=driver.getTitle();
		Assert.assertEquals(actual, title);
	}
 public static void verifyElement(WebElement elements)
 {
	 try {
		 WebDriverWait wait =new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.visibilityOf(elements));
		 Reporter.log("Element is Present",true);
	     }
	catch (Exception e)
	    {
		Reporter.log("Element is not present");
		Assert.fail();
	    }
 }
 
 public void verifyTitle(String title)
 {
	 try {
		 WebDriverWait wait =new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.titleIs(title));
		 Reporter.log("Title is Present",true);
	 }
	 catch(Exception e)
	 {
		 Reporter.log("Title is not present");

	 }
 }
}
