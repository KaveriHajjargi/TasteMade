package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.NewArrive;
import POM.ServePage;
import POM.SignInPage;

public class Testcase3 extends BasePage{
	@Test
	public void test3() throws InterruptedException
	{
		String un=Excel.Excelsheet(PATH,"Sheet1",1,0);
		String pw=Excel.Excelsheet(PATH, "Sheet1", 1, 1);
		String tt=Excel.Excelsheet(PATH, "Sheet1", 1, 2);
		
		
		LoginPage l=new LoginPage(driver);
		l.signinlink();
		
		
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pw);
		s.login();
		
		HomePage h=new HomePage(driver);

	
		h.shopping();
		h.serving();
		ServePage p=new ServePage(driver);
		      Thread.sleep(2000);
				p.object();
		NewArrive n=new NewArrive(driver);
		n.addtocart();
				
		BasePage.verifytitle(tt);
		
		
	

	
	}

}
