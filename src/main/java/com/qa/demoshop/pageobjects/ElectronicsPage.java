package com.qa.demoshop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ElectronicsPage extends BasePage{
	public ElectronicsPage(WebDriver driver) {
		super(driver);
		
	}
	final private By majortab = By.xpath("//h1[.='Electronics']");
	
	public String confirmHeading() {
		return elementAction.fetchElementText(majortab);
		
	}

}
