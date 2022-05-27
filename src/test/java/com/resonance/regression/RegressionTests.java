package com.resonance.regression;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.resonance.config.BaseTest;
import com.resonance.keywords.UIkeywords;
import com.resonance.pages.HomePage;
import com.resonance.util.PropertyFile;


public class RegressionTests extends BaseTest {
	UIkeywords keyword=new UIkeywords();
	PropertyFile pfile=new PropertyFile();
	String basePath="/src/main/resources/Envoirnment.properties";
	@Test(enabled = false)
	public void verifyTitleOfHomePage() throws IOException {
		String actualTitle=UIkeywords.getTitle();
		Assert.assertTrue(actualTitle.contains("Online Shopping site in India"));
	//	Assert.assertTrue(actualTitle.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		System.out.println("Actual Title is:"+actualTitle);
	}
	@Test(enabled = false)
	public void confirmationAlertAccept() throws IOException {
		UIkeywords.click(pfile.getValue(basePath, "Assignment_Css"));
		UIkeywords.click(pfile.getValue(basePath, "Confirmation_Alert"));
		UIkeywords.click(pfile.getValue(basePath,"Alert_Button_Click"));
		UIkeywords.acceptAlert();
		String confirmMsg=UIkeywords.getText("p#demo");
		Assert.assertEquals(confirmMsg,"You pressed OK!");
	}
	@Test(enabled = false)
	public void confirmationAlertCancel() throws IOException {
		UIkeywords.click(pfile.getValue(basePath, "Assignment_Css"));
		UIkeywords.click(pfile.getValue(basePath, "Confirmation_Alert"));
		UIkeywords.click(pfile.getValue(basePath,"Alert_Button_Click"));
		UIkeywords.cancelAlert();
		String confirmMsg=UIkeywords.getText("p#demo");
		Assert.assertEquals(confirmMsg,"You pressed Cancel!");
	}
	
}
