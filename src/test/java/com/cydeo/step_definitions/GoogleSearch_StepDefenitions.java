package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import java.security.Key;

public class GoogleSearch_StepDefenitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on Google search page")
    public void user_is_on_google_search_page()
    {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("user types apple in the google search box and clicks enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClicksEnter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple - Google Search in the google title")
    public void userSeesAppleGoogleSearchInTheGoogleTitle() {
        String expected = "apple - Google Search";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification is failed!",expected,actual);
    }
    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchkeyword) {
        googleSearchPage.searchBox.sendKeys(searchkeyword+Keys.ENTER);
    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String expectedTitle) {

        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actual);
    }
}