package com.mindtree.stepDefinations;
	import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.ProductsPage;
import com.mindtree.reUsableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

	@RunWith(Cucumber.class)
	public class SeachStepDefination extends WebDriverHelper{

	    @Given("^user chooses the browser for tide$")
	    public void user_chooses_the_browser() throws IOException  {
	    	 driver=baseFile();
	    }

	    @When("^sends the word \"([^\"]*)\" in the searchBox$")
	    public void sends_the_word_something_in_the_searchbox(String strArg1) throws InterruptedException  {
	        LandingPage lp=new LandingPage(driver);
	        lp.getSearchBox().sendKeys(strArg1);
	        lp.getSubmit().click();
	        Thread.sleep(3000);
	    }

	    @Then("^validate the page contains \"([^\"]*)\" word$")
	    public void validate_the_page_contains_something_word(String strArg1) {
	    	ProductsPage p=new ProductsPage(driver);
	    	Assert.assertTrue(p.getText().isDisplayed());
	    	System.out.println("validated the text");
	    }

	    @And("^navigated to tideurl$")
	    public void navigated_to_url() {
	    	driver.get(prop.getProperty("url"));
	    }

	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	      driver.close();
	    }

	}

