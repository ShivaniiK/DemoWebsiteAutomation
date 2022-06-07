package com.selenium;

import org.openqa.selenium.By;

import com.FacebookAutomation.BaseTest;

public class TextBox extends BaseTest{

	
	public void textBox()
	{   
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shivani");
		
	}
	
	
	public void getEmailID() 
	{
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("xyz@gmail.com");
		
	}
	
	
	public void getAddress() 
	{
		driver.findElement(By.xpath("//input[@id='currentAddress']")).sendKeys("Senapati Bapat Road");
		
	}
	
	

	public void getPermanentAddress() 
	{
		driver.findElement(By.xpath("//input[@id='permanentAddress']")).sendKeys("Pune,Maharashtra");
		
	}
}

