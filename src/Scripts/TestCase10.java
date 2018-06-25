package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.SignInPage;

public class TestCase10 extends BasePage {

	@Test
	public void test()
	{
		String un = Excel.Excelsheet(PATH, "Sheet10", 1, 0);
		String pwd = Excel.Excelsheet(PATH, "Sheet10", 1, 1);
		String t = Excel.Excelsheet(PATH, "Sheet10", 1, 2);
		LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pwd);
		s.login();
		
		HomePage g=new HomePage(driver);
		g.prof(driver);
	    g.myorder(driver);
	    BasePage.verifytitle(t);
	    driver.navigate().forward();
	    driver.navigate().back();
	    driver.navigate().back();
	   g.prof(driver);
	   g.signout(driver);
	     
	}
}
