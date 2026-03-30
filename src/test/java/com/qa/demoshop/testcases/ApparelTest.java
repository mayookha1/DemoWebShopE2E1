package com.qa.demoshop.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.demoshop.base.BaseTest;

import io.qameta.allure.Allure;

public class ApparelTest extends BaseTest{
	@Test
public void verifyPageText() {
	String actualText=ap.fetchText();
	String expectedText="Apparel & Shoes";
	assertEquals(actualText, expectedText);
	Allure.step("validation success");
}
}
