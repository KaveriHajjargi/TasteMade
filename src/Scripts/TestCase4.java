package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.BaseTest;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.SignInPage;
import POM.TravelPage;

public class TestCase4 extends BaseTest{
	@Test
	public void login()
	{
		String un=Excel.Excelsheet(PATH,"Sheet4",1,0);
		String pw=Excel.Excelsheet(PATH, "Sheet4", 1, 1);
		String tt=Excel.Excelsheet(PATH, "Sheet4", 1, 2);
		
		
		
		LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pw);
		s.login();
		
		HomePage h=new HomePage(driver);
		h.travel(driver);
		TravelPage t=new TravelPage(driver);
		t.place();
		  BasePage.verifytitle(tt);
		HomePage a=new HomePage(driver);

          
			a.prof(driver);
			a.signout(driver);
		
		
	}
	

}
