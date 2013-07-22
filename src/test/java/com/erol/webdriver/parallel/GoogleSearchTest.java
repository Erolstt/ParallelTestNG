package com.erol.webdriver.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * parallel test using testng
 */
public class GoogleSearchTest 
{
protected WebDriver driver;
	
    @Parameters({"browser","chromeDriver","chromeDriverPath","ieDriver","ieDriverPath"})
    @BeforeMethod
	public void setUp(String browser,String chromeDriver,String chromeDriverPath, String ieDriver, String ieDriverPath ) {
		
		if(browser.equalsIgnoreCase("Chrome"))
	    {   
			System.setProperty(chromeDriver, chromeDriverPath);
	        driver = new ChromeDriver();

	    }else if(browser.equalsIgnoreCase("FF"))
	    {
	        driver = new FirefoxDriver();
	    }
	    else if(browser.equalsIgnoreCase("IE"))
	    {
	    	System.setProperty(ieDriver, ieDriverPath);
	    	driver = new InternetExplorerDriver();
	    }
		
	}
    
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
    
    @Test
    public void searchTest(){
    	Factory factory = new Factory(driver);
    			factory.googlePage()
    				   .init()
    				   .searchFor("EROLSTT");
    				   
    			
    }
    
}
