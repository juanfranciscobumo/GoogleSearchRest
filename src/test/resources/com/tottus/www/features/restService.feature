#Author: pacho0323@hotmail.com
Feature: Rest service automation
  I want automatize the execution and response of a rest

  Background: 
    Given the user enter the endpoint of the rest service

  Scenario Outline: Request get
    When he enter the dates
      | token   | firstName   | lastName   |
      | <token> | <firstName> | <lastName> |
    Then he verify the expected data
      | <firstName> | <lastName> | <code> | <statusCode> |

    Examples: 
      | token                                | firstName | lastName | code | statusCode |
      | deMTZpJZpf3MZC3pAp6WVvhCYqjlDtJRhz8m | Presley   | Smith    |  200 |        200 |
