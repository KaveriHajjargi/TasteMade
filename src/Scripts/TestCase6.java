package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.SignInPage;

public class TestCase6 extends BasePage{
@Test

public void test() throws InterruptedException
{
String un = Excel.Excelsheet(PATH, "Sheet6", 1, 0);
String pwd = Excel.Excelsheet(PATH, "Sheet6", 1, 1);
String ti = Excel.Excelsheet(PATH, "Sheet6", 1, 2);

LoginPage l=new LoginPage(driver);
	l.signinlink();
 SignInPage s=new  SignInPage(driver);
	s.username(un);
	s.password(pwd);
	s.login();
	
HomePage h=new HomePage(driver);
         h.LiveTv();
        
         BasePage.verifytitle(ti);
//TastemadeTv t=new TastemadeTv(driver);
  //       t.ondemand();

	


          
         
}
}