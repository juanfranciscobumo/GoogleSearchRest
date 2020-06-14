#Author: pacho0323@hotmail.com
@issues:AUT-1
Feature: Rest service automation
  I want automatize the execution and response of a rest service

  Background: 
    Given the user enter the endpoint of the rest service

  Scenario Outline: Request get
    When he user enter the dates
      | key   | cx   | q   |
      | <key> | <cx> | <q> |
    Then he user verify the response message and code <statusCode>
    And you should see the result of the search the title <title> and <searchTerms>

    Examples: 
      | key                                     | cx                                | q        | title                           | searchTerms | statusCode |
      | AIzaSyDAriQuas52ysOibFW_oGb7kwXbvu67agE | 017576662512468239146:omuauf_lfve | facebook | Google Custom Search - facebook | facebook    |        200 |
      | AIzaSyDAriQuas52ysOibFW_oGb7kwXbvu67agE | 017576662512468239146:omuauf_lfve | twiter   | Google Custom Search - twiter   | twiter      |        200 |
