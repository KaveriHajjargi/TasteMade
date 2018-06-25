package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLib.BasePage;

public class TravelPage {

	@FindBy(xpath="//h2[.='Amazon Cruise in Ecuador']")
	private WebElement tr;
	
	@FindBy(xpath="//h2[.='Las Pozas Gardens in Mexico']")
	private WebElement p;
	
	@FindBy(xpath="//a[.='Watch Now']")
	private WebElement watch;
	
	@FindBy(xpath="//div[@class=\"VideoSaveButton\"]")
	private WebElement s;
	
	
	public TravelPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void travell()
	{
		tr.click();
	}
	
	public void place()
	{
		p.click();
		
	}
	public void watchnow()
	{
	watch.click();
	}
	public void save(WebDriver driver)
	{
		 BasePage.elementtobeclick(s);
	s.click();
	}
}

