package com.thompson.pages;

import com.thompson.utilities.BrowserUtils;
import com.thompson.utilities.ConfigurationReader;
import com.thompson.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

   @FindBy (xpath = "//div[@id='nav-xshop']//a[contains(text(),'Best Sellers')]")
   private WebElement bestSellersMenu;

   @FindBy (xpath = "//div[@id='nav-xshop']//a[contains(text(),'Prime Video')]")
   private WebElement primeVideoMenu;

   @FindBy (xpath = "//div[@id='nav-xshop']//a[contains(text(),'Help')]")
   private WebElement helpMenu;

   @FindBy (id = "twotabsearchtextbox")
   private WebElement searchBox;

   @FindBy (id = "searchDropdownBox")
   private WebElement searchDropdown;

   @FindBy (xpath = "//input[@class='nav-input'][@type='submit']")
   private WebElement submitButton;

   public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void selectByText(String categoryName){
       //BrowserUtils.waitForVisibility(searchDropdown,10);
      Select select = new Select(searchDropdown);
      select.selectByVisibleText(categoryName);
    }

    public void nameToSearchBox(String searchName){
       BrowserUtils.waitForVisibility(searchBox,10);
       BrowserUtils.waitForClickablility(searchBox,10);
       searchBox.sendKeys(searchName);
    }

    public void clickSubmit(){
       BrowserUtils.waitForVisibility(submitButton,10);
       BrowserUtils.waitForClickablility(submitButton,10);
       submitButton.click();
    }





}
