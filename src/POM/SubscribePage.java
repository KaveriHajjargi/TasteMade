package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePage {
    
	@FindBy(xpath="//span[@data-reactid='150']")
	private WebElement freetrial;
	
	
	public SubscribePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
}
	
	public void trial(WebDriver driver)
	{
		
		freetrial.click();
	}
	
	
	/*
	
	public void trial()
	{
		freetrial.click();
	}*/
}
