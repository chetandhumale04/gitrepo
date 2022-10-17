package com.administration.testclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass_02  {
	
     public static void main(String[] args) {
    	// ChromeOptions option = new ChromeOptions();
    	// option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    	 
    	 
    	 WebDriverManager.chromedriver().setup();
    	 WebDriver driver = new ChromeDriver();
    	 driver.get("https://www.flipkart.com/");
    	 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    	 driver.manage().window().maximize();
    	WebElement c =  driver.findElement(By.xpath("//button[@id='close']"));
    	 c.click();
    	 WebElement a = driver.findElement(By.xpath("//a[@title=\"About \"][1]"));
    	 Actions b = new Actions(driver);
    	 b.moveToElement(a);
    	 Select ref = new Select(a);
    	 ref.selectByIndex(1);
		
	}
}
