package com.qa.demoshop.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApparelPage extends BasePage {
final private By pageHeading =By.xpath("//h1[.='Apparel & Shoes']");
	public ApparelPage(WebDriver driver) {
		super(driver);
		
	}
	public String fetchText() {
		return elementAction.fetchElementText(pageHeading);
	}

}
