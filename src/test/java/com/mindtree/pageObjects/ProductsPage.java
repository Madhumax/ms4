package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIStore.LandingPageUI;
import com.mindtree.UIStore.ProductsPageUI;



public class ProductsPage 
{

	public WebDriver driver;
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getText()
	{
		return driver.findElement(ProductsPageUI.text);
	}
	
	
	
}
