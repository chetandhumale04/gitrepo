package com.administration.pageobjectclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
       
public class BaseClass {
	 protected WebDriver driver;
	 
	 
	@BeforeMethod
	public void setUp()
	{
		 WebDriverManager.chromedriver().setup(); //webdriver
    	  driver = new ChromeDriver();
    	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

		driver.get("https://engg.ggsf.edu.in/index.php");//url
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	
	}
	
	
	
	
	
	
	
	
	
	

}
