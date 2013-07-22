package com.erol.webdriver.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * @selitektay@gmail.com
 *
 */
public class GooglePage {

	protected WebDriver driver;
	
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public GooglePage init() {
		driver.get("https://www.google.com");
		return this;
	}
	
	@CacheLookup
	@FindBy(name = "q")
	private WebElement searchTextBox;
	
	
	public SearchResultPage searchFor(String someWords){
		searchTextBox.sendKeys(someWords);
		searchTextBox.submit();
		return new SearchResultPage(driver);
	}
	
	
}
