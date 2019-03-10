Feature: Basket
  As an end user
  I want to add a product to basket
  So that i buy products

  @regression
  Scenario: Select a product

    Given I am on homepage
    When I search for a product "Nike"
    And I select any product
    And I add the product to the basket
    Then the product should be in the basket


  @smoke
  Scenario: Select a product

    Given I am on homepage
    When I search for a product "Nike"
    And I select any product
    And I add the product to the basket
    Then the product should be in the basket
    When I remove the product
    Then the product should not be in the basket
