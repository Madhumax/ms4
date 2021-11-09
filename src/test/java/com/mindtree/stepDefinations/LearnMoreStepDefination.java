package com.mindtree.stepDefinations;


import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;

import com.mindtree.pageObjects.LandingPage;
import com.mindtree.pageObjects.LearnMorePage;
import com.mindtree.reUsableComponents.WebDriverHelper;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LearnMoreStepDefination extends WebDriverHelper{

    @Given("^user chooses the browser third testcase$")
    public void user_chooses_the_browser_third_testcase() throws IOException  {
    	driver=baseFile();
    }

    @When("^user clicks on learnmore tab$")
    public void user_clicks_on_learnmore_tab() throws InterruptedException {
        LandingPage l=new LandingPage(driver);
        l.getLearnMore().click();
        Thread.sleep(3000);
    }

    @Then("^validate the learnmorepage contains \"([^\"]*)\" word$")
    public void validate_the_page_contains_something_word(String strArg1)  {
        LearnMorePage lmp=new LearnMorePage(driver);
        lmp.getParaText().isDisplayed();
        System.out.println("good");
    }

    @And("^navigated to tideurl for third testcase$")
    public void navigated_to_tideurl_for_third_testcase() {
    	driver.get(prop.getProperty("url"));
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,6000)", "");
    }

    @And("^close the browser for third test case$")
    public void close_the_browser_for_third_test_case() {
       driver.close();
    }

}
