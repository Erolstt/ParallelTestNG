package com.erol.webdriver.parallel;

import org.openqa.selenium.WebDriver;

/**
 * @selitektay@gmail.com
 *
 */

public class Factory {


	private WebDriver driver;
	
	public Factory(WebDriver driver) {
		this.driver=driver;
	}
	
	public GooglePage googlePage(){
		return new GooglePage(driver);
	}
	
	public SearchResultPage searchResultPage(){
		return new SearchResultPage(driver);
	}
}
