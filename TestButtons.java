package com.selenium;

public class TestButtons {

	public static void main(String[] args) {
		
		Buttons objButtons = new Buttons();
		objButtons.intializationDriver("https://demoqa.com/buttons");
		objButtons.doubleClickButton();
		objButtons.rightClickButton();
		objButtons.clickButton();
	

	}

}
