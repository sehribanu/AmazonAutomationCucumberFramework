package com.thompson.pages;

import com.thompson.utilities.BrowserUtils;
import com.thompson.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookCategoryResultsPage extends BasePage{

    @FindBy (xpath = "//div[@id='nav-subnav']//span[@class='nav-a-content']")
    private WebElement categoryName;

    @FindBy (xpath = "//h2//span")
    private List<WebElement> listOfSearchResults;

    public List<WebElement> getListOfSearchResults() {
        return listOfSearchResults;
    }

    public BookCategoryResultsPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public String getCategoryName(){
        String category = categoryName.getAttribute("innerHTML");
        return category;
    }


}
