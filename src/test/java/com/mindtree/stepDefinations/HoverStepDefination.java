package com.mindtree.stepDefinations;
	import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.reUsableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	public class HoverStepDefination extends WebDriverHelper {

	    @Given("^user chooses the browser$")
	    public void user_chooses_the_browser() throws InterruptedException, IOException  {
	    	 driver=baseFile();
	        // driver.manage().window().maximize();
	    	 
	    }

	    @Then("^Hover on Shop Products tab$")
	    public void hover_on_shop_products_tab() throws Throwable {
	    	WebElement ele = driver.findElement(By.xpath("//*[@id=\'site-header\']/div[3]/div/div/div/div[1]/a"));
	    	Actions action = new Actions(driver);
	    	action.moveToElement(ele).perform();
	    }

	    @And("^navigated to url$")
	    public void navigated_to_url() throws Throwable {
	    	driver.get(prop.getProperty("url"));
	    	//Thread.sleep(3000);
	    }

	    @And("^validating the text \"([^\"]*)\"$")
	    public void validating_the_text_something(String strArg1) throws Throwable {
	        
	    }

	}

