package com.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObject.LoginPage;

public class testCases extends BaseClass 
{
@Test
public void LoginTest() throws IOException
{
	
	
	logger.info("URL is opened");
	
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	logger.info("Username Entered");
	lp.setPassword(password);
	logger.info("Password entered");
	lp.clickSubmit();
	logger.info("Clicked login");
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage232323232"))
	{
		Assert.assertTrue(true);
	}
	else
	
	{
		captureScreen(driver, "loginTest");
		Assert.assertFalse(false);
	}
}
	

}
