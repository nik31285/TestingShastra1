package com.resonance.stepdefinations;

import com.resonance.keywords.UIkeywords;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class First {
	UIkeywords keyword=new UIkeywords();
	@Given("chrome browser is opened and URL is launched")
	public void m1() {
		keyword.openBrowser("chrome");
		keyword.launchURL("https://testingshastra.com/");
	}
	@When("we get the title of home page")
	public void m2() {
		keyword.getTitle();	
	}
}
