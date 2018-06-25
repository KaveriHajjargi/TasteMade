package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServePage {
	
	@FindBy(xpath="(//p[@class='h6 name_wrapper'])[9]")
	private WebElement obj;

	@FindBy(xpath="//a[.='Serve']")
	private WebElement ser;
	
	@FindBy(xpath="(//a[.='New'])[7]")
	private WebElement newl;
	
	public ServePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void serve()
	{
		ser.click();
	}
	public void newlink()
	{
		newl.click();
	}
	public void object()
	{
		obj.click();
	}
}
