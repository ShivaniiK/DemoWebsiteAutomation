package com.selenium;

public class TestRadioButton {

	public static void main(String[] args) {
	
		RadioButton objRadioButton = new RadioButton();
		objRadioButton.intializationDriver("https://demoqa.com/radio-button");
		objRadioButton.selectRadioButton();
		objRadioButton.selectRadioButton2();

	}

}
