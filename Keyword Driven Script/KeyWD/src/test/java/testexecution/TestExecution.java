package testexecution;

import java.io.IOException;

import excelutilities.ReadExcelSheet;
import keywordDriven.Action_keyword;

public class TestExecution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		ReadExcelSheet rs=new ReadExcelSheet();
		rs.readExcelData(4);
	
		Action_keyword.OpenBrowser();
		Action_keyword.navigateURL();
		Action_keyword.enterUser();
		Action_keyword.enterPasword();
		Action_keyword.clickOnLogin();
		Action_keyword.closeBrowser();
	}

}
