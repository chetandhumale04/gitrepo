package com.administration.testclass;

import org.testng.annotations.Test;

import com.administration.pageobjectclass.BaseClass;
import com.administration.pageobjectclass.HomePage;

@Test
public class TestClass_01 extends BaseClass {
	
	public void HomeTest()
	{
		HomePage home = new HomePage(driver);
		home.Popup();
	String s	=driver.getTitle();
			System.out.println(s);	
	}
	
	
	

}
