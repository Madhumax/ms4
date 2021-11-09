package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LearnMorePageUI;



public class LearnMorePage 
{

	public WebDriver driver;
	public LearnMorePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getParaText()
	{
		return driver.findElement(LearnMorePageUI.paratext);
	}
	
	
}
