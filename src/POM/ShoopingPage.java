package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BaseTest;

public class ShoopingPage extends BaseTest{
	
	
	@FindBy(xpath="//a[.='Collections']")
	private WebElement collection;
	
	@FindBy(xpath="//a[.='Wedding Gifting']")
	private WebElement wedding;
	
	@FindBy(xpath="//a[.='Cook']")
	private WebElement cooking;
	
    @FindBy(xpath="//a[.='Lifestyle']")
    private WebElement life;
    
    @FindBy(xpath="(//p[@class='h6 name_wrapper'])[2]")
    private WebElement set;
	


	
	
	public ShoopingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	
    public void lifestyle(WebDriver driver)
    {
    Actions a=new Actions(driver);
    a.moveToElement(life).perform();
    	life.click();
    	}

	public void collect()
	{
		collection.click();
	}

	public void wedd()
	{
		wedding.click();
	}
	
	public void cook()
	{
		Actions a =new Actions( driver);
		a.moveToElement(cooking).perform();
         cooking.click();
	}
	
     public void sets()
     {
    	 set.click();
     }



	}

