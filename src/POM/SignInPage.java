package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BasePage;

public class SignInPage  extends BasePage{
	
	@FindBy(id="EMAIL")
	private WebElement email;
	
	@FindBy(id="PASSWORD")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='Button-kDSBcD jDVmgl']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[.='Connect with']")
	private WebElement fb;
	
	
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void username(String mailid)
	{
		email.sendKeys(mailid);
	}
	
	public void password(String pwd )
	{
		password.sendKeys(pwd);
	}
	
	public void login()
	{
		loginbtn.click();

	}
	
	
	public void fblogin()
	{
		fb.click();
	}
	
	

	}


