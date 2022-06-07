package com.selenium;

import org.openqa.selenium.By;


import com.FacebookAutomation.BaseTest;

public class CheckBox extends BaseTest
   {

	
	
	public void selectHomeButton() 
	{
		driver.findElement(By.xpath("//input[@id='tree-node-home']/parent::label/span[@class='rct-checkbox']")).click();
	    
	}
	 
	public void selectDesktopButton() 
	{
		driver.findElement(By.xpath("//input[@id = 'tree-node-desktop']/parent::label/span[@class = 'rct-checkbox']")).click();
		//driver.findElement(By.xpath("//button[@class= 'rct-collapse rct-collapse-btn']")).click();
		
		}
	
	 public void selectDocumentsButton()
	{
	driver.findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']")).click();
	}
	 
	 
	public void selectDownloadButton()
	{
	driver.findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']")).click(); }





}
