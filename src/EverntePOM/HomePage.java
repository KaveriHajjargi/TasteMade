package EverntePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//img[@class='GJDCG5COP']")
	private WebElement acc;
	
	@FindBy(xpath="//div[.='Log out']")
	private WebElement log;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void account()
	{
		acc.click();
	}
	public void logoutbtn()
	{
		log.click();
	}
}
