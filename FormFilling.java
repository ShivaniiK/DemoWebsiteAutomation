package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.FacebookAutomation.BaseTest;

public class FormFilling extends BaseTest {
	
	public void fillForm()
	{
	String strgetname = "Shivani";
	WebElement Fname = driver.findElement(By.id("firstName"));
	Fname.sendKeys(strgetname);
	System.out.println("Name is: " +strgetname);

	String strLname = "Kaingade";
	WebElement Lname = driver.findElement(By.id("lastName"));
	Lname.sendKeys(strLname);
	System.out.println("Last name is: " +strLname);

	String strEmail = "shivanik20@gmail.com";
	WebElement userEmail = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
	userEmail.sendKeys(strEmail);
	System.out.println("Emailid is: " +strEmail);

	String strmobile = "9863548256";
	WebElement usermobile = driver.findElement(By.id("userNumber"));
	usermobile.sendKeys(strmobile);
	System.out.println("Mobile no is: " +strmobile);
}
}
