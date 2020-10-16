package com.testCases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageObject.LoginPage;
import com.utilities.XlUtils;

public class TC_002 extends BaseClass

{
	@Test(dataProvider="LoginData")
	public void loginDDT(String user, String pwd)
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws Exception
	{
		String path="C:\\Users\\lenovo\\eclipse-workspace\\myProject\\src\\test\\java\\com\\testData\\LoginData.xlsx";
		int rownum=XlUtils.getRowCount(path, "sheet1");
		int colcount=XlUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1; i<=rownum; i++)
		{
			for(int j=0; j<colcount; j++)
			{
				logindata[i-1][j]=XlUtils.getCellData(path, "Sheet1", i, j);
			}
			
		}
		return logindata;
	}

}
