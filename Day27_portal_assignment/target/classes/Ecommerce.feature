Feature: E-Commerce End-to-End Flow

  Scenario Outline: Validate ecommerce purchase flow
    Given User launches browser
    And User opens ecommerce website
    When User logs in using "<username>" and "<password>"
    And User searches product "<product>"
    And User adds products to cart
    And User removes one product
    Then User validates total amount
    When User proceeds to checkout
    And User logs out

    Examples:
      | username      | password     | product  |
      | standard_user | secret_sauce | backpack |
