package com.selenium;



public class TestCheckBox {

	public static void main(String[] args) {
		

		CheckBox objCheckBox = new CheckBox();
		objCheckBox.intializationDriver("https://demoqa.com/checkbox");
		objCheckBox.selectHomeButton();
		objCheckBox.selectDesktopButton();
		objCheckBox.selectDocumentsButton();
		objCheckBox.selectDownloadButton(); 
			
			
		}
	}
