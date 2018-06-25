package GenericLib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constants{

	public static String Excelsheet(String PATH,String sheet,int r,int c)
	{
	String s="";
	try
	{
		FileInputStream f=new FileInputStream(PATH);
		Workbook w=WorkbookFactory.create(f);
				s=w.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
		
	}
	catch(Exception e)
	{
		
	}
	return s;
}
}

