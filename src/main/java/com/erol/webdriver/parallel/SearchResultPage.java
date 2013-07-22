package com.erol.webdriver.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * @selitektay@gmail.com
 *
 */
public class SearchResultPage {

	protected WebDriver driver;
	
	
	public SearchResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.CLASS_NAME, using = "r")
	private WebElement firstResult;
	
	public SearchResultPage clickSearchResult(){
		firstResult.click();
		return this;
	}
	
	

}
