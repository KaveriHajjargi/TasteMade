package Scripts;

import org.testng.annotations.Test;

import GenericLib.BasePage;
import GenericLib.Excel;
import POM.Createaccount;

public class Testcase1 extends BasePage {
@Test
	
	
public void acc()
{
	String un = Excel.Excelsheet(Evernote, "Sheet1", 1, 0);
	String pwd = Excel.Excelsheet(Evernote, "Sheet1", 1, 1);
Createaccount c=new Createaccount(driver);
  c.created();
  c.us(un);
   c.pass(pwd);
   c.create();
   

  
 
  
 
  
		
			
	}

}
