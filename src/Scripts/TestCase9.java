package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.SignInPage;

public class TestCase9 extends BasePage {
	@Test
	public void test() 
	{
		String un = Excel.Excelsheet(PATH,"Sheet9", 1, 0);
		String pw = Excel.Excelsheet(PATH,"Sheet9", 1, 1);
		String t = Excel.Excelsheet(PATH,"Sheet9", 1, 2);
	
	LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pw);
		s.login();
		
		HomePage p=new HomePage(driver);
		p.prof(driver);
		p.acc(driver);
		p.viewall();
		BasePage.verifytitle(t);
		p.prof(driver);
		p.signout(driver);
	}	
}
