package com.mavnit.selenium.mytraining.pages;

import com.mavnit.selenium.mytraining.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketPage extends DriverManager {
    @FindBy(css = ".form-control.form-group__input")
    private WebElement postCodeText;
    @FindBy(xpath = "//button[contains(text(),'Check')]")
    private WebElement checkText;
    @FindBy(name = "add-to-trolley-quantity")
    private WebElement productsDropDown;
    @FindBy(css = ".xs-8--none")
    private WebElement addToTrolleyButton;
    @FindBy(css = ".button--full.xs-hidden.sm-block")
    private WebElement goToTrolleyButton;
    @FindBy(css = ".ProductCard__titleLink__1PgaZ")
    private List<WebElement> selectedProductName;
    @FindBy(css = ".ProductCard__removeButton__2O6Cw")
    private WebElement removeButtn;
    @FindBy(css = ".co_marginright_12")
    private WebElement removedProductName;
    public static String actualProduct;
    public static String removedProduce;


    public void addToBasket(String selQty){
        postCodeText.sendKeys("HA3 7FE");
        checkText.click();
        Select select = new Select(productsDropDown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            String optionText = option.getText();
            if (optionText.matches(selQty)) {
                option.click();
                break;
            }
        }
        addToTrolleyButton.click();
        goToTrolleyButton.click();


    }
    public String checkProducatsInBasket(){
       return selectedProductName.get(1).getText();


    }
    public void removeFromBasket(){
        removeButtn.click();

    }
    public String checkProductsRemobved(){

        return removedProductName.getText();
    }


}
