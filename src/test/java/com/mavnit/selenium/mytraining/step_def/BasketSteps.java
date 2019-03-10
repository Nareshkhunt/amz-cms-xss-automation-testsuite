package com.mavnit.selenium.mytraining.step_def;

import com.mavnit.selenium.mytraining.pages.BasketPage;
import com.mavnit.selenium.mytraining.pages.HeaderPage;
import com.mavnit.selenium.mytraining.pages.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class BasketSteps {
    private ResultsPage resultsPage=new ResultsPage();
    private BasketPage basketPage=new BasketPage();

    @And("^I select any product$")
    public void addProduct() {

        resultsPage.selectAnyProduct();
    }

    @And("^I add the product to the basket$")
    public void iAddTheProductToTheBasket() {
        basketPage.addToBasket("3");
    }

    @Then("^the product should be in the basket$")
    public void theProductShouldBeInTheBasket() {

     String actualPro   =basketPage.checkProducatsInBasket();
     assertThat(actualPro,is(equalToIgnoringCase(ResultsPage.selectedProduct)));
        System.out.println(actualPro);
    }

    @When("^I remove the product$")
    public void iRemoveTheProduct() {
        basketPage.removeFromBasket();

    }

    @Then("^the product should not be in the basket$")
    public void theProductShouldNotBeInTheBasket() {
      String removedPro  =basketPage.checkProductsRemobved();
        System.out.println(removedPro);
    //  assertThat(removedPro,containsString(BasketPage.actualProduct+"was removed from your trolley"));


    }
}
