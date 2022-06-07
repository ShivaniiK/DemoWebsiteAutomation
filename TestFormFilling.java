package com.selenium;

public class TestFormFilling {

	public static void main(String[] args) {
		
		FormFilling objFormFilling = new FormFilling();
		objFormFilling.intializationDriver("https://demoqa.com/automation-practice-form");
		objFormFilling.fillForm();
		
	}

}
