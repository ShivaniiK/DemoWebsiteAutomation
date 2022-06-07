package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FacebookAutomation.BaseTest;

public class Buttons extends BaseTest {

	
	public void doubleClickButton() {
		
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();
		System.out.println("Double Clicked");
	}

    
	
	public void rightClickButton() {
			
		    WebElement rightClick1 = driver.findElement(By.id("rightClickBtn"));
			Actions action1 = new Actions(driver);
			action1.contextClick(rightClick1).perform();
			System.out.println("Right Clicked");
	}	
	
	
	
	public void clickButton() {
		
	    WebElement Click1 = driver.findElement(By.id("z3veX"));
	    Actions action1 = new Actions(driver);
		action1.click(Click1).perform();
		System.out.println("Dynamic Click");
}	
			
	}



