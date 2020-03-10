#Author: pacho0323@hotmail.com
Feature: Make a purchase
  I want automatize the process of purchase of a product

  Background: 
    Given the user is on the store page

  Scenario Outline: Purchase a product
    When he select a producto <product>
    Then he valid that was added successfully <product>

    Examples: 
      | product                           |
      | Control Magic Remote ANMR19BA.AWP |
