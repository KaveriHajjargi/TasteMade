package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrive {

	@FindBy(xpath="\r\n" + 
			"        Cork Coasters - Set of 4\r\n" + 
			"      ")
	private WebElement cookobj;
	
	@FindBy(xpath="//button[@id='AddToCart-product--refresh']")
	private WebElement cart;
	
	@FindBy(xpath="//span[@class='cart-item-count'")
	private WebElement cartic;
	
	public NewArrive (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void newarr()
	{
		cookobj.click();
	}
	public void carticon()
	{
		cartic.click();
	}
	public void addtocart()
	{
		cart.click();
	}
}
