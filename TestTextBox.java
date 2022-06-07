package com.selenium;


public class TestTextBox {

	public static void main(String[] args) {
		

		TextBox objTextBox = new TextBox();
		objTextBox.intializationDriver("https://demoqa.com/text-box");
		objTextBox.textBox();
		objTextBox.getEmailID();
		objTextBox.getAddress();
		objTextBox.getPermanentAddress();

	}
}