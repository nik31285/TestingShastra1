package com.resonance.stepdefinations;

import java.io.IOException;

import org.testng.Assert;

import com.resonance.keywords.UIkeywords;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	UIkeywords keyword=new UIkeywords();
	String HomePageTitle;
	@Before
	public void m1() throws IOException {
		keyword.openBrowser("chrome");
		keyword.launchURL("https://testingshastra.com/");
	}
//	@Given("chrome browser is opened and URL is launched")
//	public void m1() throws IOException {
//		keyword.openBrowser("chrome");
//		keyword.launchURL("https://testingshastra.com/");
//	}
	@When("we get the title of home page")
	public void m2() {
		HomePageTitle=keyword.getTitle();	
	}
	@Then("it must equal to expected")
	public void m3() {
		Assert.assertTrue(HomePageTitle.contains("Testing Shastra | Training | Placement"));
	}
}
