package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopNowPage {

	@FindBy(id="SortBy")
	private WebElement sort;
	
	@FindBy(xpath="(//p[@class='h6 name_wrapper'])[1]")
	private WebElement bag;
	
	
	
	public ShopNowPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sortby() throws AWTException
	{
		sort.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
	}
	public void bags()
	{
		bag.click();
	}
	
}
