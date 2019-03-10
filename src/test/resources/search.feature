Feature: Search
  As an end user
  I want to search for product
  So that i can view results

  @bvt
  Scenario: Search for a product
    Given I am on homepage
    When I search for a product "nike"
    Then I should be able to see respective results

