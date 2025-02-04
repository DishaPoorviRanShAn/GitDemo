#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Submit Order
I am able to submit Order

  @tag1
  Scenario Outline: User is able to submit order
    Given I launch the application
    When I login with <email> and <password>
    And I add product to cart and submit
    Then I am able to submit Order

    Examples: 
      
      
      | email                | password    |
      |dishagaur18@gmail.com | Poorva@0411 |
      
