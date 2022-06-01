package com.resonance.stepdefinations;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DemoCucumber {
//	@Before("Login to vpn")
//	public void login() {
//		System.out.println("Background annotation");
//	}
	@Given("set UserName")
	public void setUserName() {
		System.out.println("-----------------------------");
		System.out.println("Background Step 1");
	}
	@Given("set Password")
	public void setPassword() {
		System.out.println("-----------------------------");
		System.out.println("Backgrounf Step 2");
	}
//	@BeforeAll
	public static void m4() {
		System.out.println("I am @BeforeAll hook");
	}
//	@Before
	public void mo() {
		System.out.println("I am @Before hook");
	}
//	@BeforeStep
//	public void beforeEachStep() {
//		System.out.println("-----------------------------");
//		System.out.println("I am @BeforeStep hook");
//	}
	@Given("to launch browser")
	public void m1() {
		System.out.println("-----------------------------");
		System.out.println("Browser Lauching");
	}
	@Given("to launch URL")
	public void m2() {
		System.out.println("-----------------------------");
		System.out.println("Launcing URL");
	}
	@Then("we have to find out Home Page Title")
	public void m3() {
		System.out.println("-----------------------------");
		System.out.println("Then first to find Home Page");
	}
	@Then("check title")
	public void m5() {
		System.out.println("------------------------------");
		System.out.println("Check the Title as per expected title");
	}
	@Given("To test 2 scenario")
	public void secondSenario() {
		System.out.println("------------------------------");
		System.out.println("2nd Scenario Step 1");
	}
}
