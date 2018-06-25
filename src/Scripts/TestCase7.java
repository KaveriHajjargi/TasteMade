package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.HomePage;
import POM.LoginPage;
import POM.NewArrive;
import POM.ShoopingPage;
import POM.SignInPage;

public class TestCase7 extends BasePage {
	@Test
	public void testcase() throws InterruptedException 
	{
	String un = Excel.Excelsheet(PATH, "Sheet2", 1, 0);
		String pwd = Excel.Excelsheet(PATH, "Sheet2", 1, 1);
		String title = Excel.Excelsheet(PATH, "Sheet2", 1, 2);
	
	LoginPage l=new LoginPage(driver);
		l.signinlink();
	 SignInPage s=new  SignInPage(driver);
		s.username(un);
		s.password(pwd);
		s.login();
	

		HomePage p=new HomePage(driver);
		p.shopping();
		ShoopingPage g=new ShoopingPage(driver);
		g.sets();
		driver.getTitle();
		
		NewArrive n=new NewArrive(driver);
		n.addtocart();
		BasePage.verifytitle(title);
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		HomePage h=new HomePage(driver);
		h.prof(driver);
		h.signout(driver);
		
		
			
		}
	}