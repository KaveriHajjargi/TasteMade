package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TastemadeTv {
    
	@FindBy(xpath="//span[@data-reactid='142']")
	private WebElement trybtn;
	
	@FindBy(xpath="//a[.='On Demand']")
	private WebElement ond;
	
	public TastemadeTv(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void ondemand()
	{
		ond.click();
	}
	public void tryfree()
	{
		trybtn.click();
	}
}


	
