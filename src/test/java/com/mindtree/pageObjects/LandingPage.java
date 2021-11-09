package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LandingPageUI;



public class LandingPage 
{

	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSearchBox()
	{
		return driver.findElement(LandingPageUI.searchBox);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(LandingPageUI.submit);
	}
	public WebElement getLearnMore()
	{
		return driver.findElement(LandingPageUI.learnmore);
	}
	
	
}
