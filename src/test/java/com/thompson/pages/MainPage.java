package com.thompson.pages;

import com.thompson.utilities.ConfigurationReader;
import com.thompson.utilities.Driver;
import org.junit.Assert;

public class MainPage extends BasePage {

    public void navigateToMainPage(){
        Driver.get().get(ConfigurationReader.get("url"));
    }

    public void validateNavigationToMainPage(){
        String expectedPageTitle = "Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more";
        String actualPageTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
}
