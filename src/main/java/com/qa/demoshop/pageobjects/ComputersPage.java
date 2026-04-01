package com.qa.demoshop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComputersPage extends BasePage{

	final private By pageHeading = By.xpath("//h1[.='Computers']");
	
	public ComputersPage(WebDriver driver) {
		super(driver);
	}
	
	public void SelectComputer() {
		elementAction.doClick(pageHeading);
	}
	

}
