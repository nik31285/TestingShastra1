package com.resonance.stepdefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
		System.out.println("String parameter is:"+part);
	}
	@Given("I have following rto code and city names:")
	public void i_have_following_rto_code_and_city_names(DataTable dt) {
		Map<String, String> map;
		map=dt.asMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+":\t"+val);
		}
	}
	@Given("I have capital city names")
	public void capitalCityNames(DataTable capcity) {
		List<String> ls= capcity.asList();
		for (String CityName : ls) {
			System.out.println(CityName);	
		}
	}
	@Given("I have {string} and {string}")
	public void i_have_mh_and_maharashtra(String code, String name) {
		System.out.println(code+"\t"+name);
	}
}
