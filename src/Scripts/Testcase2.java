package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.SignInPage;

public class Testcase2 extends BasePage{
	@Test
	public void test()
		{
		String un=Excel.Excelsheet(PATH,"Sheet2",1,0);
		String pw=Excel.Excelsheet(PATH, "Sheet2", 1, 1);
		String tt=Excel.Excelsheet(PATH, "Sheet2", 1, 2);
		
		LoginPage l=new LoginPage(driver);
			l.signinlink();
		 SignInPage s=new  SignInPage(driver);
			s.username(un);
			s.password(pw);
			s.login();
			
			
		HomePage h=new HomePage(driver);

            BasePage.verifytitle(tt);
			h.prof(driver);
			h.signout(driver);
	}
}
