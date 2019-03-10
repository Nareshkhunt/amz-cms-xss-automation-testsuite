package com.mavnit.selenium.mytraining.step_def;

import com.mavnit.selenium.mytraining.pages.HeaderPage;
import com.mavnit.selenium.mytraining.pages.ResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class SeachSteps {

    private HeaderPage headerPage = new HeaderPage();
    private ResultsPage resultsPage = new ResultsPage();

    @Given("^I am on homepage$")
    public void i_am_on_homepage() {
        String actual = headerPage.getCurrentUrl();
        assertThat(actual, is(endsWith("co.uk/")));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String item) {
        headerPage.doSearch(item);
    }

    @Then("^I should be able to see respective results$")
    public void i_should_be_able_to_see_respective_results() {
        String actual = resultsPage.getProductHeader();
        assertThat(actual,is(equalToIgnoringCase(HeaderPage.searchItem)));
    }
}
