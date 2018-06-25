package EverntePOM;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import GenericLib.BaseTest;
import GenericLib.Excel;

public class LoginScript extends BaseTest {

	@Test
	public void login() throws InterruptedException
	{
		String un = Excel.Excelsheet(Evernote, "Sheet1", 1, 0);
		String pwd = Excel.Excelsheet(Evernote, "Sheet1", 1, 1);
		LoginPage l=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		l.signin();
		l.username(un);
	
		l.Continue();
		Thread.sleep(3000);
        l.password(pwd);
        String t = driver.getTitle();
        System.out.println(t);
      
	}
}
