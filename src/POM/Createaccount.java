package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class Createaccount extends BaseTest {
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@class='Button-kDSBcD jDVmgl']")
	private WebElement createacc;
	
	@FindBy(xpath="//span[.='Create Account']")
	private WebElement account;
	
	
	
	public Createaccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void us(String mail)
	{
		user.sendKeys(mail);
	}
	public void pass(String pw)
	{
		pwd.sendKeys(pw);
	}
	
	public void create()
	{
		createacc.click();
	}
	
	public void created()
	{
		account.click();
	}
	}


