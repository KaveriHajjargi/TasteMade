package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import GenericLib.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//span[.='Shop']")
	private WebElement shop;
	
	@FindBy(xpath="(//a[@class='nav-link js-drop-toggle'])[09]")
	private WebElement serve;
	
	@FindBy(xpath="(//p[@class='h6 name_wrapper'])[1]")
	private WebElement im;
	
	@FindBy(xpath="//a[@class='Navigation__NavigationLink-eGhMIb iJhQGl']")
	private WebElement profile;
	
	@FindBy(xpath="(//a[@class='btn custom-button btn--large btn--full btn--clear uppercase shop-now'])[1]")
	private WebElement shopno;
	
	@FindBy(xpath="//a[.='Sale'")
	private WebElement sal;
	
	@FindBy(xpath="//span[.='My Account']")
	private WebElement myacc;
	//TestCase2
		@FindBy(xpath="//span[.='Live TV']")
		private WebElement live;
	
	@FindBy(xpath="//span[.='Sign Out']")
	private WebElement signout;
	
	@FindBy(xpath="//span[.='Travel']")
	private WebElement travel;
	
	@FindBy(xpath="//h2[.='Flavor Trail in Mexico']")
	private WebElement trav;
	
	@FindBy(xpath="//span[@data-reactid='207']")
	private WebElement view;
	
	
	@FindBy(xpath="//span[.='My Orders']")
	private WebElement order;
	
	@FindBy(xpath="(//a[.='Travel'])[3])")
	private WebElement travell;
	
	@FindBy(id="//a[.='Luggage & Travel Bags']")
	private WebElement laguage;
	
	  @FindBy(xpath="(//p[@class='h6 name_wrapper'])[2]")
	  private WebElement bag;
	  
	  @FindBy(xpath="//span[.='Create Account']")
	  private WebElement tocart;
	  
	  @FindBy(xpath="(//input[@class='search-bar aa-input'])[1]")
	  private WebElement sear; 
	  
	  @FindBy(xpath="//span[.='More']")
	  private WebElement mo;
	  
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void more(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(mo).perform();
		mo.click();
	}
    
	
	public void LiveTv()
	{
		live.click();
	}
	
	public void bags()
	{
		bag.click();
	}
	
	public void shopnow()
	{
		shopno.click();
	}
	public void  serving()
	{
		serve.click();
	}
	
	public void prof(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(profile).perform();
		profile.click();
	}
	public void sale()
	{
		sal.click();
	}
	public void travelmenu(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(travell);
		travell.click();
	}
	
	public void trave()
	{
		trav.click();
	}
	
	public void shopping()
	{
		shop.click();
	}
	
	public void acc(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(myacc).perform();
		myacc.click();
	}
	
	public void myorder(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(order).perform();
		
		order.click();
	}
	
	public void lag()
	{
		laguage.click();
	}
	
	public void travel(WebDriver driver)
	{
	Actions a=new Actions (driver);
	a.moveToElement(travel);
		travel.click();
		
		
	}
	
	public void item()
	{
		im.click();
	}
	
	public void take()
	{
		tocart.click();
	}
	
	public void search(String find)
	{
		sear.sendKeys(find);
	}
	
	
	
	public void viewall()
	{
		view.click();
	}
	public void signout(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(profile).perform();
		
		//signout.click();
	}
}
