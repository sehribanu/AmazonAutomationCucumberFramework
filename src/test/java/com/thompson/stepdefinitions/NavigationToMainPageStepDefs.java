package com.thompson.stepdefinitions;

import com.thompson.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NavigationToMainPageStepDefs {
    @Given("the user navigates to the Main Page")
    public void the_user_navigates_to_the_Main_Page() {
        MainPage mainPage = new MainPage();
        mainPage.navigateToMainPage();
    }

    @Then("the Main page should be displayed")
    public void the_ain_page_should_be_displayed() {
        MainPage mainPage = new MainPage();
        mainPage.validateNavigationToMainPage();
    }
}
