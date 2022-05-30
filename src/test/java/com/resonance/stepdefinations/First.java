package com.resonance.stepdefinations;

import java.io.IOException;

import org.testng.Assert;

import com.resonance.keywords.UIkeywords;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class First {
	UIkeywords keywords = new UIkeywords();
	String HomePageTitle;
	@Given("chrome browser is opened and URL is launched")
	public void m1() throws IOException {
		keywords.openBrowser("chrome");
		keywords.launchURL("https://testingshastra.com/");
	}
	@When("we get the title of home page")
	public void m2() {
		HomePageTitle=keywords.getTitle();
	}
	@Then("it must equal to expected")
	public void m3() {
		Assert.assertEquals(HomePageTitle,"Testing Shastra | Training | Placement");
	}
}
