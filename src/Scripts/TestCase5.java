package Scripts;

import java.awt.AWTException;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.NewArrive;
import POM.ShopNowPage;
import POM.SignInPage;

public class TestCase5 extends BasePage {
	@Test
	public void shop() throws AWTException
	{
		String un = Excel.Excelsheet(PATH, "Sheet5", 1, 0);
		String pwd=Excel.Excelsheet(PATH, "Sheet5", 1, 1);
		String tit=Excel.Excelsheet(PATH, "Sheet5", 1, 2);

		
	LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pwd);
		s.login();
		
HomePage m=new HomePage(driver);
	m.shopping();
	m.shopnow();
	ShopNowPage n=new ShopNowPage(driver);
	n.sortby();
	n.bags();
	
	NewArrive d=new NewArrive(driver);
	d.addtocart();
	BasePage.verifytitle(tit);
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	driver.navigate().back();
	HomePage h=new HomePage(driver);
		h.prof(driver);
		h.signout(driver);
	}

}
