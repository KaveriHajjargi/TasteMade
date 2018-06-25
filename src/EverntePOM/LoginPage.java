package EverntePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="(//a[.='Log in'])[1]")
	private WebElement sign;
	
	@FindBy(id="username")
	private WebElement mail;
	
	@FindBy(id="loginButton")
	private WebElement cont;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="loginButton")
	private WebElement log;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signin()
	{
		sign.click();
	}
	
	public void username(String un)
	{
		mail.sendKeys(un);
	}
	
	public void Continue()
	{
		cont.click();
	}
	
	public void password(String pwd)
	{
		pass.sendKeys(pwd);;
	}
	
	public void loginbtn()
	{
		sign.click();
	}
}
