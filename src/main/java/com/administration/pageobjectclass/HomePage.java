package com.administration.pageobjectclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
    WebDriver ldriver;
    
    @FindBy(xpath = "//button[@id='close']")
    
    WebElement closePopup;
    
    @FindBy(xpath = "//a[text()='About '][1]")
    
    WebElement about1;

    public  HomePage(WebDriver rdriver)
	{
     ldriver = rdriver;
	 PageFactory.initElements(rdriver,this);

	}
    
    public void Popup()
    {
    	closePopup.click();
    }
   
}