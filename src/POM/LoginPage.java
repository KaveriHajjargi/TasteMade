package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericLib.BasePage;

public class LoginPage extends BasePage 
{
	
	@FindBy(xpath="//span[@data-reactid='107']")
	private WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
	
	public void signinlink()
	{
		signin.click();
	}

	
}

