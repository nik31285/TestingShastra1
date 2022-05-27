package com.resonance.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.resonance.config.BaseTest;
import com.resonance.keywords.UIkeywords;
import com.resonance.pages.HomePage;

public class HomePageTests extends BaseTest{
	UIkeywords keyword=new UIkeywords();
	@Test
	public void confirmationAlertOpen() {
		HomePage home= PageFactory.initElements(keyword.driver,HomePage.class);
		home.clickOnAssignment();
	}
	@Test
	public void videoClickCheck() {
		System.out.println("OK");
	}
	@Test
	private void clickOnAssignment() {
		System.out.println("Click on Assignment");
		System.out.println("This is detail");
	}
}
