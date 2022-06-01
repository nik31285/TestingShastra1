package com.resonance.stepdefinations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Parameterization {
	int x,y,r=0;
	String color;
	@Given("I have {int} and {int}")
	public void m1(int x, int y) {
		this.x=x;
		this.y=y;		
	}
	@When("I add them")
	public void add() {
		r=x+y;
	}
	@Then("result must be even")
	public void checkIfResultIsEven() {
		Assert.assertTrue(r%2==0,"Addition result is not even: "+r);
	}
	
	@Given("I have {word} fruit")
	public void fruitColour(String col) {
		this.color=col;
	}
	@Then("Display its colour")
	public void displayFruitColor() {
		System.out.println("Fruit colour is "+color);
	}
	@Given("I have a {string} space")
	public void m4(String part) {
		System.out.println(part);
	}
}
