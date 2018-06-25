package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.MorePage;
import POM.SignInPage;

public class TestCase8 extends BasePage {
@Test
	public void test() throws InterruptedException 
	{
	String un = Excel.Excelsheet(PATH, "Sheet8", 1, 0);
	String pwd= Excel.Excelsheet(PATH, "Sheet8", 1, 1);
	String title = Excel.Excelsheet(PATH, "Sheet8", 1, 2);
	//String name = Excel.Excelsheet(PATH, "Sheet8", 2, 0);
	//String id = Excel.Excelsheet(PATH, "Sheet8", 2, 1);
	//String msgg = Excel.Excelsheet(PATH, "Sheet8", 2, 2);
	
	LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pwd);
		s.login();
		
		HomePage p=new HomePage(driver);
		p.more(driver);
		
		MorePage g=new MorePage(driver);
		g.advertise();
		g.workwithus();
		BasePage.verifytitle(title);
	/*	g.name(name);
		g.mail(id);
		g.messg(msgg);*/
	}

}
