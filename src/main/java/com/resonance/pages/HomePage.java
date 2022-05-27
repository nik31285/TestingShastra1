package com.resonance.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.resonance.keywords.UIkeywords;

public class HomePage {
	
	@FindBy(css = "a[href=\"/assignments\"]")
	public WebElement assignmentLnk;
	public void clickOnAssignment() {
		assignmentLnk.click();
	}
}
