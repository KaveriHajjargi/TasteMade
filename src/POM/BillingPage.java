package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillingPage {
    
	@FindBy(id="ccName")
	private WebElement cname;
	
	
	@FindBy(id="cardInfo")
	private WebElement card;
	

	@FindBy(id="login")
	private WebElement logintrial;
	
	
	public BillingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void customername(String name)
	{
		cname.sendKeys(name);
	}
	
	public void cardnum(String num)
	{
		card.sendKeys(num);
	}
	
	public void logintv()
	{
		logintrial.click();
	}
}
