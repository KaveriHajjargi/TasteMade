package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BasePage;

public class MorePage extends BasePage {

     @FindBy(xpath="//span[.='Advertising']")
     private WebElement adv;

     @FindBy(xpath="//a[.='Work With Us']")
     private WebElement work;

    @FindBy(id="ContactFormName")
     private WebElement na;

   @FindBy(xpath="ContactFormEmail")
     private WebElement ma;
     
    
   @FindBy(xpath=" @FindBy(xpath=\"ContactFormEmail\")\r\n" + 
   		"     private WebElement ma;\r\n" + 
   		"     ")
   private WebElement msg;
   

	
	public MorePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void name(String name)
	{
		na.sendKeys(name);
	}
	public void mail(String id)
	{
		ma.sendKeys(id);
	}
	
	public void messg(String msgg)
	{
		msg.sendKeys(msgg);
	}
	public void advertise()
	{
		adv.click();
	}
	public void workwithus()
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,400)");
		work.click();
				}
	
}
