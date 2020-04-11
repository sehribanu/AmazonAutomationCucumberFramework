package com.thompson.stepdefinitions;

import com.thompson.pages.BookCategoryResultsPage;
import com.thompson.pages.MainPage;
import com.thompson.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

import static com.thompson.utilities.BrowserUtils.*;

public class SearchFeatureMainPageStepDefs {

    @Given("the users select {string} category")
    public void the_users_select_category(String categoryName) {
        MainPage mainPage = new MainPage();
        mainPage.selectByText(categoryName);
    }

    @Given("the users enter {string} in search box")
    public void the_users_enter_in_search_box(String searchName) {
        MainPage mainPage = new MainPage();
        mainPage.nameToSearchBox(searchName);
    }

    @When("the users hit Search button")
    public void the_users_hit_Search_button() {
        MainPage mainPage = new MainPage();
        mainPage.clickSubmit();
    }

    @Then("the users get results in {string} category")
    public void the_users_get_results_in_category(String expectedCategoryName) {
        BookCategoryResultsPage bookCategoryResultsPage = new BookCategoryResultsPage();
        String actualCategoryName = bookCategoryResultsPage.getCategoryName();
        System.out.println("actualCategoryName = " + actualCategoryName);
        Assert.assertTrue(actualCategoryName.contains(expectedCategoryName));
    }

    @Then("the users get results containing {string}")
    public void the_users_get_results_containing(String searchName) {
        BookCategoryResultsPage bookCategoryResultsPage = new BookCategoryResultsPage();
        List<String> list = getTextOfListResults(bookCategoryResultsPage.getListOfSearchResults());

        for(String s: list){
            System.out.println(s);
        }

        //I gave 16 for iteration because of my locator. There are 17 locator results, I wanted the first 16
        for(int i=0; i<16; i++){
            Assert.assertTrue(list.get(i).toLowerCase().contains(searchName));
        }

    }
}
