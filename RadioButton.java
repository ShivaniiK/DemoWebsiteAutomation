package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.FacebookAutomation.BaseTest;

public class RadioButton extends BaseTest {
	
	public void selectRadioButton() {
		
		WebElement radio1 = driver.findElement(By.id("yesRadio"));
		radio1.click();
		System.out.println(radio1.isSelected());
		
	}
	
	
public void selectRadioButton2() {
		
		WebElement radio2 = driver.findElement(By.id("impressiveRadio"));
		radio2.click();
		System.out.println(radio2.isSelected());
		
	}
	
	

}
