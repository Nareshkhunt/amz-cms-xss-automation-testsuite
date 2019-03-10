package com.mavnit.selenium.mytraining.pages;

import com.mavnit.selenium.mytraining.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {
    public static String searchItem;

    @FindBy(id = "searchTerm")
    private WebElement searchTxtBox;

    @FindBy(className = "argos-header__search-button")
    private WebElement magifierGlass;

    public void doSearch(String item) {
        searchItem=item;
        searchTxtBox.sendKeys(item);
        magifierGlass.click();
    }

    public void emptySearch(){

        magifierGlass.click();
    }


    public String getCurrentUrl() {

        return driver.getCurrentUrl();
    }
}
