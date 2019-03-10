package com.mavnit.selenium.mytraining.pages;

import com.mavnit.selenium.mytraining.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ResultsPage extends DriverManager {
    @FindBy(css = ".search-title__term")//for assert
    private WebElement headerText;

    @FindBy(css = ".ac-product-card__name")
    private List<WebElement> productNames;

    public static String selectedProduct;

    public String getProductHeader() {//to assert with actual result
                                //in search steps
        return headerText.getText();
    }

    public void selectAnyProduct() {
        int totalProducts = productNames.size();

//        if(totalProducts<=11){
//            throw new RuntimeException("No products available.");
//        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalProducts);


        WebElement selectedWebElement = productNames.get(randomNumber);
        selectedProduct= selectedWebElement.getText();//for aseert
        selectedWebElement.click();
        System.out.println(selectedProduct);

    }


}
